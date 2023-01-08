package test_map;

import java.util.Objects;

public class hashMap_student {
    private String name;
    private int age;
    private String home;


    public hashMap_student(){}

    public hashMap_student(String name, int age,String home) {
        this.name = name;
        this.age = age;
        this.home = home;
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

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        hashMap_student that = (hashMap_student) o;
        return age == that.age && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "hashMap_student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
