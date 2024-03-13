package olyatest;

public class ChildTest {
    public static void main(String[] args) {
        Child pepe = new Child();
        pepe.gender="male";
        Child bob = new Child("male");
        bob.age=5;
        pepe.hochuDeneg(10);
        bob.hochuSpat();



    }
}
