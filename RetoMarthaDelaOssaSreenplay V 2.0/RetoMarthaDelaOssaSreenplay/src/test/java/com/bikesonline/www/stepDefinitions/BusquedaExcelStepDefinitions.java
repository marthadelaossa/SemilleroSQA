package com.bikesonline.www.stepDefinitions;

import com.bikesonline.www.task.BusquedaProductosExcel;
import com.bikesonline.www.userInterface.BusquedaUI;
import com.bikesonline.www.utils.Excel;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;


public class BusquedaExcelStepDefinitions {
    @Before
    public void before() throws IOException {
        OnStage.setTheStage(new OnlineCast());
    }
    private static ArrayList<Map<String, String>> leerExcel=new ArrayList<Map<String, String>>();
    BusquedaUI busquedaUI=new BusquedaUI();
    @When("^quiero buscar Tres productos enviados desde excel$")
    public void quieroBuscarTresProductosEnviadosDesdeExcel() {
        try{
            leerExcel= Excel.readExcel("LibroReto.xlsx","Terminos Busqueda");
        }catch (IOException e){ e.printStackTrace ();}
        for (int i =0; i<leerExcel.size();i++) {
            OnStage.theActorInTheSpotlight().attemptsTo(BusquedaProductosExcel.enBikesOnline(i));
            OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion.the (busquedaUI.LBL_PRODUCTO.of()), WebElementStateMatchers.containsText(leerExcel.get(i).get("buscar"))));
        }
        }

    @Then("^valido que sea  lo buscado$")
    public void validoQueSeaLoBuscado() {

    }
}
