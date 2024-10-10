package Assigment_002;

/**
 * Exchange
 */
public class Exchange {

    public static void main(String[] args) {

        int a = 1234;
        int b = 99;
        int t = a;
        a = b;
        b = t;

        System.out.println("A: " + a + ", B: " + b + ", T: " + t);
    }

}