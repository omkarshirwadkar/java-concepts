public class TernaryOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int max = a > b ? a : b;
        max = max > c ? max : c;
        System.out.println(max);
    }
}
