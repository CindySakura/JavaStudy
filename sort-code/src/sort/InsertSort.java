package sort;

public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
        int[] result = insertSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    private static int[] insertSort(int[] arr) {
        int i;
        for (i = 0; i < arr.length-1; i++) {
            if(arr[i] > arr[i+1]){
                break;
            }
        }


        for (int j = i+1; j < arr.length; j++) {
            for (int x = j-1; x >=1; x--) {
                if(arr[x]<arr[x-1]){
                    int tmp = arr[x];
                    arr[x] = arr[x-1];
                    arr[x-1] = tmp;
                }
            }
        }
        return arr;
    }

}
