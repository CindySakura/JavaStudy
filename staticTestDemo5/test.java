package staticTestDemo5;

public class test {
    public static void main(String[] args) {
        manager m  = new manager("1", "amy", 100,100);
        System.out.println(m.getId()+", "+m.getName()+", "+
        m.getSalary()+", "+m.getBonus());

        m.work();
        m.eat();

        chef c = new chef("2","bob",100);
        System.out.println(c.getId()+", "+c.getName()+", "+
                c.getSalary());

        c.work();
        c.eat();
    }
}
