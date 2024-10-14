package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.WebPage;

public class WebStep {

    WebPage webPage;

    public WebStep(){
        this.webPage = new WebPage();
    }

    @Given("open web login page")
    public void openWebLoginPage(){
        webPage.openBrowser();
    }

    @And("user inputs username {string}")
    public void userInputsUsername(String username) {
        webPage.inputUsername(username);
    }

    @And("user inputs password {string}")
    public void userInputsPassword(String password) {
        webPage.inputPassword(password);
    }

    @And("user clicks login button")
    public void userClicksLoginButton() {
        webPage.clickLoginButton();
    }

    @Then("user will see the cart icon in the homepage")
    public void userWillSeeTheCartIconInTheHomepage() {
        webPage.assertLoginPage();
    }
}
