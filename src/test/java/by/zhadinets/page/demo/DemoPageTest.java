package by.zhadinets.page.demo;

import by.zhadinets.BaseWeb;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DemoPageTest extends BaseWeb {

    @Test
    public void verifyElementIsContainedTest() {
        DemoPage demoPage = new DemoPage();

        assertThat(demoPage.isEffectContained()).isEqualTo(true);
        assertThat(demoPage.isInteractionContained()).isEqualTo(true);
        assertThat(demoPage.isUtilityContained()).isEqualTo(true);
        assertThat(demoPage.isWidgetContained()).isEqualTo(true);

    }

}