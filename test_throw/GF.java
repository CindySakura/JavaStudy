package test_throw;

public class GF {
    private String name;
    private int age;

    public GF(){}

    public GF(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        int length = name.length();
        if(length < 3 || length > 10){
            throw new NameFormatException("name length should be between 3 and 10");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 18 || age > 40){
            throw new AgeOutofBoundsException("age should be between 18 and 40");
        }
        this.age = age;
    }

    @Override
    public String toString(){
        return this.name + " " + this.age;
    }
}
