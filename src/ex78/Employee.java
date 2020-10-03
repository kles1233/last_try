package ex78;

public class Employee  {
    protected String lastname;
    protected String firstname;
    protected double salary;
    protected String Title;

    public Employee() {
        this.salary = salary;
        this.Title = Title;
    }

    public Employee(String lastname, String firstname) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.salary = salary;
        this.Title = Title;
    }

    public double getSalary() {
        return salary;
    }

    public String getFirstname() {
        return firstname;
    }
    public String getTitle() {
        return Title;
    }

    public String getLastname() {
        return lastname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }


    @Override
    public String toString() {
        return "Employee =>" +
                "lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", salary=" + salary +
                ", jobTitle='" + Title +'\'';
    }
}
