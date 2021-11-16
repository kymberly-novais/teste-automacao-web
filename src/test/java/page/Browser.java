package page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	public static WebDriver driver;

	public void abrirBrowser(String site) {
		try {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(site);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		} catch (Exception e) {
			System.err.println("---------------- ERRO AO ABRIR O NAVEGADOR ----------------" + e.getMessage());
			System.err.println("---------------- CAUSA DO ERRO ----------------" + e.getCause());
		}

	}
	public void fecharBrowser() {
		try {
			driver.quit();
		} catch (Exception e) {
			System.err.println("---------------- ERRO AO FECHAR O NAVEGADOR ----------------" + e.getMessage());
			System.err.println("---------------- CAUSA DO ERRO ----------------" + e.getCause());
		}

	}
	public void dimensionarBrowser() {
		try {
			driver.manage().window().setSize(new Dimension(1024, 768));
		} catch (Exception e) {
			System.err.println("---------------- ERRO AO DIMENCIONAR BROWSER ----------------" + e.getMessage());
			System.err.println("---------------- CAUSA DO ERRO ----------------" + e.getCause());
		}

	}

}
