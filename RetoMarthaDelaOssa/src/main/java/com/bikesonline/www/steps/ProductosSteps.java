package com.bikesonline.www.steps;


import com.bikesonline.www.pageObjects.ProductosPages;
import com.bikesonline.www.utils.EsperaImplicita;
import com.bikesonline.www.utils.Excel;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;



import java.io.IOException;
import java.util.ArrayList;
import java.util.*;

public class ProductosSteps extends MetodosSeleniumSteps {
    ProductosPages productosPages=new ProductosPages();
    EsperaImplicita implicita = new EsperaImplicita();




    private static ArrayList<Map<String, String>> leerExcel=new ArrayList<Map<String, String>>();


    @Step
    public void buscarYValidarProductos() {
            List<By> xpathElement=new ArrayList<>();
            xpathElement.add(0,productosPages.getBtnProducto1());
            xpathElement.add(1,productosPages.getBtnProducto2());
            xpathElement.add(2,productosPages.getBtnProducto3());
            xpathElement.add(3,productosPages.getBtnProducto4());
            xpathElement.add(4,productosPages.getBtnProducto5());

        for (int i = 0; i < 5; i++) {
            clickear(productosPages.getBtnCategoria());
            implicita.esperar(120);
            clickear(xpathElement.get(i));
            implicita.esperar(120);
            try {
                leerExcel = Excel.readExcel("LibroReto.xlsx", "ValidacionProductos");
            } catch (IOException e) {
                e.printStackTrace();
            }
            validacion(productosPages.getLblProducto(), leerExcel.get(i).get("Productos"));
        }
    }

}
