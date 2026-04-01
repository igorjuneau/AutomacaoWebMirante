package br.com.mirante.interactions.sacola;

import br.com.mirante.pages.sacola.SacolaPages;
import br.com.renner.toolbox.RennerTools;
import br.com.renner.toolbox.models.DadosProduto;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;


import java.util.List;

import static br.com.renner.steps.hook.WebSetup.*;
import static br.com.renner.toolbox.RennerTools.*;
import static br.com.renner.toolbox.RennerTools.getShadowRoot;
import static org.junit.Assert.assertEquals;

public class SacolaInteractions extends SacolaPages {

    private static final int TIME_OUT = 20;
    private static DadosProduto dadosProduto;
    private static final int WAIT_FOR_SECONDS = 2;

    public SacolaInteractions() {
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

    public void selecionoIconeSacola() {
        scrollAteElemento(seleniumRobotsTool.getElement(header())
                .getShadowRoot()
                .findElement(iconeSacola()));

        aguardoElementoClicavel(seleniumRobotsTool.getElement(header())
                .getShadowRoot()
                .findElement(iconeSacola()));

        seleniumRobotsTool.getElement(header())
                .getShadowRoot()
                .findElement(iconeSacola())
                .click();

        aguardoAnimacoesJS();

        tirarPrint(scenario);
    }

    public void acessoSacola() {
        aguardoElementoClicavel(seleniumRobotsTool.getElement(header())
                .getShadowRoot()
                .findElement(iconeSacola()));

        seleniumRobotsTool.getElement(header())
                .getShadowRoot()
                .findElement(iconeSacola())
                .click();
    }

    public void verificoSeFoiAdidionadoASacola() {
        pressESC();
        scrollAteElemento(seleniumRobotsTool.getElement(header())
                .getShadowRoot()
                .findElement(iconeSacola()));

        aguardoElementoClicavel(seleniumRobotsTool.getElement(header())
                .getShadowRoot()
                .findElement(iconeSacola()));

        seleniumRobotsTool.getElement(header())
                .getShadowRoot()
                .findElement(iconeSacola())
                .click();

        Assert.assertTrue("Produto nao foi adicionado a Sacola", seleniumRobotsTool.getElement(shadowDetalheProdutoSacola())
                .getShadowRoot()
                .findElement(iconeRetirarSacola()).isEnabled());
        verificarCashBack(this::fecharCashBack);
        tirarPrint(scenario);
    }

    public void simuloFrete() {
        String cep = RennerTools.getJsonData("CEP");
        fecharTelaCashBack();

        seleniumRobotsTool.waitObject(navigationTab(), TIME_OUT);

        aguardoElementoClicavel(seleniumRobotsTool.getElement(formInputCep())
                .getShadowRoot()
                .findElement(inputCep())
        );

        seleniumRobotsTool.getElement(formInputCep())
                .getShadowRoot()
                .findElement(inputCep())
                .sendKeys(cep);

        aguardoElementoClicavel(seleniumRobotsTool.getElement(formInputCep())
                .getShadowRoot()
                .findElement(submitButton())
        );

        tirarPrint(scenario);

        seleniumRobotsTool.getElement(formInputCep())
                .getShadowRoot()
                .findElement(submitButton())
                .click();

        waitForSeconds(WAIT_FOR_SECONDS);
    }

    public void validoLabelFretePDP() {
        seleniumRobotsTool.waitObject(labelShippingPrice(), TIME_OUT);

        seleniumRobotsTool.waitObject(textLabelShippingNormal(), TIME_OUT);

        String mensagemFreteNormal = RennerTools.getJsonData("mensagemFreteNormal");

        WebElement textoFrete = seleniumRobotsTool.getElement(labelShippingPrice())
                .getShadowRoot()
                .findElement(textLabelShippingNormal());

        String mensagemAtual = textoFrete.getText();
        assertEquals(mensagemFreteNormal, mensagemAtual);
        tirarPrint(scenario);
    }

    public void validoLabelFrete() {
        seleniumRobotsTool.waitObject(labelShippingPrice(), TIME_OUT);

        seleniumRobotsTool.waitObject(textLabelShippingNormal(), TIME_OUT);

        String mensagemFreteNormal = RennerTools.getJsonData("mensagemFreteNormal");

        WebElement textoFrete = seleniumRobotsTool.getElement(labelShippingPrice())
                .getShadowRoot()
                .findElement(textLabelShippingNormal());

        String mensagemAtual = textoFrete.getText();
        assertEquals(mensagemFreteNormal, mensagemAtual);
        tirarPrint(scenario);
    }

    public void clicoEmContinuar() {
        seleniumRobotsTool.waitObject(ctaPillButtonCont(), TIME_OUT);
        scrollAteElemento(seleniumRobotsTool.getElement(ctaPillButtonCont()));
        aguardoElementoClicavel(seleniumRobotsTool.getElement(ctaPillButtonCont())
                .getShadowRoot()
                .findElement(genericButtonCont())
        );

        seleniumRobotsTool.getElement(ctaPillButtonCont())
                .getShadowRoot()
                .findElement(genericButtonCont())
                .click();
        tirarPrint(scenario);
    }

    public void escolherFreteNormal() {
        seleniumRobotsTool.waitObject(selecionarFreteNormal(), TIME_OUT);
        scrollAteElemento(seleniumRobotsTool.getElement(selecionarFreteNormal()));
        aguardoElementoClicavel(seleniumRobotsTool.getElement(selecionarFreteNormal()));
        seleniumRobotsTool.getElement(selecionarFreteNormal())
                .click();
        tirarPrint(scenario);

        waitForSeconds(WAIT_FOR_SECONDS);
    }

    public void escolherFreteExpresso() {
        seleniumRobotsTool.waitObject(selecionarFreteExpresso(), TIME_OUT);

        scrollAjustado(10);

        aguardoElementoClicavel(seleniumRobotsTool.getElement(selecionarFreteExpresso()));

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

    public void resumoDaCompraFreteExpresso() {
        seleniumRobotsTool.waitObject(labelShippingPrice(), TIME_OUT);

        seleniumRobotsTool.waitObject(textLabelShippingExpress(), TIME_OUT);

        String mensagemFrete = RennerTools.getJsonData("mensagemFrete");

        WebElement textoFrete = seleniumRobotsTool.getElement(labelShippingPrice())
                .getShadowRoot()
                .findElement(textLabelShippingExpress());

        String mensagemAtual = textoFrete.getText();

        Assert.assertTrue("A mensagem não contém o trecho esperado: " + mensagemFrete,
                mensagemAtual.contains(mensagemFrete));

        tirarPrint(scenario);
    }

    public void resumoDaCompraFreteNormal() {
        seleniumRobotsTool.waitObject(labelShippingPrice(), TIME_OUT);

        seleniumRobotsTool.waitObject(textLabelShippingNormal(), TIME_OUT);

        String mensagemFrete = RennerTools.getJsonData("mensagemFrete");

        WebElement textoFrete = seleniumRobotsTool.getElement(labelShippingPrice())
                .getShadowRoot()
                .findElement(textLabelShippingNormal());

        String mensagemAtual = textoFrete.getText();

        Assert.assertTrue("A mensagem não contém o trecho esperado: " + mensagemFrete,
                mensagemAtual.contains(mensagemFrete));

        tirarPrint(scenario);
    }

    public void resumoDaCompraFrete() {
        seleniumRobotsTool.waitObject(labelShippingPrice(), TIME_OUT);

        seleniumRobotsTool.waitObject(textLabelShipping(), TIME_OUT);

        String mensagemFrete = RennerTools.getJsonData("mensagemFrete");

        WebElement textoFrete = seleniumRobotsTool.getElement(labelShippingPrice())
                .getShadowRoot()
                .findElement(textLabelShipping());

        String mensagemAtual = textoFrete.getText();

        Assert.assertTrue("A mensagem não contém o trecho esperado: " + mensagemFrete,
                mensagemAtual.contains(mensagemFrete));

        tirarPrint(scenario);
    }

    public void deveAparecerInformacaoCashbackResumoCompra() {
        seleniumRobotsTool.waitObject(labelTotalItems(), TIME_OUT);

        seleniumRobotsTool.waitObject(textLabelShipping(), TIME_OUT);

        String mensagemFrete = RennerTools.getJsonData("total dos itens");

        WebElement textoFrete = seleniumRobotsTool.getElement(labelTotalItems())
                .getShadowRoot()
                .findElement(textLabelShipping());

        String mensagemAtual = textoFrete.getText();

        Assert.assertTrue("A mensagem não contém o trecho esperado: " + mensagemFrete,
                mensagemAtual.contains(mensagemFrete));

        tirarPrint(scenario);
    }

    public void devemAparecerValoresResumoCompra() {
        seleniumRobotsTool.waitObject(labelTotalItems(), TIME_OUT);

        seleniumRobotsTool.waitObject(textLabelShipping(), TIME_OUT);

        String mensagemFrete = RennerTools.getJsonData("total dos itens");

        WebElement textoFrete = seleniumRobotsTool.getElement(labelTotalItems())
                .getShadowRoot()
                .findElement(textLabelShipping());

        String mensagemAtual = textoFrete.getText();

        Assert.assertTrue("A mensagem não contém o trecho esperado: " + mensagemFrete,
                mensagemAtual.contains(mensagemFrete));

        tirarPrint(scenario);
    }

    public void verificarBotaoQuantidade() {
        scrollAjustado(10);
        seleniumRobotsTool.waitObject(showcaseCardProduct(), TIME_OUT);
        var botaoComprar = seleniumRobotsTool.getElement(showcaseCardProduct())
                .getShadowRoot()
                .findElement(quantitySelector())
                .getShadowRoot()
                .findElement(shadowTextLabel());
        aguardoElementoClicavel(botaoComprar);
        tirarPrint(scenario);
    }

    public void verificarBotaoAdicionarSacola() {
        scrollAjustado(10);
        seleniumRobotsTool.waitObject(showcaseCardProduct(), TIME_OUT);
        var botaoComprar = seleniumRobotsTool.getElement(showcaseCardProduct())
                .getShadowRoot()
                .findElement(ctaBuyButton())
                .getShadowRoot()
                .findElement(genericButton());
        aguardoElementoClicavel(botaoComprar);
        tirarPrint(scenario);
    }

    public void clicarNoBotaoAdicionarSacola() {
        scrollAjustado(10);
        seleniumRobotsTool.waitObject(showcaseCardProduct(), TIME_OUT);
        var botaoComprar = seleniumRobotsTool.getElement(showcaseCardProduct())
                .getShadowRoot()
                .findElement(ctaBuyButton())
                .getShadowRoot()
                .findElement(genericButton());

        aguardoElementoClicavel(botaoComprar);

        botaoComprar.click();
        tirarPrint(scenario);
    }

    public void clicarNoBotaoComprarItem() {
        aguardoElementoClicavel(btnCadastrase);
        seleniumRobotsTool.waitObject(pagesCardProductSacola(), TIME_OUT);

        scrollAjustado(5);

        var botaoComprar = seleniumRobotsTool.getElement(pagesCardProductSacola())
                .getShadowRoot()
                .findElement(ctaBuyButton())
                .getShadowRoot()
                .findElement(genericButton());

        aguardoElementoClicavel(botaoComprar);
        botaoComprar.click();
        tirarPrint(scenario);
    }

    public void clicarNoBotaoMaisDoProdutoNaSacola() {
        aguardoElementoClicavel(btnCadastrase);
        seleniumRobotsTool.waitObject(showcaseCardProductSacola(), TIME_OUT);
        pressESC();
        scrollAjustado(8);

        var botaoAdicionarProduto = seleniumRobotsTool.getElement(showcaseCardProductSacola())
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
        pressESC();
        seleniumRobotsTool.waitObject(productPurchaseDetails(), TIME_OUT);

        var trashButton = seleniumRobotsTool.getElement(productPurchaseDetails())
                .getShadowRoot()
                .findElement(iconTrash())
                .getShadowRoot()
                .findElement(genericButton());

        scrollAteElemento(trashButton);
        aguardoElementoClicavel(trashButton);
        actions.moveToElement(trashButton).perform();

        tirarPrint(scenario);
        trashButton.click();
        waitForSeconds(WAIT_FOR_SECONDS);
        pressESC();
        aguardarTelaDeLoad();

        try {
            aguardarTelaDeLoad();
            aguardoElementoClicavel(seleniumRobotsTool.getElement(productPurchaseDetails())
                    .getShadowRoot()
                    .findElement(iconTrash())
                    .getShadowRoot()
                    .findElement(genericButton()));

            var trashButton1 = seleniumRobotsTool.getElement(productPurchaseDetails())
                    .getShadowRoot()
                    .findElement(iconTrash())
                    .getShadowRoot()
                    .findElement(genericButton());

            scrollAteElemento(trashButton1);
            aguardoElementoClicavel(trashButton1);
            actions.moveToElement(trashButton1).perform();

            tirarPrint(scenario);
            trashButton.click();
            waitForSeconds(WAIT_FOR_SECONDS);
        } catch (NoSuchElementException e) {

            System.out.println("Ícone da lixeira não encontrado. Passando adiante.");
        }
    }

    public void verificarMensagemSacolaVazia() {
        pressESC();
        seleniumRobotsTool.waitObject(containerCart(), TIME_OUT);
        seleniumRobotsTool.waitObject(labelPart(), TIME_OUT);

        var mensagemElemento = seleniumRobotsTool.getElement(containerCart())
                .getShadowRoot()
                .findElement(labelPart());

        String mensagemAtual = mensagemElemento.getText();

        String mensagemEsperada = RennerTools.getJsonData("MensagemSacolaVazia");

        Assert.assertEquals(mensagemEsperada, mensagemAtual);
    }

    public void verificarMensagemFreteGrátis() {
        seleniumRobotsTool.waitObject(containerCartSreeShipping(), TIME_OUT);
        seleniumRobotsTool.waitObject(labelPart(), TIME_OUT);
        pageUp(1);
        var mensagemElemento = seleniumRobotsTool.getElement(containerCartSreeShipping())
                .getShadowRoot()
                .findElement(labelPartFrete());
        String mensagemAtual = mensagemElemento.getText();
        String mensagemEsperada = RennerTools.getJsonData("freteGratis");
        Assert.assertEquals(mensagemEsperada, mensagemAtual);
    }

    public void verificarMensagemFaltaXParaFreteGrátis() {
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

    public void clicarPrimeiroProdutodaVitrine() {

        seleniumRobotsTool.waitObject(cardCarrouselBestSelers(), TIME_OUT);

        var primeiroProdutoVitrine = seleniumRobotsTool.getElement(cardCarrouselBestSelers())
                .getShadowRoot()
                .findElement(headerLinksBestSellers1());

        scrollAteElemento(primeiroProdutoVitrine);
        aguardoElementoClicavel(primeiroProdutoVitrine);

        primeiroProdutoVitrine.click();
        tirarPrint(scenario);

        waitForSeconds(WAIT_FOR_SECONDS);
    }

    public void clicarPrimeiroProdutodaTela() {

        seleniumRobotsTool.waitObject(productCardWishlist(), TIME_OUT);

        var primeiroProduto = seleniumRobotsTool.getElement(productCardWishlist());

        scrollAteElemento(primeiroProduto);
        aguardoElementoClicavel(primeiroProduto);

        primeiroProduto.click();
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

    public void acessarProdutoNaBuscaPosicao(String pos) {
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
}