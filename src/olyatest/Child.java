package olyatest;
/* у класса след атрибуты: цвет глаз, возраст, пол.
создать два конструктора, дефолтный и с только полом.
создать метод хочу денег  в параметрах число сколько хочет и метод выводит на экран сумма которую он хочет(в рублях)(возвращает).
второй метод выводит на экран просто хочу спать и ничего не возвращает.
смотреть хуман и хуман тест*подсказка
 */

public class Child {
    String eye;
    int age;
    String gender;

    public Child() {
    }

    public Child(String gender) {
        this.gender = gender;

    }

    int hochuDeneg(int summa) {
        System.out.println("хочу " + summa + " руб");
        return summa;
    }

    void hochuSpat(){
        System.out.println("хочу спать");
    }


}

