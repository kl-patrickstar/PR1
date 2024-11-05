import java.util.Scanner;

public class tabladeunvalor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Geben Sie einen Wert zwsichen 1 und 10 ein: ");
        int wert = sc.nextInt();

        multiplikation(wert);

    }

    public static void multiplikation(int wert) {

        for (int i = 0; i < 1; i++) {

            for (int j = 0; j <= 10; j++) {

                System.out.print(j * wert + " ");
            }

        }

    }
}
