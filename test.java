package org.system.pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	WebDriverManager.chromedriver().setup();
	ChromeOptions options=new ChromeOptions();
	options.setHeadless(true);
	RemoteWebDriver driver=new ChromeDriver(options);
	driver.get("http://sendpro.pitneybowes.com/");
	//driver.get("https://support.shipping360.pitneybowes.com/");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("SendProNOCSupportUS@pb.com");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Pitney@123");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"signinButton\"]")).click();
	Thread.sleep(5000);
	System.out.println("Title of the page is: " + driver.getTitle());
	//driver.close();
	
	}

}
