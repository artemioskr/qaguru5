import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class YandexTest extends TestBase {
    @Test
    void findSelenideInYandex() {
        open("https://yandex.ru/");
        $("#text").setValue("Selenide").pressEnter();
        $("#search-result li").shouldHave(Condition.text("selenide.org"));
    }
}
