package by.zhadinets.page;

import by.zhadinets.config.ConfigurationManager;
import by.zhadinets.driver.DriverManager;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import static org.openqa.selenium.support.PageFactory.initElements;

public class AbstractPage {

    protected AbstractPage() {
        initElements(new AjaxElementLocatorFactory(DriverManager.getDriver(), ConfigurationManager.configuration().timeout()), this);
    }
}
