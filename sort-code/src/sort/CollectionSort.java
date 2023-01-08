package sort;

public class CollectionSort {
    public static void main(String[] args) {
        int[] arr = {2,4,5,3,1};
        int[] sortedarr = collectionSort(arr);
        for (int i = 0; i < sortedarr.length; i++) {
            System.out.print(sortedarr[i]);
        }
    }

    private static int[] collectionSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    int tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
        }
        return arr;
    }
}
