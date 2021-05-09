package StepDep;

import Base.Config;
import io.cucumber.java.en.Given;
import pageObject.logIn_Page;

public class login_step extends Config {
    logIn_Page amazon =new logIn_Page(driver);
    @Given("I am at amazon home page")
    public void iAmAtamazonHomePage() {
        amazon.InputSearchBox();
        amazon.clickSearchIcon();
        amazon.selectSortingOpt();
    }
}
