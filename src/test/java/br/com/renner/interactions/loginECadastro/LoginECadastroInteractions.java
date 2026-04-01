package br.com.mirante.interactions.loginECadastro;

import br.com.mirante.pages.loginECadastro.LoginECadastroPage;
import br.com.mirante.toolbox.miranteTools;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.Set;

import static br.com.renner.steps.hook.WebSetup.*;
import static br.com.renner.toolbox.RennerTools.*;


public class LoginECadastroInteractions extends LoginECadastroPage {

    private static final int TIME_OUT = 20;
    private static final int WAIT_FOR_SECONDS = 2;
    private static final int WAIT_NEW_WINDOW = 10;

    Actions actions = new Actions(driver);

    public LoginECadastroInteractions() {
    }

    public void validaUrlHml() {
        Assert.assertEquals("https://hml01.camicado.com.br/", seleniumRobotsTool.getDriver().getCurrentUrl());
        tirarPrint(scenario);
        try {
            seleniumRobotsTool.getElement(modalCookies())
                    .getShadowRoot()
                    .findElement(ctaPillButton())
                    .getShadowRoot()
                    .findElement(genericButton())
                    .click();
        } catch (Exception ignore) {
        }
    }

    public void validaUrlPrd() {
        Assert.assertEquals("https://www.camicado.com.br/", seleniumRobotsTool.getDriver().getCurrentUrl());
        tirarPrint(scenario);
        try {
            seleniumRobotsTool.getElement(modalCookies())
                    .getShadowRoot()
                    .findElement(ctaPillButton())
                    .getShadowRoot()
                    .findElement(genericButton())
                    .click();
        } catch (Exception ignore) {
        }
    }

    public void acessarUrlCampanha() {
        seleniumRobotsTool.getDriver().get("https://hml01.camicado.com.br/campanha/ofertas-exclusivas/-/N-14nvo2t?s_icid=Header_promocoes_20210903");
        Assert.assertEquals("https://hml01.camicado.com.br/campanha/ofertas-exclusivas/-/N-14nvo2t?s_icid=Header_promocoes_20210903", seleniumRobotsTool.getDriver().getCurrentUrl());
        tirarPrint(scenario);
        try {
            seleniumRobotsTool.getElement(modalCookies())
                    .getShadowRoot()
                    .findElement(ctaPillButton())
                    .getShadowRoot()
                    .findElement(genericButton())
                    .click();
        } catch (Exception ignore) {
        }
    }

    public void acessarUrlCategoria() {
        seleniumRobotsTool.getDriver().get("https://hml01.camicado.com.br/c");
        Assert.assertEquals("https://hml01.camicado.com.br/c", seleniumRobotsTool.getDriver().getCurrentUrl());
        tirarPrint(scenario);
        try {
            seleniumRobotsTool.getElement(modalCookies())
                    .getShadowRoot()
                    .findElement(ctaPillButton())
                    .getShadowRoot()
                    .findElement(genericButton())
                    .click();
        } catch (Exception ignore) {
        }
    }

    public void acessarUrlMarketPlace() {
        seleniumRobotsTool.getDriver().get("https://hml01.camicado.com.br/marketplace/all");
        Assert.assertEquals("https://hml01.camicado.com.br/marketplace/all", seleniumRobotsTool.getDriver().getCurrentUrl());
        tirarPrint(scenario);
        try {
            seleniumRobotsTool.getElement(modalCookies())
                    .getShadowRoot()
                    .findElement(ctaPillButton())
                    .getShadowRoot()
                    .findElement(genericButton())
                    .click();
        } catch (Exception ignore) {
        }
    }

