package framework.data;

// Data Builder для объекта заявки на займ
public class LoanData {
    private String userId;
    private int amount;

    public LoanData withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public LoanData withAmount(int amount) {
        this.amount = amount;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public int getAmount() {
        return amount;
    }
}
