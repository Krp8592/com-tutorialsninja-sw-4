package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class ComponentsPage extends Utility {

    By componentsTextElement = By.xpath("//h2[contains(text(),'Components')]");

    public String getComponentsTextElement(){
        return getTextFromElement(componentsTextElement);
    }
}
