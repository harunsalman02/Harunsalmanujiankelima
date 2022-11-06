package com.juaracoding.cucumber.pages;

import com.juaracoding.cucumber.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutProduct {
    private WebDriver driver;

    public CheckoutProduct() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html[1]/body[1]/div[2]/header[1]/div[1]/div[1]/ul[2]/li[3]/a[1]")
    WebElement menuCheckout;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/main[1]/article[1]/div[1]/div[1]/p[2]/a[1]")
    WebElement shopCheckout;

    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]/img[1]")
    WebElement dressCheckout;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/form/table/tbody/tr[1]/td/select/option[2]")
    WebElement colorCheckout;

    @FindBy(xpath = "//*[@id=\"pa_size\"]/option[3]")
    WebElement sizeCheckout;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/form/div/div[2]/div/div/button[2]")
    WebElement qtyCheckout;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/form/div/div[2]/button")
    WebElement addtocartCheckout;

    @FindBy(xpath = "//*[@id=\"nav-menu-item-cart\"]/div/div[3]/div[2]/a[1]")
    WebElement viewcartCheckout;

    @FindBy(xpath = "//*[@id=\"noo-site\"]/section")
    WebElement txtCheckout;

    public void menuCheckout() {
        menuCheckout.click();
    }

    public void shopCheckout() {
        shopCheckout.click();
    }

    public void dressCheckout() {
        dressCheckout.click();
    }

    public void colorCheckout() {
        colorCheckout.click();
    }

    public void sizeCheckout() {
        sizeCheckout.click();
    }

    public void qtyCheckout() {
        qtyCheckout.click();
    }

    public void addtocartCheckout() {
        addtocartCheckout.click();
    }

    public void viewcartCheckout() {
        viewcartCheckout.click();
    }

    public String gettxtCheckout() {
       return txtCheckout.getText();
    }
}