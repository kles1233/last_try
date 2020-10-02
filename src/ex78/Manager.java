package ex78;
import static java.lang.Math.*;

public class Manager implements EmployeePosition {

private String tittle;

    private int  salary;
     private int moneycompany;


    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;

        System.out.print( getJobTitle("Manager"));
    }

    public int getMoneycompany() {
        return moneycompany;
    }

    public void setMoneycompany(int moneycompany) {
        this.moneycompany = moneycompany;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

 private int Salary(){
    int a = 115000;
    int b = 140000;

     moneycompany= (a + (int) (random() * b))*5/100;
     System.out.print(moneycompany);

return moneycompany;

}
}


