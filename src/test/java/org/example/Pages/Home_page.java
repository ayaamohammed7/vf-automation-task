package org.example.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.example.StepDefs.Hooks.driver;

public class Home_page {

    public WebElement COOKIES() {

        return driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
    }

    public WebElement HomeCategory() {

        return driver.findElement(By.xpath("//button[contains(.,'Smart Phones')]"));
    }

    public WebElement SearchInput() {

        return driver.findElement(By.id("searchInput"));
    }

    public WebElement SearchCategory() {

        return driver.findElement(By.xpath("//div[@class='category-result'][contains(.,'Smart Phones')]"));
    }

    public WebElement SelectedItem() {

        return driver.findElements(By.xpath("//p[@id='mainText']")).stream().findFirst().get();

    }

    public WebElement ENGLanguage() {

        return driver.findElement(By.cssSelector("button.language"));
    }


}