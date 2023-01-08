package test_abstract;

public class test_main {
    public static void main(String[] args) {
        Frog f = new Frog("Amy", 1);
        System.out.println(f.getName() + ", "+f.getAge());
        f.drink();
        f.eat();
    }
}
