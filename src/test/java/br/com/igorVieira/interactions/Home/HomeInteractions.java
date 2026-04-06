package br.com.igorVieira.interactions.Home;

import br.com.igorVieira.pages.Home.HomePages;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static br.com.igorVieira.steps.hook.WebSetup.*;
import static br.com.igorVieira.toolbox.IgorVieiraTools.*;

public class HomeInteractions extends HomePages {

    private static final int TIME_OUT = 20;
    private WebDriverWait wait;
    private Actions actions;

    public HomeInteractions() {
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(TIME_OUT));
        this.actions = new Actions(driver);
    }

    private void scrollAteElemento(By locator) {
        WebElement element = driver.findElement(locator);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void validaUrl() {
        Assert.assertEquals("https://blog.agibank.com.br/", driver.getCurrentUrl());
    }

    public void clicarBotaoProdutos() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement botaoProdutos = wait.until(ExpectedConditions.refreshed(
                ExpectedConditions.elementToBeClickable(clicoProdutos())
        ));
        try {
            botaoProdutos.click();
        } catch (Exception e) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", botaoProdutos);
    }
    }

    public void clicarBotaoEmprestimos() {
        WebElement botao = driver.findElement(clicoEmprestimos());
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", botao);
    }

    public void clicarLupaBusca() {
        driver.navigate().refresh();
        esperarPaginaCarregar();

        WebElement lupa = wait.until(ExpectedConditions.elementToBeClickable(lupaBusca()));

        Actions actions = new Actions(driver);
        actions.moveToElement(lupa).pause(Duration.ofMillis(50)).perform();

        try {
            actions.click(lupa).perform();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".search-field, #search-field")));
        } catch (Exception e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", lupa);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".search-field, #search-field")));
        }
    }

    private void esperarPaginaCarregar() {
    }

    public void clicarBotaoConsignado() {
        WebElement botao = driver.findElement(clicoConsignado());
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", botao);
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

    public void validarTeladeHome() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(textoPrincipal()));
        List<WebElement> cards = driver.findElements(textoPrincipal());
        Assert.assertFalse(cards.isEmpty());
    }

    public void validarArtigoPassoaPassoIRAberto() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(textoPrincipalIR26()));
        List<WebElement> cards = driver.findElements(textoPrincipalIR26());
        Assert.assertFalse(cards.isEmpty());
    }

    public void validarArtigoPixParcAberto() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(textoPixParc()));
        List<WebElement> cards = driver.findElements(textoPixParc());
        Assert.assertFalse(cards.isEmpty());
    }

    public void digitarIpostoRenda() {
        WebElement busca = wait.until(ExpectedConditions.elementToBeClickable(campoBusca()));
        busca.clear();
        busca.sendKeys("Imposto de Renda");
        busca.sendKeys(Keys.ENTER);
    }

    public void digitarPixParcelado() {
        WebElement busca = wait.until(ExpectedConditions.elementToBeClickable(campoBusca()));
        busca.clear();
        busca.sendKeys("Pix Parcelado");
        busca.sendKeys(Keys.ENTER);
    }

    public void clicarArtigoPassoaPassoIR() {
        scrollAteElemento(artigoPassoIR());
        WebElement botaoartigoPassoIR = driver.findElement(artigoPassoIR());
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", botaoartigoPassoIR);
    }

    public void clicarArtigoPixParcelado() {
        scrollAteElemento(artigoPixParc());
        WebElement botaoartigoPixParc = driver.findElement(artigoPixParc());
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", botaoartigoPixParc);
    }

    public void roloATelaParaBaixo10x() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        for (int i = 0; i < 10; i++) {
            js.executeScript("window.scrollBy(0, window.innerHeight);");
            try { Thread.sleep(200); } catch (InterruptedException e) { e.printStackTrace(); }
        }
    }
}