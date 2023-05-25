package command;

import java.util.HashMap;

public class Older {

    private int id;
    private HashMap<String,Integer> fruitmap;
    public Older(){
        fruitmap=new HashMap<String,Integer>();
    }
    public int getId() {
        return 0;
    }
    public void setId(int id){
        this.id=id;
    }
    public HashMap<String,Integer> getFruitmap(){
        return fruitmap;
    }
    public void setFruitmap(String fruitkind,int quantity){
        this.fruitmap.put(fruitkind,quantity);
    }
}
