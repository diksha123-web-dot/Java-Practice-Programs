class BankAccount {
    String name;
    double balance;

    BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance)
            balance -= amount;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Diksha", 5000);
        acc.deposit(1000);
        acc.withdraw(2000);
        acc.display();
    }
}