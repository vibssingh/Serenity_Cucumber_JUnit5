package com.example.SerenityCucumberJunit5Demo.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin = {}, features = "src/test/resources/features/LoginPage.feature", glue = "com.example.SerenityCucumberJunit5Demo.definitions")

public class SerenityRunnerTest {

}
