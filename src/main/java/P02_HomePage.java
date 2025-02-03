import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class P02_HomePage {
    SHAFT.GUI.WebDriver driver;
//constractor
    public P02_HomePage(SHAFT.GUI.WebDriver driver){this.driver=driver;}
    //locator
    By menListBtn=By.xpath("//a[@href=\"#Men\"]");
    By TshirtBtn =By.xpath("//a[@href=\"/category_products/3\"][contains(.,Tshirts )]");


    //methods
    public void navegatToProduct(){
        driver.element().click(menListBtn).click(TshirtBtn);
    }

}
