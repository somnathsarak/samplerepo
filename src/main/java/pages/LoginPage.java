package pages;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import base.MyListeners;

public class LoginPage {

    WebDriver driver;

    WebDriverWait wait;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        // Initialize explicit wait
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
   
    }

    public void enterUsername() {
//    	wait.until(ExpectedConditions.elementToBeClickable(""));
    	MyListeners.getReport().log(Status.PASS ,"Entered 1: ");
    	MyListeners.getReport().log(Status.PASS ,"Entered 2: ");
    	MyListeners.getReport().log(Status.PASS ,"Entered 3: ");
    }

  
}