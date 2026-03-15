package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;

import static org.junit.Assert.*;

public class FbLogin {
    WebDriver driver;

    @Given("user is on login page")
    public void user_is_on_login_page() {
        driver = new ChromeDriver();
        driver.get("https://facebook.com");
    }

    @When("user enters valid credentials")
    public void user_enters_valid_credentials() {
        driver.findElement(By.name("email")).sendKeys("testuser");
        driver.findElement(By.name("pass")).sendKeys("password");
        driver.findElement(By.xpath("(//span[text()='Log in'])[1]")).click();
    }

    @Then("user should be redirected to homepage")
    public void user_should_be_redirected_to_homepage() {
        assertEquals("Facebook", driver.getTitle());
        driver.quit();
    }
}
