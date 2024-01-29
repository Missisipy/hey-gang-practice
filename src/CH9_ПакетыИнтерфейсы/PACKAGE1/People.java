package CH9_ПакетыИнтерфейсы.PACKAGE1;

public class People implements PeopleDo{

    protected String name;
    protected int age;
    protected int myNumber;
    protected People(String name, int age, int myNumber) {
        this.name = name;
        this.age = age * 2;
        this.myNumber = myNumber - 1;
    }
    public void returnInfoAboutMeh (People x) {
        System.out.println(name + "\n" + age + "\n" + myNumber);
    }
}
