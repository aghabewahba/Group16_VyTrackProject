package com.vytrack.pages.Aghaby_VyTruck;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ac1_Aghaby {
      public Ac1_Aghaby() {
          PageFactory.initElements(Driver.getDriver(), this);
      }

        @FindBy(id = "prependedInput")
        public WebElement Username;

        @FindBy(id = "prependedInput2")
        public WebElement Password;

        @FindBy(xpath ="//*[@id='_submit']" )
        public WebElement LOGIN;

        @FindBy(xpath = "//li[@class='dropdown dropdown-level-1'][1]")
       public WebElement fleetBtn;

        @FindBy(xpath = "//span[@class='title title-level-2'][1]")
        public WebElement vehicleBtn;
    }

