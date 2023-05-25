package chain;

public class MidFruitSorting extends AbstractFruitSort{

    public MidFruitSorting(int weigth){
        super(weigth);
    }
    @Override
    protected void pushBox(String fruit) {
        fruitBox.add("水果罐头:"+fruit);
    }
}
