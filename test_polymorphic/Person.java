package test_polymorphic;

public class Person {
    private String name;
    private int age;

    public Person(){
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }

    public void keepPet(Animal a, String sth){
        if(a instanceof Dog){
            Dog d = (Dog) a;
            System.out.println(age + "-year-old "+name+" is raising a "+a.getAge()+"-year-old dog");
            d.eat(sth);
        } else if (a instanceof  Cat) {
            Cat c = (Cat) a;
            System.out.println(age + "-year-old "+name+" is raising a "+a.getAge()+"-year-old cat");
            c.eat(sth);
        }else{
            System.out.println("No such animal");
        }

    }
}
