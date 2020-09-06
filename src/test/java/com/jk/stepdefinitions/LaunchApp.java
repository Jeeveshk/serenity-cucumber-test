package com.jk.stepdefinitions;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class LaunchApp {

	@Managed
	WebDriver driver;
	
	@Test
	public void user_is_opening_imdb_com() {
		driver.get("https://www.imdb.com/");
		driver.findElement(By.id("imdbHeader-navDrawerOpen--desktop")).click();
		driver.findElement(By.partialLinkText("Top Rated Shows")).click();
		String url = driver.getCurrentUrl();
		Assert.assertTrue(url.contains("toptv"));
	}
}
