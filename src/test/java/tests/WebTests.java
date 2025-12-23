package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class WebTests extends WebTestBase {

    @Test
    public void someTest(){
        open("/");
        $("#hero-section-brand-heading").shouldHave(text("The future of building happens together"));
    }

    @Test
    public void someTest2(){
        open("/");
        $(".MarketingNavigation-module__nav--jA9Zq").find(byText("Platform")).click();
    }
}
