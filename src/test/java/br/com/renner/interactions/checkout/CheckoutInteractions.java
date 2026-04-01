package br.com.mirante.interactions.checkout;

import br.com.mirante.pages.checkout.CheckoutPage;
import br.com.mirante.robots.key.RnKeys;
import br.com.mirante.toolbox.RennerTools;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

import static br.com.renner.steps.hook.WebSetup.*;
import static br.com.renner.toolbox.GlobalTools.getExecutionUrl;
import static br.com.renner.toolbox.RennerTools.*;


public class CheckoutInteractions extends CheckoutPage {

    private static final int TIME_OUT = 20;

    Actions actions = new Actions(driver);


    public CheckoutInteractions() {
    }

    public void fecharCashBack() {
        var modal = seleniumRobotsTool.getElement(cashbackModal())
                .getShadowRoot()
                .findElement(genericButton());
        aguardoElementoClicavel(modal);
        modal.click();
    }

    public void pesquisoPelaSkuSalva(String sku) throws Exception {

        seleniumRobotsTool.getDriver().get(getExecutionUrl());
        aguardoElementoClicavel(seleniumRobotsTool
                .getElement(header())
                .getShadowRoot()
                .findElement(shadowHeaderSearchIcon())
                .getShadowRoot()
                .findElement(button()));

        seleniumRobotsTool.getElement(header())
                .getShadowRoot()
                .findElement(divSearchIcon())
                .click();

        aguardoElementoClicavel(seleniumRobotsTool
                .getElement(header())
                .getShadowRoot()
                .findElement(shadowInputPesquisa())
                .getShadowRoot()
                .findElement(inputPesquisa()));

        seleniumRobotsTool.setText(seleniumRobotsTool
                .getElement(header())
                .getShadowRoot()
                .findElement(shadowInputPesquisa())
                .getShadowRoot()
                .findElement(inputPesquisa()), RennerTools.getJsonData(sku));

        tirarPrint(scenario);

        seleniumRobotsTool.sendKeys(seleniumRobotsTool
                .getElement(header())
                .getShadowRoot()
                .findElement(shadowInputPesquisa())
                .getShadowRoot()
                .findElement(inputPesquisa()), RnKeys.ENTER);
        esperarWeb(cardPrimeiroProdutoPesquisa());
        clickCashbackButtonIfExists();
    }

    public void acessoPrimeiroProduto() throws Exception {
        aguardoAnimacoesJS();
        pressESC();
        aguardoElementoClicavel(seleniumRobotsTool.getElement(cardPrimeiroProdutoPesquisa()));
        scrollAteElemento(seleniumRobotsTool.getElement(cardPrimeiroProdutoPesquisa()));
        aguardoElementoClicavel(seleniumRobotsTool.getElement(cardPrimeiroProdutoPesquisa()));
        clickCashbackButtonIfExists();
        waitForSeconds(2);
        tirarPrint(scenario);
        seleniumRobotsTool.click(cardPrimeiroProdutoPesquisa());
        seleniumRobotsTool.waitObject(header(), TIME_OUT);

    }

    public void adicionarProdutoASacola() throws Exception {
        clickCashbackButtonIfExists();
        aguardoElementoClicavel(seleniumRobotsTool.getElement(shadowProductPage())
                .getShadowRoot()
                .findElement(shadowBtnComprar())
                .getShadowRoot()
                .findElement(button()));

        seleniumRobotsTool.ScrollToObject(seleniumRobotsTool.getElement(shadowProductPage())
                .getShadowRoot()
                .findElement(shadowBtnComprar())
                .getShadowRoot()
                .findElement(button()));

        aguardoElementoClicavel(seleniumRobotsTool.getElement(shadowProductPage())
                .getShadowRoot()
                .findElement(shadowBtnComprar())
                .getShadowRoot()
                .findElement(button()));
        clickCashbackButtonIfExists();
        seleniumRobotsTool.getElement(shadowProductPage())
                .getShadowRoot()
                .findElement(shadowBtnComprar())
                .getShadowRoot()
                .findElement(button())
                .click();
        tirarPrint(scenario);
    }

