import com.shaft.driver.SHAFT;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P03_ProductPage {
    SHAFT.GUI.WebDriver driver;
//constractor
    public P03_ProductPage(SHAFT.GUI.WebDriver driver){this.driver=driver;}
    //locator
    By productCard=By.xpath("//div[@class=\"productinfo text-center\"]");
    By continueBtn=By.xpath("//button[@data-dismiss=\"modal\"]");
    By viewCartBtn=By.xpath("(//a[@href=\"/view_cart\"])[1]");



    @Step("add Product with price less then 1000")
    //methods
    public P03_ProductPage addProducts(){
    List<WebElement> products =driver.getDriver().findElements(productCard);
    try {
        for (int i = 0; i < products.size(); i++) {
            int productPrice=Integer.parseInt(driver.getDriver().findElement(By.xpath("(//div[@class=\"productinfo text-center\"]/h2)["+(i+1)+"]")).getText().replaceAll("[^0-9]",""));
            System.out.println("the product price is"+(i+1));

            if (productPrice<1000){
                driver.element().click(By.xpath("(//div[@class=\"productinfo text-center\"]/a)["+(i+1)+"]")).click(continueBtn);
                System.out.println("add product with price"+productPrice+"to the cart");

            }

        }
    } catch (NumberFormatException e) {
        throw new RuntimeException(e);
    }
return this;
}
    @Step("verify view cart product")
    public void productsVerifications(){
        driver.element().scrollToElement(viewCartBtn).click(viewCartBtn).and().browser().captureScreenshot();
    }

}
