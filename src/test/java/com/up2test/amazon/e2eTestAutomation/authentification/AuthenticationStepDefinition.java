package com.up2test.amazon.e2eTestAutomation.authentification;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.up2test.amazon.e2eTestAutomation.utils.CommonMethods;
import com.up2test.amazon.e2eTestAutomation.utils.Setup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AuthenticationStepDefinition extends CommonMethods {
	public WebDriver driver;
	public AuthenticationPage authenticationPage = new AuthenticationPage ();
	public CommonMethods commonMethods = new CommonMethods() ;
public AuthenticationStepDefinition() {
	super();
	driver = Setup.driver;
	PageFactory.initElements(driver, AuthenticationPage.class);
	
}

	@Given("I connect to the Amazon application")
	public void iConnectToTheAmazonApplication() throws Exception {
		commonMethods.openURLWithConfigFile("URL");
	    
	}
	@Given("I accept cookies")
	public void iAcceptCookies() {
		authenticationPage.clickAcceptCOOKIES();
	}
	@When("I click on list account")
	public void iClickOnListAccount() {
		authenticationPage.clickListAccount();
	    
	}
	@When("I fill Email {string}")
	public void iFillEmail(String email) {
		authenticationPage.fillEmail(email);
	    
	}
	@When("I click on continue")
	public void iClickOnContinue() {
		authenticationPage.clickContinue();
	    
	}
	@When("I fill password {string}")
	public void iFillPassword(String password) {
		authenticationPage.fillPassword(password);
	    
	}
	@When("I click on login")
	public void iClickOnLogin() {
		authenticationPage.clickLogin();
	}
	@Then("I m in the home page {string}")
	public void iMInTheHomePage(String userMsG) {
	    String msg = authenticationPage.getUserMsg();
	    System.out.println(msg);
	    Assert.assertTrue(msg.contains(userMsG));
	}



}
