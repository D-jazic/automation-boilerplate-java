package by.zhadinets.report;

import by.zhadinets.config.ConfigurationManager;
import by.zhadinets.driver.DriverManager;
import com.github.automatedowl.tools.AllureEnvironmentWriter;
import com.google.common.collect.ImmutableMap;
import io.qameta.allure.Attachment;
import org.openqa.selenium.TakesScreenshot;

import static org.openqa.selenium.OutputType.BYTES;

public class AllureManager {

    private AllureManager() {
    }

    public static void setAllureEnvironmentInformation() {
        AllureEnvironmentWriter.allureEnvironmentWriter(
                ImmutableMap.<String, String>builder().
                        put("Test URL", ConfigurationManager.configuration().url()).
                        put("Target execution", ConfigurationManager.configuration().target()).
                        put("Global timeout", String.valueOf(ConfigurationManager.configuration().timeout())).
                        put("Headless mode", String.valueOf(ConfigurationManager.configuration().headless())).
                        put("Faker locale", ConfigurationManager.configuration().faker()).
                        put("Local browser", ConfigurationManager.configuration().browser()).
                        put("Grid URL", ConfigurationManager.configuration().gridUrl()).
                        put("Grid port", ConfigurationManager.configuration().gridPort()).
                        build());
    }

    @Attachment(value = "Failed test screenshot", type = "image/png")
    public static byte[] takeScreenshotToAttachOnAllureReport() {
        return ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(BYTES);
    }

    @Attachment(value = "Browser information", type = "text/plain")
    public static String addBrowserInformationOnAllureReport() {
        return DriverManager.getInfo();
    }

}
