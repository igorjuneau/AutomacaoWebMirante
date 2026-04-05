package br.com.igorVieira.steps.Home;

import br.com.igorVieira.interactions.Home.HomeInteractions;
import io.cucumber.java.pt.*;

public class HomeSteps {

    HomeInteractions webSanity = new HomeInteractions();

    public HomeSteps() {
    }

    @E("clico na lupa de busca")
    public void clicoLupaBusca() {
        webSanity.clicarLupaBusca();
    }

    @E("digito Imposto de Renda no campo de busca")
    public void digitoIpostoRenda() {
        webSanity.digitarIpostoRenda();
    }

    @E("digito Pix Parcelado no campo de busca")
    public void digitoPixParcelado() {
        webSanity.digitarPixParcelado();
    }

    @Quando("clico no artigo sobre o passo a passo do IR 2026")
    public void clicoArtigoPassoaPassoIR() {
        webSanity.clicarArtigoPassoaPassoIR();
    }

    @Quando("clico no artigo sobre o pix parcelado como funcionara")
    public void clicoArtigoPixParcelado() {
        webSanity.clicarArtigoPixParcelado();
    }

    @Entao("a tela sobre do artigo é aberta")
    public void VerificoArtigoPassoaPassoIRAberto() {
        webSanity.validarArtigoPassoaPassoIRAberto();
    }

    @Entao("a tela sobre do artigo Pix é aberta")
    public void VerificoArtigoPixParcAberto() {
        webSanity.validarArtigoPixParcAberto();
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
        webSanity.validarTeladeHome();
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