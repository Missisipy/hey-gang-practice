package CH7_ПодробныйАнализМетодовИКлассов;

public class Employee {

    private String name;
    private String position;
    private double salary;

    Employee (String name, String position, double salary) {

        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    double returnSalaryInfo () {

        return salary;
    }

    void getEemployeeInfo() {

        System.out.println("Имя: " + name);
        System.out.println("Должность: " + position);
        System.out.println("Зарплата: " + salary);
    }
}
