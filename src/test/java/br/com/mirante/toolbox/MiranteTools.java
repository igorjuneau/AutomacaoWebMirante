package br.com.mirante.toolbox;

import io.cucumber.java.Scenario;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static br.com.mirante.steps.hook.WebSetup.*;


public class MiranteTools {


    private static final Duration MAX_DURATION = Duration.ofSeconds(30L);
    private static final Duration POOL_DURATION = Duration.ofSeconds(2L);

    public static void tirarPrint(Scenario scenario) {
        final byte[] screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screen, "image/png", scenario.getName());
    }

    public static void scrollAteElemento(WebElement element) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView({  behavior: 'auto',block: 'center',inline: 'center'})", element);
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

}
