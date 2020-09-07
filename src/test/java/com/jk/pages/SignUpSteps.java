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
	public void uName(String uName){
		reg.username(uName);
	}
	
	@Step
	public void emailId(String email){
		reg.email(email);
	}
	
	@Step
	public void pwd(String pwd){
		reg.password(pwd);
	}
	
	@Step
	public void repwd(String pwd){
		reg.repasswrd(pwd);
	}
	
	@Step
	public void cntnBtn(){
		reg.cntbtn();
	}

}