    public void acessarUrlDepartamento() {
        seleniumRobotsTool.getDriver().get("https://hml01.camicado.com.br/departamento/churrasco");
        Assert.assertEquals("https://hml01.camicado.com.br/departamento/churrasco", seleniumRobotsTool.getDriver().getCurrentUrl());
        tirarPrint(scenario);
        try {
            seleniumRobotsTool.getElement(modalCookies())
                    .getShadowRoot()
                    .findElement(ctaPillButton())
                    .getShadowRoot()
                    .findElement(genericButton())
                    .click();
        } catch (Exception ignore) {
        }
    }

    public void acessarUrlAmbiente() {
        seleniumRobotsTool.getDriver().get("https://hml01.camicado.com.br/ambientes/cozinha?");
        Assert.assertEquals("https://hml01.camicado.com.br/ambientes/cozinha?", seleniumRobotsTool.getDriver().getCurrentUrl());
        tirarPrint(scenario);
        try {
            seleniumRobotsTool.getElement(modalCookies())
                    .getShadowRoot()
                    .findElement(ctaPillButton())
                    .getShadowRoot()
                    .findElement(genericButton())
                    .click();
        } catch (Exception ignore) {
        }
    }

    public void acessarUrlMinhaConta() {
        seleniumRobotsTool.getDriver().get("https://hml01.camicado.com.br/minha-conta");
        Assert.assertEquals("https://hml01.camicado.com.br/minha-conta", seleniumRobotsTool.getDriver().getCurrentUrl());
        tirarPrint(scenario);
        try {
            seleniumRobotsTool.getElement(modalCookies())
                    .getShadowRoot()
                    .findElement(ctaPillButton())
                    .getShadowRoot()
                    .findElement(genericButton())
                    .click();
        } catch (Exception ignore) {
        }
    }

    public void acessarUrlFavoritos() {
        seleniumRobotsTool.getDriver().get("https://hml01.camicado.com.br/favoritos");
        Assert.assertEquals("https://hml01.camicado.com.br/favoritos", seleniumRobotsTool.getDriver().getCurrentUrl());
        tirarPrint(scenario);
        try {
            seleniumRobotsTool.getElement(modalCookies())
                    .getShadowRoot()
                    .findElement(ctaPillButton())
                    .getShadowRoot()
                    .findElement(genericButton())
                    .click();
        } catch (Exception ignore) {
        }
    }

    public void acessarUrlSacola() {
        seleniumRobotsTool.getDriver().get("https://hml01.camicado.com.br/sacola");
        Assert.assertEquals("https://hml01.camicado.com.br/sacola", seleniumRobotsTool.getDriver().getCurrentUrl());
        tirarPrint(scenario);
        try {
            seleniumRobotsTool.getElement(modalCookies())
                    .getShadowRoot()
                    .findElement(ctaPillButton())
                    .getShadowRoot()
                    .findElement(genericButton())
                    .click();
        } catch (Exception ignore) {
        }
    }

    public void acessarUrlInstitucional() {
        seleniumRobotsTool.getDriver().get("https://hml01.camicado.com.br/institucional#nossas_lojas");
        Assert.assertEquals("https://hml01.camicado.com.br/institucional#nossas_lojas", seleniumRobotsTool.getDriver().getCurrentUrl());
        tirarPrint(scenario);
        try {
            seleniumRobotsTool.getElement(modalCookies())
                    .getShadowRoot()
                    .findElement(ctaPillButton())
                    .getShadowRoot()
                    .findElement(genericButton())
                    .click();
        } catch (Exception ignore) {
        }
    }

    public void selecionoAvatarLogin() {
        seleniumRobotsTool.waitObject(header(), TIME_OUT);
        try {
            seleniumRobotsTool.getElement(modalCookies())
                    .getShadowRoot()
                    .findElement(ctaPillButton())
                    .getShadowRoot()
                    .findElement(genericButton())
                    .click();
        } catch (Exception ignore) {
        }

        SearchContext shadowRootHeader = seleniumRobotsTool
                .getElement(header())
                .getShadowRoot();
        shadowRootHeader.findElement(iconePerfil())
                .click();

        waitForSeconds(WAIT_FOR_SECONDS);

        tirarPrint(scenario);
    }

