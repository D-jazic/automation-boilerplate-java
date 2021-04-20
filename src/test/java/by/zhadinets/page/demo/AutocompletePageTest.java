package by.zhadinets.page.demo;

import by.zhadinets.BaseWeb;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AutocompletePageTest extends BaseWeb {

    @Test
    public void selectValueByArrowDownTest() {

        AutocompletePage autocompletePage = new AutocompletePage();

        autocompletePage.clickAutocomplete();
        autocompletePage.switchIFrame();

        autocompletePage.inputTagValue("a");
        autocompletePage.inputTagArrowDownAction(3);
        autocompletePage.inputTagEnterAction();

        String result = autocompletePage.getTagInputValue();

        assertThat(result.toUpperCase()).isEqualTo("ASP");

    }

}