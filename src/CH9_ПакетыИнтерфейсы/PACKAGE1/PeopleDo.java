package CH9_ПакетыИнтерфейсы.PACKAGE1;

public interface PeopleDo {

    default int PeopleSum (int a, int b) {
        return a + b;
    }
    void returnInfoAboutMeh (People x);
}
