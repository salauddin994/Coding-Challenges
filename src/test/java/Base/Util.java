package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Util extends Config {

    public static void selectSorting(){
        Select select =new Select(driver.findElement(By.id("s-result-sort-select")));
        select.selectByVisibleText("Price: Low to High");
    }





}
