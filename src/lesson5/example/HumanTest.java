package lesson5.example;

public class HumanTest {
    public static void main(String[] args) {
        Human people1 = new Human("Peter");
        Human people2 = new Human("Moter");
        Human people3 = new Human("Ola");

        people2.age = 25;
        people2.stareet(2);
        people3.stareet(2);
        people1.eyes = "zeleniy";
        System.out.println(people1.eyes);
        System.out.println(people3.eyes);
        people1.eat();
        people2.sleep();


    }

}
