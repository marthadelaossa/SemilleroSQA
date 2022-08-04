package com.bikesonline.www.pageObjects;

import org.openqa.selenium.By;

public class CategoriaPages {
    private By btnCategoria=By.xpath("//a[text()='Bicycle Accessories']");
    private By btnProducot=By.xpath("//a[@href='https://www.bikesonline.com/entity-bc15-alloy-bicycle-water-bottle-cage-black' and @class='findify-components--cards--product']");

    private By lblProducto=By.xpath("//h1[@id='p_title']");
    public By getBtnCategoria() {
        return btnCategoria;
    }

    public By getBtnProducot() {
        return btnProducot;
    }

    public By getLblProducto() {

        return lblProducto;
    }
}