    public void realizoLogin(String tipo) {
        seleniumRobotsTool.waitObject(shadowFormLogin(), TIME_OUT);
        WebElement shadowHost = seleniumRobotsTool.getElement(shadowFormLogin());
        SearchContext shadowRoot = shadowHost.getShadowRoot();
        WebElement inputLoginElement = shadowRoot.findElement(inputLogin());
        seleniumRobotsTool.waitObject(inputLoginElement, TIME_OUT);
        aguardoElementoClicavel(inputLoginElement);
        inputLoginElement.click();
        switch (tipo) {
            case "PF":
                shadowHost.sendKeys(RennerTools.getJsonData("LoginPF"));
                break;
            case "PJ":
                shadowHost.sendKeys(RennerTools.getJsonData("LoginPJ"));
                break;
            case "VT":
                shadowHost.sendKeys(RennerTools.getJsonData("LoginVT"));
                break;
            case "PIX":
                shadowHost.sendKeys(RennerTools.getJsonData("LoginPIX"));
                break;
        }
        WebElement inputSenhaElement = shadowRoot.findElement(inputSenha());
        inputSenhaElement.click();
        shadowHost.sendKeys(RennerTools.getJsonData("Senha"));
        tirarPrint(scenario);
        shadowHost.sendKeys(Keys.ENTER);
    }

    public void realizoLoginInv(String tipo) {
        seleniumRobotsTool.waitObject(shadowFormLogin(), TIME_OUT);
        WebElement shadowHost = seleniumRobotsTool.getElement(shadowFormLogin());
        SearchContext shadowRoot = shadowHost.getShadowRoot();
        WebElement inputLoginElement = shadowRoot.findElement(inputLogin());
        seleniumRobotsTool.waitObject(inputLoginElement, TIME_OUT);
        aguardoElementoClicavel(inputLoginElement);
        inputLoginElement.click();
        switch (tipo) {
            case "PF":
                shadowHost.sendKeys(RennerTools.getJsonData("LoginInvPF"));
                break;
            case "PJ":
                shadowHost.sendKeys(RennerTools.getJsonData("LoginInvPJ"));
                break;
            case "VT":
                shadowHost.sendKeys(RennerTools.getJsonData("LoginVT"));
                break;
            case "PIX":
                shadowHost.sendKeys(RennerTools.getJsonData("LoginPIX"));
                break;
        }
        WebElement inputSenhaElement = shadowRoot.findElement(inputSenha());
        inputSenhaElement.click();
        shadowHost.sendKeys(RennerTools.getJsonData("SenhaInv"));
        tirarPrint(scenario);
        shadowHost.sendKeys(Keys.ENTER);
    }

    public void validoLogin(String iniciais) {
        aguardoElementoClicavel(iconePerfil);

        WebElement element = seleniumRobotsTool.getElement(header());
        aguardoElementoClicavel(element);
        SearchContext shadowRoot = seleniumRobotsTool
                .getElement(header())
                .getShadowRoot();
        WebElement iconePerfilLogado = shadowRoot.findElement(iconePerfilLogado());
        seleniumRobotsTool.waitObject(iconePerfilLogado, TIME_OUT);
        aguardoElementoClicavel(iconePerfilLogado);
        Assert.assertEquals(iconePerfilLogado.getText(), iniciais);
        clickCashbackButtonIfExists();
    }

    public void selecionoCadastreSe() {
        aguardoElementoClicavel(btnCadastrase);
        scrollAjustado(2);

        scrollAteElemento(seleniumRobotsTool.getElement(shadowFormLogin())
                .getShadowRoot()
                .findElement(shadowCadastreSe())
                .getShadowRoot()
                .findElement(genericA()));
        aguardoElementoClicavel(btnCadastrase);
        seleniumRobotsTool.getElement(shadowFormLogin())
                .getShadowRoot()
                .findElement(shadowCadastreSe())
                .click();
        tirarPrint(scenario);
    }

