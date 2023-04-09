package com_orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserTest {
    static String browser = "Chrome";
    static WebDriver driver;

    public static void main(String[] args)
    {
        if(browser.equalsIgnoreCase("Chrome"))
        {
            driver = new ChromeDriver();
        }
        else if (browser.equalsIgnoreCase("FireFox"))
        {
            driver = new FirefoxDriver();
        }
        else if(browser.equalsIgnoreCase("Edge"))
        {
            driver = new EdgeDriver();
        }
        else
        {
            System.out.println("Wrong Browser name");
        }

        //open the URL browser
        driver.get("https://opensource-demo.orangehrmlive.com/");
        //driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        //Maximise the browser
        driver.manage().window().maximize();

        //Give the implicit wait time
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get the title of the page
        System.out.println("Title of Page \t\t : " + driver.getTitle());

        //Get the current URL
        System.out.println("Current URL \t\t : " + driver.getCurrentUrl());

        //Get the page Source
        System.out.println("Page of Source \t\t : " + driver.getPageSource());

        //Find the email field element
        driver.findElement(By.name("username")).sendKeys("Admin");

        //find the password field element
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("admin123");

        //Close the browser
        // driver.close();

    }

}
