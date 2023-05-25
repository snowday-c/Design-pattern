package chain;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractFruitSort {
    private int weight;
    protected List<String> fruitBox;
    private AbstractFruitSort nextFruitSort;
    public void getFruitBox(){
        System.out.println("Weight:"+weight);
        System.out.println("个数:"+fruitBox.size());
        for (String t:fruitBox){
            System.out.println(t+",");
        }
        System.out.println(" ");
    }
    public AbstractFruitSort(int weight){
        this.weight=weight;
        fruitBox=new ArrayList<String>();
    }
    public void setNextFruitSort(AbstractFruitSort nextFruitSort){
        this.nextFruitSort=nextFruitSort;
    }
    public void sentFruit(int weight,String fruit){
        if (this.weight<=weight)
            pushBox(fruit);
        else
            if (nextFruitSort!=null)
                nextFruitSort.sentFruit(weight,fruit);
    }

    abstract protected void pushBox(String fruit) ;
}
