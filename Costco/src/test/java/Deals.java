/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */

//import java.time.Duration;
//import javax.xml.datatype.Duration;
//import java.time.Duration;
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
public class Deals {
     private WebDriver driver;
  private String baseUrl;
    
    public Deals() {
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
    //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
        driver.close();
    }
    
      @Test
  public void testAddToCart() throws Exception {
    driver.get(baseUrl + "chrome://newtab/");
    driver.get("https://www.costco.com/");
    driver.findElement(By.id("header_sign_in")).click();
    driver.get("https://signin.costco.com/e0714dd4-784d-46d6-a278-3e29553483eb/B2C_1A_SSO_WCS_signup_signin_561/oauth2/v2.0/authorize?ClientName=USBC&ui_locales=en-US&scope=openid+offline_access&response_type=code+id_token&redirect_uri=https%3A%2F%2Fwww.costco.com%2FOAuthLogonCmd&state=URL%3D%5BSSO%5D%2F%5BSSO%5D&nonce=SfT4O7VZBvJMspaU&client_id=4900eb1f-0c10-4bd9-99c3-c59e6c1ecebf&TC=0&response_mode=form_post");
    driver.findElement(By.id("signInName")).clear();
    driver.findElement(By.id("signInName")).sendKeys("archita.singh16@gmail.com");
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("!Archishri123");
    driver.findElement(By.id("signInName")).click();
    driver.findElement(By.id("signInName")).click();
    driver.findElement(By.id("body-content")).click();
    driver.findElement(By.id("password")).click();
    driver.findElement(By.id("next")).click();
    driver.get("https://signin.costco.com/e0714dd4-784d-46d6-a278-3e29553483eb/B2C_1A_SSO_WCS_signup_signin_561/api/CombinedSigninAndSignup/confirmed?rememberMe=true&csrf_token=YWVOL3pyYzBUODRNeUVxRzdyMlVhS1E4YWNzdG4zKzVhdWtuNmwxbFdnTzA4MnozOUZjcCtIenV3eGFITWxmSHBQdGN3aHZOeEFQWFEzcmNaR2xOM1E9PTsyMDIzLTA5LTE0VDAzOjA3OjQ3Ljk3NDAzNzJaO1ZqK3hCc0JjYmo4MTFoemFUWUoxd0E9PTt7Ik9yY2hlc3RyYXRpb25TdGVwIjo0fQ==&tx=StateProperties=eyJUSUQiOiJhOTljNWYzZS0zNTliLTQyMmYtODdmNy05OWQ1MzQ3Y2ZjZWYifQ&p=B2C_1A_SSO_WCS_signup_signin_561&diags=%7B%22pageViewId%22%3A%22227c84e5-7e5e-4fac-b971-deab707995c3%22%2C%22pageId%22%3A%22CombinedSigninAndSignup%22%2C%22trace%22%3A%5B%7B%22ac%22%3A%22T005%22%2C%22acST%22%3A1694660867%2C%22acD%22%3A1%7D%2C%7B%22ac%22%3A%22T021%20-%20URL%3Ahttps%3A%2F%2Fsignin-ui.costco.com%2Fecomssoui%2F561%2FSignIn.html%3FisTC%3D0%22%2C%22acST%22%3A1694660867%2C%22acD%22%3A22%7D%2C%7B%22ac%22%3A%22T019%22%2C%22acST%22%3A1694660867%2C%22acD%22%3A3%7D%2C%7B%22ac%22%3A%22T004%22%2C%22acST%22%3A1694660867%2C%22acD%22%3A1%7D%2C%7B%22ac%22%3A%22T003%22%2C%22acST%22%3A1694660867%2C%22acD%22%3A1%7D%2C%7B%22ac%22%3A%22T035%22%2C%22acST%22%3A1694660867%2C%22acD%22%3A0%7D%2C%7B%22ac%22%3A%22T030Online%22%2C%22acST%22%3A1694660867%2C%22acD%22%3A0%7D%2C%7B%22ac%22%3A%22T002%22%2C%22acST%22%3A1694660894%2C%22acD%22%3A0%7D%2C%7B%22ac%22%3A%22T018T010%22%2C%22acST%22%3A1694660893%2C%22acD%22%3A1173%7D%5D%7D");
    driver.get("https://www.costco.com/?langId=-1&krypto=N5fY2el%2Bw6vvQPFT4rk7Q9j%2BE7MWXc4oTgH26ywVSJpbdixcxYG2gx15BGwTGD%2FmEBbFWQirGjS4s25lC0MIP3gLDSUt%2FOqFrB91CV1sA8FNAOjI9AAlmeSc9YwgTu9vDoFBmY07m5TcKFUnfYUfbO7DyKjRL2bd%2BYt5ZjQ5sH53gbjy43ZP%2BeSLtdptXIExvzQ%2FBrVQNVAETFYIl8tUxc9uw4TWsd1TnXbo%2FGOxC9tEPW5jAoHvwaLQWRg5UlN8uoqSK2ZgXYTDKqYRNDaHtg%3D%3D");
    driver.findElement(By.id("Home_Ancillary_0")).click();
    driver.get("https://www.costco.com/grocery-household.html");
    driver.findElement(By.xpath("//img[@alt='Jose’s Vanilla Nut Whole Bean Coffee 3 lb, 2-pack']")).click();
    driver.get("https://www.costco.com/jose%e2%80%99s-vanilla-nut-whole-bean-coffee-3-lb%2c-2-pack.product.100123965.html?ADBUTLERID=grocery_itemdriver_coffee");
    driver.findElement(By.id("add-to-cart-btn")).click();
  }
    
}
