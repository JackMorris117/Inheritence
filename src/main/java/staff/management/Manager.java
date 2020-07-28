package staff.management;

import staff.Employee;

public class Manager extends Employee {
    private String deptName;

    public Manager(String name, String deptName, int niNumber, Double salary) {
        super(name, niNumber, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

}