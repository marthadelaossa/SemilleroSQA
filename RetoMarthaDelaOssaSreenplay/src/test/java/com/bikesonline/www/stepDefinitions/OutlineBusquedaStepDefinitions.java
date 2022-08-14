package com.bikesonline.www.stepDefinitions;

import com.bikesonline.www.driver.DriverScreenplay;
import com.bikesonline.www.task.BusquedaProductos;
import com.bikesonline.www.task.ValidadrProducto;
import com.bikesonline.www.userInterface.BusquedaUI;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;


import java.io.IOException;

public class OutlineBusquedaStepDefinitions {
    BusquedaUI busquedaUI=new BusquedaUI();

    @Before
    public void before() throws IOException {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^que me encuentro en la pagina de bikesonline (.*)$")
    public void queMeEncuentroEnLaPaginaDeBikesonline(String url) {
        OnStage.theActorCalled("").can(BrowseTheWeb.with(DriverScreenplay.chromeDrive(url)));

    }

    @When("^quiero buscar el (.*)$")
    public void quieroBuscarElPolygon(String producto) {
        OnStage.theActorInTheSpotlight().attemptsTo(BusquedaProductos.enBikesOnline(producto));
        OnStage.theActorInTheSpotlight().attemptsTo(ValidadrProducto.enBikesOnline());

    }

    @Then("^valido que sea el (.*)$")
    public void validoQueSeaElPolygon(String producto){
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion.the (busquedaUI.LBL_PRODUCTO.of()), WebElementStateMatchers.containsText(producto)));

    }

}
