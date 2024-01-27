package Pages;

import Utils.ReusableMethods;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.testng.Assert;

public class HomePage {
    AndroidDriver driver;
    ReusableMethods methods;

    public HomePage(AndroidDriver androidDriver) {
        driver = androidDriver;
        methods = new ReusableMethods(driver);
    }

    By searchBox = By.xpath("");
    By fifthProduct = By.xpath("");
    By addToCart = By.xpath("");
    By text = By.xpath("");

    public void goToHomePage(){
        driver.get("https://www.amazon.com.tr/");
    }

    public void checkHomePage(){

        methods.checkElement(searchBox);
    }

    public void searchFor(String expectedText){
        methods.sendKeys(searchBox, expectedText);
        methods.clickSearchButton();
    }

    public void clickOnFifthProduct(){
        methods.scrollDown();
        methods.scrollDown();
        methods.scrollDown();

        methods.click(fifthProduct);
    }

    public void addToShoppingCart(){
        methods.scrollDown();
        methods.scrollDown();

        methods.click(addToCart);
    }

    public void checkProductInShoppingCart(){
       Assert.assertEquals(methods.getText(text), "Ürün sepete eklendi");
    }
}
