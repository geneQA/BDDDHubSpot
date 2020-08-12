package stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import runnerTest.webPages.LoginPage;

public class LoginPageSD {

    LoginPage loginPage = new LoginPage();

    @Given("^I am on HubSpot Login Page$")
    public void setLoginPage() throws InterruptedException {
        Thread.sleep(5000);
        String text = loginPage.getLoginPageTitle();
        Assert.assertEquals(text, "HubSpot Login");
    }


    @When("^I enter (.+) into (username|password) field on the HubSpot login page$")
    public void enterCredentials(String value, String field){
        switch (field){
            case "username":
                loginPage.enterEmail(value);
                break;
            case "password":
                loginPage.enterPassword(value);
        }
    }

    @And("^I click on login button on HubSpot login page$")
    public void clickOnLoginBtn(){
        loginPage.clickOnLoginBtn();
    }

    @Then("^I verify invalid login message on sign in page$")
    public void verifyErrorMessage(){
        Assert.assertEquals(loginPage.getErrorText(), "That email address doesn't exist.");
    }
}
