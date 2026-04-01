package br.com.mirante.pages.Home;

import org.openqa.selenium.By;

public class HomePages {

    public static By header() {
        return By.cssSelector("#PageHeader");
    }
    public static By ctaFavoriteButtonON() {
        return By.cssSelector("cta-favorite-button[isfavorite='']");
    }
    public static By ctaFavoriteButton() {
        return By.cssSelector("cta-favorite-button");
    }
    public static By genericButton() {
        return By.cssSelector("button.button");
    }
    public static By genericCloseTelaCashBack() {
        return By.cssSelector("#modal > div.container.mobileSize > div.header.header-border-none > button");
    }
    public static By buttonPlus() {
        return By.cssSelector("div > span:nth-child(3) > svg");
    }
    public static By navigationTab() {
        return By.cssSelector("navigation-tabs[selectedindex='0']");
    }
    public static By formInputCep() {
        return By.cssSelector("form-input-cep");
    }
    public static By inputCep() {
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
    public static By textLabelShippingExpress() {
        return By.cssSelector("text-label[textlabel='Frete Camicado ∙ Expresso']");
    }
    public static By continueButton() {
        return By.cssSelector("textlabel='Continuar'");
    }
    public static By selecionarFreteNormal() {
        return By.cssSelector("#\\31 _STANDARD8134080458");
    }
    public static By selecionarFreteExpresso() {
        return By.cssSelector("#\\35 58_EXPRESS8134080458");
    }
    public static By selecionarFreteAgendado() {
        return By.cssSelector("cards-freight-card[data-shipping-method='3_AGENDADO']");
    }
    public static By selecionarRetireEmLoja() {
        return By.cssSelector("#BROKER_PICKUP_STANDARD8134080458");
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
    public static By ctaPillButtonCont() {
        return By.cssSelector("cta-pill-button#buttonContinue");
    }
    public static By adressModal() {
        return By.cssSelector("modal-right[headertext='Editar endereço']");
    }
    public static By adressModalAdic() {
        return By.cssSelector("modal-right[headertext='Editar endereço']");
    }
    public static By modalRight() {
        return By.cssSelector("modal-right[id='address-modal-change']");
    }
    public static By cardsAddressCard() {
        return By.cssSelector("div.checkout-address > div > cards-address-card");
    }
    public static By cardsNewAddress() {
        return By.cssSelector("cards-new-address");
    }
    public static By ctaIconButton() {
        return By.cssSelector("#cardAddress > div.top > div.top-right > cta-icon-button");
    }
    public static By genericButtonCont() {
        return By.cssSelector("button");
    }
    public static By ctaIconButtonAddAddress() {
        return By.cssSelector("cta-icon-button[id='buttonAddAddress']");
    }
    public static By checkoutDelivery() {
        return By.cssSelector("js-checkout-delivery");
    }
    public static By buttonPen() {
        return By.cssSelector("button > svg");
    }
    public static By showcaseCardProduct() {
        return By.cssSelector("pages-product-page");
    }
    public static By showcaseCardProductHome() {
        return By.cssSelector("product-purchase-details");
    }
    public static By pagesCardProductHome() {
        return By.cssSelector("pages-product-page");
    }
    public static By basicReduced() {
        return By.cssSelector("#js-basic-reduced-1748889590754");
    }
    public static By wrapper() {
        return By.id("wrapper");
    }
    public static By wrapperH() {
        return By.id("wrapper");
    }
    public static By basicReducedCardGrid() {
        return By.cssSelector("container is-fixed scroll-not-on-top hidden");
    }
    public static By cardRectangleSquare() {
        return By.cssSelector("card-rectangle-square");
    }
    public static By basicCardSquare() {
        return By.cssSelector("basic-reduced__card-square");
    }
    public static By cardMaskHorizontal() {
        return By.cssSelector("card-mask-horizontal");
    }
    public static By basicCardSquareCard1() {
        return By.cssSelector("basic-reduced__card basic-reduced__card-1");
    }
    public static By ctaBuyButton() {
        return By.cssSelector("cta-buy-button");
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
    public static By publicityContainer() {
        return By.cssSelector("publicity-container");
    }
    public static By cardsCarrouselBestSellers() {
        return By.cssSelector("cards-carrousel-best-sellers");
    }
    public static By cardsProductSquareBestSellers1() {
        return By.cssSelector("cards-product-square-best-sellers[buttonorder='1']");
    }
    public static By cardsProductSquareBestSellers2() {
        return By.cssSelector("cards-product-square-best-sellers[buttonorder='2']");
    }
    public static By cardsProductSquareBestSellers3() {
        return By.cssSelector("cards-product-square-best-sellers[buttonorder='3']");
    }
    public static By cardsProductSquareBestSellers4() {
        return By.cssSelector("cards-product-square-best-sellers[buttonorder='4']");
    }
    public static By cardsProductSquareBestSellers5() {
        return By.cssSelector("cards-product-square-best-sellers[buttonorder='5']");
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
    public static By iconeHome() {
        return By.cssSelector("image-link[targeturl='/home']");
    }
    public static By iconeRetirarHome() {
        return By.cssSelector("#iconTrash");
    }
    public static By shadowDetalheProdutoHome() {
        return By.cssSelector("product-purchase-details");
    }
    public static By shadowHomeVazia() {
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
    public By produto(int index) {
        return By.cssSelector(String.format("product-card-square-listing:nth-child(%d)", index));
    }
    public By cardsProdutos() {
        return By.cssSelector("product-card-square-listing");
    }
    public By modalOverlay() {
        return By.cssSelector("modal-overlay js-modal-overlay");
    }
    public By bannerFull() {
        return By.cssSelector("#js-bannerFull > banner-full");
    }
    public By nomeProdutoPdpText() {
        return By.cssSelector("div.product-name text-label");
    }
    public By pageHeader() {
        return By.cssSelector("loading-container");
    }
    public By precoProdutoPdpContainer() {
        return By.cssSelector("div.product-price product-page-price");
    }
    public By inputSearchContainer() {
        return By.cssSelector("div.icon.search-icon");
    }
    public By inputSearch() {
        return By.cssSelector("input");
    }
    public By itensHomeContainer() {
        return By.cssSelector("navigation-tabs");
    }
    public By carrinhoProdutoCards() {
        return By.cssSelector("product-purchase-details");
    }
    public By nomeProdutoCarrinho() {
        return By.cssSelector("labels-double-line");
    }
    public static By productCardsProductSquare() {
        return By.cssSelector("product-card-square");
    }
    public static By cardsProductSquare() {
        return By.cssSelector("cards-product-square");
    }
    public static By cardsProductSquareListingExpanded() {
        return By.cssSelector("product-card-square-listing-expanded");
    }
    public static By wishlistContainer() {
        return By.cssSelector("#wrapper[class='wishlist__container']");
    }
    public static By productCardWishlist() {
        return By.cssSelector("product-card-wishlist");
    }
    public static By wishlistContainerTitle() {
        return By.cssSelector("wishlist__container-title");
    }
    public static By textLabelFavoritos() {
        return By.cssSelector("text-label[textlabel='Favoritos']");
    }
    public static By cardsProductSquareListing() {
        return By.cssSelector("cards-product-square-listing");
    }
    public static By imagemIndisponivelHome() {
        return By.cssSelector("div > div > div.wrapperImage > img");
    }
    public static By ctaIconButtonNext() {
        return By.cssSelector("cta-icon-button.services__nav-btn.services__nav-btn--next");
    }
    public static By ctaIconButtonPrev() {
        return By.cssSelector("cta-icon-button.services__nav-btn.services__nav-btn--prev");
    }
    public static By navBt() {
        return By.cssSelector("button");
    }
    public static By headerLinksBestSellers() {
        return By.cssSelector("header-links-best-sellers");
    }
    public static By editorialContainer() {
        return By.cssSelector("header-links[titlelabel='Banner Editorial Compre Junto ']");
    }
    public static By bannerNovidades() {
        return By.cssSelector("div.container.basic-reduced__header");
    }
    public static By bannerSujestoesdaSemana() {
        return By.cssSelector("div.pill-heading.js-pill-heading.newsreader");
    }
    public static By bannerSolucaoCompleta() {
        return By.cssSelector("div.container.editorial__header");
    }
}
