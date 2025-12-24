package base;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * BaseClass sets up and tears down the WebDriver for all test classes.
 * It also initializes default implicit and explicit waits.
 */
public class BaseClass {

    protected WebDriver driver;
    protected WebDriverWait wait;

    // Timeout configurations
    private final int IMPLICIT_WAIT_SECONDS = 10;
    private final int EXPLICIT_WAIT_SECONDS = 20;
    private final int PAGE_LOAD_TIMEOUT_SECONDS = 30;

    /**
     * Initializes WebDriver and wait configurations before each test method.
     */
    @BeforeMethod
    public void setupDriver() {
        // Setup ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Launch Chrome browser
        driver = new ChromeDriver();

        // Maximize browser window
        driver.manage().window().maximize();

        // Set global implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICIT_WAIT_SECONDS));

        // Set page load timeout
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(PAGE_LOAD_TIMEOUT_SECONDS));

        // Initialize explicit wait
        

        System.out.println("Browser launched and wait configured.");
    }

    /**
     * Closes the browser session after each test method.
     */
    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit(); // Close all browser windows and safely end session
            System.out.println("Browser closed.");
        }
    }
}

