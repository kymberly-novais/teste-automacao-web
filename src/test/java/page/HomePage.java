package page;

import elementos.Elementos;

public class HomePage extends Metodos {

	Elementos elemento = new Elementos();

	public void homepageDashboard() {
		validarURL("https://phptravels.net/api/admin");
	}

	public void menu(String menu) {
		if (menu.equalsIgnoreCase("accounts")) {
			clicar(elemento.getmMenuAccounts());
			pausa(1000);
		} else {
			System.out.println("Opção invalida!");
		}
	}

	public void categoria(String categoria) {
		if (categoria.equalsIgnoreCase(categoria)) {
			clicar(elemento.getCategoriaAdmin());
			pausa(1000);
		} else {
			System.out.println("Opção invalida!");
		}
	}

	public void pageAdminsManagement(String page) {
		if (page.equalsIgnoreCase(page)) {
			validarTexto(elemento.getTitleAdmin(), page);
			pausa(1000);
			screenShot(page);
		}
	}

}
