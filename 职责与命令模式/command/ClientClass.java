package command;

public class ClientClass {
    public static void main(String[] args) {
        Older older1=new Older();
        older1.setId(1);
        older1.setFruitmap("橙子",1);
        older1.setFruitmap("梨子",2);
        older1.setFruitmap("苹果",3);

        Older older2=new Older();
        older2.setId(2);
        older2.setFruitmap("香蕉",4);
        older2.setFruitmap("葡萄",2);
        older2.setFruitmap("西红柿",3);

        Operator op=new Operator();
        OlderCommand cmd1=new OlderCommand(op,older1);
        OlderCommand cmd2=new OlderCommand(op,older2);

        WaitorInvoker waitor=new WaitorInvoker();
        waitor.SetCommand(cmd1);
        waitor.SetCommand(cmd2);

        waitor.OrderUp();
    }
}
