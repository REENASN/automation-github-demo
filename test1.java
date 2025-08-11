package Automation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class test1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("disable-infobars");
		WebDriver player=new ChromeDriver(options);
		
	}

}