    public void preenchoCamposCadastroPF() throws Exception {
        generateAndSetCPF();
        aguardoElementoClicavel(
                seleniumRobotsTool.getElement(createAccountFormsCpf())
                        .getShadowRoot()
                        .findElement(shadowInputNome()));

        seleniumRobotsTool.getElement(createAccountFormsCpf())
                .getShadowRoot()
                .findElement(shadowInputNome())
                .getShadowRoot()
                .findElement(genericInput())
                .sendKeys(RennerTools.getJsonData("NomeCadastroPF"));

        seleniumRobotsTool.getElement(createAccountFormsCpf())
                .getShadowRoot()
                .findElement(shadowInputSobreNome())
                .getShadowRoot()
                .findElement(genericInput())
                .sendKeys(RennerTools.getJsonData("SobrenomeCadastroPF"));

        seleniumRobotsTool.getElement(createAccountFormsCpf())
                .getShadowRoot()
                .findElement(inputCPF())
                .getShadowRoot()
                .findElement(genericInput())
                .sendKeys(RennerTools.getJsonData("CPF"));

        seleniumRobotsTool.getElement(createAccountFormsCpf())
                .getShadowRoot()
                .findElement(inputSquareDate())
                .getShadowRoot()
                .findElement(genericInput())
                .sendKeys(RennerTools.getJsonData("DataNascimento"));

        scrollAjustado(4);

        seleniumRobotsTool.getElement(createAccountFormsCpf())
                .getShadowRoot()
                .findElement(inputSquarePhone())
                .getShadowRoot()
                .findElement(genericInput())
                .sendKeys(RennerTools.getJsonData("Telefone"));

        seleniumRobotsTool.getElement(createAccountFormsCpf())
                .getShadowRoot()
                .findElement(inputSquareEmail())
                .getShadowRoot()
                .findElement(genericInput())
                .sendKeys(RennerTools.getJsonData("CPF") + "@gmail.com");

        scrollAjustado(3);

        seleniumRobotsTool.getElement(createAccountFormsCpf())
                .getShadowRoot()
                .findElement(inputSquarePassword())
                .getShadowRoot()
                .findElement(genericInput())
                .sendKeys(RennerTools.getJsonData("Senha"));

        seleniumRobotsTool.getElement(createAccountFormsCpf())
                .getShadowRoot()
                .findElement(inputSquarePasswordConfirmation())
                .getShadowRoot()
                .findElement(genericInput())
                .sendKeys(RennerTools.getJsonData("Senha"));

        scrollAteElemento(seleniumRobotsTool.getElement(legalTermsAcceptanceCPF()));

        aguardoElementoClicavel(seleniumRobotsTool.getElement(legalTermsAcceptanceCPF()));

        seleniumRobotsTool.getElement(legalTermsAcceptanceCPF())
                .getShadowRoot()
                .findElement(genericSpan())
                .click();

        var botaoCadastrarPF = seleniumRobotsTool.getElement(createAccountFormsCpf())
                .getShadowRoot()
                .findElement(textLabelCadastrar());

        aguardoElementoClicavel(botaoCadastrarPF);

        actions.moveToElement(botaoCadastrarPF).perform();

        tirarPrint(scenario);

        botaoCadastrarPF.click();
    }

