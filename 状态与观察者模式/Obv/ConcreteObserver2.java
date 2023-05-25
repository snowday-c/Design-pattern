package Obv;

public class ConcreteObserver2 implements ObserverO{
    @Override
    public void response() {
        System.out.println("目标改变了，2的反应");
    }
}
