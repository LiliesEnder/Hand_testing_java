import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Integer[] src = new Integer[]{1,2,3,4,4,4,5,6,1,2,3,5,7,9,90,8,1,2,3,3,4};
        HashSet<Integer> unique = new HashSet<>(Arrays.asList(src));
        System.out.println("Unique: " + unique.size());
    }
}