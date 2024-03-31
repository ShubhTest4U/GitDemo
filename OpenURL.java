package selenium_Learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenURL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		WebDriver driver2 = new EdgeDriver();
		WebDriver driver3 = new ChromeDriver();
		driver.get("https://www.udemy.com/");
		driver2.get("https://www.udemy.com/");
		driver3.get("https://www.udemy.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.close();
		driver2.manage().window().maximize();
		System.out.println(driver2.getCurrentUrl());
		System.out.println(driver2.getTitle());
		driver2.close();

		driver3.manage().window().maximize();
		System.out.println(driver3.getCurrentUrl());
		System.out.println(driver3.getTitle());
		driver3.close();


	}

}
