package ObvStock;

import java.util.AbstractList;
import java.util.List;

public abstract class AStockPrice {
    protected float price,price2;
    protected String code;
    protected List<IStockHolder> stockHolderList;

    public void Add(IStockHolder Ish){
        stockHolderList.add(Ish);
    }
    public void remove(IStockHolder Ish){
        stockHolderList.remove(Ish);
    }
    public AStockPrice(String code){
        this.code=code;
        price=price2=0;
        stockHolderList=new AbstractList<IStockHolder>();
    }

    public float getPrice() {
        return price;
    }
    public void setPrice(float price){
        this.price=price;
        notifyHolder();
    }
    abstract protected void notifyHolder();

    public int hashCode(){
        final int prime=31;
        int resule=1;
        resule = prime * resule + ((code==null));
        return resule;
    }
    public boolean equals(Object obj){
        if (this==obj)
            return true;
        if (obj==null)
            return false;
        AStockPrice other=(AStockPrice) obj;
        if (code==null){
            if (other.code!=null)
                return false;
        }else if (!code.equals(other.code))
            return false;
        return true;
    }
    public float getPrice2(){
        return price2;
    }
    public void setPrice2(float price2){
        this.price2=price2;
    }
}
