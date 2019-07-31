package com.learnautomation.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MozillaTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Program Files\\Testing Software\\Mozilla Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://easy.techmahindra.com/ ");
		String s = driver.getTitle();
		System.out.println(s);
		driver.quit();
		// commint by anu
	}

}
