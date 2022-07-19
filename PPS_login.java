import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PPS_login {

        public static void main(String[] args) {

            System.setProperty("webdriver.chrome.driver","C:\\Users\\vk sinha\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();

            driver.get("https://dev.protectionplussolutions.com/");
            driver.manage().window().maximize();

            driver.findElement(By.id("loginform-username")).sendKeys("amrita.codelogicx@gmail.com");
            driver.findElement(By.id("loginform-password")).sendKeys("amrita94");
            driver.findElement(By.name("login-button")).click();

        }
    }

