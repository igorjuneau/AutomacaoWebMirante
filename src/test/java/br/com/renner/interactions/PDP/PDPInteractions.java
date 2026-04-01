package br.com.mirante.interactions.PDP;

import br.com.mirante.pages.PDP.PDPPages;
import br.com.mirante.toolbox.miranteTools;
import br.com.mirante.toolbox.models.DadosProduto;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

import static br.com.mirante.steps.hook.WebSetup.*;
import static br.com.renner.toolbox.RennerTools.*;
import static org.junit.Assert.assertEquals;

public class PDPInteractions extends PDPPages {

    private static final int TIME_OUT = 20;
    private static DadosProduto dadosProduto;
    private static final int WAIT_FOR_SECONDS = 2;

    public PDPInteractions() {
    }

    Actions actions = new Actions(driver);

    public void fecharCashBack() {
        var modal = seleniumRobotsTool.getElement(cashbackModal())
                .getShadowRoot()
                .findElement(genericButton());
        aguardoElementoClicavel(modal);
        modal.click();
    }

    public void fecharTelaCashBack() {
        var modaltela = seleniumRobotsTool.getElement(cashbackModal())
                .getShadowRoot()
                .findElement(genericCloseTelaCashBack());

        aguardoElementoClicavel(modaltela);
        modaltela.click();
    }

    public void selecionoIconePDP() {
        seleniumRobotsTool.waitObject(header(), TIME_OUT);

        var iconePDPElemento = seleniumRobotsTool.getElement(header())
                .getShadowRoot()
                .findElement(bagIcon());

        scrollUpAjustado(-20);

        iconePDPElemento.click();

        verificarCashBack(this::fecharCashBack);

        tirarPrint(scenario);
    }

    public void verificoSeFoiAdidionadoAPDP() {
        scrollAteElemento(seleniumRobotsTool.getElement(header())
                .getShadowRoot()
                .findElement(iconePDP()));

        aguardoElementoClicavel(seleniumRobotsTool.getElement(header())
                .getShadowRoot()
                .findElement(iconePDP()));

        seleniumRobotsTool.getElement(header())
                .getShadowRoot()
                .findElement(iconePDP())
                .click();

        aguardoAnimacoesJS();

        Assert.assertTrue("Produto nao foi adicionado a PDP", seleniumRobotsTool.getElement(shadowDetalheProdutoPDP())
                .getShadowRoot()
                .findElement(iconeRetirarPDP()).isEnabled());
        tirarPrint(scenario);
    }

    public void simuloFretePDP() {
        String cep = RennerTools.getJsonData("CEP");
        pageDown(1);
        seleniumRobotsTool.waitObject(navigationTabPDP(), TIME_OUT);

        aguardoElementoClicavel(seleniumRobotsTool.getElement(pagesProductPages())
                .getShadowRoot()
                .findElement(formInputCepPDP())
                .getShadowRoot()
                .findElement(inputCepPDP())
        );

        seleniumRobotsTool.getElement(pagesProductPages())
                .getShadowRoot()
                .findElement(formInputCepPDP())
                .getShadowRoot()
                .findElement(inputCepPDP())
                .sendKeys(cep);

        aguardoElementoClicavel(seleniumRobotsTool.getElement(pagesProductPages())
                .getShadowRoot()
                .findElement(formInputCepPDP())
                .getShadowRoot()
                .findElement(submitButton())
        );

        tirarPrint(scenario);

        seleniumRobotsTool.getElement(pagesProductPages())
                .getShadowRoot()
                .findElement(formInputCepPDP())
                .getShadowRoot()
                .findElement(submitButton())
                .click();

        waitForSeconds(WAIT_FOR_SECONDS);
    }

    public void validoLabelFreteNormalPDP() {
        seleniumRobotsTool.waitObject(labelShippingPrice(), TIME_OUT);

        String mensagemFreteNormal = RennerTools.getJsonData("mensagemFreteNormalPDP");

        WebElement textoFrete = seleniumRobotsTool.getElement(pagesProductPages())
                .getShadowRoot()
                .findElement(cardsShippingCard())
                .getShadowRoot()
                .findElement(upperTextNormal())
                .getShadowRoot()
                .findElement(textLabel());

        String mensagemAtual = textoFrete.getText();
        assertEquals(mensagemFreteNormal, mensagemAtual);
        tirarPrint(scenario);
    }

    public void escolherFreteNormal() {
        seleniumRobotsTool.waitObject(selecionarFreteNormal(), TIME_OUT);

        aguardoElementoClicavel(seleniumRobotsTool.getElement(selecionarFreteNormal()));

        scrollAteElemento(seleniumRobotsTool.getElement(selecionarFreteNormal()));

        seleniumRobotsTool.getElement(selecionarFreteNormal())
                .click();
        tirarPrint(scenario);

        waitForSeconds(WAIT_FOR_SECONDS);
    }

