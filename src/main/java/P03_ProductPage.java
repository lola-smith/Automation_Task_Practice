import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class P03_ProductPage {
    SHAFT.GUI.WebDriver driver;
//constractor
    public P03_ProductPage(SHAFT.GUI.WebDriver driver){this.driver=driver;}
    //locator
    By emailInput=By.xpath("//input[@data-qa='login-email']");
    By passowrdInput=By.xpath("//input[@data-qa='login-password']");
    By loginBtn=By.xpath("//button[@data-qa=\"login-button\"]");


    //methods
    public void login(String username,String password){
        driver.element().type(emailInput,username).type(passowrdInput,password).click(loginBtn);
    }

}
