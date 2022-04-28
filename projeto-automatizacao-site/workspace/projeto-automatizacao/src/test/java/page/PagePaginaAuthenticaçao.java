package page;

import org.openqa.selenium.WebDriver;

import Dsl.Dsl;

public class PagePaginaAuthenticaçao {

	
	private Dsl dsl;
	
	

	public PagePaginaAuthenticaçao(WebDriver driver) {
		dsl = new Dsl(driver);
	}
	
	public void inserirEmailNocadastro(String email) {
		dsl.buscarElemento_pelaId("email_create").sendKeys(email);
	}
	
	public void clicarNoBotao_Registrar() {
		dsl.clicarBotao("SubmitCreate");
	}
	
	
}
