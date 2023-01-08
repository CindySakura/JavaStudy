package test_generic;

public class Teddy extends Dog{
    public Teddy(){}

    public Teddy(String name, int age){
        super(name,age);
    }

    @Override
    public void eat(){
        System.out.println("A teddy named "+ this.getName()+" aged "+this.getAge()
                + " is eating");
    }
}
