package Str;

public class ClientClass {
    public static void main(String[] args) {
        Chef chef=new Chef();
        ICutFruit cut=new HoriBlade();
        chef.setCutmethod(cut);
        chef.CutFruit("橙子");

    }
}
