package ex78;

public class TopManager extends Employee implements EmployeePosition {


    public TopManager(double baseSalary) {
        Title = "TopManager";
        salary = calcSalary(baseSalary);
    }


    @Override
    public String getTitle() {
        return super.getTitle();
    }

    @Override
    public double calcSalary(double baseSalary) {
        double bonus = 0;
        if (Company.getIncome() > 10000000) bonus = baseSalary * 1.5;
        return baseSalary + bonus;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}