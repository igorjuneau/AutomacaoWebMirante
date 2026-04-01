package br.com.mirante.toolbox;

import br.com.mirante.toolbox.models.DadosProduto;
import io.cucumber.java.Scenario;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.Random;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static br.com.mirante.steps.hook.WebSetup.*;


public class miranteTools {


    private static final Duration MAX_DURATION = Duration.ofSeconds(30L);
    private static final Duration POOL_DURATION = Duration.ofSeconds(2L);

    public static void tirarPrint(Scenario scenario) {
        final byte[] screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screen, "image/png", scenario.getName());
    }

    public static String extractFeatureName(String filePath) {
        int lastSlashIndex = filePath.lastIndexOf('/');
        int featureExtensionIndex = filePath.lastIndexOf(".feature");

        return filePath.substring(lastSlashIndex + 1, featureExtensionIndex);
    }

    public static void scrollAteElemento(WebElement element) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView({  behavior: 'auto',block: 'center',inline: 'center'})", element);
    }

    public static void setChangedMaxValue(WebElement shadowHost, String value) {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        SearchContext shadowRoot = (SearchContext) js.executeScript("return arguments[0].shadowRoot;", shadowHost);

        WebElement secondElement = shadowRoot.findElements(By.cssSelector("input-price-range")).get(1);

        js.executeScript("arguments[0].setAttribute('changedmaxvalue', arguments[1]);", secondElement, value);
    }

    public static void scrollAjustado(int numeroDeVezes) {

        for (int i = 0; i < numeroDeVezes; i++) {
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("window.scrollBy(0,300)");
        }
    }

    public static void scrollUpAjustado(int numeroDeVezes) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        for (int i = 0; i < numeroDeVezes; i++) {
            jse.executeScript("window.scrollBy(0,-200)");
        }
    }

    public static void aguardarTelaDeLoad() {
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(MAX_DURATION)
                .pollingEvery(POOL_DURATION)
                .ignoring(JavascriptException.class);
        try {
            wait.until(webDriver -> ((JavascriptExecutor) webDriver).executeScript("return jQuery.active == 0"));
        }catch (Exception ignored){
        }

    }

    public static void scrollAteOElementoWeb(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }


    public static WebElement esperarWeb(WebElement element) {
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(MAX_DURATION)
                .pollingEvery(POOL_DURATION)
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class);

        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static WebElement esperarElementoVisivel(String xpathLocator) {
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(MAX_DURATION)
                .pollingEvery(POOL_DURATION)
                .ignoring(NoSuchElementException.class);

        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathLocator)));
    }

    public static void pressEnter(){
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ENTER).perform();
    }
    public static void pressESC(){
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ESCAPE).perform();
    }

    public static WebElement esperarWeb(By by) {
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(MAX_DURATION)
                .pollingEvery(POOL_DURATION)
                .ignoring(NoSuchElementException.class);

        return wait.until(driver -> driver.findElement(by));
    }


    public static void tirarFoco() {
        esperarWeb(By.xpath("//body")).click();
    }

    public static void esperarClickableWeb(WebElement element) {
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(MAX_DURATION)
                .pollingEvery(POOL_DURATION)
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class);

        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void aguardoElementoClicavel(String xpath) {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeAsyncScript(
                "function isElementClickable(element) {" +
                        "    const rect = element.getBoundingClientRect();" +
                        "    const isVisible = rect.width > 0 && rect.height > 0;" +
                        "    const isInViewport = rect.top >= 0 && rect.left >= 0 && rect.bottom <= (window.innerHeight || document.documentElement.clientHeight) && rect.right <= (window.innerWidth || document.documentElement.clientWidth);" +
                        "    return isVisible && isInViewport;" +
                        "}" +
                        "function waitForElementToBeClickable(xpath, retries, delay, callback) {" +
                        "    function attemptCheck(retriesLeft) {" +
                        "        const element = document.evaluate(xpath, document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue;" +
                        "        if (element && isElementClickable(element)) {" +
                        "            callback('Element is clickable');" +
                        "        } else if (retriesLeft > 0) {" +
                        "            setTimeout(() => attemptCheck(retriesLeft - 1), delay);" +
                        "        } else {" +
                        "            callback('Element not clickable after multiple attempts');" +
                        "        }" +
                        "    }" +
                        "    attemptCheck(retries);" +
                        "}" +
                        "waitForElementToBeClickable(arguments[0], 10, 500, arguments[arguments.length - 1]);",
                xpath
        );
    }

    public static void aguardoElementoClicavel(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeAsyncScript(
                "function isElementClickable(element) {" +
                        "    const rect = element.getBoundingClientRect();" +
                        "    const isVisible = rect.width > 0 && rect.height > 0;" +
                        "    const isInViewport = rect.top >= 0 && rect.left >= 0 && rect.bottom <= (window.innerHeight || document.documentElement.clientHeight) && rect.right <= (window.innerWidth || document.documentElement.clientWidth);" +
                        "    return isVisible && isInViewport;" +
                        "}" +
                        "function waitForElementToBeClickable(element, retries, delay, callback) {" +
                        "    function attemptCheck(retriesLeft) {" +
                        "        if (isElementClickable(element)) {" +
                        "            callback('Element is clickable');" +
                        "        } else if (retriesLeft > 0) {" +
                        "            setTimeout(() => attemptCheck(retriesLeft - 1), delay);" +
                        "        } else {" +
                        "            callback('Element not clickable after multiple attempts');" +
                        "        }" +
                        "    }" +
                        "    attemptCheck(retries);" +
                        "}" +
                        "waitForElementToBeClickable(arguments[0], 10, 500, arguments[1]);",
                element
        );
    }
    public static void pageDown(int numeroDeVezes) {
        for (int i = 0; i < numeroDeVezes; i++) {
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("window.scrollBy(0, window.innerHeight);");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void pageUp(int numeroDeVezes) {
        for (int i = 0; i < numeroDeVezes; i++) {
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("window.scrollBy(0, -window.innerHeight);");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static String extractSku(String url) {
        String regex = "[?&]sku=([^&]*)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(url);
        if (matcher.find()) {
            return matcher.group(1);
        } else {
            return null;
        }
    }
    public static void aguardoAnimacoesJS() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeAsyncScript(
                "const callback = arguments[arguments.length - 1];" +
                        "const sleep = (ms) => new Promise(resolve => setTimeout(resolve, ms));" +
                        "const animationsFinished = () => {" +
                        "    const animations = document.getAnimations();" +
                        "    return animations.length === 0;" +
                        "};" +
                        "const waitForAnimations = async () => {" +
                        "    await sleep(2000);" +
                        "    while (document.readyState !== 'complete' || !animationsFinished()) {" +
                        "        await sleep(100);" +
                        "    }" +
                        "    callback();" +
                        "};" +
                        "waitForAnimations();"
        );
    }
    public static void verificarCashBack(Runnable acao) {
        try {
            acao.run();
        } catch (Exception ignored) {

        }
    }
    public static void clickByJavaScript(WebElement element) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].click()", element);
    }
    public static String extractNumbers(String input) {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(input);
        StringBuilder numbers = new StringBuilder();
        while (matcher.find()) {
            numbers.append(matcher.group());
        }
        return numbers.toString();
    }
    public static String getJsonData(String key) {
        org.json.JSONObject jsonData = loadJsonSanityFromFile();
        return jsonData.getJSONObject(extractFeatureName(scenario.getUri().toString())).getString(key);
    }
    public static void setJsonData(String key, String value) {
        org.json.JSONObject jsonData = loadJsonSanityFromFile();
        jsonData.getJSONObject(extractFeatureName(scenario.getUri().toString())).put(key, value);
        try {
            Files.write(Paths.get("src/test/resources/configs/data/testData.json"), jsonData.toString(4).getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static org.json.JSONObject loadJsonSanityFromFile() {
        org.json.JSONObject jsonData = null;
        try {
            String jsonContent = new String(Files.readAllBytes(Paths.get("src/test/resources/configs/data/testData.json")));
            jsonData = new org.json.JSONObject(jsonContent);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return jsonData;
    }
    public static void generateAndSetCPF() {
        Random randomNumber = new Random();
        int n1 = randomNumber.nextInt(10);
        int n2 = randomNumber.nextInt(10);
        int n3 = randomNumber.nextInt(10);
        int n4 = randomNumber.nextInt(10);
        int n5 = randomNumber.nextInt(10);
        int n6 = randomNumber.nextInt(10);
        int n7 = randomNumber.nextInt(10);
        int n8 = randomNumber.nextInt(10);
        int n9 = randomNumber.nextInt(10);

        int sum1 = n9 * 2 + n8 * 3 + n7 * 4 + n6 * 5 + n5 * 6 + n4 * 7 + n3 * 8 + n2 * 9 + n1 * 10;
        int value1 = (sum1 / 11) * 11;

        int d1 = sum1 - value1;
        int r1 = (d1 % 11);

        if (d1 < 2) {
            d1 = 0;
        } else {
            d1 = 11 - r1;
        }

        int sum2 = d1 * 2 + n9 * 3 + n8 * 4 + n7 * 5 + n6 * 6 + n5 * 7 + n4 * 8 + n3 * 9 + n2 * 10 + n1 * 11;
        int value2 = (sum2 / 11) * 11;

        int d2 = sum2 - value2;
        r1 = (d2 % 11);

        if (d2 < 2) {
            d2 = 0;
        } else {
            d2 = 11 - r1;
        }

        String cpfGerado = String.valueOf(n1) + String.valueOf(n2) + String.valueOf(n3) +
                String.valueOf(n4) + String.valueOf(n5) + String.valueOf(n6) +
                String.valueOf(n7) + String.valueOf(n8) + String.valueOf(n9) +
                String.valueOf(d1) + String.valueOf(d2);
        setJsonData("CPF", cpfGerado);
        }

    public static void generateAndSetCNPJ() {
        Random randomNumber = new Random();

        int n1 = randomNumber.nextInt(10);
        int n2 = randomNumber.nextInt(10);
        int n3 = randomNumber.nextInt(10);
        int n4 = randomNumber.nextInt(10);
        int n5 = randomNumber.nextInt(10);
        int n6 = randomNumber.nextInt(10);
        int n7 = randomNumber.nextInt(10);
        int n8 = randomNumber.nextInt(10);

        int n9 = 0;
        int n10 = 0;
        int n11 = 0;
        int n12 = 1;

        int sum1 = n1 * 5 + n2 * 4 + n3 * 3 + n4 * 2 + n5 * 9 + n6 * 8 + n7 * 7 + n8 * 6 + n9 * 5 + n10 * 4 + n11 * 3 + n12 * 2;
        int remainder1 = sum1 % 11;
        int d1 = (remainder1 < 2) ? 0 : 11 - remainder1;

        int sum2 = n1 * 6 + n2 * 5 + n3 * 4 + n4 * 3 + n5 * 2 + n6 * 9 + n7 * 8 + n8 * 7 + n9 * 6 + n10 * 5 + n11 * 4 + n12 * 3 + d1 * 2;
        int remainder2 = sum2 % 11;
        int d2 = (remainder2 < 2) ? 0 : 11 - remainder2;

        String cnpjGerado = "" + n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9 + n10 + n11 + n12 + d1 + d2;
        setJsonData("CNPJ", cnpjGerado);
    }

    public static void generatePhoneNumber() {
        Random random = new Random();
        StringBuilder phoneNumber = new StringBuilder();

        phoneNumber.append("(");
        phoneNumber.append(11);
        phoneNumber.append(")");
        phoneNumber.append(" ");
        phoneNumber.append(random.nextInt(90000) + 10000).append("-");
        phoneNumber.append(random.nextInt(9000) + 1000);

        setJsonData("Telefone", String.valueOf(phoneNumber));
    }

    public static void clickCashbackButtonIfExists() {
        try {
            ((JavascriptExecutor) driver).executeScript(
                    "let button = document.querySelector('#cashback-modal').shadowRoot.querySelector('button');" +
                            "if (button) button.click();"
            );
        }catch (Exception ignore){
        }
    }

    public static void clickCashbackButton() {
        ((JavascriptExecutor) driver).executeScript(
                "document.querySelector(\"[titleboxmyaccount='Cashback']\").shadowRoot.querySelector(\"#aut-myAccount-boxMenu-cashbackAccount\")?.click();");
    }

    public static void waitForSeconds(int time) {
        new WebDriverWait(driver, Duration.ofSeconds(2))
                .until(driver -> true);
    }

    public static void waitForNewWindow(Set<String> existingWindows, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
        wait.until(driver -> driver.getWindowHandles().size() > existingWindows.size());
    }


    public static void adicionaCreditoValeTroca(String documento, String valor) {
        String url = "https://dev-dataconnect.givex.com:50104";

        String body = "{\n" +
                "    \"jsonrpc\": \"2.0\",\n" +
                "    \"method\": \"dc_1036\",\n" +
                "    \"params\": [\n" +
                "        \"pt\",\n" +
                "        \"5-1\",\n" +
                "        \"37674\",\n" +
                "        \"7VFAe93NDAkvD0IL\",\n" +
                "        \"" + documento + "\",\n" +
                "        \"\",\n" +
                "        \"\",\n" +
                "        \""+valor+"\",\n" +
                "        true,\n" +
                "        \"Crédito Teste Postman\",\n" +
                "        \"" + documento + "\",\n" +
                "        \"Crédito Teste Postman\",\n" +
                "        \"customer\"\n" +
                "    ],\n" +
                "    \"id\": 1\n" +
                "}";

        RestAssured.given()
                .contentType(ContentType.JSON)
                .body(body)
                .post(url)
                .then()
                .statusCode(200);
    }
    public static SearchContext getShadowRoot(By by) {
        WebElement element = driver.findElement(by);
        return element.getShadowRoot();
    }

    public static DadosProduto getProductDetailsFromCard(WebElement card) {
        DadosProduto dadosProduto = new DadosProduto();
        String name = card.getShadowRoot().findElement(By.cssSelector("a")).findElement(By.tagName("text-label")).getAttribute("textlabel").trim();
        String price = card.getShadowRoot().findElement(By.cssSelector("product-card-price")).getAttribute("price")
                .replace("R$ ", "").replace(",", ".").trim();
        dadosProduto.setName(name);
        dadosProduto.setPrice(price);
        return dadosProduto;
    }
    public static WebElement esperarWeb(By by, String mensagemErro) {
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(MAX_DURATION)
                .pollingEvery(POOL_DURATION)
                .ignoring(NoSuchElementException.class);
        try {
            return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        } catch (Exception e) {
            throw new RuntimeException(mensagemErro);
        }
    }
}
