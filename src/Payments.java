public class Payments {

    private String customerName;
    private String upiId;
    private double amount;

    public Payments(String customerName, String upiId, double amount) {
        setcustomerName(customerName);
        setupiId(upiId);
        setamount(amount);
    }

    public String getcustomerName() {
        return customerName;
    }

    public void setcustomerName(String name) {

        if (name == null || name.equals(" ")) {
            System.out.println(
                    "Customer name cannot be empty please fill that ...");
        } else {
            this.customerName = name;
        }
    }

    public String getupiId() {
        return upiId;
    }

    public void setupiId(String name) {

        if (name == null || name.equals("@ ")) {
            System.out.println(
                    "Customer upiId cannot be empty please fill that ...");
        } else {
            this.upiId = name;
        }
    }

    public double getamount() {
        return amount;
    }

    public void setamount(double amount) {

        if (amount <= 0) {
            System.out.println(
                    "Amount cannot be less then or equal to zero please fill that ...");
        } else {
            this.amount = amount;
        }
    }

    void processPayment() {

        System.out.println("Payment processing...");
        System.out.println("Payment done");
    }

    void displayPaymentDetails() {

        System.out.println("\n===========Payment Details===========");

        System.out.println("Coustomer Name: " + customerName);
        System.out.println("UPI ID: " + upiId);
        System.out.println("Amount: " + amount);

        processPayment();

        System.out.println(
                "Payment successful. Reciever has been credited with Rs. "
                        + amount);
    }
}
