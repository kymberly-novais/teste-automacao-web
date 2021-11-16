package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.Browser;
import page.HomePage;
import page.Login;
import page.NovoAdmin;

public class Steps {

	Browser browser = new Browser();
	Login login = new Login();
	HomePage home = new HomePage();
	NovoAdmin admin = new NovoAdmin();

	@Given("que eu esteja no site {string}")
	public void que_eu_esteja_no_site(String site) {
		browser.abrirBrowser(site);
	}

	@Given("informo login e senha")
	public void informo_login_e_senha() {
		login.informarLogin();
		login.informarSenha();
	}

	@When("clico no botao Login")
	public void clico_no_botao_login() {
		login.clicarEmLogin();
		login.pausa(150);
		login.screenShot("login_realizado");

	}

	@Then("serei direcionado para a pagina DASHBOARD")
	public void serei_direcionado_para_a_pagina_dashboard() {
		login.dashBoard();
		login.pausa(1000);
	}

	@Given("que eu esteja na pagina DASHBOARD")
	public void que_eu_esteja_na_pagina_dashboard() {
		home.homepageDashboard();
	}

	@When("seleciono o menu {string}")
	public void seleciono_o_menu(String menu) {
		home.menu(menu);
	}

	@Then("exibira as categorias disponiveis para selecao")
	public void exibira_as_categorias_disponiveis_para_selecao() {
		home.screenShot("opcoes_selecao");
	}

	@Given("que eu esteja na categoria {string}")
	public void que_eu_esteja_na_categoria(String catAdmin) {
		home.categoria(catAdmin);
	}


	@Then("sera exibido a pagina {string} com as opcoes disponiveis")
	public void sera_exibido_a_pagina_com_as_opcoes_disponiveis(String page) {
		home.pageAdminsManagement(page);
	}

	@Given("clicar em ADD")
	public void clicar_em_add() {
		admin.buttonAdd();
	}

	@Given("preencho os dados do novo admin")
	public void preencho_os_dados_do_novo_admin() {
		admin.preencherFirstName();
		admin.preencherLastName();
		admin.preencherEmail();
		admin.preencherPassword();
		admin.preencherMobile();
		admin.preencherCountry();
		admin.preencherAddress();
		admin.selecionarCheckBoxAdd();
		admin.selecionarCheckBoxEdit();
		admin.selecionarCheckBoxRemove();
	}

	@When("clico no botao Submit")
	public void clico_no_botao_submit() {
		admin.screenShot("campos_preenchidos");
		admin.submit();
		admin.screenShot("saved");
		browser.fecharBrowser();
	}

}
