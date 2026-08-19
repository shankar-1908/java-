import java.util.Scanner;

interface BankAccount {
    void deposit(double a);
    void withdraw(double a);
    void balance();
}

class Bank implements BankAccount {
    String name;
    int no;
    double b;

    Bank(String name, int no, double b) {
        this.name = name;
        this.no = no;
        this.b = b;
    }

    public void deposit(double a) {
        if (a <= 0)
            throw new IllegalArgumentException("Invalid Amount");

        b = b + a;
        System.out.println("Amount Deposited Successfully");
    }

    public void withdraw(double a) {
        if (a <= 0)
            throw new IllegalArgumentException("Invalid Amount");

        if (a > b)
            throw new ArithmeticException("Insufficient Balance");

        b = b - a;
        System.out.println("Amount Withdrawn Successfully");
    }

    public void balance() {
        System.out.println("Available Balance: Rs. " + (int)b);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Account Holder Name: ");
        String name = s.nextLine();

        System.out.print("Account Number: ");
        int no = s.nextInt();

        System.out.print("Initial Balance: ");
        double b = s.nextDouble();

        s.nextLine();
        System.out.print("Operation: ");
        String op = s.nextLine();

        Bank x = new Bank(name, no, b);

        try {
            if (op.equalsIgnoreCase("Deposit")) {
                System.out.print("Deposit Amount: ");
                double a = s.nextDouble();
                x.deposit(a);
            }
            else if (op.equalsIgnoreCase("Withdraw")) {
                System.out.print("Withdraw Amount: ");
                double a = s.nextDouble();
                x.withdraw(a);
            }
            else {
                throw new IllegalArgumentException("Invalid Operation");
            }
        }
        catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
            System.out.println("Transaction Failed");
        }

        x.balance();
    }
}
