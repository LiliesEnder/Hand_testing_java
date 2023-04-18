// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        int total_seconds = 49690;
        int hours = total_seconds / (60 * 60);
        int minutes = (total_seconds / 60) % 60;
        int seconds = total_seconds % 60;
        System.out.println("CURRENT TIME: hours "+ hours +" minutes "+ minutes+" seconds "+seconds+".");
        Main mn = new Main();
        mn.reverse();
    }
    void reverse(){
        String current_time = "13:48:10";
        String[] parts = current_time.split(":");
        int total_seconds = Integer.parseInt(parts[0]) * 3600 + Integer.parseInt(parts[1]) * 60 + Integer.parseInt(parts[2]);
        System.out.println("Total seconds: " + total_seconds);
    }
}