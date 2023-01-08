package sort;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {6,1,2,7,9,3,4,5,10,8,11,12,15,14,13,20,19,16};

        quickSort(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void quickSort(int[] arr,int i, int j) {
        int start = i;
        int end = j;
        if(start>=end){
            return;
        }
        int pivot = arr[i];

        while(start < end){
            while(start<end && arr[end]>=pivot){
                end -= 1;
            }
            while(start<end && arr[start]<=pivot){
                start += 1;
            }
            int tmp = arr[end];
            arr[end] = arr[start];
            arr[start] = tmp;

        }
        arr[i] =  arr[start];
        arr[start] = pivot;

        quickSort(arr,i,start-1);
        quickSort(arr,start+1,j);
    }
}
