import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Shop shop = new Shop();
        System.out.println("Phones: " + Arrays.toString(shop.findPhones("melon")));
        System.out.println("Toys: " + Arrays.toString(shop.findToys(7)));
        System.out.println("Food: " + Arrays.toString(shop.findFood(new Date(2023, Calendar.APRIL, 23))));
    }
}