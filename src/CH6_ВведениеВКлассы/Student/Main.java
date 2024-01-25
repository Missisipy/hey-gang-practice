package CH6_ВведениеВКлассы.Student;

public class Main {

    public static void main(String[] args) {

        var George = new Student("George", 22, 4.81);
        var John = new Student("John", 23, 4.32);
        var Gangsta = new Student("Petre", 34, 2.28);

        George.returnInfo();
        John.returnInfo();
        Gangsta.returnInfo();
    }
}
