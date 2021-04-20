package by.zhadinets.page.demo;

import by.zhadinets.BaseWeb;
import by.zhadinets.driver.DriverManager;
import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SpinnerPageTest extends BaseWeb {

    @Test
    public void checkPopupContainsEnteredValueTest() {
        String expectedValue = "5";

        DemoPage demoPage = new DemoPage();
        demoPage.clickSpinnerButton();

        SpinnerPage spinnerPage = new SpinnerPage();
        spinnerPage.switchIFrame();
        spinnerPage.enterAnyDigitalValue(expectedValue);
        spinnerPage.clickGetValueButton();

        Alert alert = DriverManager.getDriver().switchTo().alert();
        String result = alert.getText();

        assertThat(result).isEqualTo(expectedValue);

    }

}