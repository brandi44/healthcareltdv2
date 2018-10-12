package com.luv2code.jsf.jdbc;
import java.text.Normalizer.Form;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddPatientTest {
	
	
	public static void main(String[] args) {
		String exePath = "C:\\Users\\jelis\\Desktop\\SEP\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
  	    WebDriver driver = new ChromeDriver();
  	    String appUrl = "http://localhost:8080/Healthcareltd/faces/add-patient-form.xhtml";
  	    driver.get(appUrl);
  	    String expectedTitle = "Healthcareltd";
	    String actualTitle = driver.getTitle();
	    if(expectedTitle.equals(actualTitle)) {
	    	System.out.println("Title is correct.");
	    }
	    else {
	    	System.out.println("Title is not correct.");
	    }
	    String firstName = "AAAAA";
	    String lastName = "BBBBB";
	    String phoneNumber = "11111";
	    String email = "aaaa@bbb.com";
	    String city = "CCCCC";
	    for(int i = 0; i < 20; i++) {
		    WebElement first = driver.findElement(By.id("form:firstName"));
		    first.clear();
		    first.sendKeys(firstName);
		    WebElement last = driver.findElement(By.id("form:lastName"));
		    last.clear();
		    last.sendKeys(lastName);
		    WebElement phone = driver.findElement(By.id("form:mobilephonenumber"));
		    phone.clear();
		    phone.sendKeys(phoneNumber);
		    WebElement emai = driver.findElement(By.id("form:email"));
		    emai.clear();
		    emai.sendKeys(email);
		    WebElement cit = driver.findElement(By.id("form:city"));
		    cit.clear();
		    cit.sendKeys(city);
		    
		    WebElement AddButton = driver.findElement(By.id("form:save"));
		    AddButton.click();
		    driver.get(appUrl);
	    }
	    System.out.println("Script successful");
	    driver.close();
	    
	    System.exit(0);
	}
	
}
