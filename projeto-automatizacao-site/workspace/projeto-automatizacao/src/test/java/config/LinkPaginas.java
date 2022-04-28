package config;

public enum LinkPaginas {

	PAGINA_INICIAL("http://automationpractice.com/index.php"),
	PAGINA_AUTHENTICACAO("http://automationpractice.com/index.php?controller=authentication&back=my-account"),
	PAGINA_CADASTRO("http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation");
	
	private String descricao;
	
	LinkPaginas(String descricao) {
		this.descricao=descricao;
	}
	
	public String d() {
		return descricao;
	}
	
	
	
	
}
