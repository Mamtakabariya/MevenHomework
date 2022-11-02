package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.SimpleDateFormat;

public class EmailaFriend
{
    //import class webdriver
    protected static WebDriver driver;
    //create main class to register url
    public static void main(String[] args) {
        //creating object to connect with chrome web-driver
        System.setProperty("webdriver.chrome.driver", "src/test/Drivers/chromedriver.exe");
        driver=new ChromeDriver();
        //create object for timestamp for simple date format,to use id several times
        String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());
        System.out.println(timeStamp);

        //creating object to maximize the browser
        driver.manage().window().maximize();
        //command for the open https://demo.nopcommerce.com
        driver.get("https://demo.nopcommerce.com/");
        //command for required detail
driver.findElement(By.xpath("//h2[@class=\"product-title\"]/a[@href=\"/apple-macbook-pro-13-inch\"]")).click();
//command to friend email
driver.findElement(By.xpath("//div[@class=\"email-a-friend\"]")).click();
//for friend email
driver.findElement(By.id("FriendEmail")).sendKeys("animesh3904"+timeStamp+"@gmail.com");
//add to your email
driver.findElement(By.id("YourEmailAddress")).sendKeys("mamtakabariya123"+timeStamp+"@gmail.com");
//for personal massage
driver.findElement(By.id("PersonalMessage")).sendKeys("how are you");
//to send email
driver.findElement(By.name("send-email")).click();
String abc=driver.findElement(By.xpath("//div[@class=\"message-error validation-summary-errors\"]/ul/li")).getText();
        System.out.println(abc);
        driver.quit();

    }
}
