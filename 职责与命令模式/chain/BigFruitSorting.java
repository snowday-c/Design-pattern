package chain;

public class BigFruitSorting extends AbstractFruitSort{

    public BigFruitSorting(int weigth){
        super(weigth);
    }
    @Override
    protected void pushBox(String fruit) {
        fruitBox.add("超市:"+fruit);
    }
}