    public void escolherFreteExpresso() {
        seleniumRobotsTool.waitObject(selecionarFreteExpresso(), TIME_OUT);

        aguardoElementoClicavel(seleniumRobotsTool.getElement(selecionarFreteExpresso()));

        scrollAteElemento(seleniumRobotsTool.getElement(selecionarFreteExpresso()));

        seleniumRobotsTool.getElement(selecionarFreteExpresso())
                .click();
        tirarPrint(scenario);

        waitForSeconds(WAIT_FOR_SECONDS);
    }

    public void escolherFreteAgendado() {
        seleniumRobotsTool.waitObject(selecionarFreteAgendado(), TIME_OUT);

        aguardoElementoClicavel(seleniumRobotsTool.getElement(selecionarFreteAgendado()));

        scrollAteElemento(seleniumRobotsTool.getElement(selecionarFreteAgendado()));

        seleniumRobotsTool.getElement(selecionarFreteAgendado())
                .click();
        tirarPrint(scenario);

        waitForSeconds(WAIT_FOR_SECONDS);
    }

    public void escolherRetireEmLoja() {
        seleniumRobotsTool.waitObject(selecionarRetireEmLoja(), TIME_OUT);

        aguardoElementoClicavel(seleniumRobotsTool.getElement(selecionarRetireEmLoja()));

        scrollAteElemento(seleniumRobotsTool.getElement(selecionarRetireEmLoja()));

        seleniumRobotsTool.getElement(selecionarRetireEmLoja())
                .click();
        tirarPrint(scenario);

        waitForSeconds(WAIT_FOR_SECONDS);
    }

    public void irParaPagamento() {
        seleniumRobotsTool.waitObject(paymentButtonTablet(), TIME_OUT);

        WebElement button = seleniumRobotsTool.getElement(paymentButtonTablet())
                .getShadowRoot()
                .findElement(paymentButton());

        aguardoElementoClicavel(button);

        tirarPrint(scenario);

        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", button);
    }

    public void resumoDaCompra() {
        seleniumRobotsTool.waitObject(labelShippingPrice(), TIME_OUT);

        seleniumRobotsTool.waitObject(textLabelShippingExpress(), TIME_OUT);

        String mensagemFreteExpresso = RennerTools.getJsonData("mensagemFreteExpresso");

        WebElement textoFrete = seleniumRobotsTool.getElement(labelShippingPrice())
                .getShadowRoot()
                .findElement(textLabelShippingExpress());

        String mensagemAtual = textoFrete.getText();
        assertEquals(mensagemFreteExpresso, mensagemAtual);
        tirarPrint(scenario);
    }

    public void clicarNoBotaoAdicionarPDP() {
        aguardoElementoClicavel(btnCadastrase);

        seleniumRobotsTool.waitObject(showcaseCardProductPDP(), TIME_OUT);

        var botaoComprar = seleniumRobotsTool.getElement(showcaseCardProductPDP())
                .getShadowRoot()
                .findElement(ctaBuyButton())
                .getShadowRoot()
                .findElement(genericButton());

        aguardoElementoClicavel(botaoComprar);

        scrollAteElemento(botaoComprar);

        botaoComprar.click();
        tirarPrint(scenario);
    }

    public void clicarNoBotaoComprarItem() {
        aguardoElementoClicavel(btnCadastrase);
        seleniumRobotsTool.waitObject(pagesCardProductPDP(), TIME_OUT);

        scrollAjustado(5);

        var botaoComprar = seleniumRobotsTool.getElement(pagesCardProductPDP())
                .getShadowRoot()
                .findElement(ctaBuyButton())
                .getShadowRoot()
                .findElement(genericButton());

        aguardoElementoClicavel(botaoComprar);
        botaoComprar.click();
        tirarPrint(scenario);
    }

    public void clicarNoBotaoMaisDoProdutoNaPDP() {
        aguardoElementoClicavel(btnCadastrase);
        seleniumRobotsTool.waitObject(showcaseCardProductPDP(), TIME_OUT);

        scrollAjustado(7);
        var botaoAdicionarProduto = seleniumRobotsTool.getElement(showcaseCardProductPDP())
                .getShadowRoot()
                .findElement(selectorQuantity())
                .getShadowRoot()
                .findElement(buttonPlus());

        aguardoElementoClicavel(botaoAdicionarProduto);

        scrollAteElemento(botaoAdicionarProduto);

        botaoAdicionarProduto.click();
        tirarPrint(scenario);
    }

