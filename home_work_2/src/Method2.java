public class Method2 {
    static int sum = 0;
    public static void main(){
        sum += 4;//Ilya
        askKatya();
        askAnton();
        askDima();
        System.out.println("Apple method2: " + sum);
    }

    static void askKatya(){
        sum += 3;
    }
    static void askAnton(){
        sum +=  4;
    }
    static void askDima(){
        sum +=  1;
    }
}
