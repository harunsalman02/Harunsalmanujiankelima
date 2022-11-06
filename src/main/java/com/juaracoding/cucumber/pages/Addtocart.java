package com.juaracoding.cucumber.pages;

import com.juaracoding.cucumber.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addtocart {
    private WebDriver driver;

    public Addtocart() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "/html[1]/body[1]/div[2]/header[1]/div[1]/div[1]/ul[2]/li[1]/a[1]")
    WebElement menuAddtocart;

    @FindBy(xpath = "/html/body/div[1]/header/div[2]/div/div/div/ul/li/a")
    WebElement CartAddtocart;

    @FindBy(xpath = "/html/body/div[1]/div[2]/main/article/div/div/p[2]/a")
    WebElement ReturnAddtocart;

    @FindBy(xpath = "/html/body/div[2]/section/div/div/div/span[2]/span")
    WebElement txtAddtocart;
    public void menuAddtocart() {
        menuAddtocart.click();
    }

    public void CartAddtocart() {
        CartAddtocart.click();
    }

    public void ReturnAddtocart() {
        ReturnAddtocart.click();
    }
    public String gettxtAddtocart(){
        return txtAddtocart.getText();
    }
}
