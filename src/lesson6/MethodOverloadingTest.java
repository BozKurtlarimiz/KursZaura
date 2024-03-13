package lesson6;

public class MethodOverloadingTest {
    public static void main(String[] args) {
        MethodOverloading besit = new MethodOverloading();
        besit.summ();
        besit.summ(1);
        besit.summ(3, 2);
        besit.summ(1, 6, 2);
        besit.summ(4, 4, 2, 7);

    }
}
