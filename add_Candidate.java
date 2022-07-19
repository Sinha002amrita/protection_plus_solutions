import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class add_Candidate {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\vk sinha\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://dev.protectionplussolutions.com/");
        driver.manage().window().maximize();

        driver.findElement(By.id("loginform-username")).sendKeys("amrita.codelogicx@gmail.com");
        driver.findElement(By.id("loginform-password")).sendKeys("amrita94");
        driver.findElement(By.name("login-button")).click();

        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        driver.findElement(By.cssSelector("li a.dropdown-toggle")).click();
        driver.findElement(By.linkText("Add New")).click();

        driver.findElement(By.id("candidatedetails-ssn")).sendKeys("123456789");
        driver.findElement(By.name("CandidateDetails[firstname]")).sendKeys("Test");
        driver.findElement(By.name("CandidateDetails[lastname]")).sendKeys("Test");
        driver.findElement(By.cssSelector("#candidatedetails-email")).sendKeys("autotest@yopmail.com");

        // WebDriverWait wait = new WebDriverWait(driver,30);
        // wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("select#candidatedetails-dobmonth.input-small
        // "))).click();

        driver.findElement(By.id("candidatedetails-dobmonth")).click();
        driver.findElement(By.xpath("//option[@value='05']")).click();

        driver.findElement(By.name("CandidateDetails[dobday]")).click();
        driver.findElement(By.xpath("//option[@value='29']")).click();

        driver.findElement(By.cssSelector("#candidatedetails-dobyear")).click();
        driver.findElement(By.xpath("//option[@value='1999']")).click();

        driver.findElement(By.cssSelector("input[value='F']")).click();

        //driver.findElement(By.id("select2-candidatedetails-driverslicensestate-container")).click();
        //driver.findElement(By.xpath("//li[@id='select2-candidatedetails-addressstate-result-vmjs-AR']")).click();

        driver.findElement(By.id("candidatedetails-streetnumber")).sendKeys("76");
        driver.findElement(By.id("candidatedetails-streetname")).sendKeys("test");
        driver.findElement(By.id("candidatedetails-municipality")).sendKeys("New Jersey");

        //driver.findElement(By.id("select2-candidatedetails-addressstate-container")).click();
        //Select s = new Select(driver.findElement(By.className("select2-results__option select2-results__option--highlighted")));
        //s.selectByVisibleText("Arizona");
        //driver.findElement(By.xpath("//li[@text()='Arizona']")).click();

        driver.findElement(By.id("candidatedetails-postalcode")).sendKeys("345678");

        driver.findElement(By.id("candidate_submit")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().dismiss();

    }


}




