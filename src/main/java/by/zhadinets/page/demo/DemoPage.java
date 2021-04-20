package by.zhadinets.page.demo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.qameta.allure.Step;

public class DemoPage extends NavigationPage {

    @FindBy(xpath = "//div[@id='sidebar']//h3[contains(text(), 'Interactions')]")
    private WebElement interaction;

    @FindBy(xpath = "//div[@id='sidebar']//h3[contains(text(), 'Widgets')]")
    private WebElement widget;

    @FindBy(xpath = "//div[@id='sidebar']//h3[contains(text(), 'Effects')]")
    private WebElement effect;

    @FindBy(xpath = "//div[@id='sidebar']//h3[contains(text(), 'Utilities')]")
    private WebElement utility;

    @FindBy(xpath = "//div[@id='sidebar']//a[contains(text(), 'Spinner')]")
    private WebElement spinner;

    @Step
    public boolean isInteractionContained() {
        return interaction.isDisplayed();
    }

    @Step
    public boolean isWidgetContained() {
        return widget.isDisplayed();
    }

    @Step
    public boolean isEffectContained() {
        return effect.isDisplayed();
    }

    @Step
    public boolean isUtilityContained() {
        return utility.isDisplayed();
    }

    @Step
    public void clickSpinnerButton() {
        spinner.click();
    }

}
