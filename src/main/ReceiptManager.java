import java.util.ArrayList;
import java.util.List;

public class ReceiptManager {
    private List<Receipt> receipts;

    public ReceiptManager() {
        receipts = new ArrayList<>();
    }

    // Add a new receipt to the collection
    public void addReceipt(Receipt receipt) {
        receipts.add(receipt);
    }

    // Delete a receipt from the collection
    public void deleteReceipt(int ID) {
        receipts.removeIf(r -> r.getID() == ID);
    }

    // View all receipts in the collection
    public void viewAllReceipts() {
        for (Receipt receipt : receipts) {
            System.out.println("Receipt ID: " + receipt.getID());
            System.out.println("Receipt title: " + receipt.getTitle());
            System.out.println("Total Amount: $" + receipt.getAmount());
            System.out.println("Payment Method: " + receipt.getPaymentMethod());
            System.out.println();
        }
    }

}