    public void preenchoCamposCadastroPJ() throws Exception {
        generateAndSetCNPJ();
        aguardoElementoClicavel(
                seleniumRobotsTool.getElement(createAccountFormsCpf())
                        .getShadowRoot()
                        .findElement(shadowInputNome()));

        seleniumRobotsTool.getElement(createAccountTabs())
                .getShadowRoot()
                .findElement(cadastroCnpj())
                .click();

        seleniumRobotsTool.getElement(createAccountFormsCnpj())
                .getShadowRoot()
                .findElement(inputRazaoSocial())
                .getShadowRoot()
                .findElement(genericInput())
                .sendKeys(RennerTools.getJsonData("RazaoSocial"));

        seleniumRobotsTool.getElement(createAccountFormsCnpj())
                .getShadowRoot()
                .findElement(inputCNPJ())
                .getShadowRoot()
                .findElement(genericInput())
                .sendKeys(RennerTools.getJsonData("CNPJ"));

        seleniumRobotsTool.getElement(createAccountFormsCnpj())
                .getShadowRoot()
                .findElement(inputInscricaoMunicipal())
                .getShadowRoot()
                .findElement(genericInput())
                .sendKeys(RennerTools.getJsonData("InscricaoMunicipal"));

        seleniumRobotsTool.getElement(createAccountFormsCnpj())
                .getShadowRoot()
                .findElement(checkboxIsentoIE())
                .getShadowRoot()
                .findElement(genericSpan())
                .click();

        seleniumRobotsTool.getElement(createAccountFormsCnpj())
                .getShadowRoot()
                .findElement(inputResponsavelCPNJ())
                .getShadowRoot()
                .findElement(genericInput())
                .sendKeys(RennerTools.getJsonData("ResponsavelCNPJ"));

        seleniumRobotsTool.getElement(createAccountFormsCnpj())
                .getShadowRoot()
                .findElement(inputEmail())
                .getShadowRoot()
                .findElement(genericInput())
                .sendKeys(RennerTools.getJsonData("CNPJ") + "@gmail.com");

        scrollAjustado(4);

        seleniumRobotsTool.getElement(createAccountFormsCnpj())
                .getShadowRoot()
                .findElement(inputPhone1())
                .getShadowRoot()
                .findElement(genericInput())
                .sendKeys(RennerTools.getJsonData("Telefone"));

        seleniumRobotsTool.getElement(createAccountFormsCnpj())
                .getShadowRoot()
                .findElement(inputPhone2())
                .getShadowRoot()
                .findElement(genericInput())
                .sendKeys(RennerTools.getJsonData("Telefone"));

        seleniumRobotsTool.getElement(createAccountFormsCnpj())
                .getShadowRoot()
                .findElement(inputPassword())
                .getShadowRoot()
                .findElement(genericInput())
                .sendKeys(RennerTools.getJsonData("Senha"));

        seleniumRobotsTool.getElement(createAccountFormsCnpj())
                .getShadowRoot()
                .findElement(inputConfirmPassword())
                .getShadowRoot()
                .findElement(genericInput())
                .sendKeys(RennerTools.getJsonData("Senha"));
        scrollAjustado(10);

        scrollAteElemento(seleniumRobotsTool.getElement(legalTermsAcceptanceCNPJ()));

        aguardoElementoClicavel(seleniumRobotsTool.getElement(legalTermsAcceptanceCNPJ()));

        seleniumRobotsTool.getElement(legalTermsAcceptanceCNPJ())
                .getShadowRoot()
                .findElement(genericSpan())
                .click();

        var botaoCadastrarPJ = seleniumRobotsTool.getElement(createAccountFormsCnpj())
                .getShadowRoot()
                .findElement(textLabelCadastrar());

        actions.moveToElement(botaoCadastrarPJ).perform();

        tirarPrint(scenario);

        botaoCadastrarPJ.click();

    }

