package uistore;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Searchbox {
	
    public static WebElement srh(WebDriver driver){
    	WebElement srh = driver.findElement(By.xpath("//input[@placeholder='Search']"));
    	srh.sendKeys("liquid");
    	srh.sendKeys(Keys.ENTER);
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return srh;		 
    } 
    
    public static WebElement liquid(WebDriver driver){
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	WebElement liq = driver.findElement(By.xpath("//p[contains(text(),'Studio by Tide')]"));
    	js.executeScript("arguments[0].scrollIntoView();", liq);
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return liq;		 
    } 
    
    public static String liqtext(WebDriver driver){
    	String text1 = driver.findElement(By.xpath("//h1[contains(text(),'Studio by Tide')]")).getText();
    	String ExpectedTitle1 = "Studio by Tide Darks & Colors Liquid Laundry Detergent";
    	Assert.assertEquals(ExpectedTitle1, text1);
    	System.out.println("verified the text for liquid");
        return text1;		 
    }

}
