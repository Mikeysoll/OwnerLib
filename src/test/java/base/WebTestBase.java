package base;

import config.WebConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selenide.closeWebDriver;

public class WebTestBase {
    private static final WebConfig config = ConfigFactory.create(
            WebConfig.class, System.getProperties()
    );

    @BeforeAll
    static void setUp() {
        browser = config.browser();
        baseUrl = config.baseUrl();
        browserVersion = config.browserVersion();
        pageLoadStrategy = "eager";
        if (config.isRemote()){
            remote = config.remoteUrl();
        }
    }

    @AfterAll
    static void tearDown() {
        closeWebDriver();
    }
}