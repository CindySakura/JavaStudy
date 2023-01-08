package test_methodReference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Function;
import java.util.stream.Stream;

public class methodReference {
    public static void main(String[] args) {
        //exercise 1:
        ArrayList<String> arr = new ArrayList<>();
        Collections.addAll(arr,"a,1","b,2","c,3");

        Student[] students = arr.stream().map(Student::new).toArray(Student[]::new);
        System.out.println(Arrays.toString(students));

        //exercise 2:
        ArrayList<Student> arr1 = new ArrayList<>();
        Collections.addAll(arr1,students);

        String[] names = arr1.stream().map(Student::getName).toArray(String[]::new);
        System.out.println(Arrays.toString(names));

        //exercise 3:
        String[] nameAges = arr1.stream().map(Student::rearrange).toArray(String[]::new);
        System.out.println(Arrays.toString(nameAges));
    }
}
