package org.step;
import org.base.BaseBaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginSteppClasss extends BaseBaseClass {
	@Given("launching page of Qafox")
	public void launchingPageOfQafox() throws InterruptedException {
	    initiatebrowser("https://tutorialsninja.com/demo/index.php/");
	}
	@When("user should enter username and password")
	public void user_should_enter_username_and_password() {
	    WebElement myAccount = driver.findElement(By.xpath("//span[text()='My Account']"));
	    myAccount.click();
	    WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
	    login.click();
	    WebElement email = driver.findElement(By.id("input-email"));
	    email.sendKeys("skpks1224@gmail.com");
	    WebElement pass = driver.findElement(By.id("input-password"));
	    pass.sendKeys("ABCabc@123");
	}
	@When("user should click the login button")
	public void userShouldClickTheLoginButton() throws InterruptedException {
	    WebElement clickLogin = driver.findElement(By.xpath("//input[@value='Login']"));
	    clickLogin.click();
	    Thread.sleep(3000);
	}
	@When("user search an item")
	public void user_search_an_item() throws InterruptedException {
		WebElement searchbox = driver.findElement(By.name("search"));
		searchbox.sendKeys("MacBook Air",Keys.ENTER);	
		  Thread.sleep(3000);
	}
	@When("user loacate an item")
	public void userLoacateAnItem() throws InterruptedException {
		Thread.sleep(2000);
		scrolldown("//a[text()='MacBook Air']");
		Thread.sleep(2000);
	WebElement wantedItems = driver.findElement(By.xpath("//a[text()='MacBook Air']"));
	Thread.sleep(2000);
	wantedItems.click();
	  Thread.sleep(3000);
	}
	@When("user adding item into the cart")
	public void userAddingItemIntoTheCart() throws InterruptedException {
	WebElement addToCart = driver.findElement(By.id("button-cart"));
	addToCart.click();
	  Thread.sleep(3000);
	}
	@When("user get into the shipping page")
	public void userGetIntoTheShippingPage() throws InterruptedException {
	   WebElement shipping = driver.findElement(By.xpath("//a[text()='shopping cart']"));
	   shipping.click(); 
		  Thread.sleep(3000);

	}
	@When("user proceed to the checkout process")
	public void userProceedToTheCheckoutProcess() throws InterruptedException {
		WebElement checkOut = driver.findElement(By.xpath("//a[text()='Checkout']"));
		   checkOut.click();
			  Thread.sleep(3000);

	}
	@When("user enter the billing details")
	public void userEnterTheBillingDetails() throws InterruptedException {
	    WebElement clickNewAddress = driver.findElement(By.xpath("//input[@value='new']"));
	    clickNewAddress.click();
		  Thread.sleep(3000);

	    inspectById("input-payment-firstname", "radha");
	    inspectById("input-payment-lastname", "krishna");
	    inspectById("input-payment-company", "GreensTech");
	    inspectById("input-payment-address-1", "1/111,VINAYAGAR KOIL STREET");
	    inspectById("input-payment-address-2", "TRICHY MALAI KOTTAI");
	    inspectById("input-payment-city", "TRICHY");
	    inspectById("input-payment-postcode", "55555");
	    Thread.sleep(2000);
	  selectbyvisibletext("input-payment-country","Australia");
	  Thread.sleep(2000);
	  selectbyvisibletext("input-payment-zone","Queensland");
	  WebElement continueToBilling = driver.findElement(By.id("button-payment-address"));
	  continueToBilling.click();
	}
	@When("user enter the delivery details")
	public void userEnterTheDeliveryDetails() throws InterruptedException {
		Thread.sleep(2000);
	    WebElement clickNewdeliveryaddress = driver.findElement(By.xpath("(//input[@value='new'])[2]"));
	    clickNewdeliveryaddress.click();
	    Thread.sleep(3000);
	    
	    inspectById("input-shipping-firstname", "radha");
	    inspectById("input-shipping-lastname", "krishna");
	    inspectById("input-shipping-company", "GreensTech");
	    inspectById("input-shipping-address-1", "1/111,VINAYAGAR KOIL STREET");
	    inspectById("input-shipping-address-2", "TRICHY MALAI KOTTAI");
	    inspectById("input-shipping-city", "TRICHY");
	    inspectById("input-shipping-postcode", "55555");   
	    selectbyvisibletext("input-shipping-country","Australia");
		  Thread.sleep(2000);
		  selectbyvisibletext("input-shipping-zone","Queensland");
		  WebElement shippingdetails = driver.findElement(By.id("button-shipping-address"));
		  shippingdetails.click();
		  Thread.sleep(3000);
	}
	@When("user mention the delivery method")
	public void userMentionTheDeliveryMethod() throws InterruptedException {
	    WebElement method = driver.findElement(By.name("comment"));
	    method.sendKeys("thank you for FLAT OFFER and CASH ON DELIVERY");
	    WebElement continuemethod = driver.findElement(By.id("button-shipping-method"));
	    continuemethod.click();
	    Thread.sleep(2000);
	}
	@When("user mention the payment mode")
	public void userMentionThePaymentMode() throws InterruptedException {
		Thread.sleep(2000);
		WebElement terms = driver.findElement(By.xpath("//input[@type='checkbox']"));
	    terms.click();
	    WebElement paymentcontinue = driver.findElement(By.id("button-payment-method"));
	    paymentcontinue.click();
	}
	@When("user finally confirm the order")
	public void userFinallyConfirmTheOrder() throws InterruptedException {
		Thread.sleep(2000);
	    WebElement confirmorder = driver.findElement(By.id("button-confirm"));
	    confirmorder.click();
	}
}
