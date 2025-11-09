package ui.tests;

import framework.core.BaseTest;
import framework.pages.LoginPage;
import framework.utils.DataGenerator;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

// Пример UI-теста с аннотациями Allure
@Epic("Loan")
@Feature("Loan form")
@Story("User applies for a loan via web form")
@Owner("Pavel Evstigneev")
@Severity(SeverityLevel.CRITICAL)
public class LoanFormTest extends BaseTest {

    @Test
    @DisplayName("Проверка успешного оформления займа через web форму")
    @Description("UI-тест демонстрирует пример сценария с Allure-аннотациями и Page Object.")
    public void shouldSubmitLoanFormSuccessfully() {
        LoginPage loginPage = new LoginPage();
        String phone = DataGenerator.randomPhone();
        int amount = DataGenerator.randomLoanAmount();

        // Шаги теста
        loginPage.login(phone, "testPassword");
        // Дальнейшие шаги проверки формы и подтверждения займа
    }
}
