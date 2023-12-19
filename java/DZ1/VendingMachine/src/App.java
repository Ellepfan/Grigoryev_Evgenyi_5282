import java.util.ArrayList;
import java.util.List;

import Domen.Bottle;
import Domen.HotDrink;
import Domen.Product;
import Services.CoinDispenser;
import Services.Display;
import Services.Holder;
import Services.VendingMachine;

public class App {
    public static void main(String[] args) throws Exception {

        List<Product> assort = new ArrayList<>();
        Product item1 = new Product(100, 1, "Русская Картошка", 100);
        Product item2 = new Product(50, 2, "Кола", 101);
        Product item3 = new Bottle(150, 3, "Минеральная вода", 102, (float) 1.5);
        Product item4 = new HotDrink(90, 4, "Кофе", 103, 90);
        Product item5 = new HotDrink(60, 5, "Молоко", 104, 60);
        Product item6 = new HotDrink(50, 6, "Чай", 105, 80);
        Product item7 = new HotDrink(120, 7, "Капучино", 106, 90);
        assort.add(item1);
        assort.add(item2);
        assort.add(item3);
        assort.add(item4);
        assort.add(item5);
        assort.add(item6);
        assort.add(item7);

        Holder hold1 = new Holder(4, 4);
        CoinDispenser coinDesp = new CoinDispenser(0);
        Display disp = new Display();

        VendingMachine venMachine = new VendingMachine(hold1, coinDesp, assort, disp);

        for (Product prod : venMachine.getProducts()) {
            System.out.println(prod);
        }

        MainFrame myFrame = new MainFrame();
        myFrame.initialize();
    }
}
