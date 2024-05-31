
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class AccountPage {

    private WebDriver driver;

    By newAddressButton = By.xpath("//*[@id=\"main\"]/div/div[2]/div/div[2]/div[2]/button");
    By firstNameField = By.id("Address_FirstName");
    By lastNameField = By.id("Address_LastName");
    By emailField = By.id("Address_Email");
    By countryField = By.id("Address_CountryId");
    By cityField = By.id("Address_City");
    By address1Field = By.id("Address_Address1");
    By zipCodeField = By.id("Address_ZipPostalCode");
    By phoneNumberField = By.id("Address_PhoneNumber");
    By saveButton = By.xpath("//*[@id=\"main\"]/div/div[2]/form/div/div[2]/div[2]/button");
    By successMessage = By.xpath("//div[@class='result']");

    public AccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public void NavigateToAccountPage() {
        driver.get("https://demo.nopcommerce.com/customer/addresses");
    }

    public void clickOnNewAddressButton() {
        driver.findElement(newAddressButton).click();
    }

    public void setFirstName(String firstName) {
        driver.findElement(firstNameField).sendKeys(firstName);
    }

    public void setLastName(String lastName) {
        driver.findElement(lastNameField).sendKeys(lastName);
    }

    public void setEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void setCountry(String country) {
        driver.findElement(countryField).sendKeys(country);
    }

    public void setCity(String city) {
        driver.findElement(cityField).sendKeys(city);
    }

    public void setAddress1(String address1) {
        driver.findElement(address1Field).sendKeys(address1);
    }

    public void setZipCode(String zipCode) {
        driver.findElement(zipCodeField).sendKeys(zipCode);
    }

    public void setPhoneNumber(String phoneNumber) {
        driver.findElement(phoneNumberField).sendKeys(phoneNumber);
    }

    public void clickOnSaveButton() {
        driver.findElement(saveButton).click();
    }

    public String getSuccessMessage() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(successMessage));
        return driver.findElement(successMessage).getText();
    }
}
