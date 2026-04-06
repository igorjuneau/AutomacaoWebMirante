package br.com.igorVieira.steps.hook;

import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

public class WebSetup {

    public static WebDriver driver;
    public static String scenarioName;
    public static Scenario scenario;
    public static String baseUrl = "https://blogdoagi.com.br/";

    @Before()
    public void initiate(Scenario scenarioTest) {
        System.out.printf("TESTE %s iniciado%n", scenarioTest.getName());
        scenarioName = scenarioTest.getName();
        scenario = scenarioTest;

        if (driver == null) {
            String navegador = System.getProperty("browser", "chrome");

            switch (navegador.toLowerCase()) {
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;
                default:
                case "chrome":
                    ChromeOptions chromeOptions = new ChromeOptions();
                    chromeOptions.addArguments("--window-size=1366,768");
                    chromeOptions.addArguments("--remote-allow-origins=*");

                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(chromeOptions);
                    break;
            }
        }

        driver.manage().deleteAllCookies();
        driver.get(baseUrl);
        driver.navigate().refresh();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @After()
    public void tearDown(Scenario scenario) {
        System.out.printf("TESTE %s finalizado como: %s%n", scenario.getName(), scenario.getStatus().name());

        if (driver != null && scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Evidência_Erro");
        }
    }

    @AfterAll()
    public static void teardDownAll() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}