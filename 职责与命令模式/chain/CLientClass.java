package chain;

import java.util.Random;

public class CLientClass {
    public static void main(String[] args) {
        AbstractFruitSort Bfs,Mfs,Sfs;
        Bfs=new BigFruitSorting(9);
        Mfs=new MidFruitSorting(5);
        Sfs=new SmallFruitSorting(2);

        Bfs.setNextFruitSort(Mfs);
        Mfs.setNextFruitSort(Sfs);

        Random rm=new Random();
        for (int i=0;i<1000;i++){
            int weight=rm.nextInt(10);
            Bfs.sentFruit(weight,"橙子");
        }
        Bfs.getFruitBox();
        Mfs.getFruitBox();
        Sfs.getFruitBox();
    }
}
