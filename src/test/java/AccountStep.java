import io.cucumber.java.en.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class AccountStep extends Base {

    private AccountPage accountPage;
    private LoginPage loginPage;

    @Given("I am on the Account Management with email {string} and password {string}")
    public void i_am_on_the_account_management_page_with_user_email_and_password_password(String email, String password) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        loginPage = new LoginPage(driver);
        loginPage.clickOnLoginLink();
        loginPage.setEmail(email);
        loginPage.setPassword(password);
        loginPage.clickOnLoginButton();
        accountPage = new AccountPage(driver);
        accountPage.NavigateToAccountPage();
    }

    @When("I follow add New Address")
    public void i_follow() {
        accountPage.clickOnNewAddressButton();
    }

    @When("I fill in the following:")
    public void i_fill_in_the_following(io.cucumber.datatable.DataTable dataTable) {
        Map<String, String> data = dataTable.asMap(String.class, String.class);
        accountPage.setFirstName(data.get("FirstName"));
        accountPage.setLastName(data.get("LastName"));
        accountPage.setEmail(data.get("Email"));
        accountPage.setCountry(data.get("Country"));
        accountPage.setCity(data.get("City"));
        accountPage.setAddress1(data.get("Address1"));
        accountPage.setZipCode(data.get("ZipCode"));
        accountPage.setPhoneNumber(data.get("PhoneNumber"));
    }

    @When("I press {string}")
    public void i_press(String buttonText) {
        if (buttonText.equals("Save")) {
            accountPage.clickOnSaveButton();
        }
    }

    @Then("I should go back to the Account Management page")
    public void i_should_see() {
        assertTrue(driver.getCurrentUrl().contains("addresses"));
        driver.close();
        driver.quit();
    }
}
