public class ClientClass {
    public static void main(String[] args) {
        MyFruit fru1=new Apple();
        MyFruit Fru2=new Banana();
        MyFruitStore mfs1=MyFruitStore.Getfruitstore();
        mfs1.Add(1,fru1);
        mfs1.Add(2,fru1);
        mfs1.Add(3,new Apple());
        mfs1.Add(4,new Banana());
        MyFruitStore mfs2=MyFruitStore.Getfruitstore();
        InewJuicer newJuicer=mew Adapter();
        System.out.println(newJuicer.newPort(mfs1.Get(1),mfs1.Get(3) ));

        MyFruit fru=(MyFruit)mfs2.Get(4);
       /* MyFruitStore.Add(1,fru1);
        MyFruitStore.Add(3,new Apple());
        MyFruitStore.Add(4,new Banana());
        MyFruitStore fru=(MyFruit)MyFruitStore.Get("3");*/
        fru.Display();
        System.out.println("mfs1:"+mfs1.toString());
        System.out.println("mfs2:"+mfs2.toString());
        /*MyFruit fru2=fru1;
        //MyFruit fru2=(Apple) fru1.clone();
        fru1.Display();
        fru2.Display();
        System.out.println("fru1:"+fru1.hashCode());
        System.out.println("fru2:"+fru2.hashCode());
        System.out.println("fru1:"+fru1.toString());
        System.out.println("fru2:"+fru2.toString());
        System.out.println(fru1.equals(fru2));*/
    }
    public String factrory(String fruitname){

    }
}
