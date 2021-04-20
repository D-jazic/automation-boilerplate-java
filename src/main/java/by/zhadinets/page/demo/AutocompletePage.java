package by.zhadinets.page.demo;

import by.zhadinets.driver.DriverManager;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AutocompletePage extends NavigationPage {

    @FindBy(xpath = "//div[@id='sidebar']//a[contains(text(), 'Autocomplete')]")
    private WebElement autocomplete;

    @FindBy(xpath = "//input[@id='tags']")
    private WebElement inputTags;

    @Step
    public void clickAutocomplete() {
        autocomplete.click();
    }

    @Step
    public void inputTagValue(String value) {
        inputTags.sendKeys(value);
    }

    @Step
    public String getTagInputValue() {
        return inputTags.getAttribute("value");
    }

    @Step
    public void inputTagArrowDownAction(int executionNumber) {
        for(int i = 0; i < executionNumber + 1; i++) {
            inputTags.sendKeys(Keys.ARROW_DOWN);
        }
    }

    @Step
    public void inputTagEnterAction() {
            inputTags.sendKeys(Keys.ENTER);
    }


}
