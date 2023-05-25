package command;

import jdk.incubator.vector.VectorOperators;

public class OlderCommand implements Command{
    private Operator receiver;
    private Older order;
    public OlderCommand(Operator receiver,Older older){
        this.receiver=receiver;
        this.order=older;
    }
    @Override
    public void execute() {
        System.out.println(order.getId()+"号顾客的成品");
        receiver.MarkFruit(order);
    }
}
