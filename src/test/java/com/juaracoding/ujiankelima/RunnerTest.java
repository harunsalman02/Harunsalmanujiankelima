package com.juaracoding.ujiankelima;

import com.juaracoding.cucumber.pages.Addtocart;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "",
        features = {"src/main/resources/features/Login.feature",
                "src/main/resources/features/Addtocart.feature",
                "src/main/resources/features/CheckoutProduct.feature"},
        glue = "com.juaracoding.cucumber.ujiankelima",
        plugin = {"pretty","html:target/cucumber-reports.html","json:target/cucumber.json"})
public class RunnerTest extends AbstractTestNGCucumberTests {
}
