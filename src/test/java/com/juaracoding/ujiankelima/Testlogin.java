package com.juaracoding.ujiankelima;

import com.juaracoding.cucumber.pages.Login;
import com.juaracoding.cucumber.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Testlogin {

private static WebDriver driver;
private static ExtentTest extentTest;
private Login login = new Login();

public Testlogin() {
    driver = Hooks.driver;
    extentTest = Hooks.extentTest;
}

// Test Case one
    @When("User go to Web ACCOUNT")
    public void user_go_to_Web_ACCOUNT() {
    driver.get(Constants.URL);
    extentTest.log(LogStatus.PASS, "User go to Web ACCOUNT");

    }

    @And("User enter username password invalid")
    public void user_enter_username_password_invalid(){
    login.login("harun","harunsalman123");
    extentTest.log(LogStatus.PASS, "User enter username password invalid");
    }

    @And("User click button login")
    public void user_click_button_login() {
    login.clickBtnLogin();
    extentTest.log(LogStatus.PASS, "User click button login");
    }

    @Then("User invalid credentials")
    public void user_invalid_credentials(){
    Assert.assertEquals(login.getTxtInvalidCredentials(),"Invalid credentials");
    extentTest.log(LogStatus.PASS, "User invalid credentials");
    }

    // Test Case Two
    @When("User enter username password valid")
    public void user_enter_username_password_valid() {
    login.login("harunsalman","harunsalman123");
    extentTest.log(LogStatus.PASS, "User enter username password valid");
    }

    @And("User click button login valid")
    public void user_click_button_login_valid(){
    login.clickBtnLogin();
    extentTest.log(LogStatus.PASS,"User click button login valid");
    }

    @Then("User valid credentials")
    public void user_valid_credentials() {
    Assert.assertEquals(login.getTxtEmployeeInformation(),"Employee Information");
    Assert.assertTrue(login.getTxtEmployeeInformation().contains("Employee"));
    extentTest.log(LogStatus.PASS, "User valid credentials");
    }

}