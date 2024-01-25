package CH7_ПодробныйАнализМетодовИКлассов;

public class Main {

    public static void main(String[] args) {

        var company = new Company();

        company.addEmployee(new Employee("Gosh", "Influence", 134_000));
        company.addEmployee(new Employee("Misha", "Opposition", 100_000));
        company.addEmployee(new Employee("Kolya", "Geek", 213_000));

        company.returnAllEmployeesInfoFabric();

        System.out.println("Общая выплачиваемая сумма всем сотрудникам: " + company.CalcTotalSalaryFabric() + " RUB.");

        company.returnInfoEmployeesWithSalaryHighMiddle(150_000);
    }
}
