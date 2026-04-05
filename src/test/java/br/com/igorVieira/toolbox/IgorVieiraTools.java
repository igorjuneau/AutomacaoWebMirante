package br.com.igorVieira.toolbox;

import io.cucumber.java.Scenario;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

import static br.com.igorVieira.steps.hook.WebSetup.*;


public class IgorVieiraTools {


    private static final Duration MAX_DURATION = Duration.ofSeconds(30L);
    private static final Duration POOL_DURATION = Duration.ofSeconds(2L);

    public static void tirarPrint(Scenario scenario) {
        final byte[] screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screen, "image/png", scenario.getName());
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

    public static void pressEnter(){
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ENTER).perform();
    }

    public static void pressESC(){
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ESCAPE).perform();
    }
}
