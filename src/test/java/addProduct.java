import com.shaft.driver.SHAFT;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class addProduct {
    SHAFT.GUI.WebDriver driver;

    SHAFT.TestData.JSON testJson;
  @Test
  public void addProductToCart(){
      new P01_LoginPage(driver).login(testJson.getTestData("username"),testJson.getTestData("password"
      )).navegatToProduct();
  }



@BeforeClass
    public void setUp(){
    driver=new SHAFT.GUI.WebDriver();
    driver.browser().navigateToURL("https://automationexercise.com/login");
    testJson =new SHAFT.TestData.JSON(SHAFT.Properties.paths.testData() + "testData.json");
    }
    @AfterClass
    public void tearDowen(){
    driver.quit();
    }
}
