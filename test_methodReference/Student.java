package test_methodReference;

public class Student {
    private String name;
    private int age;

    public Student(){}

    public Student(String name_age){
        this.name = name_age.split(",")[0];
        this.age = Integer.parseInt(name_age.split(",")[1]);
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String rearrange(Student this){
        return this.getName()+"-"+this.getAge();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
