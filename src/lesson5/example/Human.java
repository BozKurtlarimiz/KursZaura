package lesson5.example;

public class Human {
    String name;
    int age;
    String eyes;

    public Human(String name) {
        this.name = name;

    }

    public Human() {
    }

    void sleep() {
        System.out.println(name + " спит");
    }

    void eat() {
        System.out.println(name + " ест");
    }

    void stareet(int cifra) {
        System.out.println(name + " постарел(а) на " + cifra + " года. Теперь ей(ему) " + (age + cifra));
    }
}

