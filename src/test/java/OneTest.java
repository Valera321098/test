import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

public class OneTest {

    @Test
    public void test() {
        assertEquals(2, 2);
        System.out.println("------------TEST-------------");
    }

    @Test
    public void test2() {
        assertEquals(2, 2);
        System.out.println("------------TEST 2-------------");
    }

    @Test
    public void test3() {
        String os = System.getProperty("os.name").toLowerCase();
        if (os.contains("windows")) {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver88.exe");
        } else if (os.contains("linux")) {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriverlinux");
        }
//        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriverlinux");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com.ua/");
    }
}
