package staticTestDemo1;

public class ArrUtil {
    private ArrUtil(){}
    
    public static String printArr(int[] arr){
        int arrlen = arr.length;
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arrlen; i++) {
            if(i==arrlen-1){
                sb.append(arr[i]);
            }else{
                sb.append(arr[i]).append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static double getAverage(double[] arr){
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        sum = sum/arr.length;
        return sum;
    }
}
