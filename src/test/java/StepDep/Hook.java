package StepDep;

import Base.Config;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.testng.util.Strings;

public class Hook extends Config {

    public static String URL;
    public static String baseURL=System.getProperty("env");
    public static String browserType=System.getProperty("browser");


    public static String defURL ="qa";
    public static String defBrowser="ch";

    @Before
    public void openBrowser(){

        if(Strings.isNullOrEmpty(baseURL)){
            baseURL=defURL;
        }
        if (Strings.isNullOrEmpty(browserType)){
            browserType=defBrowser;
        }

        driver=initdriver(browserType);
        switch (baseURL){
            case "qa":
                URL="https://www.amazon.com/";
                break;

            case "stage":
                URL="https://www.amazon.com/";
                break;
            case "prod":
                URL="https://www.amazon.com/";
                break;

        }
        driver.get(URL);

    }

    @After
    public void tearDown(){
//        driver.quit();
    }


}
