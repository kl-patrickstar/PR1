package Practice;

public class mayor_menor {

    public static void main(String[] args) {

        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        int n3 = Integer.parseInt(args[2]);

        int max = n1;
        int min = n1;

        if (n2 > max) {
            max = n2;
        } else {
            min = n2;
        }

    }

}
