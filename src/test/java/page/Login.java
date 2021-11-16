package page;

import elementos.Elementos;

public class Login extends Metodos {

	Elementos elemento = new Elementos();

	public void informarLogin() {
		try {
			driver.findElement(elemento.getLogin()).sendKeys("admin@phptravels.com");
		} catch (Exception e) {
			System.err.println("---------------- ERRO AO INFORMAR LOGIN ----------------" + e.getMessage());
			System.err.println("---------------- CAUSA DO ERRO ----------------" + e.getCause());
		}

	}

	public void informarSenha() {
		try {
			driver.findElement(elemento.getSenha()).sendKeys("demoadmin");
		} catch (Exception e) {
			System.err.println("---------------- ERRO AO INFORMAR SENHA ----------------" + e.getMessage());
			System.err.println("---------------- CAUSA DO ERRO ----------------" + e.getCause());
		}

	}

	public void clicarEmLogin() {
		try {
			driver.findElement(elemento.getConfirmaLogin()).click();
		} catch (Exception e) {
			System.err.println("---------------- ERRO AO LOGAR ----------------" + e.getMessage());
			System.err.println("---------------- CAUSA DO ERRO ----------------" + e.getCause());
		}

	}

	public void dashBoard() {
		try {
			validarTexto(elemento.getDashboard(), "DASHBOARD");
		} catch (Exception e) {
			System.err.println("---------------- ERRO AO LOGAR ----------------" + e.getMessage());
			System.err.println("---------------- CAUSA DO ERRO ----------------" + e.getCause());
		}
	}

	public void print() {
		try {
			screenShot("printLogin");
		} catch (Exception e) {
			System.err.println("---------------- ERRO AO LOGAR ----------------" + e.getMessage());
			System.err.println("---------------- CAUSA DO ERRO ----------------" + e.getCause());
		}
	}

}