    public void aumentoQuantidadeEm3() {
        scrollAjustado(1);
        aguardoElementoClicavel(seleniumRobotsTool.getElement(productPurchaseDetails())
                .getShadowRoot()
                .findElement(selectorsQuantitySelector())
                .getShadowRoot()
                .findElement(spanIncrementButton()));

        seleniumRobotsTool.getElement(productPurchaseDetails())
                .getShadowRoot()
                .findElement(selectorsQuantitySelector())
                .getShadowRoot()
                .findElement(spanIncrementButton())
                .click();
        aguardoAnimacoesJS();
        aguardoElementoClicavel(seleniumRobotsTool.getElement(productPurchaseDetails())
                .getShadowRoot()
                .findElement(selectorsQuantitySelector())
                .getShadowRoot()
                .findElement(spanIncrementButton()));

        seleniumRobotsTool.getElement(productPurchaseDetails())
                .getShadowRoot()
                .findElement(selectorsQuantitySelector())
                .getShadowRoot()
                .findElement(spanIncrementButton())
                .click();
        aguardoAnimacoesJS();
        tirarPrint(scenario);
    }

    public void verificoSeFoiAdidionadoASacolaCheckout() {
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

        Assert.assertTrue("Produto nao foi adicionado a Sacola", seleniumRobotsTool.getElement(shadowDetalheProdutoSacola())
                .getShadowRoot()
                .findElement(iconeRetirarSacola()).isEnabled());
        tirarPrint(scenario);
    }

    public void finalizoACompraComBoleto() {
        pageDown(1);
        scrollAteElemento(seleniumRobotsTool.getElement(ctaPillButtonCont()));
        aguardoElementoClicavel(seleniumRobotsTool.getElement(ctaPillButtonCont())
                .getShadowRoot()
                .findElement(genericButton())
        );
        seleniumRobotsTool.getElement(ctaPillButtonCont())
                .getShadowRoot()
                .findElement(genericButton())
                .click();
        tirarPrint(scenario);

        pageDown(4);
        scrollAteElemento(seleniumRobotsTool.getElement(selecionarFreteNormal()));
        aguardoElementoClicavel(seleniumRobotsTool.getElement(selecionarFreteNormal()));
        seleniumRobotsTool.getElement(selecionarFreteNormal())
                .click();

        scrollAteOElementoWeb(seleniumRobotsTool.getElement(buttonIrParaPagamento()));
        aguardoElementoClicavel(seleniumRobotsTool.getElement(buttonIrParaPagamento()));
        seleniumRobotsTool.getElement(buttonIrParaPagamento())
                .getShadowRoot()
                .findElement(button())
                .click();

        aguardoAnimacoesJS();
        aguardoElementoClicavel(seleniumRobotsTool.getElement(boletoBancarioPayment()));
        seleniumRobotsTool.getElement(boletoBancarioPayment()).click();
        aguardoAnimacoesJS();

        aguardoElementoClicavel(seleniumRobotsTool.getElement(boletoCloseOrderButton()));
        var finalizarCompraBoletoButton = seleniumRobotsTool.getElement(boletoCloseOrderButton())
                .getShadowRoot()
                .findElement(button());

        actions.moveToElement(finalizarCompraBoletoButton).perform();

        tirarPrint(scenario);

        finalizarCompraBoletoButton.click();

        aguardoAnimacoesJS();
    }

    public void validoPedido() {
        aguardoAnimacoesJS();
        aguardoElementoClicavel(seleniumRobotsTool.getElement(btnFechar()));
        seleniumRobotsTool.getElement(btnFechar()).click();
    }

    public void validoPedidoBoleto() {
        aguardoAnimacoesJS();
        aguardoElementoClicavel(seleniumRobotsTool.getElement(btnFechar()));
        seleniumRobotsTool.getElement(btnFechar()).click();
    }

