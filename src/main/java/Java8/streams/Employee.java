package Java8.streams;

public class Employee {

    private int empId;
    private String empName;
    private int salary;
    private String depName;
    private String status ="inactive";

    public Employee() {
    }

    public Employee(int empId, String empName, int salary, String depName, String status) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.depName = depName;
        this.status = status;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", salary=" + salary +
                ", depName='" + depName + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
