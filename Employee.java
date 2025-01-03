package leavemanagementsystem;

public class Employee {
    private int id;
    private String name;
    private String position;
    private double salary;
    public Employee(int id, String name, String position, double salary){
        this.id = id;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        if(salary>0){
        this.salary = salary;
        }else{
            System.out.println("Invalid salary! Salary must be positive number");
        }
    }
    
    public String toString(){
        return"ID:" +id+", Name: " +name+", salary: $"+salary+", Position: " + position;   
        }
}
