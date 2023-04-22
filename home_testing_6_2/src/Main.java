import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Shop shop = new Shop(10);
        try {
            shop.addProduct(new Toy("car", 4, 5));
            shop.addProduct(new Phone("smart", 5, "melon"));
            shop.addProduct(new Product("pr", 6));
            shop.addProduct(new Food("cherry", 3, new Date()));
            System.out.println("Shop: " + shop.toString());
            shop.deleteProduct("smart");
            System.out.println("Shop: " + shop.toString());
        } catch (ShopExceptions e){
            System.out.println("Error message: " + e.getMessage());
        }

    }
}