public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        try {
            TException.range(-1, 20);
        } catch (RuntimeException e){
            System.out.println("Exception is caught");
        }
        try {
            TException.range(4, 5);
            System.out.println("No exceptions");
        } catch (RuntimeException e){
            System.out.println("Exception is caught");
        }
    }
}