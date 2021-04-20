package by.zhadinets.page.demo;

import by.zhadinets.driver.DriverManager;
import by.zhadinets.page.AbstractPage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavigationPage extends AbstractPage {

    @FindBy(name = "next")
    private WebElement next;

    @FindBy(name = "previous")
    private WebElement previous;

    @FindBy(name = "finish")
    private WebElement finish;

    @FindBy(xpath = "//iFrame[@class='demo-frame']")
    private WebElement iFrame;

    @Step
    public void next() {
        next.click();
    }

    @Step
    public void previous() {
        previous.click();
    }

    @Step
    public void finish() {
        finish.click();
    }

    @Step
    public void switchIFrame() {
        DriverManager.getDriver().switchTo().frame(iFrame);
    }
}
