/**
 * 
 */
package Test3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author sagard
 *
 */
public class Testcase3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\eclipse\\Chromedriver.exe");
		String ExceptedResponse="We welcome your feedback - but we won't get it unless you complete the form correctly.";
		
		//String ExpectedForename="Forename is required";
		
		String ExpectedEmail="Email is required";
		
		//String ExpectedMessage="Message is required";
		
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://jupiter.cloud.planittesting.com/#/");
		
		driver.manage().window().maximize();
		
		//click on contact
		
		driver.findElement(By.xpath("//*[@id=\'nav-contact\']/a")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Submit']")).click();
		
		Thread.sleep(4000);
		
		
		
		//Enter forename
		
		driver.findElement(By.id("forename")).sendKeys("Sam123");
		
		String response = driver.findElement(By.xpath("//*[@id=\'header-message\']/div")).getText();
		
		System.out.println(response);
		
		if(ExceptedResponse.contentEquals(response))
		{
			System.out.println("Please enter correct name");
			
		}
		
		
		
		
		
		//Enter Email ID
		
		
		driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("4323");
		
		String response2 = driver.findElement(By.xpath("//*[@id=\'email-err\']")).getText();
		
		System.out.println(response2);
		if(ExpectedEmail.contains(response2))
		{
			System.out.println("Please enter correct Email ID");
		}
						
		
		
		
		
		
					
		
		//Enter Message
		driver.findElement(By.id("message")).sendKeys("Thank you !");
		
					
	
		driver.findElement(By.xpath("//a[text()='Submit']")).click();
		
		Thread.sleep(15000);
		
		System.out.println("Errors are validated");
		
		driver.quit();
		
}
}
