package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPage
{
    WebDriver driver;

    @FindBy(xpath = "(//button[@class='btn user-btn'])[1]")
    public WebElement removeBtnFirstIndex;


    public UsersPage(WebDriver driver)
    {
      this.driver = driver;
      PageFactory.initElements(driver,this);
    }

    public void clickOnFirstRemoveBtn()
    {
        removeBtnFirstIndex.click();
    }
}
