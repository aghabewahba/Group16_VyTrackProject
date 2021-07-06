package com.vytrack.tests;

import com.vytrack.pages.Aghaby_VyTruck.Ac1_Aghaby;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import org.testng.annotations.Test;

public class Aghaby_VyTruckTest {
    @Test
    public void Reset_Btn(){
        Driver.getDriver().get("https://qa3.vytrack.com/user/login");

        Ac1_Aghaby vtPageLogin = new Ac1_Aghaby();

        vtPageLogin.Username.sendKeys("user47");
        BrowserUtils.sleep(2);
        vtPageLogin.Password.sendKeys("UserUser123");
        vtPageLogin.LOGIN.click();

        vtPageLogin.fleetBtn.click();

        vtPageLogin.vehicleBtn.click();
    }
}
