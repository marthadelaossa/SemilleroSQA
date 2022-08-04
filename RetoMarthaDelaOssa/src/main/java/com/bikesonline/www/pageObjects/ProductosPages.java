package com.bikesonline.www.pageObjects;
import org.openqa.selenium.By;


public class ProductosPages {
    private By btnCategoria = By.xpath("//a[text()='Bicycle Parts']");
    private By btnProducto1=By.xpath("//a[@href='https://www.bikesonline.com/entity-pp20-composite-flat-pedals-black' and @class='findify-components--cards--product']");
    private By btnProducto2=By.xpath("//a[@href='https://www.bikesonline.com/entity-inner-tube-27.5x1.5-2.5-schrader-valve-650b' and @class='findify-components--cards--product']");
    private By btnProducto3=By.xpath("//a[@href='https://www.bikesonline.com/entity-inner-tube-700x32-48c-schrader-valve-hybrid' and @class='findify-components--cards--product']");
    private By btnProducto4=By.xpath("//a[@href='https://www.bikesonline.com/entity-rp15-carbon-road-bike-pedals-look-keo-compa' and @class='findify-components--cards--product']");
    private By btnProducto5=By.xpath("//a[@href='https://www.bikesonline.com/2022-marin-san-quentin-3-frameset' and @class='findify-components--cards--product']");
    private By lblProducto=By.xpath("//h1[@id='p_title']");

    public By getBtnCategoria() {
        return btnCategoria;
    }

    public By getBtnProducto1() {
        return btnProducto1;
    }

    public By getBtnProducto2() {
        return btnProducto2;
    }

    public By getBtnProducto3() {
        return btnProducto3;
    }

    public By getBtnProducto4() {
        return btnProducto4;
    }

    public By getBtnProducto5() {
        return btnProducto5;
    }

    public By getLblProducto() {
        return lblProducto;
    }

}


