package staff;

public abstract class Employee {
    private String name;
    private int niNumber;
    private Double salary;

    public Employee(String name, int niNumber, Double salary){
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
    public String setName(String name){
        return this.name = name;
    }

    public int getNiNumber() {
        return niNumber;
    }

    public Double getSalary() {
        return salary;
    }

    public void raiseSalary(Double increase){
        if (increase > 0){
        salary += increase;}
    };

    public Double payBonus(){

        return salary += (salary /= 100);
    }

}
