package br.com.mirante.steps.sacola;

import br.com.mirante.interactions.sacola.SacolaInteractions;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class SacolaSteps {

    SacolaInteractions webSanity = new SacolaInteractions();

    public SacolaSteps() {
    }
    @Dado("que seleciono o icone de sacola")
    @E("seleciono o icone de sacola")
    public void que_seleciono_o_icone_de_sacola() {
        webSanity.selecionoIconeSacola();
    }
    @E("Verifico se o produto foi adicionado a sacola")
    public void voidVerificoSacola() {
        webSanity.verificoSeFoiAdidionadoASacola();
    }
    @Quando("simulo o frete com CEP valido")
    public void simulo_o_frete_com_cep_valido() {
        webSanity.simuloFrete();
    }
    @Entao("deve aparecer Frete Camicado Normal")
    public void deve_aparecer_frete_camicado_normal() {
        webSanity.validoLabelFrete();
    }
    @Quando("seleciono o frete normal")
    public void seleciono_o_frete_normal() {
        webSanity.escolherFreteNormal();
    }
    @Quando("seleciono o frete expresso")
    public void seleciono_o_frete_expresso() {
        webSanity.escolherFreteExpresso();
    }
    @Quando("seleciono o frete agendado")
    public void seleciono_o_frete_agendado() {
        webSanity.escolherFreteAgendado();
    }
    @Quando("seleciono retire em loja")
    public void seleciono_retire_em_loja() {
        webSanity.escolherRetireEmLoja();
    }
    @Entao("deve aparecer o frete normal no resumo da compra")
    public void deve_aparecer_o_frete_normal_no_resumo_da_compra() {
        webSanity.resumoDaCompraFreteNormal();
    }
    @Entao("deve aparecer o frete expresso no resumo da compra")
    public void deve_aparecer_o_frete_expresso_no_resumo_da_compra() {
        webSanity.resumoDaCompraFreteExpresso();
    }
    @Entao("deve aparecer o frete escolhido no resumo da compra")
    public void deve_aparecer_o_frete_escolhido_no_resumo_da_compra() {
        webSanity.resumoDaCompraFrete();
    }
    @Entao("devem aparecer os valores no resumo da compra")
    public void devemAparecerValoresResumoCompra() {
        webSanity.devemAparecerValoresResumoCompra();
    }
    @Entao("deve aparecer a informacao de cashback no resumo da compra")
    public void deveAparecerInformacaoCashbackResumoCompra() {
        webSanity.deveAparecerInformacaoCashbackResumoCompra();
    }
    @Quando("devo ver o botao de quantidade")
    public void verificarBotaoQuantidade() {
        webSanity.verificarBotaoQuantidade();
    }
    @Quando("devo ver o botao de Adicionar a Sacola")
    public void verificarBotaoAdicionarASacola() {
        webSanity.verificarBotaoAdicionarSacola();
    }
    @Quando("Clico no icone de adicionar a sacola")
    public void clicoNoIconeDeAdicionarASacola() {
        webSanity.clicarNoBotaoAdicionarSacola();
    }
    @Quando("Clico no icone de adicionar mais unidades do produto na sacola")
    public void clicoNoIconeDeAdicionarMaisDoProdutoASacola() {
        webSanity.clicarNoBotaoMaisDoProdutoNaSacola();
    }
    @E("Removo o item da sacola")
    public void removoOItemDaSacola() {
        webSanity.clicarNoBotaoLixeira();
    }
    @Entao("verifico que a sacola esta vazia")
    @Entao("uma mensagem de sacola vazia deve aparecer")
    public void umaMensagemDeSacolaVaziaDeveAparecer() {
        webSanity.verificarMensagemSacolaVazia();
    }
    @Entao("verifico que obtive frete gratis")
    public void umaMensagemDeFreteGratisDeveAparecer() {
        webSanity.verificarMensagemFreteGrátis();
    }
    @Entao("verifico que nao obtive frete gratis")
    @Entao("verifico as regras para o frete gratis")
    public void umaMensagemDefaltaXParaFreteGratisDeveAparecer() {
        webSanity.verificarMensagemFaltaXParaFreteGrátis();
    }
    @E("volto para a sacola")
    public void volto_para_a_sacola() {
        webSanity.clicarBotaoFechar();
    }
    @Dado("que acesso a sacola")
    public void acessoSacola() {
        webSanity.acessoSacola();
    }
    @E("valido as informações do produto")
    public void validoAsInformacoesDoProduto() {
        webSanity.validarInformacoesDoProduto();
    }
    @E("clico no primeiro produto da tela")
    public void clicarPrimeiroProdutodaTela() {
        webSanity.clicarPrimeiroProdutodaTela();
    }
    @E("clico no primeiro produto da vitrine")
    public void clicarPrimeiroProdutodaVitrine() {
        webSanity.clicarPrimeiroProdutodaVitrine();
    }
    @E("acesso o produto na posição {string} na lista de resultados de busca")
    public void acessoOProdutoNaPosicaoNaListaDeResultadosDeBusca(String pos) {
        webSanity.acessarProdutoNaBuscaPosicao(pos);
    }
    @Entao("devo ver a tela de PDP")
    public void devoVerATelaDePDP() {
        webSanity.validarTelaPDP();
    }
    @Entao("devo ver itens nos resultados de busca")
    public void devoVerItensNosResultadosDeBusca() {
        webSanity.validarRetornoBusca();
    }
}
