package com.bikesonline.www.steps;

import com.bikesonline.www.pageObjects.BusquedaPages;
import com.bikesonline.www.utils.EsperaImplicita;
import com.bikesonline.www.utils.Excel;
import net.thucydides.core.annotations.Step;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class BusquedaSteps extends MetodosSeleniumSteps{
BusquedaPages busquedaPages= new BusquedaPages();
EsperaImplicita implicita = new EsperaImplicita();
private static ArrayList<Map<String, String>>leerExcel=new ArrayList<Map<String, String>>();
@Step
    public void busquedasConExcel(){


        try{
         leerExcel= Excel.readExcel("LibroReto.xlsx","Terminos Busqueda");
        }catch (IOException e){ e.printStackTrace ();}
        for (int i =0; i<leerExcel.size();i++) {
            escribir(busquedaPages.getTxtBusqueda(), leerExcel.get(i).get("buscar"));
            clickear (busquedaPages.getBtnBusqueda());
            implicita.esperar(120);
            limpiarCampo(busquedaPages.getTxtBusqueda());

        }
}

}
