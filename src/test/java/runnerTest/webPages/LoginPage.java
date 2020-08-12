package runnerTest.webPages;

import org.openqa.selenium.By;

public class LoginPage extends ElementUtil{
    private By emailId = By.id("username");
    private By password = By.id("password");
    private By loginBtn = By.id("loginBtn");
    private By errorMessage = By.xpath("//h5[text()]");

    public String getLoginPageTitle(){
       return getTitle();
    }

    public void enterEmail(String email){
        sendValue(emailId, email);
    }

    public void enterPassword(String pass){
        sendValue(password, pass);
    }

    public void clickOnLoginBtn(){
        clickOn(loginBtn);
    }

    public String getErrorText(){
        return getTextFromElement(errorMessage);
    }

}
