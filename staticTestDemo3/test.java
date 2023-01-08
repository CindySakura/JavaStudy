package staticTestDemo3;

public class test {
    public static void main(String[] args) {
        ragdoll rd = new ragdoll();

        rd.catchMouse();
        rd.drink();
        rd.eat();

        System.out.println("------------------");
        husky hs = new husky();
        hs.ruinHouse();
        hs.drink();
        hs.eat();
        hs.stayHome();
    }
}
