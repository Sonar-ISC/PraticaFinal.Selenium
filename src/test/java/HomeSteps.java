
import org.junit.jupiter.api.Test;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.jupiter.api.Assertions.*;
public class HomeSteps {

    private WebDriver driver;
    private HomePage HomePage2;
    private LoginPage loginPage;


    @Given("El usuario inicia sesion  with email {string} and password {string}")
    public void testLogin(String email, String password) throws InterruptedException {
        String pathDriver = "C:\\Users\\sofia\\OneDrive\\Escritorio\\Semillero\\chromedriver-win64\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",pathDriver);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        driver.get("https://demo.nopcommerce.com/digital-downloads");
        HomePage2 = new HomePage(driver);
        loginPage = new LoginPage(driver);

        Thread.sleep(2000);
        HomePage2.home();
        loginPage.setPassword(password);
        Thread.sleep(2000);
    }
}
