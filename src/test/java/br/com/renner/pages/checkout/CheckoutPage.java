package br.com.mirante.pages.checkout;

import org.openqa.selenium.By;

public class CheckoutPage {
    public static By header() {
        return By.cssSelector("#PageHeader");
    }
    public static By iconeSacola() {
        return By.cssSelector("header-bag-icon");
    }
    public static By iconeRetirarSacola() {
        return By.cssSelector("#iconTrash");
    }
    public static By shadowDetalheProdutoSacola() {
        return By.cssSelector("product-purchase-details");
    }
    public static By shadowHeaderSearchIcon() {
        return By.cssSelector("header-search-icon");
    }
    public static By button() {
        return By.cssSelector("button");
    }
    public static By shadowInputPesquisa() {
        return By.cssSelector("input-rounded-search");
    }
    public static By inputPesquisa() {
        return By.cssSelector("#automation-search-icon-template-input-id");
    }
    public static By cardPrimeiroProdutoPesquisa() {
        return By.cssSelector("product-card-square-listing-expanded:nth-child(1)");
    }
    public static By shadowProductPage() {
        return By.cssSelector("pages-product-page");
    }
    public static By shadowBtnComprar() {
        return By.cssSelector("cta-buy-button");
    }
    public static By shadowButtonContinue() {
        return By.cssSelector("#buttonContinue");
    }
    public static By selecionarFreteNormal() {
        return By.cssSelector("cards-freight-card[icon='deliver']");
    }
    public static By cardFreight() {
        return By.cssSelector("cardFreight");
    }
    public static By shippingMethodStandard() {
        return By.cssSelector("cards-freight-card[data-shipping-method='7062_STANDARD']");
    }
    public static By ctaPillButtonCont() {
        return By.cssSelector("cta-pill-button#buttonContinue");
    }
    public static By buttonIrParaPagamento() {
        return By.cssSelector("#payment-button-desktop");
    }
    public static By boletoBancarioPayment() {
        return By.cssSelector("[paymenttitle='Boleto Bancário']");
    }
    public static By valeTrocaPayment() {
        return By.cssSelector("[paymenttitle='Vale Troca']");
    }
    public static By PIXPayment() {
        return By.cssSelector("[paymenttitle='Pix']");
    }
    public static By cartaoCreditoPayment() {
        return By.cssSelector("[paymenttitle='Cartão de Crédito']");
    }
    public static By cartaomirante() {
        return By.cssSelector("[paymenttitle='Cartão mirante']");
    }
    public static By meuCartaPayment() {
        return By.cssSelector("[paymenttitle='Meu Cartão']");
    }
    public static By shadowInputCPFValeTroca() {
        return By.cssSelector("#storeCreditValidationInput");
    }
    public static By boletoCloseOrderButton() {
        return By.cssSelector("#boletoCloseOrderButton");
    }
    public static By btnFechar() {
        return By.cssSelector("#btFechar");
    }
    public By divSearchIcon() {
        return By.cssSelector(".icon.search-icon");
    }
    public static By modalCookies() {
        return By.cssSelector("modal-cookies");
    }
    public static By ctaPillButton() {
        return By.cssSelector("cta-pill-button");
    }
    public static By genericButton() {
        return By.cssSelector("button");
    }
    public static By genericInput() {
        return By.cssSelector("input");
    }
    public static By productPurchaseDetails() {
        return By.cssSelector("product-purchase-details");
    }
    public static By selectorsQuantitySelector() {
        return By.cssSelector("#selectorQuantity");
    }
    public static By spanIncrementButton() {
        return By.cssSelector("div > span:nth-child(3) > svg");
    }
    public static By shadowCheckboxValeTroca() {
        return By.cssSelector("#storeCreditCardsContainer");
    }
    public static By shadowCheckboxValeTroca2() {
        return By.cssSelector("store-credit-card:nth-child(3)");
    }
    public static By checkboxValeTroca() {
        return By.cssSelector("input-checkbox");
    }
    public static By btnFinalizarCompraVT() {
        return By.cssSelector("#storeCreditFinalizePurchaseButton");
    }
    public static By shadowInputCVV() {
        return By.cssSelector("#paymentForm");
    }
    public static By shadowInputCVV2() {
        return By.cssSelector("input-square-name");
    }
    public static By paymentForm() {
        return By.cssSelector("#paymentForm");
    }
    public static By dropdownCardInstallmentSelector() {
        return By.cssSelector("selectors-dropdown-card-installment-selector");
    }
    public static By firstInstallmentOption() {
        return By.cssSelector(".dropdown-options > button:nth-child(1)");
    }
    public static By finalizaCompraCartao() {
        return By.cssSelector("[textlabel='Finalizar compra']");
    }
    public static By cashbackModal() {
        return By.cssSelector("#cashback-modal");
    }
}
