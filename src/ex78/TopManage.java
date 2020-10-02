package ex78;

public class TopManage implements EmployeePosition {
    private String tittle;
    private int salary;
    private int moneycompany;

    public int getMoneycompany() {
        return moneycompany;
    }

    public void setMoneycompany(int moneycompany) {
        this.moneycompany = moneycompany;
    }

    public void setTittle1(String tittle) {
        this.tittle = tittle;

        System.out.print( getJobTitle("TopManager"));
    }
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }



        public void Salary(int money_company) {

        if (money_company > 10000000) {
            moneycompany = money_company * 150 / 100;
            System.out.print(calcSalary(moneycompany));
        }

    }

}