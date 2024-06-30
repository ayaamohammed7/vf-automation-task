package org.example.Pages;
import org.example.StepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.concurrent.TimeUnit;


import static org.example.StepDefs.Hooks.driver;

public class AddToCart_page {

    public WebElement AddToCart()
    {
        new WebDriverWait(Hooks.driver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(By.className("button.add-to-cart")));

        return  driver.findElement(By.cssSelector("button.add-to-cart"));
    }

}
