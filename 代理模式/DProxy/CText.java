package DProxy;

public class CText implements ITextInterface{
    @Override
    public void SendMessage(String mes) {
        for (int i=5;i>=0;i--){
            System.out.println(mes+"怪物的出现还有"+i+"秒");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(mes+"怪物出来了！");
    }
}
