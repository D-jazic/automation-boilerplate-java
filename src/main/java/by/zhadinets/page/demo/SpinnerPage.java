package by.zhadinets.page.demo;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SpinnerPage extends NavigationPage {

    @FindBy(css = ".ui-spinner-input")
    private WebElement digitalValueInput;

    @FindBy(xpath = "//button[@id='getvalue']")
    private WebElement getValueButton;

    @Step
    public void enterAnyDigitalValue(String value) {
        digitalValueInput.sendKeys(value);
    }

    @Step
    public void clickGetValueButton() {
        getValueButton.click();
    }

}
