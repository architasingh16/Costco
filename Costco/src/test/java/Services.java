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
public class Services {
    private WebDriver driver;
  private String baseUrl;
    
    public Services() {
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
       driver.close() ;
    }
     @Test
  public void testService() throws Exception {
    driver.get(baseUrl + "chrome://newtab/");
    driver.get("https://www.costco.com/");
    driver.findElement(By.id("header_sign_in")).click();
    driver.get("https://signin.costco.com/e0714dd4-784d-46d6-a278-3e29553483eb/B2C_1A_SSO_WCS_signup_signin_561/oauth2/v2.0/authorize?ClientName=USBC&ui_locales=en-US&scope=openid+offline_access&response_type=code+id_token&redirect_uri=https%3A%2F%2Fwww.costco.com%2FOAuthLogonCmd&state=URL%3D%5BSSO%5D%2F%5BSSO%5D&nonce=XBj2Du0BsVVv38z7&client_id=4900eb1f-0c10-4bd9-99c3-c59e6c1ecebf&TC=0&response_mode=form_post");
    driver.findElement(By.id("signInName")).clear();
    driver.findElement(By.id("signInName")).sendKeys("archita.singh16@gmail.com");
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("!Archishri123");
    driver.findElement(By.id("signInName")).click();
    driver.findElement(By.id("password")).click();
    driver.findElement(By.id("next")).click();
    driver.get("https://signin.costco.com/e0714dd4-784d-46d6-a278-3e29553483eb/B2C_1A_SSO_WCS_signup_signin_561/api/CombinedSigninAndSignup/confirmed?rememberMe=true&csrf_token=aEhMRVl3UVlFSlRlZ0dlemc2L0hMNUIzcnJOYTk1K25tbFJGSVFvYUcrUWdmbWRyUVp4UUhWZlhNU2dQZGVnL1ROaDJLWjJxZWZxdW1jbzVEazNicFE9PTsyMDIzLTA5LTE0VDAzOjUwOjE1Ljg0NDYxMTRaO0VUTFRYcHlUa00zVi9RUnVieWxEOEE9PTt7Ik9yY2hlc3RyYXRpb25TdGVwIjo0fQ==&tx=StateProperties=eyJUSUQiOiI2ZDY1MDM2Ny01OWUxLTQyMGQtYjVlNy03YWYzOWJkZjA2OGMifQ&p=B2C_1A_SSO_WCS_signup_signin_561&diags=%7B%22pageViewId%22%3A%2204db897e-2453-453f-addb-49ebeba1ea3c%22%2C%22pageId%22%3A%22CombinedSigninAndSignup%22%2C%22trace%22%3A%5B%7B%22ac%22%3A%22T005%22%2C%22acST%22%3A1694663414%2C%22acD%22%3A1%7D%2C%7B%22ac%22%3A%22T021%20-%20URL%3Ahttps%3A%2F%2Fsignin-ui.costco.com%2Fecomssoui%2F561%2FSignIn.html%3FisTC%3D0%22%2C%22acST%22%3A1694663414%2C%22acD%22%3A23%7D%2C%7B%22ac%22%3A%22T019%22%2C%22acST%22%3A1694663415%2C%22acD%22%3A4%7D%2C%7B%22ac%22%3A%22T004%22%2C%22acST%22%3A1694663415%2C%22acD%22%3A1%7D%2C%7B%22ac%22%3A%22T003%22%2C%22acST%22%3A1694663415%2C%22acD%22%3A1%7D%2C%7B%22ac%22%3A%22T035%22%2C%22acST%22%3A1694663415%2C%22acD%22%3A0%7D%2C%7B%22ac%22%3A%22T030Online%22%2C%22acST%22%3A1694663415%2C%22acD%22%3A0%7D%2C%7B%22ac%22%3A%22T002%22%2C%22acST%22%3A1694663439%2C%22acD%22%3A0%7D%2C%7B%22ac%22%3A%22T018T010%22%2C%22acST%22%3A1694663438%2C%22acD%22%3A926%7D%5D%7D");
    driver.get("https://www.costco.com/?langId=-1&krypto=xz6XRrtOeud8fjsUuwQ%2B%2FJvauQJFfEeacjJZQOXKnDcqEo4DjTEHvqHj9Z%2FSxR5oQeUD3zqznlFnUDRBXshmgzoXUdCzsQCgbunlYLWZho%2F6X6rceY3JwMcv5l8lkMGslT370j0XpIjDbg6zkPoXRCNhNwv0rOUDxtUb%2Fh8U7twvhEX%2B6NwP6LUtXad3KtbTsOalbaxWhw8rFEUWlqu0zWHMq7uWm%2BW7ov1nTBlqZlNENCSu23bHNxAA2SsjlESw");
    driver.findElement(By.id("Home_Ancillary_6")).click();
    driver.get("https://www.costco.com/services.html");
  }

}
