package org.example;
import org.openqa.selenium.By;
//class import from selenium
import org.openqa.selenium.WebDriver;
//import from selenium web-driver
import org.openqa.selenium.chrome.ChromeDriver;
// class import from Chrome browser

import java.text.SimpleDateFormat;
//created class
public class BasePage01
{
    //protected web driver
    protected static WebDriver driver;
//creating class from register on https://demo.nopcommerce.com/
    public static void main(String[] args)
    {
        //creating object to communicate with chrome web-driver to open the browser
        System.setProperty("webdriver.chrome.driver","src/test/Drivers/chromedriver.exe");
        driver =new ChromeDriver();
        //create object for timestamp for simple date format,to use id several times

        String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());
        System.out.println(timeStamp);
        //creating object to maximize the browser

        driver.manage().window().maximize();
        //command for the open https://demo.nopcommerce.com/
        driver.get("https://demo.nopcommerce.com/");
        //command for to click on register at Home Page
        driver.findElement(By.className("ico-register")).click();
        //command to input required details
        driver.findElement(By.id("FirstName")).sendKeys("Mamta");
        driver.findElement(By.id("LastName")).sendKeys("Patel");
        driver.findElement(By.id("Email")).sendKeys("bhumikabariya3994"+timeStamp+"@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("Bhumi1234");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Bhumi1234");
        driver.findElement(By.id("register-button")).click();
        //to complete register use command register
        String regMsg = driver.findElement((By.className("result"))).getText();
//import variable
        System.out.println(regMsg);


        driver.quit();


    }
}