    public void preenchoCamposCadastroInvalidoPF() throws Exception {
        generateAndSetCPF();
        aguardoElementoClicavel(
                seleniumRobotsTool.getElement(createAccountFormsCpf())
                        .getShadowRoot()
                        .findElement(shadowInputNome()));

        seleniumRobotsTool.getElement(createAccountFormsCpf())
                .getShadowRoot()
                .findElement(shadowInputNome())
                .getShadowRoot()
                .findElement(genericInput())
                .sendKeys(RennerTools.getJsonData("NomeInvalidoCadastroPF"));

        seleniumRobotsTool.getElement(createAccountFormsCpf())
                .getShadowRoot()
                .findElement(shadowInputSobreNome())
                .getShadowRoot()
                .findElement(genericInput())
                .sendKeys(RennerTools.getJsonData("SobrenomeInvalidoCadastroPF"));

        seleniumRobotsTool.getElement(createAccountFormsCpf())
                .getShadowRoot()
                .findElement(inputCPF())
                .getShadowRoot()
                .findElement(genericInput())
                .sendKeys(RennerTools.getJsonData("CPFInvalido"));

        seleniumRobotsTool.getElement(createAccountFormsCpf())
                .getShadowRoot()
                .findElement(inputSquareDate())
                .getShadowRoot()
                .findElement(genericInput())
                .sendKeys(RennerTools.getJsonData("DataNascimentoInvalido"));

        scrollAjustado(4);

        seleniumRobotsTool.getElement(createAccountFormsCpf())
                .getShadowRoot()
                .findElement(inputSquarePhone())
                .getShadowRoot()
                .findElement(genericInput())
                .sendKeys(RennerTools.getJsonData("TelefoneInvalido"));

        seleniumRobotsTool.getElement(createAccountFormsCpf())
                .getShadowRoot()
                .findElement(inputSquareEmail())
                .getShadowRoot()
                .findElement(genericInput())
                .sendKeys(RennerTools.getJsonData("CPFInvalido") + "@gmail");

        scrollAjustado(3);

        seleniumRobotsTool.getElement(createAccountFormsCpf())
                .getShadowRoot()
                .findElement(inputSquarePassword())
                .getShadowRoot()
                .findElement(genericInput())
                .sendKeys(RennerTools.getJsonData("SenhaInvalido"));

        seleniumRobotsTool.getElement(createAccountFormsCpf())
                .getShadowRoot()
                .findElement(inputSquarePasswordConfirmation())
                .getShadowRoot()
                .findElement(genericInput())
                .sendKeys(RennerTools.getJsonData("SenhaInvalido"));

        scrollAteElemento(seleniumRobotsTool.getElement(legalTermsAcceptanceCPF()));

        aguardoElementoClicavel(seleniumRobotsTool.getElement(legalTermsAcceptanceCPF()));

        seleniumRobotsTool.getElement(legalTermsAcceptanceCPF())
                .getShadowRoot()
                .findElement(genericSpan())
                .click();

        var botaoCadastrarPF = seleniumRobotsTool.getElement(createAccountFormsCpf())
                .getShadowRoot()
                .findElement(textLabelCadastrar());

        aguardoElementoClicavel(botaoCadastrarPF);

        actions.moveToElement(botaoCadastrarPF).perform();

        tirarPrint(scenario);

        botaoCadastrarPF.click();
    }

