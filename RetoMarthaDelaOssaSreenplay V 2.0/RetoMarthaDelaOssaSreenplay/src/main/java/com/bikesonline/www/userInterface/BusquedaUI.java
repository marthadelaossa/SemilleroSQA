package com.bikesonline.www.userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class BusquedaUI {
    public final Target TXT_BARRA_BUSQUEDA = Target.the("Barra de Busqueda de BikesOnline")
            .locatedBy("//input[@id='name_search' and @nsearch-id='0']");
    public final Target BTN_PRODUCTO_UNO= Target.the("Primer producto encontrado en la busqueda")
            .locatedBy("(//a[@Class='findify-components--cards--product'])[1]");
    public final Target LBL_PRODUCTO=Target.the("Titulo del Producto").locatedBy("(//h1[@id='p_title'])");

}

