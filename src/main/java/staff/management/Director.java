package staff.management;

public class Director extends Manager{
    private Double budget;

    public Director(String name, String deptName, int niNumber, Double salary, Double budget) {
        super(name, deptName, niNumber, salary);
        this.budget = budget;
    }

    public Double getBudget() {
        return budget;
    }
}
