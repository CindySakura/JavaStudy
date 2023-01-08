package test4;

import java.util.Scanner;

public class carTest {
    public static void main(String[] args) {
        Car[] arr = new Car[3];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            Car c = new Car();
            System.out.println("type in the brand");
            String brand = sc.next();
            c.setBrand(brand);

            System.out.println("type in the price");
            int price = sc.nextInt();
            c.setPrice(price);

            System.out.println("type in the color");
            String color = sc.next();
            c.setColor(color);

            arr[i] = c;
        }
        double sumPrice = 0;
        for (int i = 0; i < arr.length; i++) {
            Car car = arr[i];
            System.out.println(car.getBrand()+ ' ' + car.getColor() + ' '+ car.getPrice());
            sumPrice += car.getPrice();
        }
        System.out.println((sumPrice*1.0)/arr.length);
    }
}
