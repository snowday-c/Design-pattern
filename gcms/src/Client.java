import java.sql.SQLOutput;

public class Client {
    public static void main(String[] args) {
        MealBuilder mb=(MealBuilder)XMLUtil.getBean();
        KFCWaiter waiter=new KFCWaiter();
        waiter.setMealBuilder(mb);
        Meal mael= waiter.construct();
        System.out.println("套餐组成：");
        System.out.println(mael.getFood());
        System.out.println(mael.getDrink());
    }
}
