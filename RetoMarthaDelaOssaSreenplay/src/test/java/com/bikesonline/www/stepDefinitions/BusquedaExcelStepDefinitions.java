package com.bikesonline.www.stepDefinitions;

import com.bikesonline.www.task.BusquedaProductosExcel;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.io.IOException;


public class BusquedaExcelStepDefinitions {
    @Before
    public void before() throws IOException {
        OnStage.setTheStage(new OnlineCast());
    }
    @When("^quiero buscar Tres productos enviados desde excel$")
    public void quieroBuscarTresProductosEnviadosDesdeExcel() {
        OnStage.theActorInTheSpotlight().attemptsTo(BusquedaProductosExcel.enBikesOnline());
    }

    @Then("^valido que sea  lo buscado$")
    public void validoQueSeaLoBuscado() {

    }
}
