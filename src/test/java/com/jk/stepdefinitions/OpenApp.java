package com.jk.stepdefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.annotations.Managed;

public class OpenApp {
	@Managed
	WebDriver driver;
	
	@Given("user is opening imdb site")
	public void user_is_opening_imdb_com() {
		driver.get("https://www.imdb.com/");
	}

	@When("he clicks on menu")
	public void he_clicks_on_menu() {
		driver.findElement(By.id("imdbHeader-navDrawerOpen--desktop")).click();
	}

	@When("he clicks on top rated tv shows")
	public void he_clicks_on_top_rated_tv_shows() {
		driver.findElement(By.partialLinkText("Top Rated Shows")).click();
	}

	@Then("he should see list of top rated tv shows")
	public void he_should_see_list_of_top_rated_tv_shows() {
		String url = driver.getCurrentUrl();
		Assert.assertTrue(url.contains("toptv"));
	}

}
