package test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Dsl.Dsl;
import config.LinkPaginas;
import page.PagePaginaAuthenticaçao;

public class TestPaginaAutenticacao {

	private WebDriver driver;
    private Dsl dsl;
    private PagePaginaAuthenticaçao pagePagina_Authenticacao;
   
	
	@Before
	public void inicio() {
		 System.setProperty("webdriver.chrome.driver","C:/ARTHUR/ESTUDO-TI/T03-PROJETOS/TESTES/SELENIUM/projeto-automatizacao-site/drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(LinkPaginas.PAGINA_AUTHENTICACAO.d());
			pagePagina_Authenticacao = new PagePaginaAuthenticaçao(driver);
	}
	
	@After
	public void encerrar() {
		//driver.quit();
	}
	
	@Test
	public void deveVerificar_SeEntrouNaPaginaIncial() {
		Assert.assertTrue(dsl.verifica_SeEstaNaPaginaDesejda(LinkPaginas.PAGINA_AUTHENTICACAO.d()));
		
	}
	
	@Test
	public void deveVerificar_SeSeguiuParaPaginaDeCadastro_AoEntrarComEmail_Valido() {
		 pagePagina_Authenticacao.inserirEmailNocadastro("socorro4551@uorak.com");
		 pagePagina_Authenticacao.clicarNoBotao_Registrar();
		 
		 Assert.assertTrue(dsl.verifica_SeEstaNaPaginaDesejda(LinkPaginas.PAGINA_CADASTRO.d()));
		
	}
	
	
	
}
