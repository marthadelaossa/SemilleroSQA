package com.bikesonline.www.stepDefinitions;

import com.bikesonline.www.task.BusquedaProductos;
import com.bikesonline.www.task.ValidadrProducto;
import com.bikesonline.www.userInterface.BusquedaUI;
import com.bikesonline.www.utils.Models;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;

import java.io.IOException;
import java.util.List;

public class BackgroundBusquedaStepDefinitions {
    BusquedaUI busquedaUI=new BusquedaUI();
    @Before
    public void before() throws IOException {
        OnStage.setTheStage(new OnlineCast());
    }
    @When("^quiero buscar tres productos$")
    public void quieroBuscarTresProductos(List<Models> arg1) {
        OnStage.theActorInTheSpotlight().attemptsTo(BusquedaProductos.enBikesOnline(arg1.get(0).getProducto()));
        OnStage.theActorInTheSpotlight().attemptsTo(ValidadrProducto.enBikesOnline());
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion.the (busquedaUI.LBL_PRODUCTO.of()), WebElementStateMatchers.containsText(arg1.get(0).getProducto())));



    }

    @Then("^valido que sea lo que busco$")
    public void validoQueSeaLoQueBusco() {

    }


}
