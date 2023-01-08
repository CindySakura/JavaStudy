package test_polymorphic;

public class test_polymorphic {
    public static void main(String[] args) {
        Dog d = new Dog(2,"red");
        Cat c = new Cat(1, "blue");

        Person p1 = new Person("Amy", 32);
        p1.keepPet(d,"bone");
        p1.keepPet(c,"fish");

        Person p2 = new Person("Bob", 32);
        p2.keepPet(d,"fish");
        p2.keepPet(c,"bone");
    }
}
