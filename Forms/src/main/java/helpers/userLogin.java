package helpers;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.time.Duration;

public class userLogin {
    static String username = "user.test.automated@gmail.com";
    static String pasword = "testingUser_22";
    static WebDriver driver;
    public static WebDriverWait wait;

    public static void loginUser(){
        ChromeOptions options = new ChromeOptions();
        System.setProperty("webdriver.chrome.driver", "src/main/java/Drivers/chromedriver.exe");
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        //driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        driver.get("https://www.google.es/intl/es/forms/about/");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"section-intro\"]/div[2]/div/div/div[1]/a[1]"))).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"identifierId\"]"))).sendKeys(username);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"identifierNext\"]/div/button"))).click();
        //TODO: prueba a quitar el click, si no, quitar la pausa y poner otra condición :D
        try{Thread.sleep(2000);}catch (InterruptedException e) {e.printStackTrace();}
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#view_container > div > div > div.pwWryf.bxPAYd > div > div.WEQkZc > div > form > span > section > div > div > div.SdBahf.VxoKGd > div.eEgeR > div"))).click();
        try{Thread.sleep(5000);}catch (InterruptedException e) {e.printStackTrace();}
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"))).sendKeys(pasword);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"passwordNext\"]/div/button"))).click();
        Assert.isTrue(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"gb\"]/div[2]/div[3]/div[1]/div[2]/div/a/img"))).isDisplayed(),"User is not correctly logged");
    }
}
