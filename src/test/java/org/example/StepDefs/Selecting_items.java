package org.example.StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.Home_page;
import org.example.Pages.AddToCart_page;


public class Selecting_items {

    Home_page home = new Home_page();
    AddToCart_page add = new AddToCart_page();

    @Given("user open website and accept cookies")
    public void acceptCookies(){
        home.COOKIES().click();
    }

    @When("user select english language")
    public void selectEngLang(){
        home.ENGLanguage().click();
    }

    @And("User select smartphone category")
    public void selectCategory(){
        home.HomeCategory().click();
    }

    @And("user select phone")
    public void SearchProduct(){
        home.SelectedItem().click();
    }

    @Then("User add product into basket")
    public void AddElementToBasket(){

        add.AddToCart().click();
    }
}
