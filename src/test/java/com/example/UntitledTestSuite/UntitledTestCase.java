package com.example.UntitledTestSuite;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.io.File;
import org.apache.commons.io.FileUtils;

public class UntitledTestCase {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  private JavascriptExecutor js;

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    System.setProperty("webdriver.chrome.driver", "");
    driver = new ChromeDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    js = (JavascriptExecutor) driver;
  }

  @Test
  public void testUntitledTestCase() throws Exception {
    driver.get("https://lms.cloudwalker.tv/");
    driver.findElement(By.xpath("//div[@id='root']/div/div/main/div/main/div[2]/form/button/span")).click();
    driver.findElement(By.xpath("//div[@id='root']/div/div/div/div/ul/div/ul/div[9]/div[2]/span")).click();
    driver.findElement(By.xpath("//div[@id='root']/div/div/div[2]/div[2]/div/div[3]/div/div/div/table/tbody/tr/td[15]/div/div/input")).click();
    driver.findElement(By.xpath("//input[@value='TEST']")).clear();
    driver.findElement(By.xpath("//input[@value='TEST']")).sendKeys("TEST");
    driver.findElement(By.xpath("//td[@value='C0:8A:CD:A3:E9:74']")).click();
    driver.findElement(By.xpath("//form[@id='form_ltx7kit9']/div/div[7]/div/div[2]/div/div/div")).click();
    driver.findElement(By.xpath("//form[@id='form_ltx7kit9']/div/div[7]/div/div[2]/div/div/div/span")).click();
    driver.findElement(By.xpath("//div[@id='root']/div/div/div[2]/div[2]/div[2]/button")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
