package sort;

public class Bubblesort {
    public static void main(String[] args) {
        int[] arr = {2,4,5,3,1};
        int[] sortedarr = bubblesort(arr);
        for (int i = 0; i < sortedarr.length; i++) {
            System.out.print(sortedarr[i]);
        }
    }
    public static int[] bubblesort(int[] arr){
        int len = arr.length;
        int tmp;
        for (int i = len-1; i >=0; i--) {
            for (int j = 0; j < i; j++) {
                if(arr[j] > arr[j+1]){
                    tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        return arr;
    }
}
