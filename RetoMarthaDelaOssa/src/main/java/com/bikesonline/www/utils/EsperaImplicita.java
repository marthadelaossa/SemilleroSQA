package com.bikesonline.www.utils;

import com.bikesonline.www.driver.SeleniumWebDriver;

import java.util.concurrent.TimeUnit;

public class EsperaImplicita {
    public void  esperar (int segundos){
        SeleniumWebDriver.driver.manage().timeouts().implicitlyWait(segundos, TimeUnit.SECONDS);

    }
}
