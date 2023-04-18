import java.util.function.Consumer;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static int sum = 0;
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        sum += 4; //Ilya

        sum += askAnton();
        sum += askKatya();
        sum += askDima();

        System.out.println("Apple: " + sum);
        Method2.main();
    }
    static int askKatya(){
        return 3;
    }
    static int askAnton(){
        return 4;
    }
    static int askDima(){
        return 1;
    }
}

