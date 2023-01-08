package staticTestDemo5;

public class chef extends employee{
    public chef(){}

    public chef(String id, String name, double salary){
        super(id, name, salary);
    }
    @Override
    public void work(){
        System.out.println("cooking");
    }
}
