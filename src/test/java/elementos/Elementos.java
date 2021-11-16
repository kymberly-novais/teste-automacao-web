package elementos;

import org.openqa.selenium.By;

import page.Metodos;

public class Elementos extends Metodos {

	// pagelogin
	private By login = By.name("email");
	private By senha = By.name("password");
	private By confirmaLogin = By.xpath("//span[text()=\"Login\"]");

	// homeppage
	private By dashboard = By.xpath("//*[@class='serverHeader__title']");

	// menu
	private By menuAccounts = By.xpath("//*[@class='fa fa-user-circle']");

	// categoria
	private By categoriaAdmin = By.xpath("//*[@href=\"https://phptravels.net/api/admin/accounts/admins/\"]");

	// addadmin
	private By titleAdmin = By.xpath("//*[@class='panel-heading']");
	private By buttonAdd = By.xpath("//*[@class='glyphicon glyphicon-plus-sign']");
	private By firstName = By.name("fname");
	private By lasttName = By.name("lname");
	private By email = By.name("email");
	private By password = By.name("password");
	private By mobile = By.name("mobile");
	private By country = By.xpath("//*[@class='select2-chosen']");
	private By preencherCountry = By.xpath("//*[@id=\"select2-drop\"]/div/input");
	private By adress = By.name("address1");
	private By submit = By.xpath("//*[@class='btn btn-primary btn-block btn-lg']");

	// checkbox
	private By addCars = By
			.xpath("//*[@id=\"content\"]/form/div[2]/div/div[2]/div[4]/div[1]/div/div[2]/ul/li[1]/label/input");
	private By addHotels = By
			.xpath("//*[@id=\"content\"]/form/div[2]/div/div[2]/div[4]/div[1]/div/div[2]/ul/li[2]/label/input");
	private By addTours = By
			.xpath("//*[@id=\"content\"]/form/div[2]/div/div[2]/div[4]/div[1]/div/div[2]/ul/li[3]/label/input");
	private By addRentals = By
			.xpath("//*[@id=\"content\"]/form/div[2]/div/div[2]/div[4]/div[1]/div/div[2]/ul/li[4]/label/input");
	private By addBookings = By
			.xpath("//*[@id=\"content\"]/form/div[2]/div/div[2]/div[4]/div[1]/div/div[2]/ul/li[5]/label/input");
	private By addLocations = By
			.xpath("//*[@id=\"content\"]/form/div[2]/div/div[2]/div[4]/div[1]/div/div[2]/ul/li[6]/label/input");

	private By editCars = By
			.xpath("//*[@id=\"content\"]/form/div[2]/div/div[2]/div[4]/div[2]/div/div[2]/ul/li[1]/label/input");
	private By editHotels = By
			.xpath("//*[@id=\"content\"]/form/div[2]/div/div[2]/div[4]/div[2]/div/div[2]/ul/li[2]/label/input");
	private By editTours = By
			.xpath("//*[@id=\"content\"]/form/div[2]/div/div[2]/div[4]/div[2]/div/div[2]/ul/li[3]/label/input");
	private By editRentals = By
			.xpath("//*[@id=\"content\"]/form/div[2]/div/div[2]/div[4]/div[2]/div/div[2]/ul/li[4]/label/input");
	private By editBookings = By
			.xpath("//*[@id=\"content\"]/form/div[2]/div/div[2]/div[4]/div[2]/div/div[2]/ul/li[5]/label/input");
	private By editLocations = By
			.xpath("//*[@id=\"content\"]/form/div[2]/div/div[2]/div[4]/div[2]/div/div[2]/ul/li[6]/label/input");

	private By removeCars = By
			.xpath("//*[@id=\"content\"]/form/div[2]/div/div[2]/div[4]/div[3]/div/div[2]/ul/li[1]/label/input");
	private By removeHotels = By
			.xpath("//*[@id=\"content\"]/form/div[2]/div/div[2]/div[4]/div[3]/div/div[2]/ul/li[2]/label/input");
	private By removeTours = By
			.xpath("//*[@id=\"content\"]/form/div[2]/div/div[2]/div[4]/div[3]/div/div[2]/ul/li[3]/label/input");
	private By removeRentals = By
			.xpath("//*[@id=\"content\"]/form/div[2]/div/div[2]/div[4]/div[3]/div/div[2]/ul/li[4]/label/input");
	private By removeBookings = By
			.xpath("//*[@id=\"content\"]/form/div[2]/div/div[2]/div[4]/div[3]/div/div[2]/ul/li[5]/label/input");
	private By removeLocations = By
			.xpath("//*[@id=\"content\"]/form/div[2]/div/div[2]/div[4]/div[3]/div/div[2]/ul/li[6]/label/input");
	
	private By validaCadastro = By.className("ui-pnotify-title");
	
	public By getLogin() {
		return login;
	}

	public By getSenha() {
		return senha;
	}

	public By getConfirmaLogin() {
		return confirmaLogin;
	}

	public By getDashboard() {
		return dashboard;
	}

	public By getmMenuAccounts() {
		return menuAccounts;
	}

	public By getMenuAccounts() {
		return menuAccounts;
	}

	public By getCategoriaAdmin() {
		return categoriaAdmin;
	}

	public By getButtonAdd() {
		return buttonAdd;
	}

	public By getFirstName() {
		return firstName;
	}

	public By getLasttName() {
		return lasttName;
	}

	public By getEmail() {
		return email;
	}

	public By getPassword() {
		return password;
	}

	public By getMobile() {
		return mobile;
	}

	public By getCountry() {
		return country;
	}

	public By getAdress() {
		return adress;
	}

	public By getSubmit() {
		return submit;
	}

	public By getAddCars() {
		return addCars;
	}

	public By getAddHotels() {
		return addHotels;
	}

	public By getAddTours() {
		return addTours;
	}

	public By getAddRentals() {
		return addRentals;
	}

	public By getAddBookings() {
		return addBookings;
	}

	public By getAddLocations() {
		return addLocations;
	}

	public By getEditCars() {
		return editCars;
	}

	public By getEditHotels() {
		return editHotels;
	}

	public By getEditTours() {
		return editTours;
	}

	public By getEditRentals() {
		return editRentals;
	}

	public By getEditBookings() {
		return editBookings;
	}

	public By getEditLocations() {
		return editLocations;
	}

	public By getRemoveCars() {
		return removeCars;
	}

	public By getRemoveHotels() {
		return removeHotels;
	}

	public By getRemoveTours() {
		return removeTours;
	}

	public By getRemoveRentals() {
		return removeRentals;
	}

	public By getRemoveBookings() {
		return removeBookings;
	}

	public By getRemoveLocations() {
		return removeLocations;
	}

	public By getTitleAdmin() {
		return titleAdmin;
	}

	public By getPreencherCountry() {
		return preencherCountry;
	}

	public By getValidaCadastro() {
		return validaCadastro;
	}
	

}
