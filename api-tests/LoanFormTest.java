import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class LoanFormTest {

    @BeforeAll
    static void setUp() {
        Configuration.browser = "chrome";
        Configuration.baseUrl = "https://zaymigo.ru"; //
        Configuration.startMaximized = true;
    }

    @Test
    void loanFormShouldDisplayCorrectValues() {
        open("/");

        // Проверяю заголовок
        $("h1").shouldHave(text("Первый займ бесплатно"));

        // Проверяю, что сумма и срок отобразились
        $("div:has-text('Сумма')").shouldBe(visible);
        $("div:has-text('Срок')").shouldBe(visible);

        // Проверка отображения текущих значений суммы и срока
        $("div").shouldHave(text("10 000"));
        $("div").shouldHave(text("12 дней"));

        // Проверка наличия кнопки "Получить деньги"
        $("a").shouldHave(text("Получить деньги")).shouldBe(visible);
    }
}
