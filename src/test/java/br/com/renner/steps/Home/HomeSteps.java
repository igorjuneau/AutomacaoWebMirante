package br.com.mirante.steps.Home;

import br.com.mirante.interactions.Home.HomeInteractions;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class HomeSteps {

    HomeInteractions webSanity = new HomeInteractions();

    public HomeSteps() {
    }
    @Dado("que seleciono o icone de Home")
    @E("seleciono o icone de Home")
    public void que_seleciono_o_icone_de_Home() {
        webSanity.selecionoIconeHome();
    }
    @E("Verifico se o produto foi adicionado a Home")
    public void voidVerificoHome() {
        webSanity.verificoSeFoiAdidionadoAHome();
    }
    @Dado("clico em continuar")
    public void clico_em_continuar() {
        webSanity.clicoEmContinuar();
    }
    @Quando("clico em editar endereco")
    public void clicoEmEditarEndereco() {
        webSanity.clicoEmEditarEndereco();
    }
    @Quando("clico em adicionar novo endereco")
    public void clicoEmAdicionarEndereco() {
        webSanity.clicoEmAdicionarEndereco();
    }
    @Entao("verifico que a tela de edicao de endereco esta disponivel")
    public void edicaoDisponivel() {
        webSanity.edicaoEndDisponivel();
    }
    @Entao("verifico que a tela de adicao de endereco esta disponivel")
    public void adicaoDisponivel() {
        webSanity.adicaoEndDisponivel();
    }
    @Quando("clico para ir para pagamento")
    public void clico_para_ir_para_pagamento() {
        webSanity.irParaPagamento();
    }
    @Quando("Clico no icone de adicionar a Home")
    public void clicoNoIconeDeAdicionarAHome() {
        webSanity.clicarNoBotaoAdicionarHome();
    }
    @Quando("Clico no botao comprar item")
    public void clicoNoBotaocomprarItem() {
        webSanity.clicarNoBotaoComprarItem();
    }
    @Quando("Clico no botao favoritar item")
    public void clicoNoBotaoFavoritarItem() {
        webSanity.clicarNoBotaofavoritarItem();
    }
    @Quando("verifico que o item foi favoritado")
    public void verificoItemFavoritado() {
        webSanity.verificoItemFavoritado();
    }
    @Quando("verifico a vitrine de Favoritos")
    public void verificoVitrineFavoritos() {
        webSanity.verificoVitrineFavoritos();
    }
    @Quando("fecho a tela de cashback")
    public void fecharTelaCashBack() {
        webSanity.fecharTelaCashBack();
    }
    @E("Removo o item da Home")
    public void removoOItemDaHome() {
        webSanity.clicarNoBotaoLixeira();
    }
    @E("volto para a Home")
    public void volto_para_a_Home() {
        webSanity.clicarBotaoFechar();
    }
    @Dado("que pesquiso pelo produto {string}")
    @Quando("pesquiso pelo produto {string}")
    public void quePesquisoPeloProduto(String produto) {
        webSanity.pesquisarPorProduto(produto);
    }
    @Dado("que estou na tela de Home")
    @Entao("verifico que estou na tela de Home")
    public void VerificoqueEstouemHome() {
        webSanity.verificoqueEstouemHome();
    }
    @E("rolo a tela para baixo 2x")
    public void roloATelaParaBaixo2x() {
        webSanity.roloATelaParaBaixo2x();
    }
    @E("rolo a tela para baixo 5x")
    public void roloATelaParaBaixo5x() {
        webSanity.roloATelaParaBaixo5x();
    }
    @E("rolo a tela para baixo 11x")
    public void roloATelaParaBaixo11() {
        webSanity.roloATelaParaBaixo11();
    }
    @E("rolo a tela para baixo 17x")
    public void roloATelaParaBaixo17() {
        webSanity.roloATelaParaBaixo17();
    }
    @Entao("verifico que a tela Home possui Banner com Duas Imagens")
    public void validoBannerDuasImagens() {
        webSanity.validarBannerDuasImagens();
    }
    @Entao("verifico que a tela Home possui Banner com Cinco Imagens")
    public void validoBannerCincoImagens() {
        webSanity.validarBannerCincoImagens();
    }
    @Entao("verifico que existem imagens indisponíveis")
    public void imagensIndisponiveisHome() {
        webSanity.imagensIndisponiveisnaHome();
    }
    @E("encontro o Banner Servicos Exclusivos")
    public void encontroBannerServicosExclusivos() {
        webSanity.encontroBannerServicosExclusivos();
    }
    @E("clico no botão para mudar a imagem para Esquerda")
    public void imagemEsquerda() {
        webSanity.mudarImagemEsquerda();
    }
    @E("clico no botão para mudar a imagem para Direita")
    public void imagemDireita() {
        webSanity.mudarImagemDireita();
    }
    @E("encontro a Vitrine Mais Vendidos")
    public void encontroVitrineMaisVendidos() {
        webSanity.vitrineMaisVendidos();
    }
    @E("visualizo os Banners da Home")
    public void visualizoBannersHome() {
        webSanity.visualizoBannersHome();
    }
}
