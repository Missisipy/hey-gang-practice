package CH7_ПодробныйАнализМетодовИКлассов;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private List<Employee> employees;

    Company () {

        employees = new ArrayList<>();
    }

    void addEmployee (Employee employee) {

        employees.add(employee);
        System.out.println("Добавлен новый сотрудник");
    }

    double CalcTotalSalaryFabric () {

        double totalSal = 0;
        for (Employee employee : employees) totalSal += employee.returnSalaryInfo();
        return totalSal;
    }

    void returnAllEmployeesInfoFabric() {

        System.out.println("Информация о сотрудниках в компании:");
        for (Employee employee : employees) {

            employee.getEemployeeInfo();
        }
    }

    void returnInfoEmployeesWithSalaryHighMiddle (double middleValueSalary) {

        System.out.println("Информация о сотрудниках с зарплатой выше " + middleValueSalary + ":");
        for (Employee employee : employees) {

            if (employee.returnSalaryInfo() > middleValueSalary) employee.getEemployeeInfo();
        }
    }
}