package Autosuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Eskay\\Documents\\automtion\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		WebElement google = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		google.sendKeys("iphone");
		Thread.sleep(02000);
		List<WebElement> iphone = driver.findElements(By.xpath("//ul[@jsname='bw4e9b'][1]"));

		for (WebElement no : iphone) {
			System.out.println(no.getText());

		}

		driver.close();

	}

}
