package test2;

public class test1 {
    public static void main(String[] args) {
        //create the first role
        Role r1 = new Role("Amy",100,'m');
        //create the second role
        Role r2 = new Role("Bob",100,'m');

        r1.showRoleInfo();
        r2.showRoleInfo();

        //game start
        while(true){
            //r1 attacks r2
            r1.attack(r2);
            if(r2.getBlood() == 0){
                System.out.println(r1.getName()+" K.O " + r2.getName());
                break;
            }
            r2.attack(r1);
            if(r1.getBlood() == 0){
                System.out.println(r2.getName()+" K.O " + r1.getName());
                break;
            }
        }
    }
}
