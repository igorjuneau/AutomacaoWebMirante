package br.com.mirante.interactions.Home;

import br.com.mirante.pages.Home.HomePages;
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
import static br.com.mirante.toolbox.RennerTools.*;
import static org.junit.Assert.assertEquals;

public class HomeInteractions extends HomePages {

    private static final int TIME_OUT = 20;
    private static DadosProduto dadosProduto;
    private static final int WAIT_FOR_SECONDS = 2;

    public HomeInteractions() {
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

    public void selecionoIconeHome() {
        scrollAteElemento(seleniumRobotsTool.getElement(header())
                .getShadowRoot()
                .findElement(iconeHome()));

        aguardoElementoClicavel(seleniumRobotsTool.getElement(header())
                .getShadowRoot()
                .findElement(iconeHome()));

        seleniumRobotsTool.getElement(header())
                .getShadowRoot()
                .findElement(iconeHome())
                .click();

        aguardoAnimacoesJS();
        tirarPrint(scenario);
    }

    public void verificoSeFoiAdidionadoAHome() {
        scrollAteElemento(seleniumRobotsTool.getElement(header())
                .getShadowRoot()
                .findElement(iconeHome()));

        aguardoElementoClicavel(seleniumRobotsTool.getElement(header())
                .getShadowRoot()
                .findElement(iconeHome()));

        seleniumRobotsTool.getElement(header())
                .getShadowRoot()
                .findElement(iconeHome())
                .click();

        aguardoAnimacoesJS();

        Assert.assertTrue("Produto nao foi adicionado a Home", seleniumRobotsTool.getElement(shadowDetalheProdutoHome())
                .getShadowRoot()
                .findElement(iconeRetirarHome()).isEnabled());
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

    public void clicoEmAdicionarEndereco() {
        seleniumRobotsTool.waitObject(checkoutDelivery(), TIME_OUT);
        scrollAteElemento(seleniumRobotsTool.getElement(checkoutDelivery()));

        seleniumRobotsTool.getElement(checkoutDelivery())
                .getShadowRoot()
                .findElement(cardsNewAddress())
                .getShadowRoot()
                .findElement(ctaIconButton())
                .getShadowRoot()
                .findElement(genericButton())
                .click();
        tirarPrint(scenario);
    }

    public void clicoEmEditarEndereco() {
        seleniumRobotsTool.waitObject(checkoutDelivery(), TIME_OUT);
        scrollAteElemento(seleniumRobotsTool.getElement(checkoutDelivery()));

        seleniumRobotsTool.getElement(checkoutDelivery())
                .getShadowRoot()
                .findElement(cardsAddressCard())
                .getShadowRoot()
                .findElement(ctaIconButton())
                .getShadowRoot()
                .findElement(buttonPen())
                .click();
        tirarPrint(scenario);
    }

    public void clicoEmContinuar() {
        seleniumRobotsTool.waitObject(ctaPillButtonCont(), TIME_OUT);
        pressESC();
        pageDown(2);
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

    public void resumoDaCompraFrete() {
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

    public void clicarNoBotaoAdicionarHome() {
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

    public void verificoVitrineFavoritos() {
        aguardoElementoClicavel(btnCadastrase);
        seleniumRobotsTool.waitObject(productCardWishlist(), TIME_OUT);
        seleniumRobotsTool.getElement(productCardWishlist());
    }

    public void verificoItemFavoritado() {
        aguardoElementoClicavel(btnCadastrase);
        seleniumRobotsTool.waitObject(cardsProductSquareListingExpanded(), TIME_OUT);
        var itemFavoritado = seleniumRobotsTool.getElement(cardsProductSquareListingExpanded())
                .getShadowRoot()
                .findElement(ctaFavoriteButtonON());

        aguardoElementoClicavel(itemFavoritado);
    }

    public void clicarNoBotaofavoritarItem() {
        aguardoElementoClicavel(btnCadastrase);
        seleniumRobotsTool.waitObject(cardsProductSquareListingExpanded(), TIME_OUT);
        pressESC();
        scrollAjustado(5);

        var botaoFavoritar = seleniumRobotsTool.getElement(cardsProductSquareListingExpanded())
                .getShadowRoot()
                .findElement(ctaFavoriteButton())
                .getShadowRoot()
                .findElement(button());

        aguardoElementoClicavel(botaoFavoritar);
        botaoFavoritar.click();
        tirarPrint(scenario);
    }

    public void clicarNoBotaoComprarItem() {
        aguardoElementoClicavel(btnCadastrase);
        seleniumRobotsTool.waitObject(pagesCardProductHome(), TIME_OUT);

        scrollAjustado(5);

        var botaoComprar = seleniumRobotsTool.getElement(pagesCardProductHome())
                .getShadowRoot()
                .findElement(ctaBuyButton())
                .getShadowRoot()
                .findElement(genericButton());

        aguardoElementoClicavel(botaoComprar);
        botaoComprar.click();
        tirarPrint(scenario);
    }

    public void clicarNoBotaoMaisDoProdutoNaHome() {
        aguardoElementoClicavel(btnCadastrase);
        seleniumRobotsTool.waitObject(showcaseCardProductHome(), TIME_OUT);

        scrollAjustado(8);

        var botaoAdicionarProduto = seleniumRobotsTool.getElement(showcaseCardProductHome())
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

        scrollAteElemento(trashButton);

        aguardoElementoClicavel(trashButton);

        actions.moveToElement(trashButton).perform();

        tirarPrint(scenario);

        trashButton.click();

        waitForSeconds(WAIT_FOR_SECONDS);
    }

    public void verificarMensagemHomeVazia() {
        seleniumRobotsTool.waitObject(containerCart(), TIME_OUT);
        seleniumRobotsTool.waitObject(labelPart(), TIME_OUT);

        var mensagemElemento = seleniumRobotsTool.getElement(containerCart())
                .getShadowRoot()
                .findElement(labelPart());

        String mensagemAtual = mensagemElemento.getText();

        String mensagemEsperada = RennerTools.getJsonData("MensagemHomeVazia");

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

    public void validarRetornoBusca() {
        esperarWeb(produtosResultadosContainer());
        esperarWeb(cardsProdutos());
        List<WebElement> cards = driver.findElements(cardsProdutos());
        Assert.assertFalse("Nenhum resultado encontrado para a busca.", cards.isEmpty());
    }

    public void verificoqueEstouemHome() {
        seleniumRobotsTool.waitObject(bannerFull(), TIME_OUT);
        var paginaHome = seleniumRobotsTool.getElement(bannerFull());
        esperarWeb(paginaHome);
        tirarPrint(scenario);
    }

    public void roloATelaParaBaixo() {
        seleniumRobotsTool.waitObject(bannerFull(), TIME_OUT);
        pageDown(1);
    }

    public void roloATelaParaBaixo2x() {
        seleniumRobotsTool.waitObject(bannerFull(), TIME_OUT);
        pageDown(2);
    }

    public void roloATelaParaBaixo5x() {
        seleniumRobotsTool.waitObject(bannerFull(), TIME_OUT);
        pageDown(5);
    }

    public void roloATelaParaBaixo11() {
        seleniumRobotsTool.waitObject(bannerFull(), TIME_OUT);
        pageDown(11);
    }

    public void roloATelaParaBaixo17() {
        seleniumRobotsTool.waitObject(bannerFull(), TIME_OUT);
        pageDown(17);
    }

    public void validarBannerDuasImagens() {
        seleniumRobotsTool.waitObject(cardRectangleSquare(), TIME_OUT);
        var imagem01 = seleniumRobotsTool.getElement(cardRectangleSquare());
        scrollAteElemento(imagem01);
        var imagem02 = seleniumRobotsTool.getElement(cardMaskHorizontal());
        scrollAteElemento(imagem02);
        tirarPrint(scenario);
    }

    public void validarBannerCincoImagens() {
        seleniumRobotsTool.waitObject(cardsCarrouselBestSellers(), TIME_OUT);
        var image01 = seleniumRobotsTool.getElement(cardsCarrouselBestSellers())
                .getShadowRoot()
                .findElement(cardsProductSquareBestSellers1());
        scrollAteElemento(image01);
        var image02 = seleniumRobotsTool.getElement(cardsCarrouselBestSellers())
                .getShadowRoot()
                .findElement(cardsProductSquareBestSellers2());
        scrollAteElemento(image02);
        var image03 = seleniumRobotsTool.getElement(cardsCarrouselBestSellers())
                .getShadowRoot()
                .findElement(cardsProductSquareBestSellers3());
        scrollAteElemento(image03);
        var image04 = seleniumRobotsTool.getElement(cardsCarrouselBestSellers())
                .getShadowRoot()
                .findElement(cardsProductSquareBestSellers4());
        scrollAteElemento(image04);
        var image05 = seleniumRobotsTool.getElement(cardsCarrouselBestSellers())
                .getShadowRoot()
                .findElement(cardsProductSquareBestSellers5());
        scrollAteElemento(image05);
        tirarPrint(scenario);
    }

    public void adicaoEndDisponivel() {
        seleniumRobotsTool.waitObject(adressModalAdic(), TIME_OUT);
        var adicionarEndereco = seleniumRobotsTool.getElement(adressModalAdic());
        esperarWeb(adicionarEndereco);
        tirarPrint(scenario);
    }

    public void edicaoEndDisponivel() {
        seleniumRobotsTool.waitObject(adressModal(), TIME_OUT);
        var editarEndereco = seleniumRobotsTool.getElement(adressModal());
        esperarWeb(editarEndereco);
        tirarPrint(scenario);
    }

    public void imagensIndisponiveisnaHome() {
        seleniumRobotsTool.waitObject(productCardsProductSquare(), TIME_OUT);
        pageUp(3);
        var Indisponivel = seleniumRobotsTool.getElement(productCardsProductSquare())
                .getShadowRoot()
                .findElement(cardsProductSquare())
                .getShadowRoot()
                .findElement(imagemIndisponivelHome());
        esperarWeb(Indisponivel);
        tirarPrint(scenario);
    }

    public void encontroBannerServicosExclusivos() {
        seleniumRobotsTool.waitObject(ctaIconButtonNext(), TIME_OUT);
        var bannerService = seleniumRobotsTool.getElement(ctaIconButtonNext());
        aguardoElementoClicavel(bannerService);
        tirarPrint(scenario);
    }

    public void mudarImagemEsquerda() {
        seleniumRobotsTool.waitObject(ctaIconButtonNext(), TIME_OUT);
        var bannerServiceIconButton = seleniumRobotsTool.getElement(ctaIconButtonNext())
                .getShadowRoot()
                .findElement(navBt());
        aguardoElementoClicavel(bannerServiceIconButton);
        bannerServiceIconButton.click();
        tirarPrint(scenario);
    }

    public void mudarImagemDireita() {
        seleniumRobotsTool.waitObject(ctaIconButtonPrev(), TIME_OUT);
        var bannerServiceIconButton = seleniumRobotsTool.getElement(ctaIconButtonPrev())
                .getShadowRoot()
                .findElement(navBt());
        aguardoElementoClicavel(bannerServiceIconButton);
        bannerServiceIconButton.click();
        tirarPrint(scenario);
    }

    public void vitrineMaisVendidos() {
        seleniumRobotsTool.waitObject(headerLinksBestSellers(), TIME_OUT);
        var bestSellers = seleniumRobotsTool.getElement(headerLinksBestSellers());
        scrollAteElemento(bestSellers);
        aguardoElementoClicavel(bestSellers);
        tirarPrint(scenario);
    }

    public void visualizoBannersHome() {
        seleniumRobotsTool.waitObject(editorialContainer(), TIME_OUT);
        roloATelaParaBaixo2x();
        var editorialContainer = seleniumRobotsTool.getElement(editorialContainer());
        aguardoElementoClicavel(editorialContainer);
        roloATelaParaBaixo2x();
        var bannerNovidades = seleniumRobotsTool.getElement(bannerNovidades());
        aguardoElementoClicavel(bannerNovidades);
        roloATelaParaBaixo2x();
        var sujestoesdaSemana = seleniumRobotsTool.getElement(bannerSujestoesdaSemana());
        aguardoElementoClicavel(sujestoesdaSemana);
        roloATelaParaBaixo2x();
        var solucaoCompleta = seleniumRobotsTool.getElement(bannerSolucaoCompleta());
        aguardoElementoClicavel(solucaoCompleta);
        tirarPrint(scenario);
    }
}