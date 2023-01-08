package test2;

import java.util.Random;

public class Role {
    private String name;
    private int blood;
    private char gender;
    private String face;//random

    String[] boyfaces = {"handsome", "hot"};
    String[] girlfaces = {"cute","pretty"};

    public Role(){}

    public Role(String name, int blood, char gender){
        this.name = name;
        this.blood = blood;
        this.gender = gender;
        setFace(gender);
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

    public void setGender(char gender){
        this.gender = gender;
    }

    public char getGender(){
        return gender;
    }

    public void setFace(char gender){
        Random r = new Random();

        if(gender == 'm'){
            //choose one from boyfaces
            int index = r.nextInt(boyfaces.length);
            this.face = boyfaces[index];
        }else if(gender == 'f'){
            //choose one from girlfaces
            int index = r.nextInt(girlfaces.length);
            this.face = girlfaces[index];
        }else{
            this.face = "hot";
        }

    }

    public String getFace(){
        return face;
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

    public void showRoleInfo(){
        System.out.println("Name: " + getName());
        System.out.println("Blood: " + getBlood());
        System.out.println("Gender: " + getGender());
        System.out.println("Face: " + getFace());
    }

}
