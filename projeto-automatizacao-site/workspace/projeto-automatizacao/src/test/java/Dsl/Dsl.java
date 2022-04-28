package Dsl;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import config.LinkPaginas;

public class Dsl {

	private WebDriver driver ;
	
	public Dsl(WebDriver driver) {
		this.driver=driver;
	}
	
	public void entrarEmUmaPaginaEspecifica(String pagina) {
		driver.get(pagina);
	}
	
	public boolean verifica_SeEstaNaPaginaDesejda(String link_pagina) {
	  	return driver.getCurrentUrl().equals(link_pagina);
	}
	
	
	//------------------busca de elementos ----------------------------------------------
	
	
	public WebElement buscarElemento_pelaClasse(String classe_nome) {
		return driver.findElement(By.className(classe_nome));
	}
	
	public WebElement buscarElemento_pelaId(String id_nome) {
		return driver.findElement(By.id(id_nome));
	}
	
	//-------------------botoes---------------------------------------------
	
	public void clicarBotao(String id_nome) {
		driver.findElement(By.id(id_nome)).click();
	}
	
   
	
	
}
