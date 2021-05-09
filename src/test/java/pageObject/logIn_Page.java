package pageObject;

import Base.Config;
import Base.Util;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class logIn_Page extends Config {

    public logIn_Page(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.ID,using = "twotabsearchtextbox")
    WebElement searchBox;

    public void InputSearchBox(){
        searchBox.sendKeys("ps4 bundle");
    }

    @FindBy(how = How.ID,using = "nav-search-submit-button")
    WebElement searchIcon;

    public void clickSearchIcon(){
        searchIcon.click();
    }




    public void selectSortingOpt(){
        Util.selectSorting();
    }





}
