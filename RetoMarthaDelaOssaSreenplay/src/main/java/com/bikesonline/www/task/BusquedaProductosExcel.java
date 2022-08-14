package com.bikesonline.www.task;

import com.bikesonline.www.userInterface.BusquedaUI;
import com.bikesonline.www.utils.Excel;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class BusquedaProductosExcel implements Task {
    BusquedaUI busquedaUI=new BusquedaUI();


    private static ArrayList<Map<String, String>> leerExcel=new ArrayList<Map<String, String>>();
    public <T extends Actor> void performAs(T actor) {
        try{
            leerExcel= Excel.readExcel("LibroReto.xlsx","Terminos Busqueda");
        }catch (IOException e){ e.printStackTrace ();}
        for (int i =0; i<leerExcel.size();i++) {
        actor.attemptsTo(
                WaitUntil.the(busquedaUI.TXT_BARRA_BUSQUEDA, isVisible()).forNoMoreThan(30).seconds(),
                Enter.keyValues(leerExcel.get(i).get("buscar")).into(busquedaUI.TXT_BARRA_BUSQUEDA),
                WaitUntil.the(busquedaUI.TXT_BARRA_BUSQUEDA, isVisible()).forNoMoreThan(30).seconds(),
                Enter.keyValues(Keys.ENTER).into(busquedaUI.TXT_BARRA_BUSQUEDA),
                WaitUntil.the(busquedaUI.BTN_PRODUCTO_UNO, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(busquedaUI.BTN_PRODUCTO_UNO),
                WaitUntil.the(busquedaUI.LBL_PRODUCTO, isVisible()).forNoMoreThan(30).seconds(),
                Clear.field(busquedaUI.TXT_BARRA_BUSQUEDA)
        );
            OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion.the (busquedaUI.LBL_PRODUCTO.of()), WebElementStateMatchers.containsText(leerExcel.get(i).get("buscar"))));
        }
    }
    public static Performable enBikesOnline (){
        return Instrumented.instanceOf(BusquedaProductosExcel.class).withProperties();
    }
}
