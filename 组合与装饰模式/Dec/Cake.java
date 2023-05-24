package Dec;

public class Cake implements IBirthdayCake{
    public Cake(){
        System.out.println("Cake blank was Created");
    }
    @Override
    public void Show() {
        System.out.println("Cake Blank");
    }
}
