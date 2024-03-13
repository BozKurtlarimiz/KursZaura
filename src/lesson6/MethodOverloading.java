package lesson6;

public class MethodOverloading {


    public int summ() {
        int result = 0;
        System.out.println("сумма всех чисел равна: " + result);
        return 0;
    }

    public int summ(int chislo) {
        int result = chislo;
        System.out.println("сумма всех чисел равна: " + result);
        return chislo;
    }

    public int summ(int chislo, int chislo2) {
        int result = chislo + chislo2;
        System.out.println("сумма всех чисел равна: " + result);
        return result;
    }

    public int summ(int chislo, int chislo2, int chislo3) {
        int result = chislo + chislo2 + chislo3;
        System.out.println("сумма всех чисел равна: " + result);
        return result;
    }

    public int summ(int chislo, int chislo2, int chislo3, int chislo4) {
        int result = chislo + chislo2 + chislo3 + chislo4;
        System.out.println("сумма всех чисел равна: " + result);
        return result;
    }

}

