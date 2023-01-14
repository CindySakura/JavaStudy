package test_call;

public class Student {
    private String name;
    private String gender;
    private int age;
    private double prob;

    public Student(){}

    public Student(String name,String gender,int age,double prob){
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.prob = prob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getProb() {
        return prob;
    }

    public void setProb(double prob) {
        this.prob = prob;
    }

    @Override
    public String toString() {
        return name +"-"+ gender +"-"+age + "-"+ prob;
    }
}
