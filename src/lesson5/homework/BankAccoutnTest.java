package lesson5.homework;

public class BankAccoutnTest {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount();
        ba1.balance = 100;
        ba1.id = 1;
        ba1.name = "Vasek";

        BankAccount ba2 = new BankAccount();
        ba2.balance = 150;
        ba2.id = 2;
        ba2.name = "Chumo";

        ba1.popolnenieScheta(5);
        ba2.snyatieSoScheta(100);
    }

}
