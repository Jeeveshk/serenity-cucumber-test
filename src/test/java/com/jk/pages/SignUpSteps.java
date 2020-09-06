package com.jk.pages;

import net.thucydides.core.annotations.Step;

public class SignUpSteps {
	
	SignUpPage reg;
	
	@Step
	public void signUpBtn(){
		reg.clickSignUp();
	}
	
	@Step
	public void createAcctBtn(){
		reg.clickCreateAcct();
	}
	
	@Step
	public void uName(){
		reg.username();
	}
	
	@Step
	public void emailId(){
		reg.email();
	}
	
	@Step
	public void pwd(){
		reg.password();
	}
	
	@Step
	public void repwd(){
		reg.repasswrd();
	}
	
	@Step
	public void cntnBtn(){
		reg.cntbtn();
	}

}
