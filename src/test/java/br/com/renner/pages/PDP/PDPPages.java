package br.com.mirante.pages.PDP;

import org.openqa.selenium.By;

public class PDPPages {

    public static By header() {
        return By.cssSelector("#PageHeader");
    }
    public static By productPageContainer() {
        return By.cssSelector("#wrapper > div.product-page-container");
    }
    public static By categoriaPDP() {
        return By.cssSelector("text-label[textlabel=\"Taças \"]");
    }
    public static By categoriaAnteriorPDP() {
        return By.cssSelector("text-label[textlabel='Servir']");
    }
    public static By navigationbreadcrumbsPDP() {
        return By.cssSelector("navigation-breadcrumbs");
    }
    public static By categoryCarousel() {
        return By.cssSelector("category-carousel");
    }
    public static By bagIcon() {
        return By.cssSelector("#automation-header-bag-icon-id");
    }
    public static By genericButton() {
        return By.cssSelector("button");
    }
    public static By genericCloseTelaCashBack() {
        return By.cssSelector("#modal > div.container.mobileSize > div.header.header-border-none > button");
    }
    public static By buttonPlus() {
        return By.cssSelector("div > span:nth-child(3) > svg");
    }
    public static By navigationTabPDP() {
        return By.cssSelector("div.desktop-layout > div:nth-child(2) > div.section-column.right.form");
    }
    public static By pagesProductPages() {
        return By.cssSelector("pages-product-page");
    }
    public static By formInputCepPDP() {
        return By.cssSelector("form-input-cep");
    }
    public static By inputCepPDP() {
        return By.cssSelector("#input-cep");
    }
    public static By submitButton() {
        return By.cssSelector("[type='submit']");
    }
    public static By labelShippingPrice() {
        return By.cssSelector("#labelShippingPrice");
    }
    public static By textLabelShippingNormal() {
        return By.cssSelector("text-label[textlabel='Frete Camicado ∙ Normal']");
    }
    public static By cardsShippingCard() {
        return By.cssSelector("cards-shipping-card");
    }
    public static By upperTextNormal() {
        return By.cssSelector("labels-double-line[uppertext='Normal'][bottomtext='11 dias úteis'][maxlength='30']");
    }
    public static By labelsDoubleLine() {
        return By.cssSelector("labels-double-line");
    }
    public static By textLabel() {
        return By.cssSelector("text-label");
    }
    public static By textLabelShippingExpress() {
        return By.cssSelector("text-label[textlabel='Frete Camicado ∙ Expresso']");
    }
    public static By continueButton() {
        return By.cssSelector("#buttonContinue");
    }
    public static By selecionarFreteNormal() {
        return By.cssSelector("cards-freight-card[data-shipping-method='1_NORMAL']");
    }
    public static By selecionarFreteExpresso() {
        return By.cssSelector("cards-freight-card[data-shipping-method='2_EXPRESS']");
    }
    public static By selecionarFreteAgendado() {
        return By.cssSelector("cards-freight-card[data-shipping-method='3_AGENDADO']");
    }
    public static By selecionarRetireEmLoja() {
        return By.cssSelector("cards-freight-card[data-shipping-method='4_RetireEmLoja']");
    }
    public static By paymentButtonTablet() {
        return By.cssSelector("#payment-button-tablet");
    }
    public static By modalCookies() {
        return By.cssSelector("modal-cookies");
    }
    public static By ctaPillButton() {
        return By.cssSelector("cta-pill-button");
    }
    public static By showcaseCardProductPDP() {
        return By.cssSelector("pages-product-page");
    }
    public static By pagesCardProductPDP() {
        return By.cssSelector("#wrapper > bundle-purchase-banner");
    }
    public static By bundlePurchaseTitle() {
        return By.cssSelector("bundle-purchase-title fontSize-32 mobileFontSize-24");
    }
    public static By ctaBuyButton() {
        return By.cssSelector("cta-buy-button");
    }
    public static By headContainer() {
        return By.cssSelector("card-bundle-purchase");
    }
    public static By cardHumblePurchase() {
        return By.cssSelector("card-bundle-purchase");
    }
    public static By ctaIconButton() {
        return By.cssSelector("cta-icon-button");
    }
    public static By selectorQuantity() {
        return By.cssSelector("#selectorQuantity");
    }
    public static By containerCart() {
        return By.cssSelector("#container-cart div:nth-child(2) text-label");
    }
    public static By labelPart() {
        return By.cssSelector("[part='label']");
    }
    public static By containerCartSreeShipping() {
        return By.cssSelector("#cardFreeShippingProgress > text-label");
    }
    public static By labelPartFrete() {
        return By.cssSelector("[part='label']");
    }
    public static By paymentButton() {
        return By.cssSelector("button[part='link']");
    }
    public static By productPurchaseDetails() {
        return By.cssSelector("product-purchase-details");
    }
    public static By iconTrash() {
        return By.cssSelector("#iconTrash");
    }
    public static By inputGenerico() {
        return By.cssSelector("input");
    }
    public static By headerPayment() {
        return By.cssSelector("simple-header");
    }
    public static By spanIconClose() {
        return By.cssSelector("span.icon-close");
    }
    public static By cashbackModal() {
        return By.cssSelector("#cashback-modal");
    }
    public static By cashbackTelaModal() {
        return By.cssSelector("#modal > div.container.mobileSize");
    }
    public static String btnCadastrase = "//*[text()='Cadastre-se']";

