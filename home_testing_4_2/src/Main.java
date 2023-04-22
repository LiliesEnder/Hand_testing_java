import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Shop shop = new Shop();
        Product[] chiper = shop.getProducts(3);
        System.out.println("chiper: " + Arrays.toString(chiper));
        System.out.println("chipest: " + shop.findTheCheapest());
        System.out.println("Have P: " + shop.containsProduct("P"));
    }
}