    public void preenchoCamposCadastroInvalidoPJ() throws Exception {
        generateAndSetCNPJ();
        aguardoElementoClicavel(
                seleniumRobotsTool.getElement(createAccountFormsCpf())
                        .getShadowRoot()
                        .findElement(shadowInputNome()));

        seleniumRobotsTool.getElement(createAccountTabs())
                .getShadowRoot()
                .findElement(cadastroCnpj())
                .click();

        seleniumRobotsTool.getElement(createAccountFormsCnpj())
                .getShadowRoot()
                .findElement(inputRazaoSocial())
                .getShadowRoot()
                .findElement(genericInput())
                .sendKeys(RennerTools.getJsonData("RazaoSocialInvalido"));

        seleniumRobotsTool.getElement(createAccountFormsCnpj())
                .getShadowRoot()
                .findElement(inputCNPJ())
                .getShadowRoot()
                .findElement(genericInput())
                .sendKeys(RennerTools.getJsonData("CNPJInvalido"));

        seleniumRobotsTool.getElement(createAccountFormsCnpj())
                .getShadowRoot()
                .findElement(inputInscricaoMunicipal())
                .getShadowRoot()
                .findElement(genericInput())
                .sendKeys(RennerTools.getJsonData("InscricaoMunicipalInvalido"));

        seleniumRobotsTool.getElement(createAccountFormsCnpj())
                .getShadowRoot()
                .findElement(checkboxIsentoIE())
                .getShadowRoot()
                .findElement(genericSpan())
                .click();

        seleniumRobotsTool.getElement(createAccountFormsCnpj())
                .getShadowRoot()
                .findElement(inputResponsavelCPNJ())
                .getShadowRoot()
                .findElement(genericInput())
                .sendKeys(RennerTools.getJsonData("ResponsavelCNPJInvalido"));

        seleniumRobotsTool.getElement(createAccountFormsCnpj())
                .getShadowRoot()
                .findElement(inputEmail())
                .getShadowRoot()
                .findElement(genericInput())
                .sendKeys(RennerTools.getJsonData("CNPJInvalido") + "@gmail");

        scrollAjustado(4);

        seleniumRobotsTool.getElement(createAccountFormsCnpj())
                .getShadowRoot()
                .findElement(inputPhone1())
                .getShadowRoot()
                .findElement(genericInput())
                .sendKeys(RennerTools.getJsonData("TelefoneInvalido"));

        seleniumRobotsTool.getElement(createAccountFormsCnpj())
                .getShadowRoot()
                .findElement(inputPhone2())
                .getShadowRoot()
                .findElement(genericInput())
                .sendKeys(RennerTools.getJsonData("TelefoneInvalido"));

        seleniumRobotsTool.getElement(createAccountFormsCnpj())
                .getShadowRoot()
                .findElement(inputPassword())
                .getShadowRoot()
                .findElement(genericInput())
                .sendKeys(RennerTools.getJsonData("SenhaInvalido"));

        seleniumRobotsTool.getElement(createAccountFormsCnpj())
                .getShadowRoot()
                .findElement(inputConfirmPassword())
                .getShadowRoot()
                .findElement(genericInput())
                .sendKeys(RennerTools.getJsonData("SenhaInvalido"));
        scrollAjustado(10);

        scrollAteElemento(seleniumRobotsTool.getElement(legalTermsAcceptanceCNPJ()));

        aguardoElementoClicavel(seleniumRobotsTool.getElement(legalTermsAcceptanceCNPJ()));

        seleniumRobotsTool.getElement(legalTermsAcceptanceCNPJ())
                .getShadowRoot()
                .findElement(genericSpan())
                .click();

        var botaoCadastrarPJ = seleniumRobotsTool.getElement(createAccountFormsCnpj())
                .getShadowRoot()
                .findElement(textLabelCadastrar());

        actions.moveToElement(botaoCadastrarPJ).perform();

        tirarPrint(scenario);

        botaoCadastrarPJ.click();

    }

    public void validoMensagemdeDadoInvalido() {
        aguardoElementoClicavel(
                seleniumRobotsTool.getElement(createAccountFormsCpf())
                        .getShadowRoot()
                        .findElement(errorText()));

        String mensagemDeErro = seleniumRobotsTool.getElement(createAccountFormsCpf())
                .getShadowRoot()
                .findElement(errorText()).getText();

        Assert.assertTrue(
                "A mensagem de erro não contém o texto esperado",
                mensagemDeErro.contains(RennerTools.getJsonData("Dado Inválido")));
    }

