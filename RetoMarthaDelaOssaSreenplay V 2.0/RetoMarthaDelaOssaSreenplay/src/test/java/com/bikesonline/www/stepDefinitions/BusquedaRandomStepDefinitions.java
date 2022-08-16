package com.bikesonline.www.stepDefinitions;

import com.bikesonline.www.task.BusquedaProductoRandom;
import com.bikesonline.www.task.ValidadrProducto;
import com.bikesonline.www.userInterface.BusquedaRandomUI;
import com.bikesonline.www.userInterface.BusquedaUI;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;

public class BusquedaRandomStepDefinitions {
    BusquedaRandomUI busquedaRandomUI=new BusquedaRandomUI();
    @When("^quiero buscar un producto de forma aleatoria$")
    public void quieroBuscarUnProductoDeFormaAleatoria() {
        OnStage.theActorInTheSpotlight().attemptsTo(BusquedaProductoRandom.enBikesOnline());

    }

    @Then("^valido lo buscado$")
    public void validoLoBuscado() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion.the (busquedaRandomUI.LBL_PRODUCTO.of()), WebElementStateMatchers.containsText("Bike")));
    }
}
