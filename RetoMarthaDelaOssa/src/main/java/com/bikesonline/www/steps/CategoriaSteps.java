package com.bikesonline.www.steps;


import com.bikesonline.www.pageObjects.CategoriaPages;
import com.bikesonline.www.utils.EsperaImplicita;
import com.bikesonline.www.utils.Excel;
import net.thucydides.core.annotations.Step;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class CategoriaSteps extends MetodosSeleniumSteps {
    CategoriaPages categoriaPages= new CategoriaPages();
    EsperaImplicita implicita = new EsperaImplicita();
    private static ArrayList<Map<String, String>> leerExcel=new ArrayList<Map<String, String>>();
    @Step
    public void buscarPorCategoria()   {
        clickear (categoriaPages.getBtnCategoria());
        implicita.esperar(120);
        clickear (categoriaPages.getBtnProducot());
        implicita.esperar(120);

    }
    public void validarProducto(){
        try{
            leerExcel= Excel.readExcel("LibroReto.xlsx","ValidacionCategoria");
        }catch (IOException e){ e.printStackTrace ();}
        validacion(categoriaPages.getLblProducto(),leerExcel.get(0).get("Producto"));
    }
}
