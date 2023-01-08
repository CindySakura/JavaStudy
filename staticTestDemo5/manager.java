package staticTestDemo5;

public class manager extends employee{
    private double bonus;

    public manager(){}

    public manager(String id, String name, double salary, double bonus) {
        super(id,name,salary);
        this.bonus = bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus(){
        return bonus;
    }

    @Override
    public void work(){
        System.out.println("managing");
    }
}
