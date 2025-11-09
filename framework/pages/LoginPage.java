package framework.pages;

import com.codeborne.selenide.SelenideElement;

// Page Object для авторизации пользователя
public class LoginPage {
    private SelenideElement phoneField;
    private SelenideElement passwordField;
    private SelenideElement loginButton;

    public void login(String phone, String password) {
        // Ввод данных и нажатие кнопки входа
    }
}
