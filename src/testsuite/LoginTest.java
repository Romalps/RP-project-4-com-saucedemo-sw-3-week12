package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

import java.util.List;

/*
3. Write down the following test into ‘LoginTest’
class
1. userSholdLoginSuccessfullyWithValid
Credentials
* Enter “standard_user” username
* Enter “secret_sauce” password
* Click on ‘LOGIN’ button
* Verify the text “PRODUCTS”
2. verifyThatSixProductsAreDisplayedOnPage
* Enter “standard_user” username
* Enter “secret_sauce” password
* Click on ‘LOGIN’ button
* Verify that six products are displayed
on page
 */
public class LoginTest extends Utility {

    String baseUrl = "https://www.saucedemo.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifyUserShouldLoginSuccessfullyWithValidCredentials() {

        // * Enter “standard_user” username
        // Find Username field element and send element
        sendTextToElement(By.xpath("//input[@id='user-name']"),"standard_user");
        //* Enter “secret_sauce” password
        // Find Password field element and send element
        sendTextToElement(By.xpath("//input[@id='password']"),"secret_sauce");
        //* Click on ‘LOGIN’ button
        clickOnElement(By.xpath("//input[@id='login-button']"));
        //* Verify the text “PRODUCTS”
        assertMethod(By.xpath("//span[@class='title']"),"Products");


    }
    @Test
    public void verifyThatSixProductsAreDisplayedOnPage(){

        // * Enter “standard_user” username
        // Find Username field element and send element
        sendTextToElement(By.xpath("//input[@id='user-name']"),"standard_user");
        //* Enter “secret_sauce” password
        // Find Password field element and send element
        sendTextToElement(By.xpath("//input[@id='password']"),"secret_sauce");
        //* Click on ‘LOGIN’ button
        clickOnElement(By.xpath("//input[@id='login-button']"));
        //* Verify that six products are displayed on page

        List<WebElement> totalItems= driver.findElements(By.xpath("//div[@class='inventory_item_label']"));
        System.out.println(totalItems);
        Assert.assertEquals(totalItems.size(),6);

    }


    @After
    public void tearDown() {
        closeBrowser();
    }
}
