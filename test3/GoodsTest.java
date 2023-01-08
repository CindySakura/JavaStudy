package test3;

public class GoodsTest {
    public static void main(String[] args) {
        Goods[] arr = new Goods[3];

        //create 3 goods objects
        Goods g1 = new Goods("001","p40",5999.0,100);
        Goods g2 = new Goods("002","cup",227.0, 50);
        Goods g3 = new Goods("003","food", 12.7,70);

        //put goods into array
        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;

        for (int i = 0; i <arr.length; i++){
            Goods goods = arr[i];
            System.out.println(goods.getId()+", " +goods.getName() + ", " + goods.getPrice() + ", " + goods.getCount()) ;
        }
    }
}
