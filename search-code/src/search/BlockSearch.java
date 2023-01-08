package search;

public class BlockSearch {
    public static void main(String[] args) {
        int[] arr ={16,5,9,12,21,18,
                    32,23,37,26,45,34,
                    50,48,61,52,73,66};
        Block b1 = new Block(21,0,5);
        Block b2 = new Block(45,6,11);
        Block b3 = new Block(73,12,17);

        Block[] barr = {b1,b2,b3};
        int num = 18;
        int index = blockSearch(barr, arr,num);
        System.out.println(index);
    }

    private static int blockSearch(Block[] barr, int[] arr, int num) {
        int block = getBlock(barr, num);
        if(block == -1){
            return -1;
        }

        int startIdx = barr[block].getMinIdx();
        int endIdx = barr[block].getMaxIdx();

        for (int i = startIdx; i <= endIdx; i++) {
            if(arr[i] == num){
                return i;
            }

        }
        return -1;
    }


    private static int getBlock(Block[] barr, int num){
        for (int i = 0; i < barr.length; i++) {
            if(num<=barr[i].getMax()){
                return i;
            }
        }
        return -1;
    }

}
