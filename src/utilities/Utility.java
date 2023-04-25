package utilities;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Utility extends BaseTest {
    // This method will find element and click
    public void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    // This method find element and send text to element
    public void sendTextToElement(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    // This method find element and  return the text
    public String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }


    // ******************************* Assert Method**********************
    public void assertMethod(By by, String expectedMessage) {
        WebElement actualTextElement = driver.findElement(by);
        String actualMessage = actualTextElement.getText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }
}
