package Autosuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String exp = "iphone 13";

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Eskay\\Documents\\automtion\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
	    driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("iphone");
		
		Thread.sleep(02000);
		List<WebElement> iphone = driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));

		for (WebElement eachtypes : iphone) {
			String act = eachtypes.getText();
			
			if (act.equals(exp)) {
				eachtypes.click();
				break;				  

			}

		}

		Thread.sleep(2000);
		driver.close();
	}

}
