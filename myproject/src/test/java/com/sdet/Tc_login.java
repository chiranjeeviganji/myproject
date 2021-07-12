package com.sdet;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tc_login {

@Test
public void login_test()
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demo.guru99.com/V4/");					
    driver.findElement(By.name("uid")).sendKeys("mngr337426");							
    driver.findElement(By.name("password")).sendKeys("gEtepEm");							
    driver.findElement(By.name("btnLogin")).click();	
Assert.assertEquals(driver.getTitle(), "Guru99 Bank Manager HomePage");
driver.close();
	
	
}
	
}
