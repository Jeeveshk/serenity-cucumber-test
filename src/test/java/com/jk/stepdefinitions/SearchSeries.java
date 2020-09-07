package com.jk.stepdefinitions;

import com.jk.pages.HomeSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SearchSeries {
	
	//This will refer to the steps class wherein all the steps are connected to page objects
	@Steps
	HomeSteps home;

	@When("he searches for game of throne series")
	public void list_of_results_are_shown() {
		home.searchStep();
	}

	@Then("list of results are shown amd he selects {string}")
	public void he_selects(String string) {
		home.selectStep();
	}

}
