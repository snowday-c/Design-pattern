package ObvStock;

import java.util.ArrayList;
import java.util.List;

public class BuyHolder implements IStockHolder{
    private List<AStockPrice> attentionlist;
    private String name;
    public BuyHolder(String name){
        attentionlist=new ArrayList<AStockPrice>();
        this.name=name;
    }

    @Override
    public void update(AStockPrice asp) {
        if (attentionlist.contains(asp)){

            System.out.println(name);

            if (asp.getPrice()-asp.getPrice2()>0){
                System.out.println(asp.code+":");
                System.out.println("原价:"+asp.price+"-现价:");
                System.out.println("涨了，爽");
            }
            else{
                System.out.println(asp.code+":");
                System.out.println("原价:"+asp.price2+"-现价:");
                System.out.println("跌了，哭");
            }
        }
    }

    public void AddHolder(AStockPrice asp){
        attentionlist.add(asp);
        asp.Add(this);
    }

}
