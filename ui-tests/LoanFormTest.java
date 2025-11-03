// UI тест: проверяет оформление займа на 10 000₽ на 12 дней и расчёт суммы к возврату
@Test
@DisplayName("Оформление займа — расчет суммы к возврату")
public void testLoanCalculation() {
    $("input[name='amount']").setValue("10000");
    $("input[name='term']").setValue("12");
    $("button").click();
    $("div.return-amount").shouldHave(text("10 000 ₽")); // или ожидаемая сумма с процентами
}
