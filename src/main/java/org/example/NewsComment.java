package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewsComment
{
    protected static WebDriver driver;
    //create main class to register url
    public static void main(String[] args)
    {
        //creating object to connect with chrome web-driver
        System.setProperty("webdriver.chrome.driver", "src/test/Drivers/chromedriver.exe");
        driver =new ChromeDriver();
        //creating object to maximize the browser
        driver.manage().window().maximize();
        //command for the open https://demo.nopcommerce.com
        driver.get("https://demo.nopcommerce.com/");
//input required details
driver.findElement(By.xpath("//div[@class=\"buttons\"]//a[@href=\"/nopcommerce-new-release\"]")).click();
//command to add new comments
driver.findElement(By.id("AddNewComment_CommentTitle")).sendKeys("hellow news");
//input new massage
driver.findElement(By.id("AddNewComment_CommentText")).sendKeys("i am here to read ");
//add new comment
driver.findElement(By.name("add-comment")).click();
//command to gettext
String abcXyz=driver.findElement(By.xpath("//div[@class=\"result\"]")).getText();
        System.out.println(abcXyz);
       // driver.quit();
    }
}
