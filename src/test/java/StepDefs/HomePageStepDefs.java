package StepDefs;

import Pages.HomePage;
import Utils.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HomePageStepDefs {

    HomePage hp = new HomePage(DriverFactory.getDriver());

    @Given("user on Home Page")
    public void userOnHomePage() {
    hp.goToHomePage();
        hp.checkHomePage();
    }

    @Then("search for: {string}")
    public void searchFor(String expectedText) {
        hp.searchFor(expectedText);
    }

    @Then("click on fifth product")
    public void clickOnFifthProduct() {
        hp.clickOnFifthProduct();
    }

    @Then("add to shopping cart")
    public void addToShoppingCart() {
        hp.addToShoppingCart();
    }

    @Then("verify that product is on the shoppingCart")
    public void verifyThatProductIsOnTheShoppingCart() {
        hp.checkProductInShoppingCart();
    }
}
