package com.example.SerenityCucumberJunit5Demo.definitions;

import com.example.SerenityCucumberJunit5Demo.steps.StepDashboardPage;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;

public class DashboardPageDefinitions {

	@Steps
	StepDashboardPage dashPage;

	@Step
	public void verifyAdminLogin() {
		dashPage.loginVerify();
	}
}