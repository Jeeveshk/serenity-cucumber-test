package com.jk.pages;

import org.junit.Assert;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

public class HomePage extends PageObject{
	
	//This will Launch the application
	public void lunchApp(){
		$(By.id("home_img_holder")).click();
	}
	
	//This will select the string on the application
	public void searchStr(){
		$(By.cssSelector(".imdb-header-search__input")).typeAndEnter("Game of thrones");
	}
	
	//This will select the item from the list 
	public void selectResult()
	{
		$(By.partialLinkText("Game of Thrones: The Last Watch")).click();
	}
	
	//This will verify the title
	public void verifyTitle()
	{
		$(By.partialLinkText("Game of Thrones: The Last Watch")).shouldBeVisible();
		Assert.assertTrue($(By.partialLinkText("Game of Thrones: The Last Watch")).isDisplayed());
	}
	
	//This will verify the rating
	public void verifyRating()
	{
		$(By.xpath("//span[text()='7.2']")).shouldBeVisible();
		Assert.assertTrue($(By.xpath("//span[text()='7.2']")).isDisplayed());
	}
	
	//This will verify the reviews
	public void verifyReviews()
	{
		$(By.linkText("69 user")).shouldBeVisible();
		Assert.assertTrue($(By.linkText("69 user")).isDisplayed());
	}
	
	

}
