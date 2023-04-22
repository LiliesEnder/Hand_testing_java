public class TException {
    public static int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
    public static void range(int left, int right){
        if(left < 0 | right >= arr.length | left > right){
            throw new RuntimeException("Error on arguments");
        }
        StringBuilder s = new StringBuilder();
        for (int i = left; i <= right; i++) {
            s.append(arr[i]).append(", ");
        }
        System.out.println(s);
    }
}
