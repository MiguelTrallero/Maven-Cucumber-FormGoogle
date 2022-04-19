package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class setup {
    public static WebDriver driver;

    public WebDriver set_driver() {
    ChromeOptions options = new ChromeOptions();
    System.setProperty("webdriver.chrome.driver", "src/main/java/Drivers/chromedriver.exe");
    options.addArguments("--start-maximized");
    driver = new ChromeDriver(options);

    System.out.println("Opening browser...");
    return driver;
}
}
