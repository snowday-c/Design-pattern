package Dec;

public class ClientClass  {
    public static void main(String[] args) {


        IBirthdayCake birthdayCake = new Cake();
        birthdayCake.Show();
        Cream cream = new Cream(birthdayCake);
        cream.PutCream();
        //cream.Show;
        Fruit fruit = new Fruit(cream);
        fruit.PutFruit();
        fruit.Show();
    }
}

