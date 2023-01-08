package staticTestDemo5;

public class employee {
    private String id;
    private String name;
    private double salary;

    public employee(){}

    public employee(String id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void work(){
        System.out.println("working");
    }
    public void eat(){
        System.out.println("eating");
    }

}
