package br.com.mirante.steps.hook;

import br.com.mirante.robots.SeleniumRobotsTool;
import br.com.mirante.robots.builder.SeleniumRobotsBuilder;
import com.perfecto.reportium.client.ReportiumClient;
import com.perfecto.reportium.client.ReportiumClientFactory;
import com.perfecto.reportium.model.CustomField;
import com.perfecto.reportium.model.Job;
import com.perfecto.reportium.model.PerfectoExecutionContext;
import com.perfecto.reportium.model.Project;
import com.perfecto.reportium.test.TestContext;
import com.perfecto.reportium.test.result.TestResultFactory;
import io.cucumber.core.backend.TestCaseState;
import io.cucumber.java.*;
import io.cucumber.plugin.event.PickleStepTestStep;
import io.cucumber.plugin.event.Result;
import io.cucumber.plugin.event.TestCase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;
import java.lang.reflect.Field;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static br.com.mirante.toolbox.GlobalTools.*;
import static br.com.mirante.toolbox.miranteTools.tirarPrint;


public class WebSetup {

    public static SeleniumRobotsTool seleniumRobotsTool;
    public static WebDriver driver;
    public static String baseUrl = getExecutionUrl();
    public static String build = "";
    public static String scenarioName;
    public static Scenario scenario;
    ReportiumClient reportiumClient;
    private int indexStep = 0;

