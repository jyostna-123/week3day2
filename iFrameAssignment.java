package week3.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrameAssignment {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        // handle the frame //iframeResult
        driver.switchTo().frame("iframeResult");
        // Click Try It Button
        driver.findElement(By.xpath("//button[text()='Try it']")).click();
        
        // handle the alert
        
        Alert alert = driver.switchTo().alert();
        String text = alert.getText();
        System.out.println(text);// print text in the alert box
        
        // Click OK/Cancel in the alert
        alert.accept();
        
        // Confirm the action is performed correctly by verifying the text !!
 String text2 = driver.findElement(By.id("demo")).getText();
        if (text2.contains("You pressed")) {
            System.out.println("Action is performed successfully");
        }

	
		

	}




	}


