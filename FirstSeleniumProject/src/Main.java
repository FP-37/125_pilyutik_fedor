import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver","D:/edgeDriver/msedgedriver.exe");
        WebDriver webDriver = new EdgeDriver();
        webDriver.get("https://habr.com/ru/articles/152653/");
    }
}