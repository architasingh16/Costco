/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author archita
 */
public class Optical {
    private WebDriver driver;
  private String baseUrl;
    
    public Optical() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        System.setProperty("webdriver.chrome.driver", "c:\\data3\\chromedriver.exe");
    driver = new ChromeDriver();
    baseUrl = "https://www.google.com/";
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
        driver.close();
    }
     @Test
  public void testOptical() throws Exception {
    driver.get(baseUrl + "chrome://newtab/");
    driver.get("https://www.costco.com/");
    driver.findElement(By.id("header_sign_in")).click();
    driver.get("https://signin.costco.com/e0714dd4-784d-46d6-a278-3e29553483eb/B2C_1A_SSO_WCS_signup_signin_561/oauth2/v2.0/authorize?ClientName=USBC&ui_locales=en-US&scope=openid+offline_access&response_type=code+id_token&redirect_uri=https%3A%2F%2Fwww.costco.com%2FOAuthLogonCmd&state=URL%3D%5BSSO%5D%2F%5BSSO%5D&nonce=KNHBZ4Wb5Hk1Vd5c&client_id=4900eb1f-0c10-4bd9-99c3-c59e6c1ecebf&TC=0&response_mode=form_post");
    driver.findElement(By.id("signInName")).clear();
    driver.findElement(By.id("signInName")).sendKeys("archita.singh16@gmail.com");
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("!Archishri123");
    driver.findElement(By.id("signInName")).click();
    driver.findElement(By.id("password")).click();
    driver.findElement(By.id("next")).click();
    driver.get("https://signin.costco.com/e0714dd4-784d-46d6-a278-3e29553483eb/B2C_1A_SSO_WCS_signup_signin_561/api/CombinedSigninAndSignup/confirmed?rememberMe=true&csrf_token=S1ZJZnFCa2wwWDUwd1Vac2d6WmtDSjR0clhsY0FFNHl4dFZsWFFSYUtCUkVJSkpxWTBsYWN1N2taQzdaV1loY2g0dnB5d1IxZld3YWdrdTRyNmlhamc9PTsyMDIzLTA5LTE0VDAzOjU5OjMwLjk2ODczODVaO0ZVcm43ZW1IK3Uyb1YveWR6cG9MVVE9PTt7Ik9yY2hlc3RyYXRpb25TdGVwIjo0fQ==&tx=StateProperties=eyJUSUQiOiIwM2VjYjJkNC1iNzVhLTQyNTYtYjlmOC1mODA1YjI0MDliNTUifQ&p=B2C_1A_SSO_WCS_signup_signin_561&diags=%7B%22pageViewId%22%3A%221e84e3a4-3731-4575-a504-f44bc9e95a48%22%2C%22pageId%22%3A%22CombinedSigninAndSignup%22%2C%22trace%22%3A%5B%7B%22ac%22%3A%22T005%22%2C%22acST%22%3A1694663970%2C%22acD%22%3A1%7D%2C%7B%22ac%22%3A%22T021%20-%20URL%3Ahttps%3A%2F%2Fsignin-ui.costco.com%2Fecomssoui%2F561%2FSignIn.html%3FisTC%3D0%22%2C%22acST%22%3A1694663970%2C%22acD%22%3A7%7D%2C%7B%22ac%22%3A%22T019%22%2C%22acST%22%3A1694663970%2C%22acD%22%3A3%7D%2C%7B%22ac%22%3A%22T004%22%2C%22acST%22%3A1694663970%2C%22acD%22%3A1%7D%2C%7B%22ac%22%3A%22T003%22%2C%22acST%22%3A1694663970%2C%22acD%22%3A0%7D%2C%7B%22ac%22%3A%22T035%22%2C%22acST%22%3A1694663970%2C%22acD%22%3A0%7D%2C%7B%22ac%22%3A%22T030Online%22%2C%22acST%22%3A1694663970%2C%22acD%22%3A0%7D%2C%7B%22ac%22%3A%22T002%22%2C%22acST%22%3A1694663994%2C%22acD%22%3A0%7D%2C%7B%22ac%22%3A%22T018T010%22%2C%22acST%22%3A1694663993%2C%22acD%22%3A1175%7D%5D%7D");
    driver.get("https://www.costco.com/?langId=-1&krypto=FMXykVJDNx%2BjN2jAOkA0EmBhrzsUV1mMLuba%2FK2nKQzrFQu2eGCKTEz4CBhyCGJHE9%2F9axw1EVG1eGmxBfV%2FwAu0saRZjAXnFu7XH%2BIlOPAGZxb%2FAgMRihTaQINDHhC8ROmAXgru5Lj5DKgsQgqGz%2BHNcOYgBCMGjbFdyvJtF8SDdv0ClPf8xc66FUbVe%2FddASH%2F%2FwVA6QoWVrmuGDZWSthrLIbVO%2BHdd5JHg9aY0uAqTO3BOMc8HakjmX5pnGQtQM0qQQCBNDDF4aBj6n7P8A%3D%3D");
    driver.findElement(By.id("Home_Ancillary_4")).click();
    driver.get("https://www.costco.com/optical.html");
    driver.findElement(By.linkText("Shop Eyeglasses")).click();
    driver.get("https://glasses.costco.com/");
     
  }
}
