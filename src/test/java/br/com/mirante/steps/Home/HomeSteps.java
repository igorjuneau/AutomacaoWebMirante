package br.com.mirante.steps.Home;

import br.com.mirante.interactions.Home.HomeInteractions;
import io.cucumber.java.pt.*;

public class HomeSteps {

    HomeInteractions webSanity = new HomeInteractions();

    public HomeSteps() {
    }

    @Quando("clico no botao Produtos")
    public void clicoBotaoProdutos() {
        webSanity.clicarBotaoProdutos();
    }

    @Quando("clico no botao Emprestimos")
    public void clicoBotaoEmprestimos() {
        webSanity.clicarBotaoEmprestimos();
    }

    @Quando("clico no botao emprestimo consignado")
    public void clicoBotaoConsignado() {
        webSanity.clicarBotaoConsignado();
    }

    @Dado("que estou na tela de Home")
    public void VerificoqueEstouemHome() {
        webSanity.validarRetornoHome();
    }

    @Dado("que estou no site blogdoagi")
    public void validaSite() throws Exception {
        webSanity.validaUrl();
    }

    @E("rolo a tela para baixo 10x")
    public void roloATelaParaBaixo10() {
        webSanity.roloATelaParaBaixo10x();
    }

    @E("verifico que a tela de Emprestimos Consignados foi carregada com sucesso")
    public void visualizoTituloTelaConsignado() {
        webSanity.visualizoTitulodaTelaConsignado();
    }

    @E("verifico que as tres imagens foram carregadas")
    public void visualizoTresImagens() {
        webSanity.visualizoTresImagensEmprestimo();
    }
}