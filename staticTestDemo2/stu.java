package staticTestDemo2;

public class stu {
    private String name;
    private int age;
    private String gender;

    public stu(){}

    public stu(String name, int age,String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
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
    public void setGender(String gender){
        this.gender = gender;
    }

    public String setGender(){
        return this.gender;
    }
}
