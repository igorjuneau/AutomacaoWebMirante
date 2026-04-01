package br.com.mirante.pages.busca;

import org.openqa.selenium.By;

public class BuscaPage {
    public static By header() {
        return By.cssSelector("#PageHeader");
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

    public By divSearchIcon() {
        return By.cssSelector(".icon.search-icon");
    }

    public static By shadowSearchSuggestionUl() {
        return By.cssSelector("[automationulid='automation-search-suggestion-result-page-render-ul-id']");
    }

    public static By searchSuggestionUlId() {
        return By.cssSelector("#automation-search-suggestion-result-page-render-ul-id");
    }

    public static By listItem() {
        return By.cssSelector("li.list-item");
    }

    public static By productBackgroundRounded() {
        return By.cssSelector("product-background-rounded");
    }

    public static By cashbackModal() {
        return By.cssSelector("#cashback-modal");
    }

    public static By genericButton() {
        return By.cssSelector("button");
    }

    public static By modalCookies() {
        return By.cssSelector("modal-cookies");
    }

    public static By ctaPillButton() {
        return By.cssSelector("cta-pill-button");
    }

    public static By automationCtaPillButtonId() {
        return By.cssSelector("#automation-cta-pill-button-id");
    }

    public static By navigationFilterTabs() {
        return By.cssSelector("#automation-nav-label-id-categorias-1");
    }

    public static By divCategorias() {
        return By.cssSelector("div");
    }

    public static By filterBar() {
        return By.cssSelector("filter-bar");
    }

    public static By wrapperFilterBar() {
        return By.cssSelector("#wrapper > filter-bar");
    }

    public static By msgProductNotFound() {
        return By.cssSelector("msg-product-not-found");
    }

    public static By textLabel() {
        return By.cssSelector("text-label");
    }

    public static By h1() {
        return By.cssSelector("h1");
    }

    public static By pagesProductPage() {
        return By.cssSelector("pages-product-page");
    }

    public static By pageHeader() {
        return By.cssSelector("page-header");
    }

    public static By inputRoundedSearch() {
        return By.cssSelector("input-rounded-search");
    }

    public static By searchCategorySuggestion() {
        return By.cssSelector("search-category-suggestion");
    }

    public static By ctaCategorySuggestionPill() {
        return By.cssSelector("cta-category-suggestion-pill");
    }

    public static By plusButton() {
        return By.cssSelector(".plus-button");
    }
}
