package test_polymorphic;

public class Dog extends Animal{
    public Dog(){
    }

    public Dog(int age, String colour){
        super(age,colour);
    }

    @Override
    public void eat(String sth){
        System.out.println(getAge() + "-year-old "+getColour()+" dog is eating "+sth);
    }

    public void lookHome(){
        System.out.println("look home");
    }
}
