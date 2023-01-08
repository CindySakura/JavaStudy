package test_polymorphic;

public class Animal {
    private int age;
    private String colour;

    public Animal(){
    }

    public Animal(int age, String colour){
        this.age = age;
        this.colour = colour;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }

    public void setColour(String colour){
        this.colour = colour;
    }
    public String getColour(){
        return this.colour;
    }

    public void eat(String sth){
        System.out.println("eating " + sth);
    }
}
