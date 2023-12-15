package com.example.SerenityCucumberJunit5Demo.definitions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.example.SerenityCucumberJunit5Demo.steps.StepDashboardPage;
import com.example.SerenityCucumberJunit5Demo.steps.StepForgetPasswordPage;
import com.example.SerenityCucumberJunit5Demo.steps.StepLoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class LoginPageDefinitions {

	@Steps
	StepLoginPage loginPage;

	@Steps
	StepDashboardPage dashPage;

	@Steps
	StepForgetPasswordPage forgetpasswordPage;

	@Given("User is on Home page")
	public void openApplication() {
		loginPage.open();
	}

	@When("User enters username as {string}")
	public void enterUsername(String userName) {

		loginPage.inputUserName(userName);
	}

	@When("User enters password as {string}")
	public void enterPassword(String passWord) {
		loginPage.inputPassword(passWord);
		loginPage.clickLogin();
	}

	@Then("User should be able to login successfully")
	public void clickOnLoginButton() {
		dashPage.loginVerify();
	}

	@Then("User should be able to see error message {string}")
	public void unsucessfulLogin(String expectedErrorMessage) {
		String actualErrorMessage = loginPage.errorMessage();

		System.out.println("Actual Error Message :" + actualErrorMessage);

		assertEquals(expectedErrorMessage, actualErrorMessage);
	}

	@When("User clicks on Forgot your password link")
	public void clickForgetPasswordLink() {
		loginPage.clickForgetPasswordLink();
	}

	@Then("User should be able to see new page which contains Reset Password button")
	public void verifyForgetPasswordPage() {

		assertTrue(forgetpasswordPage.ForgetPasswordPage());
	}
}