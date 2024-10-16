package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.DriverUtils;

public class LoginPage
{

    WebDriver driver;

    @FindBy(name="email")
    public WebElement emailTextbox;


    @FindBy(name="password")
    public WebElement passwordTextbox;


    @FindBy(name="role")
    public WebElement roleDropdown;

    @FindBy(className = "form-btn")
    public WebElement signInBtn;



    public LoginPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);


    }


    public void enterEmail(String em)
    {

        emailTextbox.sendKeys(em);
    }

    public void enterPassword(String pw)
    {
        passwordTextbox.sendKeys(pw);
    }

    public void clickSignInBtn()
    {
        signInBtn.click();
    }

    public void selectRole(String role)
    {
        DriverUtils.selectByVisibleText(roleDropdown,role);
    }




}
