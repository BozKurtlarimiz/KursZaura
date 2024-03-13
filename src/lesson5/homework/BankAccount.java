package lesson5.homework;


import java.net.ProtocolFamily;

public class BankAccount {
    int id;
    String name;
    double balance;



    void popolnenieScheta(double summaPopolneniya) {
        System.out.println("balans do popolneniya: " + balance);
        System.out.println("Balans popolneyetsa na" + summaPopolneniya);
//        balance += summaPopolneniya;
      balance = balance+ summaPopolneniya;
        System.out.println("Balans posle popolneniya" + balance);
        System.out.println();

    }

    void snyatieSoScheta(double summaSnyatiya) {
        System.out.println("Balans do snyatiya: " + balance);
        System.out.println("Balans umenshaetsya na:" + summaSnyatiya);
        balance -= summaSnyatiya;
        System.out.println("Balans posle snyatiya" + balance);
        System.out.println();

    }

}


