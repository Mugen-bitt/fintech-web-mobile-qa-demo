package framework.utils;

// Генератор тестовых данных (имена, телефоны, суммы и т.п.)
public class DataGenerator {
    public static String randomPhone() {
        // Возвращает фиктивный номер телефона
        return "+79001234567";
    }

    public static int randomLoanAmount() {
        // Возвращает случайную сумму займа
        return 10000;
    }
}
