package page;

import elementos.Elementos;

public class NovoAdmin extends Metodos {

	Elementos elemento = new Elementos();

	public void buttonAdd() {

		clicar(elemento.getButtonAdd());

	}
	
	public void checkUrl() {
		validarURL("https://phptravels.net/api/admin/accounts/admins/add");
	}
	

	public void preencherFirstName() {

		pausa(500);
		escrever(elemento.getFirstName(), "Teste");
		pausa(500);

	}

	public void preencherLastName() {
		pausa(500);
		escrever(elemento.getLasttName(), "Teste");
		pausa(500);
	}

	public void preencherEmail() {
		pausa(500);
		escrever(elemento.getEmail(), "teste@test.com.br");
		pausa(500);
	}

	public void preencherPassword() {
		pausa(500);
		escrever(elemento.getPassword(), "3HNYL3mpwm");
		pausa(500);
	}

	public void preencherMobile() {
		pausa(500);
		escrever(elemento.getMobile(), "(24) 99947-1945");
		pausa(500);
	}

	public void preencherCountry() {
		pausa(500);
		clicar(elemento.getCountry());
		escrever(elemento.getPreencherCountry(), "Brazil");
		enter(elemento.getPreencherCountry());
		pausa(500);
	}

	public void preencherAddress() {
		pausa(500);
		escrever(elemento.getAdress(), "Travessa Waldomiro Gomes de Faria");
		pausa(500);
	}

	public void selecionarCheckBoxAdd() {
		clicar(elemento.getAddCars());
		clicar(elemento.getAddHotels());
		clicar(elemento.getAddTours());
		clicar(elemento.getAddRentals());
		clicar(elemento.getAddBookings());
		clicar(elemento.getAddLocations());
	}

	public void selecionarCheckBoxEdit() {
		clicar(elemento.getEditCars());
		clicar(elemento.getEditHotels());
		clicar(elemento.getEditTours());
		clicar(elemento.getEditRentals());
		clicar(elemento.getEditBookings());
		clicar(elemento.getEditLocations());
	}

	public void selecionarCheckBoxRemove() {
		clicar(elemento.getRemoveCars());
		clicar(elemento.getRemoveHotels());
		clicar(elemento.getRemoveTours());
		clicar(elemento.getRemoveRentals());
		clicar(elemento.getRemoveBookings());
		clicar(elemento.getRemoveLocations());
	}
	public void submit() {
		clicar(elemento.getSubmit());
	}

}
