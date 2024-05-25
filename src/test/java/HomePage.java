import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;



public class HomePage {

    protected WebDriver driver;

    By buttonLogin = By.xpath("//*[@class=\"ico-login\"]");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void home(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement buttonLoginElement = driver.findElement(buttonLogin);
        buttonLoginElement.click();
    }

}