    public void clicarNoBotaoLixeira() {

        seleniumRobotsTool.waitObject(productPurchaseDetails(), TIME_OUT);

        var trashButton = seleniumRobotsTool.getElement(productPurchaseDetails())
                .getShadowRoot()
                .findElement(iconTrash())
                .getShadowRoot()
                .findElement(genericButton());

        aguardoElementoClicavel(trashButton);

        scrollAteElemento(trashButton);

        actions.moveToElement(trashButton).perform();

        tirarPrint(scenario);

        trashButton.click();

        waitForSeconds(WAIT_FOR_SECONDS);
    }

    public void verificarMensagemPDPVazia() {

        seleniumRobotsTool.waitObject(containerCart(), TIME_OUT);
        seleniumRobotsTool.waitObject(labelPart(), TIME_OUT);

        var mensagemElemento = seleniumRobotsTool.getElement(containerCart())
                .getShadowRoot()
                .findElement(labelPart());

        String mensagemAtual = mensagemElemento.getText();

        String mensagemEsperada = RennerTools.getJsonData("MensagemPDPVazia");

        Assert.assertEquals(mensagemEsperada, mensagemAtual);
    }

    public void verificarMensagemFreteGrátis() {

        seleniumRobotsTool.waitObject(containerCartSreeShipping(), TIME_OUT);
        seleniumRobotsTool.waitObject(labelPart(), TIME_OUT);

        var mensagemElemento = seleniumRobotsTool.getElement(containerCartSreeShipping())
                .getShadowRoot()
                .findElement(labelPartFrete());

        String mensagemAtual = mensagemElemento.getText();

        String mensagemEsperada = RennerTools.getJsonData("freteGratis");

        Assert.assertEquals(mensagemEsperada, mensagemAtual);
    }

    public void verificarMensagemFaltaXParaFreteGrátisPDP() {
        seleniumRobotsTool.waitObject(containerCartSreeShipping(), TIME_OUT);
        seleniumRobotsTool.waitObject(labelPart(), TIME_OUT);

        var mensagemElemento = seleniumRobotsTool.getElement(containerCartSreeShipping())
                .getShadowRoot()
                .findElement(labelPartFrete());

        String mensagemAtual = mensagemElemento.getText();

        String mensagemEsperada = RennerTools.getJsonData("semFreteGratis");

        Assert.assertTrue("A mensagem não contém o trecho esperado: " + mensagemEsperada,
                mensagemAtual.contains(mensagemEsperada));
    }

    public void clicarBotaoFechar() {

        seleniumRobotsTool.waitObject(headerPayment(), TIME_OUT);

        var botaoFechar = seleniumRobotsTool.getElement(headerPayment())
                .getShadowRoot()
                .findElement(spanIconClose());

        aguardoElementoClicavel(botaoFechar);

        botaoFechar.click();
        tirarPrint(scenario);

        waitForSeconds(WAIT_FOR_SECONDS);
    }

    public void pesquisarPorProduto(String produto) {
        WebElement searchContainer = getShadowRoot(header()).findElement(inputSearchContainer());
        esperarWeb(searchContainer);
        searchContainer.click();
        WebElement inputSearch = getShadowRoot(header()).findElement(By.cssSelector("input-rounded-search")).getShadowRoot().findElement(inputSearch());
        esperarClickableWeb(inputSearch);
        inputSearch.sendKeys(produto);
        inputSearch.sendKeys(Keys.ENTER);
    }

    public void acessarProdutoNaBuscaPosicaoPDP(String pos) {
        scrollAjustado(4);
        esperarWeb(produtosResultadosContainer());
        esperarWeb(cardsProdutos());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        List<WebElement> cards = driver.findElements(cardsProdutos());
        WebElement card = cards.get(Integer.parseInt(pos) - 1);
        dadosProduto = getProductDetailsFromCard(card);
        scrollAteOElementoWeb(card);
        esperarClickableWeb(card);
        card.click();
    }

    public void validarInformacoesDoProduto() {
        String nomeProdutoPdp = getShadowRoot(pdpContainer()).findElement(nomeProdutoPdpText()).getText();
        Double precoProdutoPdp = Double.parseDouble(getShadowRoot(pdpContainer()).findElement(precoProdutoPdpContainer()).getAttribute("price").replaceAll("[^0-9.,]", "").replace(",", "."));
        Assert.assertTrue(String.format("Nome do produto na PDP não é igual ao esperado. Esperado: %s - Encontrado: %s", dadosProduto.getName().trim(), nomeProdutoPdp.trim()), nomeProdutoPdp.equalsIgnoreCase(dadosProduto.getName().trim()));
        Assert.assertEquals(String.format("Preço do produto na PDP não é igual ao esperado. Esperado: %.2f - Encontrado: %.2f", Double.parseDouble(dadosProduto.getPrice()), precoProdutoPdp), precoProdutoPdp, Double.parseDouble(dadosProduto.getPrice()), 0.0);
    }

