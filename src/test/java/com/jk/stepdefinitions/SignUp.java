package com.jk.stepdefinitions;

import java.util.List;
import java.util.Map;

import com.jk.pages.SignUpSteps;

import io.cucumber.datatable.DataTable;
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

	@Then("fills in the details and sign up")
	public void fills_in_the_details_and_sign_up(DataTable dt) {
		List<Map<String, String>> lst = dt.asMaps(String.class, String.class);
		for(int i=0;i<lst.size();i++)
		{
			regStp.uName(lst.get(i).get("username"));
			regStp.emailId(lst.get(i).get("email"));
			regStp.pwd(lst.get(i).get("passwrd"));
			regStp.repwd(lst.get(i).get("passwrd"));
			regStp.cntnBtn();
		}
	}
}
