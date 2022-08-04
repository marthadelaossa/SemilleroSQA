package com.bikesonline.www.stepDefinitions;
import com.bikesonline.www.steps.CategoriaSteps;
import com.bikesonline.www.utils.EsperaImplicita;
import com.bikesonline.www.driver.SeleniumWebDriver;
import com.bikesonline.www.utils.Excel;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class CategoriaStepDefinitions {
    @Steps
    CategoriaSteps categoriaSteps= new CategoriaSteps();

    @Steps
    EsperaImplicita implicita = new EsperaImplicita();
    private static ArrayList<Map<String,String>>leerExcel=new  ArrayList<Map<String,String>>();
    @Dado("^que me encuentro en la pagina de inicio de bikesonline$")
    public void queMeEncuentroEnLaPaginaDeInicioDeBikesonline() {
        try{
            leerExcel= Excel.readExcel("LibroReto.xlsx","url");
        }catch (IOException e){ e.printStackTrace ();}
        SeleniumWebDriver.chromeDrive(leerExcel.get(0).get("link"));
        implicita.esperar(60);
    }

    @Cuando("^quiero buscar  un producto en una de las categorias de la pagina de bikesonline$")
    public void quieroBuscarUnProductoEnUnaDeLasCategoriasDeLaPaginaDeBikesonline() {
        categoriaSteps.buscarPorCategoria();

    }
    @Entonces("^valido la busqueda$")
    public void validoLaBusqueda() {
        categoriaSteps.validarProducto();
        SeleniumWebDriver.driver.quit();
    }
}
