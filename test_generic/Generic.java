package test_generic;

import java.util.ArrayList;

public class Generic {
    public static void main(String[] args) {
        ArrayList<Cat> list1 = new ArrayList<>();
        list1.add(new lihuaCat("a",1));
        list1.add(new bosiCat("b",2));

        ArrayList<Dog> list2= new ArrayList<>();
        list2.add(new Husky("c",1));
        list2.add(new Teddy("d",2));

        ArrayList<Animal> list3= new ArrayList<>();
        list3.add(new lihuaCat("f",1));
        list3.add(new Teddy("e",2));

        keepCat(list1);
        keepDog(list2);
        keepPet(list3);
    }

    public static void keepCat(ArrayList<? extends Cat> list){
        for (Cat cat : list) {
            cat.eat();
        }
    }

    public static void keepDog(ArrayList<? extends Dog> list){
        for (Dog dog : list) {
            dog.eat();
        }
    }

    public static void keepPet(ArrayList<? extends Animal> list){
        for (Animal animal : list) {
            animal.eat();
        }
    }
}
