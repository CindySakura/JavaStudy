package test_generic;

public class bosiCat extends Cat{
    public bosiCat(){}

    public bosiCat(String name, int age){
        super(name,age);
    }

    @Override
    public void eat(){
        System.out.println("A bosi cat named "+ this.getName()+" aged "+this.getAge()
        + " is eating");
    }
}
