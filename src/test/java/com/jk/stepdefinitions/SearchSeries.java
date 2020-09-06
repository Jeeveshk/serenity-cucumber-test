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
	
	@Given("user is on home page of imdb site")
	public void user_searches_for_game_of_throne_series() {
		home.launchStep();
	}

	@When("he searches for game of throne series")
	public void list_of_results_are_shown() {
		//driver.findElement(By.cssSelector(".imdb-header-search__input")).sendKeys("Game of thrones");
		home.searchStep();
	}

	@Then("list of results are shown amd he selects {string}")
	public void he_selects(String string) {
		home.selectStep();
	}

}
