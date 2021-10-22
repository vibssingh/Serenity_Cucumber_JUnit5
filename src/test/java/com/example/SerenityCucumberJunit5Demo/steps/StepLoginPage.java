package com.example.SerenityCucumberJunit5Demo.steps;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;

public class StepLoginPage extends PageObject {

	@FindBy(name = "txtUsername")
	WebElementFacade username;

	@FindBy(name = "txtPassword")
	WebElementFacade password;

	@FindBy(name = "Submit")
	WebElementFacade submitButton;

	@FindBy(id = "spanMessage")
	WebElementFacade errorMessage;

	@FindBy(id = "forgotPasswordLink")
	WebElementFacade linkText;

	@Step("Enter Username")
	public void inputUserName(String userName) {
		username.sendKeys((userName));
	}

	@Step("Enter Password")
	public void inputPassword(String passWord) {
		password.sendKeys((passWord));
	}

	@Step("Click Submit Button")
	public void clickLogin() {
		submitButton.click();
	}

	@Step("Error Message on unsuccessful login")
	public String errorMessage() {
		String actualErrorMessage = errorMessage.getText();
		System.out.println("Actual Error Message :" + actualErrorMessage);

		return actualErrorMessage;
	}

	@Step("Click Forget Password Link")
	public void clickForgetPasswordLink() {
		linkText.click();

		System.out.println("Clicked on Forgot Password Link");
	}

}