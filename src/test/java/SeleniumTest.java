import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumTest {
    @Test(testName = "Find a good course")
    public static void test() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ltu.se/");

        //PAGE !
        driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")).click();
        driver.findElement(By.id("ltu-menu-search")).click();
        driver.findElement(By.id("cludo-search-bar-input")).sendKeys("Test av IT");
        driver.findElement(By.id("cludo-search-bar-input")).sendKeys(Keys.ENTER);

        //PAGE 2 (different failed attempts at clicking on a element)
        //By course = RelativeLocator.with(By.tagName("a")).near(By.className("search-results-item"));
        //driver.findElement(course).click();
        //driver.findElement(By.xpath("/html/body/main/div/div/div/div[2]/div/article/div[3]/div/div[2]/div[3]/ul/li/div/a[1]")).click();
        //driver.findElement(By.xpath("//a[contains(title(), 'Test av IT-system')]")).click();
        //driver.findElement(By.xpath("//a[@title='Test av IT-system']")).click();

        driver.close();
    }
}