    public void finalizoCompraValeTroca() throws Exception {
        scrollAteElemento(seleniumRobotsTool.getElement(ctaPillButtonCont()));
        aguardoElementoClicavel(seleniumRobotsTool.getElement(ctaPillButtonCont())
                .getShadowRoot()
                .findElement(genericButton())
        );

        seleniumRobotsTool.getElement(ctaPillButtonCont())
                .getShadowRoot()
                .findElement(genericButton())
                .click();
        tirarPrint(scenario);

        pageDown(4);
        scrollAteElemento(seleniumRobotsTool.getElement(selecionarFreteNormal()));
        aguardoElementoClicavel(seleniumRobotsTool.getElement(selecionarFreteNormal()));
        seleniumRobotsTool.getElement(selecionarFreteNormal())
                .click();

        scrollAteOElementoWeb(seleniumRobotsTool.getElement(buttonIrParaPagamento()));
        aguardoElementoClicavel(seleniumRobotsTool.getElement(buttonIrParaPagamento()));
        seleniumRobotsTool.getElement(buttonIrParaPagamento())
                .getShadowRoot()
                .findElement(button())
                .click();

        aguardoAnimacoesJS();

        aguardoElementoClicavel(seleniumRobotsTool.getElement(valeTrocaPayment()));
        seleniumRobotsTool.getElement(valeTrocaPayment()).click();
        aguardoAnimacoesJS();

        aguardoElementoClicavel(seleniumRobotsTool.getElement(shadowInputCPFValeTroca())
                .getShadowRoot()
                .findElement(genericInput()));

        seleniumRobotsTool.setText(seleniumRobotsTool.getElement(shadowInputCPFValeTroca())
                .getShadowRoot()
                .findElement(genericInput()), RennerTools.getJsonData("InicioCPF"));
        seleniumRobotsTool.sendKeys(seleniumRobotsTool.getElement(shadowInputCPFValeTroca())
                .getShadowRoot()
                .findElement(genericInput()), RnKeys.ENTER);

        aguardoElementoClicavel(seleniumRobotsTool.getElement(shadowCheckboxValeTroca())
                .getShadowRoot()
                .findElement(shadowCheckboxValeTroca2())
                .getShadowRoot()
                .findElement(checkboxValeTroca()));
        seleniumRobotsTool.getElement(shadowCheckboxValeTroca())
                .getShadowRoot()
                .findElement(shadowCheckboxValeTroca2())
                .getShadowRoot()
                .findElement(checkboxValeTroca()).click();

        aguardoAnimacoesJS();

        scrollAjustado(2);
        var finalizarCompraVTButton = seleniumRobotsTool.getElement(btnFinalizarCompraVT());

        actions.moveToElement(finalizarCompraVTButton).perform();

        tirarPrint(scenario);

        finalizarCompraVTButton.click();
    }

    public void finalizoCompraCartaoRenner() throws Exception {
        scrollAteElemento(seleniumRobotsTool.getElement(ctaPillButtonCont()));
        aguardoElementoClicavel(seleniumRobotsTool.getElement(ctaPillButtonCont())
                .getShadowRoot()
                .findElement(genericButton())
        );

        seleniumRobotsTool.getElement(ctaPillButtonCont())
                .getShadowRoot()
                .findElement(genericButton())
                .click();
        tirarPrint(scenario);

        pageDown(4);
        scrollAteElemento(seleniumRobotsTool.getElement(selecionarFreteNormal()));
        aguardoElementoClicavel(seleniumRobotsTool.getElement(selecionarFreteNormal()));
        seleniumRobotsTool.getElement(selecionarFreteNormal())
                .click();

        scrollAteOElementoWeb(seleniumRobotsTool.getElement(buttonIrParaPagamento()));
        aguardoElementoClicavel(seleniumRobotsTool.getElement(buttonIrParaPagamento()));
        seleniumRobotsTool.getElement(buttonIrParaPagamento())
                .getShadowRoot()
                .findElement(button())
                .click();

        aguardoAnimacoesJS();

        aguardoElementoClicavel(seleniumRobotsTool.getElement(cartaoRenner()));
        seleniumRobotsTool.getElement(cartaoRenner()).click();
        aguardoAnimacoesJS();

        seleniumRobotsTool.setText(seleniumRobotsTool.getElement(shadowInputCVV())
                .getShadowRoot()
                .findElement(shadowInputCVV2())
                .getShadowRoot()
                .findElement(genericInput()), "123");

        seleniumRobotsTool.getElement(paymentForm())
                .getShadowRoot()
                .findElement(dropdownCardInstallmentSelector())
                .getShadowRoot()
                .findElement(button())
                .click();

        seleniumRobotsTool.getElement(paymentForm())
                .getShadowRoot()
                .findElement(dropdownCardInstallmentSelector())
                .getShadowRoot()
                .findElement(firstInstallmentOption())
                .click();

        aguardoElementoClicavel(seleniumRobotsTool.getElement(paymentForm())
                .getShadowRoot()
                .findElement(finalizaCompraCartao()));

        var finalizarCompraCartaoButton = seleniumRobotsTool.getElement(paymentForm())
                .getShadowRoot()
                .findElement(finalizaCompraCartao());

        actions.moveToElement(finalizarCompraCartaoButton).perform();

        tirarPrint(scenario);

        finalizarCompraCartaoButton.click();
    }

