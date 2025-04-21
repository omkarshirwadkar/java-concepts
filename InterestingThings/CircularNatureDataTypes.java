public class CircularNatureDataTypes {
    public static void main(String[] args) {
        // byte short int long are circular in nature i.e., if they exceed the max value they will start from the min value
        // byte and short can perform the circular nature while initialization
        // long and int do not support circular nature while initialization
        byte c = (byte) 128;
        System.out.println(c); // --> -128
        short s = (short) 32768;
        System.out.println(s); // --> -32768

        //This Works and displays the min value
        int a = (int) 2147483647;
        a += 1;
        long b = (long) 9223372036854775807L;
        b += 1;
        //This does not work
        // int a = (int)2147483648;
        // long b = (long)9223372036854775808L;
        System.out.println(a); // --> -2147483648
        System.out.println(b); // --> -9223372036854775808
    }
}
