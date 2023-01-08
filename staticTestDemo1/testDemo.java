package staticTestDemo1;

public class testDemo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        String parr = ArrUtil.printArr(arr);
        System.out.println(parr);

        double[] arr2 = {1.5,2.5,3.5,1.5};
        System.out.println(ArrUtil.getAverage(arr2));
    }
}
