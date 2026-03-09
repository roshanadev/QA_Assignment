package interactingwithsaucedemoautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class PerformCheckout {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        WebElement username = driver.findElement(By.id("user-name"));
        username.sendKeys("standard_user");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");

        WebElement login = driver.findElement(By.id("login-button"));
        login.click();

        WebElement backpack = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        backpack.click();
        System.out.println("Product added to cart");

        WebElement cart = driver.findElement(By.className("shopping_cart_link"));
        cart.click();

        WebElement checkout = driver.findElement(By.id("checkout"));
        checkout.click();
        System.out.println("Checkout started");

        WebElement firstName = driver.findElement(By.id("first-name"));
        firstName.sendKeys("Roshna");

        WebElement lastName = driver.findElement(By.id("last-name"));
        lastName.sendKeys("Devkota");

        WebElement postalCode = driver.findElement(By.id("postal-code"));
        postalCode.sendKeys("44600");

        WebElement continueButton = driver.findElement(By.id("continue"));
        continueButton.click();

        WebElement finishButton = driver.findElement(By.id("finish"));
        finishButton.click();
        System.out.println("Finishing order");

        WebElement message = driver.findElement(By.className("complete-header"));
        String confirmationText = message.getText();
        System.out.println(confirmationText);


    }
}