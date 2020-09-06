package com.jk.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

public class SignUpPage extends PageObject {
	
	//This will click on the signUp button on home page
	public void clickSignUp(){
		$(By.partialLinkText("Sign In")).click();
	}
	
	//This will click on the creat account button
	public void clickCreateAcct(){
		$(By.linkText("Create a New Account")).click();
	}
	
	//This will enter username
	public void username(){
		$(By.id("ap_customer_name")).type("jk");
	}
	
	//This will enter email
	public void email(){
		$(By.id("ap_email")).type("jk@gmail.com");
	}
	
	//This will enter password
	public void password(){
		$(By.id("ap_password")).type("qwert1234");
	}
	
	//This will re-enter password
	public void repasswrd(){
		$(By.id("ap_password_check")).type("qwert1234");
	}
	
	//This will click on continue/signup button
	public void cntbtn(){
		$(By.id("continue")).click();
	}

}
