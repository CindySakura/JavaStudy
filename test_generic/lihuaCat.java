package test_generic;

public class lihuaCat extends Cat{
    public lihuaCat(){}

    public lihuaCat(String name, int age){
        super(name,age);
    }

    @Override
    public void eat(){
        System.out.println("A lihua cat named "+ getName()+" aged "+getAge()
                + " is eating");
    }
}
