package com.bikesonline.www.userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class BusquedaRandomUI {
    public final Target BTN_CATEGORIA= Target.the("Categoria Bikes")
            .locatedBy("(//a[@Class=\"dropdown-toggle\"])[1]");

    public final Target BTN_PRODUCTO_ALEATORIO= Target.the("Boton para seleccionar producto Aleatorio")
            .locatedBy("//a[@Class=\"findify-components--cards--product findify-product-card-bike-collection\"]");

    public final Target LBL_PRODUCTO_ALEATORIO= Target.the("Titulo producto Aleatorio")
            .locatedBy("//span[@Class=\"findify-components--text findify-components--cards--product__title\"]");

    public final Target LBL_PRODUCTO= Target.the("Titulo del Producto").locatedBy("(//h1[@id='p_title'])");
}