    public void finalizoCompraCartaoCreditoMeuCartao() throws Exception {
        scrollAteElemento(seleniumRobotsTool.getElement(ctaPillButtonCont()));
        aguardoElementoClicavel(seleniumRobotsTool.getElement(ctaPillButtonCont())
                .getShadowRoot()
                .findElement(genericButton())
        );

        seleniumRobotsTool.getElement(ctaPillButtonCont())
                .getShadowRoot()
                .findElement(genericButton())
                .click();
        tirarPrint(scenario);

        pageDown(4);
        scrollAteElemento(seleniumRobotsTool.getElement(selecionarFreteNormal()));
        aguardoElementoClicavel(seleniumRobotsTool.getElement(selecionarFreteNormal()));
        seleniumRobotsTool.getElement(selecionarFreteNormal())
                .click();

        scrollAteOElementoWeb(seleniumRobotsTool.getElement(buttonIrParaPagamento()));
        aguardoElementoClicavel(seleniumRobotsTool.getElement(buttonIrParaPagamento()));
        seleniumRobotsTool.getElement(buttonIrParaPagamento())
                .getShadowRoot()
                .findElement(button())
                .click();

        aguardoAnimacoesJS();

        aguardoElementoClicavel(seleniumRobotsTool.getElement(meuCartaPayment()));
        seleniumRobotsTool.getElement(meuCartaPayment()).click();
        aguardoAnimacoesJS();

        seleniumRobotsTool.setText(seleniumRobotsTool.getElement(shadowInputCVV())
                .getShadowRoot()
                .findElement(shadowInputCVV2())
                .getShadowRoot()
                .findElement(genericInput()), "123");

        seleniumRobotsTool.getElement(paymentForm())
                .getShadowRoot()
                .findElement(dropdownCardInstallmentSelector())
                .getShadowRoot()
                .findElement(button())
                .click();

        seleniumRobotsTool.getElement(paymentForm())
                .getShadowRoot()
                .findElement(dropdownCardInstallmentSelector())
                .getShadowRoot()
                .findElement(firstInstallmentOption())
                .click();

        aguardoElementoClicavel(seleniumRobotsTool.getElement(paymentForm())
                .getShadowRoot()
                .findElement(finalizaCompraCartao()));

        var finalizarCompraCartaoButton = seleniumRobotsTool.getElement(paymentForm())
                .getShadowRoot()
                .findElement(finalizaCompraCartao());

        actions.moveToElement(finalizarCompraCartaoButton).perform();

        tirarPrint(scenario);

        finalizarCompraCartaoButton.click();
    }

