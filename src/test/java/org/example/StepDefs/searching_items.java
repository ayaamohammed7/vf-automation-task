package org.example.StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.AddToCart_page;
import org.example.Pages.Home_page;

public class searching_items {

    Home_page home = new Home_page();
    AddToCart_page add = new AddToCart_page();

    @Given("user opens website and accept cookies")
    public void acceptCookies(){
        home.COOKIES().click();
    }

    @When("user selects english language")
    public void selectEngLang(){
        home.ENGLanguage().click();
    }

    @And("User pressed on search bar and search for item")
    public void searchItems(){
        home.SearchInput().sendKeys("Samsung");
    }

    @And("User selects samsung category")
    public void searchCategory(){
        home.SearchCategory().click();
    }

    @And("user selected phone")
    public void selectProduct(){
        home.SelectedItem().click();
    }

    @Then("User adds product into basket")
    public void AddElementToBasket(){
        add.AddToCart().click();
    }
}