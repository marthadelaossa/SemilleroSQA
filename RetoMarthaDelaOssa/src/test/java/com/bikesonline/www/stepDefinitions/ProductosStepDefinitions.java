package com.bikesonline.www.stepDefinitions;

import com.bikesonline.www.driver.SeleniumWebDriver;
import com.bikesonline.www.steps.ProductosSteps;
import com.bikesonline.www.utils.EsperaImplicita;
import com.bikesonline.www.utils.Excel;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class ProductosStepDefinitions {
    @Steps
    ProductosSteps productosSteps= new ProductosSteps();
    @Steps
    EsperaImplicita implicita = new EsperaImplicita();
    private static ArrayList<Map<String,String>> leerExcel=new  ArrayList<Map<String,String>>();
    @Dado("^que me encuentro www\\.bikesonline\\.com$")
    public void queMeEncuentroWwwBikesonlineCom() {
        try{
            leerExcel= Excel.readExcel("LibroReto.xlsx","url");
        }catch (IOException e){ e.printStackTrace ();}
        SeleniumWebDriver.chromeDrive(leerExcel.get(0).get("link"));
        implicita.esperar(60);

    }

    @Cuando("^quiero buscar  (\\d+)  producto en una de sus categorias y validarlos$")
    public void quieroBuscarProductoEnUnaDeSusCategoriasYValidarlos(int arg1) {
                productosSteps.buscarYValidarProductos();
    }

    @Entonces("^salgo de la pagina$")
    public void salgoDeLaPagina() {
        SeleniumWebDriver.driver.quit();

    }
}
