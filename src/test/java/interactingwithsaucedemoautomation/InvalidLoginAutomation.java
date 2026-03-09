package interactingwithsaucedemoautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLoginAutomation {
    public static void main(String[] args) {
        WebDriver driver  = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        WebElement username= driver.findElement(By.id("user-name"));
        username.sendKeys("admin");

        WebElement password= driver.findElement(By.id("password"));
        password.sendKeys("secret");

        WebElement loginButton= driver.findElement(By.id("login-button"));
        loginButton.click();

        WebElement errorMessage = driver.findElement(By.xpath("//h3[@data-test='error']"));
        String errorText = errorMessage.getText();
        System.out.println("Error message: " + errorText);

    }
}