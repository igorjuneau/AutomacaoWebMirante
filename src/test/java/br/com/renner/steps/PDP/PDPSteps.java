package br.com.mirante.steps.PDP;

import br.com.mirante.interactions.PDP.PDPInteractions;
import io.cucumber.java.pt.*;

public class PDPSteps {

    PDPInteractions webSanity = new PDPInteractions();

    public PDPSteps() {
    }
    @Dado("que seleciono o icone de PDP")
    @E("seleciono o icone de PDP")
    public void que_seleciono_o_icone_de_PDP() {
        webSanity.selecionoIconePDP();
    }
    @E("Verifico se o produto foi adicionado a PDP")
    public void voidVerificoPDP() {
        webSanity.verificoSeFoiAdidionadoAPDP();
    }
    @Quando("Clico no icone de adicionar a PDP")
    public void clicoNoIconeDeAdicionarAPDP() {
        webSanity.clicarNoBotaoAdicionarPDP();
    }
    @Quando("Clico no icone de adicionar mais unidades do produto na PDP")
    public void clicoNoIconeDeAdicionarMaisDoProdutoAPDP() {
        webSanity.clicarNoBotaoMaisDoProdutoNaPDP();
    }
    @E("Removo o item da PDP")
    public void removoOItemDaPDP() {
        webSanity.clicarNoBotaoLixeira();
    }
    @Entao("uma mensagem de PDP vazia deve aparecer")
    public void umaMensagemDePDPVaziaDeveAparecer() {
        webSanity.verificarMensagemPDPVazia();
    }
    @Entao("verifico que nao obtive frete gratis PDP")
    @Entao("verifico as regras para o frete gratis PDP")
    public void umaMensagemDefaltaXParaFreteGratisDeveAparecerPDP() {
        webSanity.verificarMensagemFaltaXParaFreteGrátisPDP();
    }
    @Quando("simulo o frete com CEP valido PDP")
    public void simulo_o_frete_com_cep_valido_PDP() {
        webSanity.simuloFretePDP();
    }
    @Entao("deve aparecer Frete Camicado Normal PDP")
    public void deve_aparecer_frete_camicado_normal_PDP() {
        webSanity.validoLabelFreteNormalPDP();
    }
    @E("volto para a PDP")
    public void volto_para_a_PDP() {
        webSanity.clicarBotaoFechar();
    }
    @Então("verifico o Campo Sobre o Produto na PDP")
    public void devoVeroCampoSobreoProdutoNaPDP() {
        webSanity.validarCampoSobreProdutoNaTelaPDP();
    }
    @Quando("valido a tela de PDP")
    public void validoTelPDP() {
        webSanity.validarTelaPDP();
    }
    @Entao("as imagens em destaque sao apresentadas no banner")
    public void imagensDestaqueApresentadasBanner() {
        webSanity.imagensDestaqueApresentadasBanner();
    }
    @Entao("verifico que o menu comprar junto e apresentado na PDP")
    public void devoVerATelaDeComprarJuntonaPDP() {
        webSanity.validarComprarJuntonaPDP();
    }
    @Entao("clico na categoria do produto na PDP")
    public void clicoNaCategoriaDoProdutoPDP() {
        webSanity.clicarCategoriaProdutoPDP();
    }
    @Entao("tento clicar na categoria anterior do produto na PDP")
    public void clicoNaCategoriaAnteriorDoProdutoPDP() {
        webSanity.clicarCategoriaAnteriorProdutoPDP();
    }
    @Entao("o sistema retorna para a pagina de produtos PDP")
    public void retornoParaPaginaDeProdutosPDP() {
        webSanity.retornarPaginaProdutosPDP();
    }
}