    public void finalizoCompraCartaoCreditoBandeira(String cartao) throws Exception {
        seleniumRobotsTool.getDriver().get(getExecutionUrl());
        scrollAteElemento(seleniumRobotsTool.getElement(ctaPillButtonCont()));
        aguardoElementoClicavel(seleniumRobotsTool.getElement(ctaPillButtonCont())
                .getShadowRoot()
                .findElement(genericButton()));

        seleniumRobotsTool.getElement(ctaPillButtonCont())
                .getShadowRoot()
                .findElement(genericButton())
                .click();
        tirarPrint(scenario);

        pageDown(4);
        scrollAteElemento(seleniumRobotsTool.getElement(selecionarFreteNormal()));
        aguardoElementoClicavel(seleniumRobotsTool.getElement(selecionarFreteNormal()));
        seleniumRobotsTool.getElement(selecionarFreteNormal())
                .click();

        scrollAteOElementoWeb(seleniumRobotsTool.getElement(buttonIrParaPagamento()));
        aguardoElementoClicavel(seleniumRobotsTool.getElement(buttonIrParaPagamento()));
        seleniumRobotsTool.getElement(buttonIrParaPagamento())
                .getShadowRoot()
                .findElement(button())
                .click();

        aguardoAnimacoesJS();

        aguardoElementoClicavel(seleniumRobotsTool.getElement(cartaoCreditoPayment()));
        seleniumRobotsTool.getElement(cartaoCreditoPayment()).click();
        aguardoAnimacoesJS();

        seleniumRobotsTool.setText(seleniumRobotsTool.getElement(shadowInputCVV())
                .getShadowRoot()
                .findElement(shadowInputCVV2())
                .getShadowRoot()
                .findElement(genericInput()), RennerTools.getJsonData(cartao));

        seleniumRobotsTool.getElement(paymentForm())
                .getShadowRoot()
                .findElement(dropdownCardInstallmentSelector())
                .getShadowRoot()
                .findElement(button())
                .click();

        seleniumRobotsTool.getElement(paymentForm())
                .getShadowRoot()
                .findElement(dropdownCardInstallmentSelector())
                .getShadowRoot()
                .findElement(firstInstallmentOption())
                .click();

        aguardoElementoClicavel(seleniumRobotsTool.getElement(paymentForm())
                .getShadowRoot()
                .findElement(finalizaCompraCartao()));

        var finalizarCompraCartaoButton = seleniumRobotsTool.getElement(paymentForm())
                .getShadowRoot()
                .findElement(finalizaCompraCartao());

        actions.moveToElement(finalizarCompraCartaoButton).perform();

        tirarPrint(scenario);

        finalizarCompraCartaoButton.click();
    }
    public void finalizoCompraCartaoCredito() throws Exception {
        scrollAteElemento(seleniumRobotsTool.getElement(ctaPillButtonCont()));
        aguardoElementoClicavel(seleniumRobotsTool.getElement(ctaPillButtonCont())
                .getShadowRoot()
                .findElement(genericButton())
        );

        seleniumRobotsTool.getElement(ctaPillButtonCont())
                .getShadowRoot()
                .findElement(genericButton())
                .click();
        tirarPrint(scenario);

        pageDown(4);
        scrollAteElemento(seleniumRobotsTool.getElement(selecionarFreteNormal()));
        aguardoElementoClicavel(seleniumRobotsTool.getElement(selecionarFreteNormal()));
        seleniumRobotsTool.getElement(selecionarFreteNormal())
                .click();

        scrollAteOElementoWeb(seleniumRobotsTool.getElement(buttonIrParaPagamento()));
        aguardoElementoClicavel(seleniumRobotsTool.getElement(buttonIrParaPagamento()));
        seleniumRobotsTool.getElement(buttonIrParaPagamento())
                .getShadowRoot()
                .findElement(button())
                .click();

        aguardoAnimacoesJS();

        aguardoElementoClicavel(seleniumRobotsTool.getElement(cartaoCreditoPayment()));
        seleniumRobotsTool.getElement(cartaoCreditoPayment()).click();
        aguardoAnimacoesJS();

        seleniumRobotsTool.setText(seleniumRobotsTool.getElement(shadowInputCVV())
                .getShadowRoot()
                .findElement(shadowInputCVV2())
                .getShadowRoot()
                .findElement(genericInput()), "123");

        seleniumRobotsTool.getElement(paymentForm())
                .getShadowRoot()
                .findElement(dropdownCardInstallmentSelector())
                .getShadowRoot()
                .findElement(button())
                .click();

        seleniumRobotsTool.getElement(paymentForm())
                .getShadowRoot()
                .findElement(dropdownCardInstallmentSelector())
                .getShadowRoot()
                .findElement(firstInstallmentOption())
                .click();

        aguardoElementoClicavel(seleniumRobotsTool.getElement(paymentForm())
                .getShadowRoot()
                .findElement(finalizaCompraCartao()));

        var finalizarCompraCartaoButton = seleniumRobotsTool.getElement(paymentForm())
                .getShadowRoot()
                .findElement(finalizaCompraCartao());

        actions.moveToElement(finalizarCompraCartaoButton).perform();

        tirarPrint(scenario);

        finalizarCompraCartaoButton.click();
    }
    public void finalizoACompraComPIX() {
        scrollAteElemento(seleniumRobotsTool.getElement(ctaPillButtonCont()));
        aguardoElementoClicavel(seleniumRobotsTool.getElement(ctaPillButtonCont())
                .getShadowRoot()
                .findElement(genericButton())
        );

        seleniumRobotsTool.getElement(ctaPillButtonCont())
                .getShadowRoot()
                .findElement(genericButton())
                .click();
        tirarPrint(scenario);

        pageDown(4);
        scrollAteElemento(seleniumRobotsTool.getElement(selecionarFreteNormal()));
        aguardoElementoClicavel(seleniumRobotsTool.getElement(selecionarFreteNormal()));
        seleniumRobotsTool.getElement(selecionarFreteNormal())
                .click();

        scrollAteOElementoWeb(seleniumRobotsTool.getElement(buttonIrParaPagamento()));
        aguardoElementoClicavel(seleniumRobotsTool.getElement(buttonIrParaPagamento()));
        seleniumRobotsTool.getElement(buttonIrParaPagamento())
                .getShadowRoot()
                .findElement(button())
                .click();

        aguardoAnimacoesJS();
        aguardoElementoClicavel(seleniumRobotsTool.getElement(PIXPayment()));
        seleniumRobotsTool.getElement(PIXPayment()).click();
        aguardoAnimacoesJS();

        aguardoElementoClicavel(seleniumRobotsTool.getElement(boletoCloseOrderButton()));
        seleniumRobotsTool.getElement(boletoCloseOrderButton())
                .getShadowRoot()
                .findElement(button())
                .click();
        aguardoAnimacoesJS();

        tirarPrint(scenario);
    }

}
