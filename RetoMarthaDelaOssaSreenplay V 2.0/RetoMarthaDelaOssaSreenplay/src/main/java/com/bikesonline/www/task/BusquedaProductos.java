package com.bikesonline.www.task;

import com.bikesonline.www.userInterface.BusquedaUI;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class BusquedaProductos implements Task {
    BusquedaUI busquedaUI=new BusquedaUI();
    private String producto;

    public BusquedaProductos(String producto) {
        this.producto = producto;
    }



    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.keyValues(producto).into(busquedaUI.TXT_BARRA_BUSQUEDA),
                WaitUntil.the(busquedaUI.TXT_BARRA_BUSQUEDA, isVisible()).forNoMoreThan(30).seconds(),
                Enter.keyValues(Keys.ENTER).into(busquedaUI.TXT_BARRA_BUSQUEDA)
        );
    }
    public static Performable enBikesOnline (String producto){
        return Instrumented.instanceOf(BusquedaProductos.class).withProperties(producto);
    }
}
