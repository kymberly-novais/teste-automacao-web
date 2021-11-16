package page;

import static org.junit.Assert.assertEquals;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Metodos extends Browser {

	public void escrever(By elemento, String texto) {
		try {
			driver.findElement(elemento).sendKeys(texto);
		} catch (Exception e) {
			System.err.println("---------------- ERRO AO ESCREVER ----------------" + e.getMessage());
			System.err.println("---------------- CAUSA DO ERRO ----------------" + e.getCause());
		}
	}

	public void clicar(By elemento) {
		try {
			driver.findElement(elemento).click();
		} catch (Exception e) {
			System.err.println("---------------- ERRO AO CLICAR ----------------" + e.getMessage());
			System.err.println("---------------- CAUSA DO ERRO ----------------" + e.getCause());
		}
	}

	public void pausa(int tempo) {
		try {
			Thread.sleep(tempo);
		} catch (Exception e) {
			System.err.println("---------------- ERRO AO PAUSAR ----------------" + e.getMessage());
			System.err.println("---------------- CAUSA DO ERRO ----------------" + e.getCause());
		}
	}

	public void elementoClicavel(By elemento, int tempo) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, tempo);
			wait.until(ExpectedConditions.elementToBeClickable(elemento));

		} catch (Exception e) {
			System.err.println("---------------- ERRO AO AGUARDAR ELEMENTO CLICAVEL ----------------" + e.getMessage());
			System.err.println("---------------- CAUSA DO ERRO ----------------" + e.getCause());
		}
	}

	public void validarTexto(By elemento, String textoEsperado) {
		try {
			String textoCapturado = driver.findElement(elemento).getText();
			assertEquals(textoEsperado, textoCapturado);

		} catch (Exception e) {
			System.err.println("---------------- ERRO AO VALIDAR TEXTO ----------------" + e.getMessage());
			System.err.println("---------------- CAUSA DO ERRO ----------------" + e.getCause());
		}
	}

	public void screenShot(String nomeEvidencia) {
		try {
			TakesScreenshot scrShot = (TakesScreenshot) driver;
			File scrFile = scrShot.getScreenshotAs(OutputType.FILE);
			File destFile = new File("./Evidencias/" + nomeEvidencia + ".png");
			FileUtils.copyFile(scrFile, destFile);

		} catch (Exception e) {
			System.err.println("---------------- ERRO AO TIRAR EVIDENCIA ----------------" + e.getMessage());
			System.err.println("---------------- CAUSA DO ERRO ----------------" + e.getCause());
		}

	}

	public void validarURL(String esperado) {
		try {
			String URL = driver.getCurrentUrl();
			assertEquals(URL, esperado);

		} catch (Exception e) {
			System.err.println("---------------- ERRO AO VALIDAR URL ----------------" + e.getMessage());
			System.err.println("---------------- CAUSA DO ERRO ----------------" + e.getCause());
		}

	}

	public void enter(By elemento) {


		driver.findElement(elemento).sendKeys(Keys.ENTER);

	}

	public static void categoriaSuspensaCars() {
		WebElement catCars = driver.findElement(By.xpath("//*[@href=\"#Cars\"]"));
		Actions builder = new Actions(driver);
		builder.moveToElement(catCars).build().perform();
	}

}
