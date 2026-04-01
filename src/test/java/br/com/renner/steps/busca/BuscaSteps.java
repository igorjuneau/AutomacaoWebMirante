package br.com.mirante.steps.busca;

import br.com.mirante.interactions.busca.BuscaInteractions;
import br.com.mirante.interactions.checkout.CheckoutInteractions;
import io.cucumber.java.pt.*;

import static br.com.mirante.toolbox.miranteTools.adicionaCreditoValeTroca;

public class BuscaSteps {
    BuscaInteractions buscaInteractions = new BuscaInteractions();

    public BuscaSteps() {
    }
    @Quando("Clico na lupa de busca")
    public void clicoNoIconeDeBusca() throws Exception {
        buscaInteractions.clicoNoIconeDeBusca();
    }
    @Quando("clico no botao filtrar")
    public void clicoNoIconefiltrar() throws Exception {
        buscaInteractions.clicoNoIconefiltrar();
    }
    @Quando("clico em categorias")
    public void clicoEmCategorias() throws Exception {
        buscaInteractions.clicoEmCategorias();
    }
    @E("Clico no primeiro produto na sugestao")
    public void clicoNoPrimeiroProdutoNaSugestao() {
        buscaInteractions.clicoNoPrimeiroProdutoNaSugestao();
    }
    @E("visualizo as Sugestoes de produtos")
    public void visualizoProdutoNaSugestao() {
        buscaInteractions.visualizoProdutosNaSugestao();
    }
    @E("visualizo a mensagem nenhum resultado para")
    public void visualizoMensagemNenhumResultado() {
        buscaInteractions.MensagemNenhumResultado();
    }
    @Então("Verifico se fui redirecionado para PDP")
    public void verificoSeFuiRedirecionadoParaPDP() {
        buscaInteractions.verificoSeFuiRedirecionadoParaPDP();
    }
    @Então("Verifico se a busca retorna mensagem de termo invalido")
    public void verificoSeABuscaRetornaMesnagemDeTermoInvalido() {
        buscaInteractions.verificoSeABuscaRetornaMesnagemDeTermoInvalido();
    }
    @Quando("Pesquiso no input da busca {string}")
    public void pesquisoNoInputDaBusca(String termo) throws Exception {
        buscaInteractions.pesquisoNoInputDaBusca(termo, "n/d");
    }
    @Quando("Pesquiso no input da busca {string} e clico na lupa")
    public void pesquisoNoInputDaBuscaEClicoNaLupa(String termo) throws Exception {
        buscaInteractions.pesquisoNoInputDaBusca(termo, "lupa");
    }
    @Quando("Pesquiso no input da busca {string} e pressiono enter")
    public void pesquisoNoInputDaBuscaEPressionoEnter(String termo) throws Exception {
        buscaInteractions.pesquisoNoInputDaBusca(termo, "enter");
    }
    @E("Acesso primeira categoria sugerida")
    public void acessoPrimeiraCategoriaSugerida() {
        buscaInteractions.acessoPrimeiraCategoriaSugerida();
    }
    @E("Clico no botao de ver mais categorias")
    public void clicoNoBotaoDeVerMaisCategorias() {
        buscaInteractions.clicoNoBotaoDeVerMaisCategorias();
    }
    @Então("Verifico se fui para pagina de categoria")
    public void verificoSeFuiParaPaginaDeCategoria() {
        buscaInteractions.verificoSeFuiParaPaginaDeCategoria();
    }
}
