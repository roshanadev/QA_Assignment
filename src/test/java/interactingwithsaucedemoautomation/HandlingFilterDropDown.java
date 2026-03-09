package interactingwithsaucedemoautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class HandlingFilterDropDown {

    public static void main(String[] args)  {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        WebElement Username = driver.findElement(By.id("user-name"));
        Username.sendKeys("standard_user");

        WebElement Password = driver.findElement(By.id("password"));
        Password.sendKeys("secret_sauce");

        WebElement LoginButton = driver.findElement(By.id("login-button"));
        LoginButton.click();

        WebElement FilterDropdown = driver.findElement(By.className("product_sort_container"));
        FilterDropdown.click();

        WebElement NameFilter = driver.findElement(By.xpath("//option[@value='za']"));
        NameFilter.click();
        System.out.println("Products sorted from Z to A:");

        List<WebElement> productList = driver.findElements(By.className("inventory_item_name"));
        for (WebElement item : productList) {
            System.out.println(item.getText());
        }

        WebElement PriceFilter = driver.findElement(By.xpath("//option[@value='lohi']"));
        PriceFilter.click();
        System.out.println("\nProducts sorted by Price (Low to High):");

        List<WebElement> priceList = driver.findElements(By.className("inventory_item_price"));
        for (WebElement price : priceList) {
            System.out.println(price.getText());
        }

    }
}