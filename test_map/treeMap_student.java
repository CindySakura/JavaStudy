package test_map;

public class treeMap_student implements Comparable<treeMap_student>{
    private String name;
    private int age;

    public treeMap_student(){}

    public treeMap_student(String name, int age) {
        this.name = name;
        this.age = age;
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
    public int compareTo(treeMap_student o) {
        //this: to be input
        //o: already exists
        int i = this.age - o.getAge();
        i = i == 0 ? this.name.compareTo(o.getName()) :i ;
        return i;
    }

    @Override
    public String toString() {
        return "treeMap_student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
