package com.automation.day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Opening {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver(); //Ctrl + Shift + O
		driver.manage().window().maximize();
		driver.get("https://facebook.com");

	}

}
