package com.bikesonline.www.task;

import com.bikesonline.www.userInterface.BusquedaUI;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class ValidadrProducto implements Task {
    BusquedaUI busquedaUI=new BusquedaUI();
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(busquedaUI.BTN_PRODUCTO_UNO)
        );
    }
    public static Performable enBikesOnline (){
        return Instrumented.instanceOf(ValidadrProducto.class).withProperties();
    }
}
