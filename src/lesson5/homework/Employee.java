package lesson5.homework;

public class Employee {
    int id;
    String surname;
    int age;
    double salary;
    String department;

    public Employee(int id, String surname, int age, double salary, String department) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    void UvelichenieZP(){
        System.out.println("ZP do uvelicheniya: "+ salary);
//        salary=salary*2;
        salary*=2;
        System.out.println("ZP posle uvelicheniya:"+ salary);


    }
}
