package ex78;

    public class Operator extends Employee implements EmployeePosition{



        public Operator(double baseSalary) {
            Title = "Operator";
            salary = baseSalary;
        }

        @Override
        public String getTitle() {
            return super.getTitle();
        }

        @Override
        public double calcSalary(double baseSalary) {
            return baseSalary;
        }

        @Override
        public String toString() {
            return super.toString();
        }
    }
