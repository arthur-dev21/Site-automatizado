package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfigDriver {
	
	private static String CHROME_DRIVER = "C:/ARTHUR/ESTUDO-TI/T03-PROJETOS/TESTES/SELENIUM/projeto-automatizacao-site/drivers/chromedriver.exe";
	

	public static void main(String[] args) {
		    System.setProperty("webdriver.chrome.driver",CHROME_DRIVER);
			WebDriver driver = new ChromeDriver();
			driver.get("http://automationpractice.com/index.php");
	}
	
	
}
