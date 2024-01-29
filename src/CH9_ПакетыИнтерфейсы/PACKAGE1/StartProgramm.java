package CH9_ПакетыИнтерфейсы.PACKAGE1;

import CH9_ПакетыИнтерфейсы.PACKAGE2.CleverPeoples;

public class StartProgramm {
    static void returnInfo (People x) {
        x.returnInfoAboutMeh(x);
    }

    public static void IWantToSay (String msg) {
        System.out.println(msg);
    }

    static void IdontUnderstand1 (People x) {
        IWantToSay(x.age + " это не мой возраст!!!");
    }

    public static void main(String[] args) {

        People man1 = new People("Вовчик", 34, 7);
        People man2 = new CleverPeoples("Альберт", 23, 3);
        People man3 = new CleverPeoples("Чаппи", 0, 31415, "Роберт");

        returnInfo(man1);
        returnInfo(man3);
        returnInfo(man2);
        IdontUnderstand1(man2);
        IWantToSay("это " + man1.name + " я посчитал 2 + 2 и это равно " + man1.PeopleSum(2, 2));
    }
}
