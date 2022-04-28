package page;

import org.openqa.selenium.WebDriver;

import Dsl.Dsl;
import config.LinkPaginas;

public class PagePaginaIncial {

	private Dsl dsl;

	public PagePaginaIncial(WebDriver driver) {
		dsl = new Dsl(driver);
	}
	
	public void entrar_paginaInicial() {
		dsl.entrarEmUmaPaginaEspecifica(LinkPaginas.PAGINA_INICIAL.d());
	}

	public void clicarBotaoLogin() {
		dsl.buscarElemento_pelaClasse("login").click();
	}
	
	

}