    public void esqueciMinhaSenha() {
        aguardoElementoClicavel(
                seleniumRobotsTool.getElement(shadowFormLogin())
                        .getShadowRoot()
                        .findElement(labelRecoverPassword())
                        .getShadowRoot()
                        .findElement(genericA()));

        seleniumRobotsTool.getElement(shadowFormLogin())
                .getShadowRoot()
                .findElement(labelRecoverPassword())
                .getShadowRoot()
                .findElement(genericA())
                .click();

        aguardoElementoClicavel(seleniumRobotsTool.getElement(passwordRecovery())
                .getShadowRoot()
                .findElement(inputForgotPassword())
                .getShadowRoot()
                .findElement(inputForgotPassword()));

        seleniumRobotsTool.getElement(passwordRecovery())
                .getShadowRoot()
                .findElement(inputForgotPassword())
                .getShadowRoot()
                .findElement(inputForgotPassword())
                .sendKeys(RennerTools.getJsonData("CPF"));

        tirarPrint(scenario);

        seleniumRobotsTool.getElement(passwordRecovery())
                .getShadowRoot()
                .findElement(inputForgotPassword())
                .getShadowRoot()
                .findElement(inputForgotPassword())
                .sendKeys(Keys.ENTER);
    }

    public void validoMensagemRecuperacaoSenha() {
        aguardoElementoClicavel(
                seleniumRobotsTool.getElement(loginToast())
                        .getShadowRoot()
                        .findElement(genericTextLabel()));

        Assert.assertEquals(RennerTools.getJsonData("TextoRecuperaSenha"), seleniumRobotsTool.getElement(loginToast())
                .getShadowRoot()
                .findElement(genericTextLabel()).getText());
    }

    public void validoSenhaouEmailInvalido() {
        aguardoElementoClicavel(
                seleniumRobotsTool.getElement(loginToast())
                        .getShadowRoot()
                        .findElement(genericTextLabel()));

        Assert.assertEquals(RennerTools.getJsonData("TextoEmaileSenhaInvalidos"), seleniumRobotsTool.getElement(loginToast())
                .getShadowRoot()
                .findElement(genericTextLabel()).getText());
    }

    public void loginSocialGoogle() {
        Set<String> janelasAntes = driver.getWindowHandles();
        aguardoElementoClicavel(btnCadastrase);
        scrollAteElemento(seleniumRobotsTool.getElement(shadowFormLogin())
                .getShadowRoot()
                .findElement(shadowCadastreSe())
                .getShadowRoot()
                .findElement(genericA()));
        aguardoElementoClicavel(btnCadastrase);

        aguardoElementoClicavel(seleniumRobotsTool.getElement(loginGoogle()));
        tirarPrint(scenario);
        seleniumRobotsTool.getElement(loginGoogle()).click();
        waitForNewWindow(janelasAntes, WAIT_NEW_WINDOW);
        Set<String> janelasDepois = driver.getWindowHandles();
        String novaAba = janelasDepois.stream()
                .filter(handle -> !janelasAntes.contains(handle))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Nova aba não encontrada"));
        driver.switchTo().window(novaAba);
    }

    public void loginSocialFacebook() {
        Set<String> janelasAntes = driver.getWindowHandles();
        aguardoElementoClicavel(btnCadastrase);
        scrollAteElemento(seleniumRobotsTool.getElement(shadowFormLogin())
                .getShadowRoot()
                .findElement(shadowCadastreSe())
                .getShadowRoot()
                .findElement(genericA()));
        aguardoElementoClicavel(btnCadastrase);

        aguardoElementoClicavel(seleniumRobotsTool.getElement(loginFacebook()));
        tirarPrint(scenario);
        seleniumRobotsTool.getElement(loginFacebook()).click();
        waitForNewWindow(janelasAntes, WAIT_NEW_WINDOW);
        Set<String> janelasDepois = driver.getWindowHandles();
        String novaAba = janelasDepois.stream()
                .filter(handle -> !janelasAntes.contains(handle))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Nova aba não encontrada"));
        driver.switchTo().window(novaAba);
    }

    public void validoJanelaLoginGoogle() {
        Assert.assertTrue(seleniumRobotsTool.getDriver().getCurrentUrl().contains("accounts.google.com"));
    }

    public void validoJanelaLoginFacebook() {
        Assert.assertTrue(seleniumRobotsTool.getDriver().getCurrentUrl().contains("facebook.com"));
    }
}