    public static By cookieCtaPillButton() {
        return By.cssSelector(".button__close.fontSize-14.mobileFontSize-14");
    }
    public static By btnFecharCookies() {
        return By.cssSelector("button[type='button']");
    }
    public static By iconePDP() {
        return By.cssSelector("header-bag-icon");
    }
    public static By iconeRetirarPDP() {
        return By.cssSelector("#iconTrash");
    }
    public static By shadowDetalheProdutoPDP() {
        return By.cssSelector("product-purchase-details");
    }
    public static By shadowPDPVazia() {
        return By.cssSelector("navigation-tabs>div:nth-child(2)>text-label");
    }
    public static By underHeader() {
        return By.cssSelector("#js-underHeaderContainer");
    }
    public static By iconePerfil() {
        return By.cssSelector("#automation-header-profile-icon-logged-off-id");
    }
    public static By abaProdutos() {
        return By.cssSelector("div.desk-hamburger");
    }
    public static By shadowAppMenu() {
        return By.cssSelector("app-menu");
    }
    public static By shadowHeaderLinksHighlight() {
        return By.cssSelector("header-links-highlight");
    }
    public static By shadowHeaderSearchIcon() {
        return By.cssSelector("header-search-icon");
    }
    public static By button() {
        return By.cssSelector("button");
    }
    public static By shadowInputPesquisa() {
        return By.cssSelector("input-rounded-search");
    }
    public static By inputPesquisa() {
        return By.cssSelector("#automation-search-icon-template-input-id");
    }
    public static By cardPrimeiroProdutoPesquisa() {
        return By.cssSelector("product-card-square-listing:nth-child(1)");
    }
    public static By cardOitavoProdutoPesquisa() {
        return By.cssSelector("product-card-square-listing:nth-child(8)");
    }
    public static By finalPesquisaProduto() {
        return By.cssSelector("cta-see-more-button");
    }
    public static By listCardsProdutoPesquisa() {
        return By.cssSelector("product-card-square-listing");
    }
    public static By shadowProductCardPrice() {
        return By.cssSelector("product-card-price");
    }
    public static By shadowTextLabel() {
        return By.cssSelector("text-label");
    }
    public static By cardSextoProdutoPesquisa() {
        return By.cssSelector("product-card-square-listing:nth-child(6)");
    }
    public static By shadowFilter() {
        return By.cssSelector("filter-bar");
    }
    public static By shadowProductPage() {
        return By.cssSelector("pages-product-page");
    }
    public static By loadingContainer() {
        return By.cssSelector("loading-container");
    }
    public static By wrapper() {
        return By.cssSelector("#wrapper");
    }
    public static By shadowBtnComprar() {
        return By.cssSelector("cta-buy-button");
    }
    public static By shadowFilterN2() {
        return By.cssSelector("cta-filter-button");
    }
    public static By shadowNavigateFiltrer() {
        return By.cssSelector("navigation-filter-tabs");
    }
    public static By shadowBtnAplicarFilter() {
        return By.cssSelector("floating-bar");
    }
    public static By shadowBtnAplicarFilterN2() {
        return By.cssSelector("cta-pill-button");
    }
    public static By labelPriceFilter() {
        return By.cssSelector("text-label[textlabel=\"Preço\"]");
    }
    public static By inputPriceRangeFilter() {
        return By.cssSelector("input-price-range");
    }
    public static By handlePriceRangeFilter() {
        return By.cssSelector(".noUi-handle.noUi-handle-upper>*");
    }
    public static By shadowTextPriceProduct() {
        return By.cssSelector("product-page-price");
    }
    public static By shadowTextPriceProductn2() {
        return By.cssSelector("div>text-label");
    }
    public static By div() {
        return By.cssSelector("div");
    }
    public static By shadowCloseButtonCashBack() {
        return By.cssSelector("#cashback-modal");
    }
    public static By closeButtonCashBack() {
        return By.cssSelector(".close-button");
    }
    public static By shadowButtonContinue() {
        return By.cssSelector("#buttonContinue");
    }
    public static By checkboxEnderecoCarrinho() {
        return By.cssSelector(".checkout__select-mark>div");
    }
    public static By buttonIrParaPagamento() {
        return By.cssSelector(".title__primary.checkout__button.checkout__button-terciary.js-confirm-delivery");
    }
    public static By checkboxPagamentoPix() {
        return By.cssSelector(".js-payment-option>.icon-ic-pix");
    }
    public static By buttonFinalizarCompra() {
        return By.cssSelector("#paymentForm>button");
    }
    public static By tituloSucessoPedido() {
        return By.cssSelector(".checkout__title-pages__text");
    }
    public static By btnFechar() {
        return By.cssSelector("#btFechar");
    }
    public static By aceitarTermosUso() {
        return By.cssSelector("#checkmarch");
    }
    public static By shadowTextProduct() {
        return By.cssSelector(".product-name>text-label");
    }
    public static By shadowOrdenacaoList() {
        return By.cssSelector("selectors-dropdown-ordenation");
    }
    public static By buttonIndex3() {
        return By.cssSelector("button:nth-child(3)");
    }
    public static By textProductPage() {
        return By.cssSelector("h1");
    }
    public static By shadowHeaderLinksHighlightN2() {
        return By.cssSelector("div>text-label");
    }
    public static By h2TituloCategoria() {
        return By.cssSelector("h2");
    }
    public static By shadowMenuSelectionDepartaments() {
        return By.cssSelector("menu-section-departments");
    }
    public static By shadowManuSelectionDepartamentsN2() {
        return By.cssSelector("menu-section-department-n2[class=\"department\"]");
    }
    public static By btnTudoSobreCamaEBanho() {
        return By.cssSelector("menu-text-link[textlabel=\"Tudo de cama e banho\"]");
    }
    public static By headerLinks() {
        return By.cssSelector("header-links-highlight");
    }
    public static By cardHorizontalHightLight() {
        return By.cssSelector("card-horizontal-highlight>h1");
    }
    public static By divPrimeiroProduto() {
        return By.cssSelector("product-card-square-listing:nth-child(1)");
    }
    public static By menuListItemCamaEBanho() {
        return By.cssSelector("menu-list-item[textlabel=\"Cama e Banho\"]");
    }
    public static By shadowFormLogin() {
        return By.cssSelector("#formLogin");
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
    public By divSearchIcon() {
        return By.cssSelector(".icon.search-icon");
    }
    public By menuListItem(String text) {
        return By.cssSelector(String.format("menu-list-item[textlabel='%s']", text));
    }
    public By menuSubListItem(String text) {
        return By.cssSelector(String.format("menu-text-link[textlabel='%s']", text));
    }
    public By tituloCategorias() {
        return By.cssSelector("#category-filter-header");
    }
    public By produtosResultadosContainer() {
        return By.cssSelector("#js-resultsListing");
    }
    public By rrShowcaseVejaTambem() {
        return By.cssSelector("#rrShowcase-ZdVAMEk55qxB8Qisqm5Gg");
    }
    public By produto(int index) {
        return By.cssSelector(String.format("product-card-square-listing:nth-child(%d)", index));
    }
    public By cardsProdutos(){
        return By.cssSelector("product-card-square-listing");
    }
    public By cardsProductSquare(){
        return By.cssSelector("cards-product-square");
    }
    public By pdpContainer() {
        return By.cssSelector("pages-product-page");
    }
    public By nomeProdutoPdpText(){
        return By.cssSelector("div.product-name text-label");
    }
    public By precoProdutoPdpContainer(){
        return By.cssSelector("div.product-price product-page-price");
    }
    public By inputSearchContainer(){
        return By.cssSelector("div.icon.search-icon");
    }
    public By inputSearch(){
        return By.cssSelector("input");
    }
    public By itensPDPContainer(){
        return By.cssSelector("navigation-tabs");
    }
    public By carrinhoProdutoCards(){
        return By.cssSelector("product-purchase-details");
    }
    public By nomeProdutoCarrinho(){
        return By.cssSelector("labels-double-line");
    }
}
