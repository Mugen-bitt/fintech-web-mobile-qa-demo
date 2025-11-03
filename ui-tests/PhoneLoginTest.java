import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class PhoneLoginTest {

    @BeforeAll
    static void setup() {
        Configuration.baseUrl = "https://zaymigo.ru"; //
        Configuration.startMaximized = true;
    }

    @Test
    void loginByPhone_shouldShowNextStepOrCodeField() {
        open("/");

        // Нажимаю кнопку "Войти"
        $("button", 1).click(); // или точнее: $x("//button[contains(text(), 'Войти')]").click();

        // Ввод номера телефона
        $("[placeholder='Телефон']").setValue("79001234567");

        // Нажимаю кнопку "Войти"
        $$("button").findBy(text("Войти")).click();

        // Проверка — появляется поле для кода / уведомление / следующий шаг
        $("body").shouldHave(text("код") // либо: $("input[placeholder*='Код']").shouldBe(visible);
        );
    }
}
