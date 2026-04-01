package br.com.mirante.interactions.busca;

import br.com.mirante.pages.busca.BuscaPage;
import br.com.mirante.robots.key.RnKeys;
import br.com.mirante.toolbox.miranteTools;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

import static br.com.mirante.steps.hook.WebSetup.*;
import static br.com.mirante.toolbox.GlobalTools.getExecutionUrl;
import static br.com.mirante.toolbox.RennerTools.*;


public class BuscaInteractions extends BuscaPage {

    private static final int TIME_OUT = 20;

    Actions actions = new Actions(driver);


    public BuscaInteractions() {
    }


    public void clicoNoIconeDeBusca() {
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
    }

    public void visualizoProdutosNaSugestao() {

        seleniumRobotsTool.getElement(header())
                .getShadowRoot()
                .findElement(shadowSearchSuggestionUl())
                .getShadowRoot()
                .findElements(listItem())
                .get(0);

        aguardoAnimacoesJS();
        tirarPrint(scenario);
    }

    public void MensagemNenhumResultado() {

        seleniumRobotsTool.getElement(header())
                .getShadowRoot()
                .findElement(msgProductNotFound())
                .getShadowRoot()
                .findElements(listItem())
                .get(0);

        aguardoAnimacoesJS();
        tirarPrint(scenario);
    }

    public void clicoNoIconefiltrar() {
        seleniumRobotsTool.waitObject(wrapperFilterBar(), TIME_OUT);
        var botaoFiltrar = seleniumRobotsTool.getElement(wrapperFilterBar())
                .getShadowRoot()
                .findElement(automationCtaPillButtonId())
                .getShadowRoot()
                .findElement(button());
        aguardoElementoClicavel(botaoFiltrar);
        botaoFiltrar.click();
        tirarPrint(scenario);
    }

    public void clicoEmCategorias() {
        seleniumRobotsTool.waitObject(wrapperFilterBar(), TIME_OUT);
        var botaoCategorias = seleniumRobotsTool.getElement(wrapperFilterBar())
                .getShadowRoot()
                .findElement(navigationFilterTabs())
                .getShadowRoot()
                .findElement(divCategorias());
        aguardoElementoClicavel(botaoCategorias);
        botaoCategorias.click();
        tirarPrint(scenario);
    }

    public void clicoNoPrimeiroProdutoNaSugestao() {
        try {
            seleniumRobotsTool.getElement(modalCookies())
                    .getShadowRoot()
                    .findElement(ctaPillButton())
                    .getShadowRoot()
                    .findElement(genericButton())
                    .click();
        } catch (Exception ignore) {
        }
        aguardoElementoClicavel(seleniumRobotsTool.getElement(header())
                .getShadowRoot()
                .findElement(shadowSearchSuggestionUl())
                .getShadowRoot()
                .findElements(listItem())
                .get(0));

        seleniumRobotsTool.getElement(header())
                .getShadowRoot()
                .findElement(shadowSearchSuggestionUl())
                .getShadowRoot()
                .findElements(listItem())
                .get(0)
                .click();

        aguardoAnimacoesJS();
        tirarPrint(scenario);
    }


    public void verificoSeFuiRedirecionadoParaPDP() {
        esperarWeb(seleniumRobotsTool.getElement(pagesProductPage())
                .getShadowRoot()
                .findElement(textLabel())
                .getShadowRoot()
                .findElement(h1()));
        String urlAtual = seleniumRobotsTool.getDriver().getCurrentUrl();
        Assert.assertTrue("nao foi redirecionado para PDP'", urlAtual.contains("sku"));
    }

    public void verificoSeABuscaRetornaMesnagemDeTermoInvalido() {
        String mensagem = seleniumRobotsTool.getElement(msgProductNotFound())
                .getShadowRoot()
                .findElement(textLabel())
                .getShadowRoot()
                .findElement(h1())
                .getText();

        Assert.assertEquals("Mensagem não confere", "Ops, não encontramos", mensagem);
    }

    public void pesquisoNoInputDaBusca(String termo, String metodoBusca) throws Exception {
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
                .findElement(inputPesquisa()), RennerTools.getJsonData(termo));

        tirarPrint(scenario);

        if (metodoBusca.equalsIgnoreCase("enter")) {
            seleniumRobotsTool.sendKeys(seleniumRobotsTool
                    .getElement(header())
                    .getShadowRoot()
                    .findElement(shadowInputPesquisa())
                    .getShadowRoot()
                    .findElement(inputPesquisa()), RnKeys.ENTER);
        } else if (metodoBusca.equalsIgnoreCase("lupa")) {
            aguardoElementoClicavel(seleniumRobotsTool.getElement(pageHeader())
                    .getShadowRoot()
                    .findElement(inputRoundedSearch())
                    .getShadowRoot()
                    .findElement(ctaPillButton())
                    .getShadowRoot()
                    .findElement(button()));

            seleniumRobotsTool.getElement(pageHeader())
                    .getShadowRoot()
                    .findElement(inputRoundedSearch())
                    .getShadowRoot()
                    .findElement(ctaPillButton())
                    .getShadowRoot()
                    .findElement(button())
                    .click();
        }
    }

    public void acessoPrimeiraCategoriaSugerida() {
        aguardoAnimacoesJS();
        aguardoElementoClicavel(
                seleniumRobotsTool.getElement(header())
                        .getShadowRoot()
                        .findElement(searchCategorySuggestion())
                        .getShadowRoot()
                        .findElement(ctaCategorySuggestionPill())
        );

        seleniumRobotsTool.getElement(header())
                .getShadowRoot()
                .findElement(searchCategorySuggestion())
                .getShadowRoot()
                .findElement(ctaCategorySuggestionPill())
                .click();
        aguardoAnimacoesJS();
    }

    public void verificoSeFuiParaPaginaDeCategoria() {
        Assert.assertTrue(seleniumRobotsTool.getDriver().getCurrentUrl().contains("/c/"));
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

    public void clicoNoBotaoDeVerMaisCategorias() {
        aguardoElementoClicavel(
                seleniumRobotsTool.getElement(header())
                        .getShadowRoot()
                        .findElement(searchCategorySuggestion())
                        .getShadowRoot()
                        .findElement(plusButton())
                        .getShadowRoot()
                        .findElement(genericButton())
        );

        seleniumRobotsTool.getElement(header())
                .getShadowRoot()
                .findElement(searchCategorySuggestion())
                .getShadowRoot()
                .findElement(plusButton())
                .getShadowRoot()
                .findElement(genericButton())
                .click();
    }
}
