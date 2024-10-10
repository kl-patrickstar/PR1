package Assigment_002;

public class Sum {

    public static void main(String[] args) {

        int n = 4;
        int s = 0;
        int i = 1;

        while (i <= n) {
            s = s + i;
            i = i + 1;
        }

        System.out.println("Wert von s: " + s + ", Wert von i: " + i);

    }

}