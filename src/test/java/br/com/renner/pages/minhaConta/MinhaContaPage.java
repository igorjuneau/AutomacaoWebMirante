package br.com.mirante.pages.minhaConta;

import org.openqa.selenium.By;

public class MinhaContaPage {

    public static By header() {
        return By.cssSelector("#PageHeader");
    }
    public static By iconePerfilLogado() {
        return By.cssSelector("#automation-header-profile-icon-logged-in-id");
    }
    public static By minhaContaTextLabel() {
        return By.cssSelector("[textlabel='Minha conta']");
    }
    public static By enderecoOption() {
        return By.cssSelector("[titleboxmyaccount='Endereços']");
    }
    public static By logoutTooltip() {
        return By.cssSelector("logout-tooltip");
    }
    public static By headerToast() {
        return By.cssSelector("#headerToast");
    }
    public static By toastType() {
        return By.cssSelector("[toasttype='success']");
    }
    public static By toastButton() {
        return By.cssSelector("#baseToast");
    }
    public static By cardsNewAddress() {
        return By.cssSelector("cards-new-address");
    }
    public static By buttonAddAddress() {
        return By.cssSelector("#buttonAddAddress");
    }
    public static By addressForm() {
        return By.cssSelector("address-form");
    }
    public static By cepField() {
        return By.cssSelector("#postalCode");
    }
    public static By enderecoField() {
        return By.cssSelector("#address1");
    }
    public static By numeroField() {
        return By.cssSelector("#address2");
    }
    public static By bairroField() {
        return By.cssSelector("#county");
    }
    public static By cidadeField() {
        return By.cssSelector("#city");
    }
    public static By estadoDropdown() {
        return By.cssSelector("#state");
    }
    public static By submitButton() {
        return By.cssSelector("[type='submit']");
    }
    public static By oneAddressCard() {
        return By.cssSelector("cards-address-card:nth-child(1)");
    }
    public static By oneCtaIconButton() {
        return By.cssSelector("cta-icon-button:nth-child(1)");
    }
    public static By secondAddressCard() {
        return By.cssSelector("cards-address-card:nth-child(2)");
    }
    public static By secondCtaIconButton() {
        return By.cssSelector("cta-icon-button:nth-child(2)");
    }
    public static By deleteAddressButton() {
        return By.cssSelector("#aut-my-addresses-delete-button");
    }
    public static By modalCookies() {
        return By.cssSelector("modal-cookies");
    }
    public static By ctaPillButton() {
        return By.cssSelector("cta-pill-button");
    }
    public static By cashbackModal() {
        return By.cssSelector("#cashback-modal");
    }
    public static By textoGenerico() {
        return By.cssSelector("text-label");
    }
    public static By boxPageInfo() {
        return By.cssSelector("box-page-info");
    }
    public static By textLabelValeTroca() {
        return By.cssSelector("text-label[textlabel='Vale-troca']");
    }
    public static By botaoGenerico() {
        return By.cssSelector("button");
    }
    public static By cardsAddressCard() {
        return By.cssSelector("cards-address-card");
    }
    public static By ctaIconButton() {
        return By.cssSelector("cta-icon-button");
    }
    public static By inputGenerico() {
        return By.cssSelector("input");
    }
    public static String btnCadastrase = "//*[text()='Cadastre-se']";

    public static By dadosOption() {
        return By.cssSelector("[titleboxmyaccount='Meus dados']");
    }
    public static By userMyDataCpf() {
        return By.cssSelector("user-my-data-cpf");
    }
    public static By autMyDataCpfPhoneNumber() {
        return By.cssSelector("#aut-myData-cpf-phoneNumber");
    }
    public static By autMyDataButton() {
        return By.cssSelector("#aut-myData-button");
    }
    public static By alterarSenhaTextLabel() {
        return By.cssSelector("[textlabel='Alterar senha']");
    }
    public static By changePasswordForm() {
        return By.cssSelector("#change-password-form");
    }
    public static By senhaField() {
        return By.cssSelector("#aut-changePassword-password");
    }
    public static By novaSenhaInput() {
        return By.cssSelector("[id='aut-changePassword-newPassword']");
    }
    public static By confirmarNovaSenhaInput() {
        return By.cssSelector("[id='aut-changePassword-confirmPassword']");
    }
    public static By TextLabelVTText() {
        return By.cssSelector("text-label");
    }
    public static By valeTrocaTextLabel() {
        return By.cssSelector("[textlabel='Vale troca']");
    }
    public static By storeCreditTotal() {
        return By.cssSelector("store-credit-total");
    }
    public static By valueCredit() {
        return By.cssSelector("[textlabel='R$ 728,34']");
    }
    public static By cashbackTitleBox() {
        return By.cssSelector("[titleboxmyaccount='Cashback']");
    }
    public static By cashbackAccountOption() {
        return By.cssSelector("#aut-myAccount-boxMenu-cashbackAccount");
    }
    public static By titleBoxSaldoCashback() {
        return By.cssSelector("[titleboxcashback='Seu saldo de cashback é de']");
    }
    public static By cashBackValue() {
        return By.cssSelector("[id='aut-cashBack-value']");
    }
}