    public void validarCampoSobreProdutoNaTelaPDP() {
        aguardoElementoClicavel(btnCadastrase);
        seleniumRobotsTool.waitObject(pagesCardProductPDP(), TIME_OUT);

        var botaoComprar = seleniumRobotsTool.getElement(pagesCardProductPDP())
                .getShadowRoot()
                .findElement(headContainer())
                .getShadowRoot()
                .findElement(ctaIconButton());

        aguardoElementoClicavel(botaoComprar);
        botaoComprar.click();
        tirarPrint(scenario);
    }

    public void validarRetornoBusca() {
        esperarWeb(produtosResultadosContainer());
        esperarWeb(cardsProdutos());
        List<WebElement> cards = driver.findElements(cardsProdutos());
        Assert.assertFalse("Nenhum resultado encontrado para a busca.", cards.isEmpty());
    }

    public void validarTelaPDP() {
        esperarWeb(pdpContainer(), "O container da tela de PDP não foi encontrado.");
        WebElement pdpContainerEl = driver.findElement(pdpContainer());
        if (dadosProduto.getUrl() != null)
            Assert.assertTrue(String.format("URL acessada não é igual a esperada ao acessar a pdp. Esperado:  %s, Encontrado: %s", dadosProduto.getUrl(), driver.getCurrentUrl()), driver.getCurrentUrl().contains(dadosProduto.getUrl()));
        Assert.assertTrue("Container da PDP não foi encontrado", pdpContainerEl.isDisplayed());
        Assert.assertTrue("título do produto na PDP não foi encontrado", getShadowRoot(pdpContainer()).findElement(nomeProdutoPdpText()).isDisplayed());
        Assert.assertTrue("preço do produto na PDP não foi encontrado", getShadowRoot(pdpContainer()).findElement(precoProdutoPdpContainer()).isDisplayed());
    }

    public void imagensDestaqueApresentadasBanner() {
        pageDown(5);
        seleniumRobotsTool.waitObject(pagesCardProductPDP(), TIME_OUT);
        var bannerComprarJunto = seleniumRobotsTool.getElement(pagesCardProductPDP());
        scrollAteElemento(bannerComprarJunto);
        aguardoElementoClicavel(bannerComprarJunto);
        tirarPrint(scenario);
    }

    public void validarComprarJuntonaPDP() {
        pageDown(5);
        seleniumRobotsTool.waitObject(pagesCardProductPDP(), TIME_OUT);
        var botaoComprarJunto = seleniumRobotsTool.getElement(pagesCardProductPDP())
                .getShadowRoot()
                .findElement(cardHumblePurchase())
                .getShadowRoot()
                .findElement(ctaPillButton());
        scrollAteElemento(botaoComprarJunto);
        aguardoElementoClicavel(botaoComprarJunto);
        tirarPrint(scenario);
    }

    public void clicarCategoriaProdutoPDP() {
        seleniumRobotsTool.waitObject(shadowProductPage(), TIME_OUT);
        var botaoCategoriaPDP = seleniumRobotsTool.getElement(shadowProductPage())
                .getShadowRoot()
                .findElement(navigationbreadcrumbsPDP())
                .getShadowRoot()
                .findElement(categoriaPDP());
        aguardoElementoClicavel(botaoCategoriaPDP);
        botaoCategoriaPDP.click();
        tirarPrint(scenario);
    }

    public void retornarPaginaProdutosPDP() {
        seleniumRobotsTool.waitObject(loadingContainer(), TIME_OUT);
        var paginaProdutosPDP = seleniumRobotsTool.getElement(loadingContainer());
        aguardoElementoClicavel(paginaProdutosPDP);
        tirarPrint(scenario);
    }

    public void clicarCategoriaAnteriorProdutoPDP() {
        seleniumRobotsTool.waitObject(shadowProductPage(), TIME_OUT);
        var paginaProdutosPDP = seleniumRobotsTool.getElement(shadowProductPage())
                .getShadowRoot()
                .findElement(navigationbreadcrumbsPDP())
                .getShadowRoot()
                .findElement(categoriaAnteriorPDP());

        aguardoElementoClicavel(paginaProdutosPDP);
        tirarPrint(scenario);
    }
}