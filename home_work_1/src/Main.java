// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        String name = "Lily";
        double start_money = 10000.0;
        int years = 3;
        double rate = 3.5;
        double finish_money = start_money * (1.0 + rate / 100.0 * (double)(years));
        System.out.println("Hello, " + name + ". Your final balance: " + finish_money + " rubles");
    }
}