package com_orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest1 {


    public static void main(String[] args) {

        String baseUrl ="https://opensource-demo.orangehrmlive.com/";

        //Launch the Chrome Browser
        WebDriver driver = new ChromeDriver();

        //Open the Url into Browser
        driver.get(baseUrl);

        //Maximise the browser
        driver.manage().window().maximize();

        //We give Implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Get the title of the page
        String title = driver.getTitle();
        System.out.println(title);

        //Get Page Source
        System.out.println("Page source :" + driver.getPageSource());

       //find the UserName field element
        WebElement UserNameField = driver.findElement(By.name("username"));

        //Type the UserName into UserName field
         UserNameField.sendKeys("Admin");

         //Find the password field element and Type the password
        driver.findElement(By.name("password")).sendKeys("admin123");

        //Close the Browser
          driver.close();

    }
}
