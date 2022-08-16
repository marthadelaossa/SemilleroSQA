package com.bikesonline.www.task;

import com.bikesonline.www.interactions.ClickRandom;
import com.bikesonline.www.userInterface.BusquedaRandomUI;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;



import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class BusquedaProductoRandom implements Task {

    BusquedaRandomUI busquedaRandomUI=new BusquedaRandomUI();


    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
            Click.on(busquedaRandomUI.BTN_CATEGORIA),
            WaitUntil.the(busquedaRandomUI.BTN_PRODUCTO_ALEATORIO, isVisible()).forNoMoreThan(30).seconds(),
            ClickRandom.enBikesOnline()
    );
    }
    public static Performable enBikesOnline (){
        return Instrumented.instanceOf(BusquedaProductoRandom.class).withProperties();
    }
}
