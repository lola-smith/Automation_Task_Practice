import com.shaft.driver.SHAFT;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class P02_HomePage {
    SHAFT.GUI.WebDriver driver;
//constractor
    public P02_HomePage(SHAFT.GUI.WebDriver driver){this.driver=driver;}
    //locator
    By menListBtn=By.xpath("//a[@href=\"#Men\"]");
    By TshirtBtn =By.xpath("//a[@href=\"/category_products/3\"][contains(.,Tshirts )]");


    //methods
    @Step("navigate to product page")

    public P03_ProductPage navegatToProduct(){
        driver.element().click(menListBtn).click(TshirtBtn);
        return new P03_ProductPage(driver);
    }

}
