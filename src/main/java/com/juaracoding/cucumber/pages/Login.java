package com.juaracoding.cucumber.pages;

import com.juaracoding.cucumber.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
    private WebDriver driver;

    public Login() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

@FindBy(name = "username")
    WebElement username;

    @FindBy(name = "password")
    WebElement password;

    @FindBy (xpath = "/html[1]/body[1]/div[1]/div[2]/main[1]/article[1]/div[1]/div[1]/div[2]/div[1]/form[1]/p[3]/button[1]")
    WebElement btnLogin;

    @FindBy(xpath = "/html/body/div[1]/div[2]/main/article/div/div/div[2]/div[1]/form/p[1]/input")
    WebElement txtEmployeeInformation;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/main[1]/article[1]/div[1]/div[1]/div[2]/div[1]/form[1]/p[2]/span[1]/input[1]")
    WebElement txtInvalidCrendentials;

    @FindBy(xpath = "/html/body/div[1]/div[2]/main/article/div/div/div[1]/ul/li/a")
    WebElement txtRequired;

    public void login(String username, String password){
        this.username.sendKeys(username);
        this.password.sendKeys(password);
    }

    public void clickBtnLogin() {
        btnLogin.click();
    }

    public String getTxtEmployeeInformation(){
        return txtEmployeeInformation.getText();
    }

    public String getTxtInvalidCredentials() {
        return txtInvalidCrendentials.getText();
    }

    public String getTxtRequired(){
        return txtRequired.getText();
    }

}