package br.com.mirante.pages.Home;

import org.openqa.selenium.By;

public class HomePages {

    public By textoPrincipal() {
        return By.cssSelector("#menu-item-3713 > a > span.menu-text");
    }
    public By clicoProdutos() {
        return By.xpath("//*[@id=\"menu-item-3714\"]/a/span[2]");
    }
    public By clicoEmprestimos() {
        return By.cssSelector("#menu-item-3723 > a > span.menu-text");
    }
    public By imagemEmprestimo01() {
        return By.cssSelector("#post-4102 > div > div.wp-block-uagb-post-grid.uagb-post-grid.uagb-post__" +
                "image-position-background.uagb-post__image-enabled.uagb-block-be168cfe.uagb-post__items.uagb-post" +
                "__columns-3.is-grid.uagb-post__columns-tablet-2.uagb-post__columns-mobile-1.uagb-post__equal-height." +
                "uagb-equal_height_inline-read-more-buttons > article:nth-child(1) > h3 > a");
    }
    public By imagemEmprestimo02() {
        return By.cssSelector("#post-4102 > div > div.wp-block-uagb-post-grid.uagb-post-grid.uagb-post__" +
                "image-position-background.uagb-post__image-enabled.uagb-block-be168cfe.uagb-post__items.uagb-post" +
                "__columns-3.is-grid.uagb-post__columns-tablet-2.uagb-post__columns-mobile-1.uagb-post__equal-height." +
                "uagb-equal_height_inline-read-more-buttons > article:nth-child(2) > div.uagb-post__image");
    }
    public By imagemEmprestimo03() {
        return By.cssSelector("#post-4102 > div > div.wp-block-uagb-post-grid.uagb-post-grid.uagb-post__" +
                "image-position-background.uagb-post__image-enabled.uagb-block-be168cfe.uagb-post__items.uagb-post" +
                "__columns-3.is-grid.uagb-post__columns-tablet-2.uagb-post__columns-mobile-1.uagb-post__equal-height." +
                "uagb-equal_height_inline-read-more-buttons > article:nth-child(3) > div.uagb-post__image");
    }
    public By clicoConsignado() {
        return By.cssSelector("#menu-item-3727 > a > span.menu-text");
    }
    public By tituloConsignado() {
        return By.xpath("//h1[contains(text(), 'Empréstimo Consignado')]");
    }

}
