package ex78;

import static java.lang.Math.random;

public interface EmployeePosition {

   public default String getJobTitle(String tittle){

       return tittle;

    }


    public default double calcSalary(double baseSalary){
        int a = 30000;
        int b = 500000;

        baseSalary = (random()*a + (int) (random() * b));

return baseSalary;

    }

}
