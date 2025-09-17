package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class PurchaseAutomation {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeTest
    public void launchBrowser(){
        driver = new ChromeDriver();
    }

    @Test(priority = 1)
    public void startBrowser(){
        driver.get("https://www.ndosiautomation.co.za/");
        driver.manage().window().maximize();
    }

    @Test(priority = 2)
    public void clickOverview() throws InterruptedException {
        driver.findElement(By.id("nav-btn-overview")).click();
        Thread.sleep(2000); // Pause for 2 seconds to allow page to load
    }

    @Test(priority = 3)
    public void clickLearningMaterials() throws InterruptedException {
        driver.findElement(By.id("nav-btn-practice")).click();
        Thread.sleep(2000);
    }

    @Test(priority = 4)
    public void enterUsername() throws InterruptedException {
        driver.findElement(By.id("login-email")).sendKeys("andiswa@gmail.com");
        Thread.sleep(2000);
    }

    @Test(priority = 5)
    public void enterPassword() throws InterruptedException {
        driver.findElement(By.id("login-password")).sendKeys("Password@123");
        Thread.sleep(2000);
    }

    @Test(priority = 6)
    public void clickLogin() throws InterruptedException {
        driver.findElement(By.id("login-submit")).click();
        Thread.sleep(4000);
    }


/*

    @Test(priority = 7)
    public void clickWebAutomation() throws InterruptedException {
        driver.findElement(By.xpath("//span(contains.,'Web Automation')]")).click();
        Thread.sleep(2000);
    }

    @Test(priority = 8)
    public void selectDeviceType() throws InterruptedException {
        WebElement dropdown = driver.findElement(By.id("deviceType"));
        Select select = new Select(dropdown);
        select.selectByVisibleText("Phone");
        Thread.sleep(2000);
    }

    @Test(priority = 9)
    public void selectBrand() throws InterruptedException {
        WebElement dropdown = driver.findElement(By.id("brand"));
        Select select = new Select(dropdown);
        select.selectByVisibleText("Apple");
        Thread.sleep(2000);
    }

    @Test(priority = 10)
    public void selectStorageOption() throws InterruptedException {
        WebElement radioButton = driver.findElement(By.xpath("//input[@id='storage-128GB']"));
        radioButton.click();
        Thread.sleep(2000);
    }

    @Test(priority = 11)
    public void selectColour() throws InterruptedException {
        WebElement dropdown = driver.findElement(By.id("color"));
        Select select = new Select(dropdown);
        select.selectByVisibleText("Gold");
        Thread.sleep(2000);
    }

    @Test(priority = 12)
    public void enterQuantity() throws InterruptedException {
        driver.findElement(By.id("quantity")).clear(); // make sure input is cleared first
        driver.findElement(By.id("quantity")).sendKeys("2"); // correct ID for quantity
        Thread.sleep(2000);
    }

    @Test(priority = 13)
    public void enterAddress() throws InterruptedException {
        driver.findElement(By.id("address")).sendKeys("77 Iran Street, Kempton Park");
        Thread.sleep(2000);
    }

    @Test(priority = 14)
    public void clickPurchase() throws InterruptedException {
        driver.findElement(By.id("purchase-device-btn")).click();
        Thread.sleep(2000);
    }

    @Test(priority = 15)
    public void successToast(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("purchase-success-toast")));
        WebElement toast = driver.findElement(By.id("purchase-success-toast"));
        assert(toast.isDisplayed());

    }

    @Test(priority = 16)
    public void clickLogout() throws InterruptedException {
        driver.findElement(By.id("logout-button")).click();
        Thread.sleep(2000);
    }

    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
*/

}
