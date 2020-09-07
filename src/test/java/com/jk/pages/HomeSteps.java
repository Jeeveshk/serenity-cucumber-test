package com.jk.pages;

import net.thucydides.core.annotations.Step;

public class HomeSteps {
	
	HomePage homePage;
	
	
	//This will call the search string method in HomePage Class
	@Step
	public void searchStep(){
		homePage.searchStr();		
	}
	
	//This will call the select result method and verify element on HomePage
	@Step
	public void selectStep(){
		homePage.selectResult();
		homePage.verifyTitle();
		homePage.verifyRating();
		homePage.verifyReviews();
	}

}
