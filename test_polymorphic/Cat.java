package test_polymorphic;

public class Cat extends Animal{
    public Cat(){
    }

    public Cat(int age, String colour){
        super(age,colour);
    }
    @Override
    public void eat(String sth){
        System.out.println(getAge()+"-year-old " +getColour()+" cat is eating " + sth);
    }

    public void catchMouse(){
        System.out.println("catch mouse");
    }

}
