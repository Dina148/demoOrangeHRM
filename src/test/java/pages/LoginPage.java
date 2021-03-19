package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginPage {

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }


      @FindBy(id = "txtUsername")
        public WebElement usernameaW;

        @FindBy(id = "txtPassword")
        WebElement passwordW;

        @FindBy(id = "btnLogin")
    public WebElement loginButton;

        public void login(String username, String password){
            usernameaW.sendKeys(username);
            passwordW.sendKeys(password);

        }

        @FindBy(xpath = "//li/a[@id='menu_admin_viewAdminModule']")
    public WebElement adminButton;

        @FindBy(xpath = "//a[contains(text(),'Username')]")
    public WebElement clickOnUsername;

        @FindBy(id = "ohrmList_chkSelectAll")
            public WebElement checkboxUsername;


        @FindBy(tagName = "tr")
    public List<WebElement> userNames;

        public void descendingNames(){
            for(int i=0; i<userNames.size()-1; i++){
                if(userNames.get(i).getText().charAt(0) >= userNames.get(i+1).getText().charAt(0));
                Assert.assertTrue("Esending names", true);
            }
        }



//        @FindBy(xpath = "//input[@id='ohrmList_chkSelectAll']")
//    public WebElement checkBox;
//

    }






