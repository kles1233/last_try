package ex78;
import static java.lang.Math.*;
import java.util.Random;

    public class Manager extends Employee implements EmployeePosition {
        private int income;

        public Manager(double baseSalary) {
            Title = "Manager";
            Random r = new Random();
            income = 100000 + r.nextInt(25000);
            Company.income += income;
            salary = calcSalary(baseSalary);
        }


        public int getIncome() {
            return income;
        }

        @Override
        public String getTitle() {
            return super.getTitle();
        }

        @Override
        public double calcSalary(double baseSalary) {
            Random r = new Random();
            double bonus = 0.05 * income;
            return bonus + baseSalary;
        }

        @Override
        public String toString() {
            return "Manager =>" +
                    "income=" + income +
                    ", salary=" + salary +
                    ", Title='" + Title + '\'';
        }
    }