    @AfterAll()
    public static void teardDownAll() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    @Before()
    public void initiate(Scenario scenarioTest) {

        System.out.printf("TESTE %s is started%n", scenarioTest.getName());
        scenarioName = scenarioTest.getName().replaceAll("-", " ");
        scenario = scenarioTest;
        if (build.isEmpty()) {
            build = "Web-Camicado-Regressivo-" + getExecutionAmbiente();
        }
        if (driver == null)
            switch (getExecutionNavegador()) {
                default:
                case "chrome": {
                    System.out.println("Chrome");
                    ChromeOptions chromeOptions = new ChromeOptions();
                    chromeOptions.addArguments("--window-size=1366,768");
                    chromeOptions.addArguments("--window-maximize");
                    chromeOptions.addArguments("--disable-notifications");
                    chromeOptions.addArguments("--no-sandbox");
                    chromeOptions.addArguments("--disable-gpu");
                    chromeOptions.addArguments("--remote-allow-origins=*");
                    chromeOptions.addArguments("--incognito");

                    WebDriverManager.chromedriver().setup();

                    WebDriverManager.chromedriver().cachePath("src/test/resources/drivers");
                    WebDriverManager.chromedriver().forceDownload();

                    seleniumRobotsTool = new SeleniumRobotsBuilder()
                            .timeoutSeconds(1)
                            .pollingSeconds(1)
                            .setChromeOptions(chromeOptions)
                            .build();
                    break;
                }
                case "edge": {
                    SeleniumRobotsBuilder seleniumRobotsBuild = new SeleniumRobotsBuilder()
                            .pollingSeconds(60)
                            .timeoutSeconds(30)
                            .pollingSeconds(5)
                            .edge();
                    WebDriverManager.edgedriver().setup();
                    seleniumRobotsTool = seleniumRobotsBuild.build();
                    break;
                }
                case "opera": {
                    SeleniumRobotsBuilder seleniumRobotsBuild = new SeleniumRobotsBuilder()
                            .pollingSeconds(60)
                            .timeoutSeconds(30)
                            .pollingSeconds(5);
                    WebDriverManager.operadriver().setup();
                    seleniumRobotsTool = seleniumRobotsBuild.build();
                    break;
                }
                case "firefox": {
                    SeleniumRobotsBuilder seleniumRobotsBuild = new SeleniumRobotsBuilder()
                            .pollingSeconds(60)
                            .timeoutSeconds(30)
                            .pollingSeconds(5)
                            .firefox();

                    WebDriverManager.firefoxdriver().setup();
                    seleniumRobotsTool = seleniumRobotsBuild.build();
                    break;
                }
                case "remote": {
                    SeleniumRobotsBuilder seleniumRobotsBuild = new SeleniumRobotsBuilder()
                            .pollingSeconds(60)
                            .timeoutSeconds(30)
                            .pollingSeconds(5)
                            .remoteExec("http://localhost:4444/wd/hub")
                            .chrome();
                    WebDriverManager.chromedriver().setup();
                    HashMap<String, Object> chromePrefs = new HashMap<>();
                    chromePrefs.put("profile.default_content_settings.popups", 0);
                    chromePrefs.put("download.prompt_for_download", "false");
                    chromePrefs.put("plugins.plugins_disabled", new String[]{"Adobe Flash Player", "Chrome PDF Viewer"});
                    ChromeOptions options = new ChromeOptions();
                    options.setExperimentalOption("prefs", chromePrefs);
                    options.addArguments("--lang=pt");
                    options.addArguments("--no-sandbox");
                    options.addArguments("--disable-dev-shm-usage");
                    options.addArguments("--aggressive-cache-discard");
                    options.addArguments("--disable-cache");
                    options.addArguments("--disable-application-cache");
                    options.addArguments("--disable-offline-load-stale-cache");
                    options.addArguments("--disk-cache-size=0");
                    options.addArguments("--disable-gpu");
                    options.addArguments("--dns-prefetch-disable");
                    options.addArguments("--no-proxy-server");
                    options.addArguments("--log-level=3");
                    options.addArguments("--silent");
                    options.addArguments("--disable-browser-side-navigation");
                    options.setPageLoadStrategy(PageLoadStrategy.EAGER);
                    options.setAcceptInsecureCerts(true);
                    System.setProperty("webdriver.chrome.silentOutput", "true");
                    seleniumRobotsTool = seleniumRobotsBuild.setChromeOptions(options).build();
                    break;
                }
                case "perfecto": {
                    SeleniumRobotsBuilder seleniumRobotsBuild = new SeleniumRobotsBuilder()
                            .pollingSeconds(60)
                            .timeoutSeconds(30)
                            .pollingSeconds(5)
                            .remoteExec(getUrlPerfecto())
                            .chrome();
                    WebDriverManager.chromedriver().setup();


                    HashMap<String, Object> chromePrefs = new HashMap<>();
                    chromePrefs.put("profile.default_content_settings.popups", 0);
                    chromePrefs.put("download.prompt_for_download", "false");
                    chromePrefs.put("plugins.plugins_disabled", new String[]{"Adobe Flash Player", "Chrome PDF Viewer"});
                    ChromeOptions options = new ChromeOptions();
                    options.setExperimentalOption("prefs", chromePrefs);
                    options.addArguments("--disable-notifications");
                    options.addArguments("--lang=pt");
                    options.addArguments("--no-sandbox");
                    options.addArguments("--disable-dev-shm-usage");
                    options.addArguments("--aggressive-cache-discard");
                    options.addArguments("--disable-cache");
                    options.addArguments("--disable-application-cache");
                    options.addArguments("--disable-offline-load-stale-cache");
                    options.addArguments("--disk-cache-size=0");
                    options.addArguments("--disable-gpu");
                    options.addArguments("--dns-prefetch-disable");
                    options.addArguments("--no-proxy-server");
                    options.addArguments("--log-level=3");
                    options.addArguments("--silent");
                    options.addArguments("--disable-browser-side-navigation");
                    options.addArguments("--incognito");
// Configurações específicas
                    options.setAcceptInsecureCerts(true);
                    options.setPageLoadStrategy(PageLoadStrategy.EAGER);

// Opções adicionais
                    Map<String, Object> perfectoOptions = new HashMap<>();
                    perfectoOptions.put("browserName", "Chrome");
                    //perfectoOptions.put("browserVersion", "127");
                    perfectoOptions.put("location", "US East");
                    perfectoOptions.put("platformName", "Windows");
                    perfectoOptions.put("platformVersion", "10");
                    perfectoOptions.put("resolution", "1366x768");
                    perfectoOptions.put("securityToken", getTokenPerfecto());
                    perfectoOptions.put("waitForAvailableLicense", true);
                    perfectoOptions.put("waitForAvailableLicenseTimeout", 900);

                    options.setCapability("perfecto:options", perfectoOptions);
                    System.setProperty("webdriver.chrome.silentOutput", "true");
                    seleniumRobotsTool = seleniumRobotsBuild.setChromeOptions(options).build();


                    indexStep = 0;


                    break;
                }
            }
        if (getExecutionNavegador().equalsIgnoreCase("perfecto")) {
            String tags = String.join(", ", scenarioTest.getSourceTagNames());
            if (reportiumClient == null) {
                PerfectoExecutionContext perfectoExecutionContext = new PerfectoExecutionContext.PerfectoExecutionContextBuilder()
                        .withProject(new Project("Web-Camicado-Regressivo-" + getExecutionAmbiente(), "1.0.0"))
                        .withJob(new Job(build, Integer.parseInt(System.getProperty("buildNumber", "1"))))
                        .withWebDriver(seleniumRobotsTool.getDriver())
                        .build();
                reportiumClient = new ReportiumClientFactory().createPerfectoReportiumClient(perfectoExecutionContext);
            }

            reportiumClient.testStart(scenarioName, new TestContext.Builder()
                    .withTestExecutionTags(tags)
                    .withCustomFields(new CustomField("ambiente", getExecutionAmbiente()))
                    .build());
        }

        driver = seleniumRobotsTool.getDriver();
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        if(getExecutionNavegador().equalsIgnoreCase("perfecto")){
            driver.manage().window().maximize();
        }

    }

