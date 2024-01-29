package CH9_ПакетыИнтерфейсы.PACKAGE2;

import CH9_ПакетыИнтерфейсы.PACKAGE1.People;
import CH9_ПакетыИнтерфейсы.PACKAGE1.PeopleDo;

public class CleverPeoples extends People implements PeopleDo {

    String myDogName;
    public CleverPeoples(String name, int age, int myNumber, String myDogName) {
        super(name, age, myNumber);
        this.myDogName = myDogName;
    }
    public CleverPeoples(String name, int age, int myNumber) {
        super(name, age, myNumber);
    }
    public void returnInfoAboutMeh(People x) {
        System.out.println(name + "\n" + age + "\n" + myNumber);
    }
}
