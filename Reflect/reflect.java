package Reflect;

import java.lang.reflect.Constructor;
import java.util.Arrays;

public class reflect {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        Class clazz = Class.forName("Reflect.Person");
        System.out.println(clazz);
        Constructor constructor = clazz.getConstructor(String.class);
        System.out.println(constructor);
        System.out.println(Arrays.toString(clazz.getDeclaredFields()));
    }

}
