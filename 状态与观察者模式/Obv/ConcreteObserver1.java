package Obv;

public class ConcreteObserver1 implements ObserverO{
    @Override
    public void response() {
        System.out.println("目标改变了，1的反应");
    }
}
