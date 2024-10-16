package base;

import pageObjects.LoginPage;
import pageObjects.UsersPage;
import utils.DriverFactory;
import utils.DriverUtils;

public class BasePage {

    public static LoginPage loginPage;
    public static UsersPage usersPage;
    public static DriverUtils driverUtils;


    public static void initPages() {

        loginPage = new LoginPage(DriverFactory.driver);
        usersPage = new UsersPage(DriverFactory.driver);
        driverUtils = new DriverUtils();


    }


}
