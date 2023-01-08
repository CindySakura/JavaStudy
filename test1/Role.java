package test1;

import java.util.Random;

public class Role {
    private String name;
    private int blood;

    public Role(){}

    public Role(String name, int blood){
        this.name = name;
        this.blood = blood;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setBlood(int blood){
        this.blood = blood;
    }

    public int getBlood(){
        return blood;
    }

    //method for attack
    public void attack(Role role){
        //count the damage
        Random r = new Random();
        int hurt = r.nextInt(20)+1;

        //update the blood of the role
        int remainBlood = role.getBlood() - hurt;
        remainBlood = remainBlood < 0 ? 0: remainBlood;
        role.setBlood(remainBlood);

        System.out.println(this.getName()+" hit " + role.getName() + " causing " + hurt +" points of damage, and "
        + role.getName()+" remained " + remainBlood + " points of blood.");
    }


}
