package Automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTestBooking {

	
		public static void main(String[] args) 
		{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		//switch to frame1
		WebElement frame1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1);
		WebElement textbox1=driver.findElement(By.xpath("//input[@type='text'][@name='mytext1']"));
		
		textbox1.sendKeys("Welcome1");
		driver.switchTo().defaultContent();//Go back to main Page
		
		//switch to frame2
		WebElement frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		WebElement textbox2=driver.findElement(By.xpath("//input[@type='text'][@name='mytext2']"));
		// TODO Auto-generated method stub

	}

}
