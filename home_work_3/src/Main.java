// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static int number = 5;
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        Main.printIfElse();
        Main.printSwitch();
        Main.printNumberFor();
        Main.printNumberWhile();
    }
    static void printIfElse(){
        if (number == 1){
            System.out.println("one");
        } else if (number == 2){
            System.out.println("two");
        } else if (number == 3){
            System.out.println("three");
        } else if (number == 4){
            System.out.println("four");
        } else if (number == 5){
            System.out.println("five");
        } else if (number == 6){
            System.out.println("six");
        } else if (number == 7){
            System.out.println("seven");
        } else if (number == 8){
            System.out.println("eight");
        } else if (number == 9){
            System.out.println("nine");
        } else if (number == 10){
            System.out.println("ten");
        };
    }
    static void printSwitch(){
        switch (number){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 8:
                System.out.println("eight");
                break;
            case 9:
                System.out.println("nine");
                break;
            case 10:
                System.out.println("ten");
                break;
        }
    }
    static void printNumberFor(){
        for (int i = 100; i < 400; i++) {
            if((i % 7 == 0 || i % 3 == 0) && (i % 9 != 0)){
                System.out.println("Number: " + i);
            }
        }
    }
    static void printNumberWhile(){
        int i = 100;
        while (i < 400){
            if((i % 7 == 0 || i % 3 == 0) && (i % 9 != 0)){
                System.out.println("Number: " + i);
            }
            i++;
        }
    }

}