enum PaymentMethod {
    CASH, CARD
}

abstract class Payment {
    private int ID;
    private double amount;
    private PaymentMethod paymentMethod;

    public Payment(int ID, double amount, PaymentMethod paymentMethod) {
        this.ID = ID;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
    }

    public int getID() {
        return ID;
    }

    public double getAmount() {
        return amount;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}