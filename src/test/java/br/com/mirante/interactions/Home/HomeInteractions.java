package br.com.mirante.interactions.Home;

import br.com.mirante.pages.Home.HomePages;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static br.com.mirante.steps.hook.WebSetup.*;


public class HomeInteractions extends HomePages {

    private static final int TIME_OUT = 20;
    private WebDriverWait wait;
    private Actions actions;

    public HomeInteractions() {
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(TIME_OUT));
        this.actions = new Actions(driver);
    }

    private void aguardarEClicar(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    private void scrollAteElemento(By locator) {
        WebElement element = driver.findElement(locator);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void validaUrl() {
        Assert.assertEquals("https://blog.agibank.com.br/", driver.getCurrentUrl());
    }

    public void clicarBotaoProdutos() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("footer")));
        aguardarEClicar(clicoProdutos());
        wait.until(ExpectedConditions.visibilityOfElementLocated(clicoProdutos()));
    }

    public void clicarBotaoEmprestimos() {
        aguardarEClicar(clicoEmprestimos());
        wait.until(ExpectedConditions.visibilityOfElementLocated(clicoEmprestimos()));
    }

    public void clicarBotaoConsignado() {
        aguardarEClicar(clicoConsignado());
        wait.until(ExpectedConditions.visibilityOfElementLocated(clicoConsignado()));
    }

    public void visualizoTitulodaTelaConsignado() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(tituloConsignado()));
        Assert.assertFalse(driver.findElements(tituloConsignado()).isEmpty());
    }

    public void visualizoTresImagensEmprestimo() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(imagemEmprestimo01()));
        Assert.assertFalse(driver.findElements(imagemEmprestimo01()).isEmpty());
        wait.until(ExpectedConditions.visibilityOfElementLocated(imagemEmprestimo02()));
        Assert.assertFalse(driver.findElements(imagemEmprestimo02()).isEmpty());
        wait.until(ExpectedConditions.visibilityOfElementLocated(imagemEmprestimo03()));
        Assert.assertFalse(driver.findElements(imagemEmprestimo03()).isEmpty());
    }

    public void validarRetornoHome() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(textoPrincipal()));
        List<WebElement> cards = driver.findElements(textoPrincipal());
        Assert.assertFalse(cards.isEmpty());
    }

    public void roloATelaParaBaixo10x() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        for (int i = 0; i < 10; i++) {
            js.executeScript("window.scrollBy(0, window.innerHeight);");
            try { Thread.sleep(200); } catch (InterruptedException e) { e.printStackTrace(); }
        }
    }
}