package br.com.mirante.pages.loginECadastro;

import org.openqa.selenium.By;
import static org.openqa.selenium.By.xpath;

public class LoginECadastroPage {
    public static By header() {
        return By.cssSelector("#PageHeader");
    }
    public static By iconePerfil() {
        return By.cssSelector("#automation-header-profile-icon-logged-off-id");
    }
    public static By shadowFormLogin() {
        return By.cssSelector("#formLogin");
    }
    public static By shadowCadastreSe() {
        return By.cssSelector("#buttonRegister");
    }
    public static By genericA() {
        return By.cssSelector("a");
    }
    public static By inputCPF() {
        return By.cssSelector("#inputCPF");
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
    public static By textLabelCadastrar() {
        return By.cssSelector("[textlabel='Cadastrar']");
    }
    public static By genericSpan() {
        return By.cssSelector("span");
    }
    public static By legalTermsAcceptanceCPF() {
        return By.cssSelector("create-account-forms-cpf>*>#legalTermsAcceptance");
    }
    public static By legalTermsAcceptanceCNPJ() {
        return By.cssSelector("create-account-forms-cnpj>*>#legalTermsAcceptance");
    }
    public static By inputSquarePassword() {
        return By.cssSelector("input-square-password");
    }
    public static By inputSquarePasswordConfirmation() {
        return By.cssSelector("input-square-password:nth-of-type(2)");
    }
    public static By inputSquareDate() {
        return By.cssSelector("input-square-date");
    }
    public static By inputSquarePhone() {
        return By.cssSelector("input-square-phone");
    }
    public static By inputSquareEmail() {
        return By.cssSelector("input-square-email");
    }
    public static By createAccountFormsCpf() {
        return By.cssSelector("create-account-forms-cpf");
    }
    public static By shadowInputNome() {
        return By.cssSelector("#inputName");
    }
    public static By shadowInputSobreNome() {
        return By.cssSelector("#inputSurname");
    }
    public static By inputLogin() {
        return By.cssSelector("#inputLogin");
    }
    public static By inputSenha() {
        return By.cssSelector("#inputPassword");
    }
    public static By iconePerfilLogado() {
        return By.cssSelector("#automation-header-profile-icon-logged-in-id");
    }
    public static By createAccountTabs() {
        return By.cssSelector("create-account-tabs");
    }
    public static By cadastroCnpj() {
        return By.cssSelector("#cnpj");
    }
    public static By createAccountFormsCnpj() {
        return By.cssSelector("create-account-forms-cnpj");
    }
    public static By inputRazaoSocial() {
        return By.cssSelector("#inputCorporateName");
    }
    public static By inputCNPJ() {
        return By.cssSelector("#inputCNPJ");
    }
    public static By inputInscricaoMunicipal() {
        return By.cssSelector("#inputCityRegistration");
    }
    public static By checkboxIsentoIE() {
        return By.cssSelector("#checkboxStateRegistrationFree");
    }
    public static By inputResponsavelCPNJ() {
        return By.cssSelector("#inputAccountablePerson");
    }
    public static By inputEmail() {
        return By.cssSelector("#inputEmail");
    }
    public static By inputPassword() {
        return By.cssSelector("#inputPassword");
    }
    public static By inputConfirmPassword() {
        return By.cssSelector("#inputConfirmPassword");
    }
    public static By inputPhone1() {
        return By.cssSelector("#inputPhone1");
    }
    public static By inputPhone2() {
        return By.cssSelector("#inputPhone2");
    }
    public static By labelRecoverPassword() {
        return By.cssSelector("#labelRecoverPassword");
    }
    public static By passwordRecovery() {
        return By.cssSelector("#passwordRecovery");
    }
    public static By inputForgotPassword() {
        return By.cssSelector("#inputForgotPassword");
    }
    public static By buttonRecoverPassword() {
        return By.cssSelector("#buttonRecoverPassword");
    }
    public static By loginToast() {
        return By.cssSelector("#loginToast");
    }
    public static By baseToast() {
        return By.cssSelector("#baseToast");
    }
    public static By genericTextLabel() {
        return By.cssSelector("text-label");
    }
    public static By errorText() {
        return By.cssSelector("input-square-cpf");
    }
    public static By generictextLabel() {
        return By.cssSelector("textlabel");
    }
    public static By loginGoogle() {
        return By.cssSelector("[slot='social-login-google']");
    }
    public static By loginFacebook() {
        return By.cssSelector("facebook-button");
    }
    public static String iconePerfil = "//*[@id='automation-header-profile-icon-logged-in-id']";

    public static String btnCadastrase = "//*[text()='Cadastre-se']";

    public static String txtCampoSenhaEmailInv = "//*[text()='Ops, senha ou email inválidos']";
}
