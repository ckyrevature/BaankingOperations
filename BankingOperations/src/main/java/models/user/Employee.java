package domain;

public class Employee extends User{

    //maybe will useful in SQL
    private int employeeID;



    public Employee() {
    }

    public Employee(int employeeID) {
        super();
        this.employeeID = employeeID;

    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID;
    }
}
