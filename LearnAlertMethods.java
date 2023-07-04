package week3.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlertMethods {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//driver.findElement(By.xpath("//span[text()='Show']")).click();
		
		
		
		//	Simple Alert
		
		//@SuppressWarnings("unused")
		//Alert Simple=driver.switchTo().alert();
		//@SuppressWarnings("unused")
		//String text=Simple.getText();
		//System.out.println(text);
		//Simple.accept();
		
		//Confirm Alert
		//driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		//Alert Confirm=driver.switchTo().alert();
		//Confirm.sendKeys(text);
		//Confirm.dismiss();
		
		//Prompt Alert
		Alert prompt=driver.switchTo().alert();
				String getText=prompt.getText();
				System.out.println(getText);
				prompt.sendKeys("text");
					prompt.accept();
				System.out.println("succesfullly handled prompt alert");
				
		//Sweet Alert

				//driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
				//Thread.sleep(2000);
				//driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
	}

}
