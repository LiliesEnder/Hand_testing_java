import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        double A = 1.0;
        double B = 2.0;
        double C = 3.0;

        double D = B * B - 4 * A * C;
        if (D > 0.0){
           System.out.println("x1 = " + (-B - Math.sqrt(D))/(2*A));
           System.out.println("x2 = " + (-B + Math.sqrt(D))/(2*A));
        } else if (D == 0.0){
            System.out.println("x1 = " + -B/(2*A));
        } else {
            System.out.println("No solutions");
        }
        sorting();
    }

    public static void sorting(){
        int unsorted[] = new int[]{3,5,3,5,6,7,8,4,7,9,1,3,0,10,2,3,4,5,6,7,1,2,3,7};
        System.out.println("Unsorted: " + Arrays.toString(unsorted));
        int tmp = 0;
        boolean sorted = false;
        for (int j = 0; j < unsorted.length - 1; j++) {
            sorted = true;
            for (int i = 0; i < unsorted.length - j - 1; i++) {
                if (unsorted[i] > unsorted[i+1]){
                    sorted = false;
                    tmp = unsorted[i + 1];
                    unsorted[i+1] = unsorted[i];
                    unsorted[i] = tmp;
                }
            }
            if(sorted){
                break;
            }
        }
        System.out.println("Sorted: " + Arrays.toString(unsorted));
    }
}