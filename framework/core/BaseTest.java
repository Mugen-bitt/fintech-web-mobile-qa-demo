package framework.core;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import io.qameta.allure.Step;

// Базовый класс для всех тестов
public abstract class BaseTest {

    @BeforeEach
    @Step("Инициализация тестового окружения")
    public void setup() {
        // Инициализация драйвера, конфигурации, логирования
    }

    @AfterEach
    @Step("Завершение теста и снятие скриншота при падении")
    public void teardown() {
        // Закрытие драйвера, сбор артефактов
    }
}
