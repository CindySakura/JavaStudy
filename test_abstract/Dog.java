package test_abstract;

public class Dog extends Animal{
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }
    @Override
    public void eat(){
        System.out.println("eat bones");
    }
}
