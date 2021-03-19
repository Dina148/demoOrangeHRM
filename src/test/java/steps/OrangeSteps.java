package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import utils.ConfigReader;
import utils.Driver;

public class OrangeSteps {

    WebDriver driver;
    LoginPage loginPage;



    @Given("the user navigate  to the page")
    public void the_user_navigate_to_the() {
        driver=Driver.getDriver();
        driver.get(ConfigReader.getProperty("url"));
    }

    @When("user enter the {string} and {string}")
    public void user_enter_the_and(String username, String password) {
        loginPage=new LoginPage(driver);
        loginPage.login(username, password);

    }

    @Then("user click the login button")
    public void user_click_the_login_button() {
        loginPage=new LoginPage(driver);
        loginPage.loginButton.click();


    }
    @When("user clicks the admin function")
    public void user_clicks_the_admin_function() {
        driver=Driver.getDriver();
        loginPage=new LoginPage(driver);
        loginPage.adminButton.click();

    }
    @Then("user click first checkboxes are selected")
    public void user_click_first_checkboxes_are_selected() {
        driver=Driver.getDriver();
        loginPage=new LoginPage(driver);
        loginPage.checkboxUsername.click();
        Assert.assertTrue(loginPage.checkboxUsername.isSelected());

    }
    @Then("click on top of username {int} times")
    public void click_on_top_of_username_times(Integer int1) {
        loginPage=new LoginPage(driver);
        loginPage.clickOnUsername.click();
        loginPage.clickOnUsername.click();

    }
    @Then("validate usernames are listed in descending order")
    public void validate_usernames_are_listed_in_descending_order() {
        loginPage.descendingNames();

    }

}
