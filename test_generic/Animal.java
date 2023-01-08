package test_generic;

public abstract class Animal {
    private String name;
    private int age;

    public Animal(){}

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName(){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setAge(){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public abstract void eat();
}
