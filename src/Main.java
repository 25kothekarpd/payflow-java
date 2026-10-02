import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=======WELCOME TO G-PAY======\n");

        System.out.print("Enter customer Name : ");
        String customerName = sc.nextLine();

        System.out.print("Enter UPI ID : ");
        String upiId = sc.nextLine();

        System.out.print("Enter Amount to Transfer : ");
        double amount = sc.nextDouble();

        Payments p1 = new Payments(
                customerName,
                upiId,
                amount
        );

        p1.displayPaymentDetails();

        sc.close();
    }
}