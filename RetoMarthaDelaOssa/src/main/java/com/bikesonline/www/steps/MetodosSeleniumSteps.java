package com.bikesonline.www.steps;

import com.bikesonline.www.driver.SeleniumWebDriver;
import org.openqa.selenium.By;


import static org.junit.Assert.assertEquals;


public class MetodosSeleniumSteps {



    public void escribir(By localizador, String texto){
        SeleniumWebDriver.driver.findElement(localizador).sendKeys(texto);
    }

    public void limpiarCampo(By localizador){

        SeleniumWebDriver.driver.findElement(localizador).clear();
    }
    public String getTextElement (By localizador){
        return SeleniumWebDriver.driver.findElement(localizador).getText();
    }
    public void validacion (By localizador, String texto){
        assertEquals(getTextElement(localizador),texto);
    }
    public void clickear(By localizador){
        SeleniumWebDriver.driver.findElement(localizador).click();
    }




}
