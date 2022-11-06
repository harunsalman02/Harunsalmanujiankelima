package com.juaracoding.ujiankelima;

import com.juaracoding.cucumber.pages.Addtocart;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestAddtocart {
    WebDriver driver;

    private static ExtentTest extentTest;
    private Addtocart addtocart = new Addtocart();

    public TestAddtocart(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

@When("User click menu Addtocart")
    public void user_click_menu_Addtocart(){
        Hooks.delay(1);
        addtocart.menuAddtocart();
        extentTest.log(LogStatus.PASS, "User click menu Addtocart");
}

@When("User click cart Addtocart")
    public void user_click_cart_addtocart(){
Hooks.delay(1);
addtocart.CartAddtocart();
extentTest.log(LogStatus.PASS, "User click cart Addtocart");
}

@When("User click return Addtocart")
    public void user_click_return_addtocart() {
        Hooks.delay(1);
        addtocart.ReturnAddtocart();
        extentTest.log(LogStatus.PASS,"User on catalog Addtocart");
}

@Then("User on menu Addtocart")
    public void user_on_menu_addtocart() {
        Assert.assertEquals(addtocart.gettxtAddtocart(), " ToolsQA Demo Site Products");
        extentTest.log(LogStatus.PASS,"User on menu Addtocart");
}

}