package test_abstract;

public class Sheep extends Animal{
    public Sheep() {
    }

    public Sheep(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat(){
        System.out.println("eat grass");
    }
}
