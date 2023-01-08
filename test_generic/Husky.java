package test_generic;

public class Husky extends Dog{
    public Husky(){}

    public Husky(String name, int age){
        super(name,age);
    }

    @Override
    public void eat(){
        System.out.println("A husky named "+ this.getName()+" aged "+this.getAge()
                + " is eating");
    }
}
