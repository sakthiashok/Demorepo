package com.qa.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testclas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Jarsanddriver\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://qa.standoventory.standox.com/");
		driver.findElement(By.name("IDToken1")).sendKeys("SHDE.main");
		driver.findElement(By.name("IDToken2")).sendKeys("stock");
		driver.findElement(By.name("Login.Submit")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.id("agreeLicense")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/button/img")).click();
		driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/a[3]")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("/html/body/main/div[2]/div[2]/label/img")).click();

	}

}
