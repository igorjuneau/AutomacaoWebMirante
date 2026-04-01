package br.com.mirante.steps.checkout;

import br.com.mirante.interactions.checkout.CheckoutInteractions;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

import static br.com.mirante.toolbox.miranteTools.adicionaCreditoValeTroca;

public class CheckoutSteps {
    CheckoutInteractions checkoutInteractions = new CheckoutInteractions();

    public CheckoutSteps() {
    }
    @Quando("Pesquiso um produto pela SKU {string}")
    public void pesquisoPelaSKUSalva(String produto1) throws Exception {
        checkoutInteractions.pesquisoPelaSkuSalva(produto1);
    }
    @E("Finalizo a compra com cartao de credito {string}")
    public void finalizoCompraCartaoCreditoBandeira(String cartao) throws Exception {
        checkoutInteractions.finalizoCompraCartaoCreditoBandeira(cartao);
    }
    @E("Finalizo a compra com cartao de credito")
    public void finalizoCompraCartaoCredito() throws Exception {
        checkoutInteractions.finalizoCompraCartaoCredito();
    }
    @E("Acesso a PDP do primeiro produto")
    public void acessoPrimeiroProduto() throws Exception {
        checkoutInteractions.acessoPrimeiroProduto();
    }
    @E("Adiciono o produto a sacola")
    public void adicionarProdutoASacola() throws Exception {
        checkoutInteractions.adicionarProdutoASacola();
    }
    @E("Verifico se o produto foi adicionado a sacola Checkout")
    public void voidVerificoSacolaCheck() {
        checkoutInteractions.verificoSeFoiAdidionadoASacolaCheckout();
    }
    @E("Finalizo a compra com Vale troca")
    public void finalizoCompraValeTroca() throws Exception {
        checkoutInteractions.finalizoCompraValeTroca();
    }
    @E("Finalizo a compra com cartao de credito meu cartao")
    public void finalizoCompraCartaoCreditoMeuCartao() throws Exception {
        checkoutInteractions.finalizoCompraCartaoCreditoMeuCartao();
    }
    @E("Finalizo a compra com cartao mirante")
    public void finalizoCompraCartaomirante() throws Exception {
        checkoutInteractions.finalizoCompraCartaomirante();
    }
    @E("Aumento a quantidade do primeiro para 3")
    public void aumentoQuantidadeEm3() {
        checkoutInteractions.aumentoQuantidadeEm3();
    }
    @E("Finalizo a compra com Boleto")
    public void finalizoCompraBoleto() {
        checkoutInteractions.finalizoACompraComBoleto();
    }
    @Entao("Pedido boleto deve ser finalizado com sucesso")
    public void pedidoDeveSerFinalizadoComSucesso() {
        checkoutInteractions.validoPedidoBoleto();
    }
    @Entao("Pedido VT deve ser finalizado com sucesso")
    public void pedidoVTDeveSerFinalizadoComSucesso() {
        checkoutInteractions.validoPedidoBoleto();
    }
    @Entao("Pedido deve ser finalizado com sucesso")
    public void pedidoDeveSerFinalizadoSucesso() {
        checkoutInteractions.validoPedido();
    }
    @Dado("Adiciono vale troca para o CPF {string} com valor {string}")
    public void adicionoValeTrocaParaOCPF(String doc, String valor) {
        adicionaCreditoValeTroca(doc, valor);
    }
    @E("Finalizo a compra com PIX")
    public void finalizoACompraComPIX() {
        checkoutInteractions.finalizoACompraComPIX();
    }
}
