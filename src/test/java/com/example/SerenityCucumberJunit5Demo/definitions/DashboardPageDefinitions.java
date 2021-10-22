package com.example.SerenityCucumberJunit5Demo.definitions;

import com.example.SerenityCucumberJunit5Demo.steps.StepDashboardPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class DashboardPageDefinitions {

	@Steps
	StepDashboardPage dashPage;

	@Step
	public void verifyAdminLogin() {
		dashPage.loginVerify();
	}
}