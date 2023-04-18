// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    static int melon = 10;
    static int watermelon = 10;
    static double melon_price = 0.0;
    static double watermelon_price = 0.0;
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
    }
    public static void sellWatermelon(int x){
        watermelon -= x;
    }
    public static void sellMelon(int y){
        melon -= y;
    }
    public static void sell(int x_watermelon, int y_melom){
        Main.sellWatermelon(x_watermelon);
        Main.sellMelon(y_melom);
    }
    public static void setPriceWatermelon(double a){
        watermelon_price = a;
    }
    public static void setPriceMelon(double b){
        melon_price = b;
    }
    public static int productAmount(){
        return melon + watermelon;
    }
    public static double price(int x_watermelon, int y_melom){
        return watermelon_price * (double)x_watermelon + melon_price *(double) y_melom;
    }
}