    @BeforeStep()
    public void beforeStep(Scenario scenario) {
        if (getExecutionNavegador().equalsIgnoreCase("perfecto")) {
            reportiumClient.stepStart(getCurrentStep(scenario));
        }
    }

    public String getCurrentStep(Scenario scenario) {

        try {
            Field delegate = scenario.getClass().getDeclaredField("delegate");
            delegate.setAccessible(true);
            TestCaseState testCaseState = (TestCaseState) delegate.get(scenario);

            Field testCaseField = testCaseState.getClass().getDeclaredField("testCase");
            testCaseField.setAccessible(true);
            TestCase testCase = (TestCase) testCaseField.get(testCaseState);

            List<PickleStepTestStep> testStepTitles = testCase.getTestSteps()
                    .stream()
                    .filter(step -> step instanceof PickleStepTestStep)
                    .map(step -> (PickleStepTestStep) step)
                    .collect(Collectors.toList());

            PickleStepTestStep stepTestStep = testStepTitles.get(indexStep);
            indexStep = indexStep + 1;
            return stepTestStep != null ? stepTestStep.getStep().getText() : "";
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }

        return "";
    }

    @AfterStep()
    public void afterStep(Scenario scenario) {
        if (getExecutionNavegador().equalsIgnoreCase("perfecto")) {
            reportiumClient.stepEnd();
        }
    }

    @After()
    public void tearDown(Scenario scenario) throws IOException {

        System.out.printf("TESTE %s is %s%n", scenario.getName(), scenario.getStatus().name());

        if (driver != null) {
            tirarPrint(scenario);
        }

        if (getExecutionNavegador().equalsIgnoreCase("perfecto") && reportiumClient != null) {
            reportiumClient.testStop(scenario.isFailed()
                    ? TestResultFactory.createFailure(getFailureMessage(scenario))
                    : TestResultFactory.createSuccess());

            String reportURL = reportiumClient.getReportUrl();
            System.out.println("Report URL - " + reportURL);
        }

        if (driver != null) {
            driver.manage().deleteAllCookies();
        }

    }

    public String getFailureMessage(Scenario scenario) {
        Result failResult = null;

        try {
            Field delegate = scenario.getClass().getDeclaredField("delegate");
            delegate.setAccessible(true);
            TestCaseState testCaseState = (TestCaseState) delegate.get(scenario);

            Field stepResults = testCaseState.getClass().getDeclaredField("stepResults");
            stepResults.setAccessible(true);
            List<Result> results = (List<Result>) stepResults.get(testCaseState);

            for (Result result : results) {
                if (result.getStatus().name().equalsIgnoreCase("FAILED")) {
                    failResult = result;
                }
            }
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }

        return (failResult != null) ? failResult.getError().getMessage() : "";
    }

}
