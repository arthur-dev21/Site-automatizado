package test;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestPaginaCadastro {

	    private final String PAGINA_CADASTRO = "http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation";
	    
	    private WebDriver driver;
		
		@Before
		public void inicio() {
			 System.setProperty("webdriver.chrome.driver","C:/ARTHUR/ESTUDO-TI/T03-PROJETOS/TESTES/SELENIUM/projeto-automatizacao-site/drivers/chromedriver.exe");
				driver = new ChromeDriver();
				driver.get(PAGINA_CADASTRO);
		}
		
		
		
		
}
