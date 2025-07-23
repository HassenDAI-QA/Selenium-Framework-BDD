package com.up2test.amazon.e2eTestAutomation.authentification;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AuthenticationPage {
	
    /* Locators */
	final static String ACCEPT_COOKIES = "sp-cc-accept" ;
	final static String List_ACCOUNT = "nav-tools" ;
	final static String Fill_EMAIL = "ap_email";
	final static String Click_Continue = "continue";
	final static String Fill_Password = "ap_password";
	final static String Click_Login = "signInSubmit";
	final static String USER_MSG = "nav-link-accountList-nav-line-1";
    /* @FindBy */
	@FindBy(how = How.ID , using = ACCEPT_COOKIES)
	public static WebElement acceptCookiesBtn ;
    
	@FindBy(how = How.ID , using = List_ACCOUNT )
	public static WebElement listAccountMenu ;
	
	@FindBy(how = How.ID , using = Fill_EMAIL)
	public static WebElement fillEmail ;
	
	@FindBy(how = How.ID , using = Click_Continue)
	public static WebElement clickContinueBtn ;
	
	@FindBy(how = How.ID , using = Fill_Password)
	public static WebElement fillPassword ;
	
	@FindBy(how = How.ID , using = Click_Login)
	public static WebElement clickLoginBtn ;
	
	@FindBy(how = How.ID , using = USER_MSG)
	 public static WebElement userMsg ;


    /* Methods */
	public void clickAcceptCOOKIES() {
		acceptCookiesBtn.click();
	}
	public void clickListAccount() {
		listAccountMenu.click();
	}
		public void fillEmail (String email) {
			fillEmail.sendKeys(email);	
		}
		public void clickContinue() {
			clickContinueBtn.click();
	}	
		public void fillPassword (String password) {
			fillPassword.sendKeys(password);
		}
		public void clickLogin() {
			clickLoginBtn.click();	
		}
		public String getUserMsg() {
			 return userMsg.getText();

			 }
}
