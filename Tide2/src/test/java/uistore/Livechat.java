package uistore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Livechat {
	
	 public static WebElement livechat(WebDriver driver){
	    	WebElement live = driver.findElement(By.xpath("//a[normalize-space()='Live Chat']"));
	        return live;		 
	    } 
	 
	    public static String livetext(WebDriver driver){
	    	String text2 = driver.findElement(By.xpath("//div[@class='banner-card-content']//p[contains(text(),'From Tide’s expert clean team')]")).getText();
	    	String ExpectedTitle1 = "From Tide’s expert clean team";
	    	Assert.assertEquals(ExpectedTitle1, text2);
	    	System.out.println("verified the text for Livechat");
	        return text2;		 
	    }

}
