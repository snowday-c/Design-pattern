package chain;

public class SmallFruitSorting extends AbstractFruitSort{

    public SmallFruitSorting(int weigth){
        super(weigth);
    }
    @Override
    protected void pushBox(String fruit) {
        fruitBox.add("打果汁:"+fruit);
    }
}
