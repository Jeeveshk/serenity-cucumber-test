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
	public void username(String username){
		$(By.id("ap_customer_name")).type(username);
	}
	
	//This will enter email
	public void email(String email){
		$(By.id("ap_email")).type(email);
	}
	
	//This will enter password
	public void password(String password){
		$(By.id("ap_password")).type(password);
	}
	
	//This will re-enter password
	public void repasswrd(String password){
		$(By.id("ap_password_check")).type(password);
	}
	
	//This will click on continue/signup button
	public void cntbtn(){
		$(By.id("continue")).click();
	}

}
