package Ada;

import pro.MyFruit;

public class Adapter  implements InewJuicer{
    private OldJuicer oldJuicer;
    public String newport(MyFruit fruit1,MyFruit fruit2) {
        oldJuicerc = new Ada.OldJuicer();
        String str="混合果汁:"+oldJuicer.onePort(fruit1);
        str+=oldJuicer.onePort(fruit2);
        return str;
    }
}
