class Receipt extends Payment {
    private String title;

    public Receipt(int ID, String title, double amount, PaymentMethod paymentMethod) {
        super(ID, amount, paymentMethod);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}