package com.juaracoding.ujiankelima;

import com.juaracoding.cucumber.pages.CheckoutProduct;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestCheckoutProduct {

    WebDriver driver;
private static ExtentTest extentTest;
private CheckoutProduct checkoutProduct = new CheckoutProduct();

public TestCheckoutProduct() {
    driver = Hooks.driver;
    extentTest = Hooks.extentTest;
}

@When("User click menu Checkout product")
    public void user_click_menu_checkout_product() {
    Hooks.delay(1);
    checkoutProduct.menuCheckout();
    extentTest.log(LogStatus.PASS, "User click menu Checkout product");
}

@When("User click shop Checkout product")
    public void user_click_shop_checkout_product() {
    Hooks.delay(1);
    checkoutProduct.shopCheckout();
    extentTest.log(LogStatus.PASS, "User click shop Checkout product");
}

@When("User click dress Checkout product")
    public void user_click_dress_checkout_product() {
    Hooks.delay(1);
    checkoutProduct.dressCheckout();
    extentTest.log(LogStatus.PASS, "User click dress Checkout product");
}

@When("User click color Checkout product")
    public void user_click_color_checkout_product() {
    Hooks.delay(1);
    checkoutProduct.colorCheckout();
    extentTest.log(LogStatus.PASS, "User click color Checkout product");
}

@When("User click size Checkout product")
    public void user_click_size_checkout_product(){
    Hooks.delay(1);
    checkoutProduct.sizeCheckout();
    extentTest.log(LogStatus.PASS, "User click size Checkout product");
}

    @When("User click qty Checkout product")
    public void user_click_qty_checkout_product() {
        Hooks.delay(1);
        checkoutProduct.qtyCheckout();
        extentTest.log(LogStatus.PASS, "User click qty Checkout product");
    }

    @When("User click addtocart Checkout product")
    public void user_click_addtocart_checkout_product(){
        Hooks.delay(1);
        checkoutProduct.addtocartCheckout();
        extentTest.log(LogStatus.PASS, "User click addtocart Checkout product");
    }

    @When("User click viewcart Checkout product")
    public void user_click_viewcart_Checkout_product() {
        Hooks.delay(1);
        checkoutProduct.viewcartCheckout();
        extentTest.log(LogStatus.PASS, "User click viewcart Checkout product");
    }

    @Then("User on txt Checkout product")
    public void user_on_txt_Checkout_product(){
        Hooks.delay(1);
        Assert.assertEquals(checkoutProduct.gettxtCheckout(), "CART");
        extentTest.log(LogStatus.PASS, "User click addtocart Checkout product");
    }
}
