import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GoogleTest extends TestBase {

    @Test
    void findGoogleInGoogle() {
        open("https://google.com");
        $(byName("q")).setValue("google").pressEnter();

        $(".rso").shouldHave(text("www.google.ru"));
    }
}
