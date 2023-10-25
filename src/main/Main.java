public class Main {
    public static void main(String[] args) {
        ReceiptManager manager = new ReceiptManager();

        // Add sample receipts with different payment methods
        Receipt receipt1 = new Receipt(1, "John Doe", 100.0, PaymentMethod.CASH);
        Receipt receipt2 = new Receipt(2, "Jane Smith", 75.5, PaymentMethod.CARD);

        manager.addReceipt(receipt1);
        manager.addReceipt(receipt2);

        // View all receipts
        System.out.println("All Receipts:");
        manager.viewAllReceipts();

        // Delete a receipt
        manager.deleteReceipt(1);

        // View receipts after deletion
        System.out.println("Receipts after Deletion:");
        manager.viewAllReceipts();
    }
}