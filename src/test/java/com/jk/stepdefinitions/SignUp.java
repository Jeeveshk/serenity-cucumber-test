package com.jk.stepdefinitions;

import com.jk.pages.SignUpSteps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SignUp {
	
	//This will refer to the steps class wherein all the steps are connected to page objects
	@Steps
	SignUpSteps regStp;
	
	@When("he clicks on sign up")
	public void he_clicks_on_sign_up() {
		regStp.signUpBtn();
	}

	@When("he clicks on create account")
	public void he_clicks_on_create_account() {
		regStp.createAcctBtn();
	}

	@When("fills in the details")
	public void filles_in_the_details() {
		regStp.uName();
		regStp.emailId();
		regStp.pwd();
		regStp.repwd();
	}

	@Then("he signs up")
	public void he_signs_up() {
		regStp.cntnBtn();
	}

}
