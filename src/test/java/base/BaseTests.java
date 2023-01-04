package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BaseTests {
    private WebDriver driver;

    public static void main(String[] args) {
        BaseTests test = new BaseTests();
        test.setUp();
    }
    public void setUp(){
        System.setProperty("webdrider.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());

        //WebElement inputsLink = driver.findElement(By.linkText("Inputs"));
        //inputsLink.click();
        WebElement shiftingContent = driver.findElement(By.linkText("Shifting Content"));
        shiftingContent.click();
        WebElement example1 = driver.findElement(By.linkText("Example 1: Menu Element"));
        example1.click();
        List<WebElement> linkWithinEx1 = driver.findElements(By.tagName("a"));
        System.out.println(linkWithinEx1.size());

        driver.manage().window().maximize();

        System.out.println(driver.getTitle());

        //driver.quit();
    }

}
