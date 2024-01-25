package CH6_ВведениеВКлассы.Student;

public class Student {

    private String name;
    private int age;
    private double gpa;

    Student (String name, int age, double gpa) {

        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    void returnInfo () {

        System.out.println("Информация о студенте:\n" +
                "Имя: " + name + "\n" +
                "Возраст: " + age + "\n" +
                "Средний балл: " + gpa);
        System.out.println();
    }

}
