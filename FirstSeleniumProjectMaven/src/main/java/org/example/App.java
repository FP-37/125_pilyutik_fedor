package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class App
{
    public static void main( String[] args ) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://gun.kinozadrot3.site/3726-djon-uik-4-2023.html");
        driver.findElement(By.id("ps-3726")).click();
        Thread.sleep(3000);
        driver.quit();
    }
}
