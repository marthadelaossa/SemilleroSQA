package com.bikesonline.www.pageObjects;

import org.openqa.selenium.By;

public class BusquedaPages {
    private By txtBusqueda=By.xpath("//input[@id='name_search' and @nsearch-id='0']");
    private By btnBusqueda=By.xpath("(//button[@class='btn btn-info'])[1]");

    public By getTxtBusqueda() {
        return txtBusqueda;
    }

    public By getBtnBusqueda() {
        return btnBusqueda;
    }
}
