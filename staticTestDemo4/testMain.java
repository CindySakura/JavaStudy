package staticTestDemo4;

public class testMain {
    public static void main(String[] args) {
        husky h = new husky();
        h.drink();
        h.eat();
        h.ruinhome();
        h.stayhome();

        Chinesedog cd = new Chinesedog();
        cd.eat();
        cd.drink();
        cd.stayhome();
    }
}
