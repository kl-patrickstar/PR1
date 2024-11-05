
public class tablaMultiplcacion1al10 {

    public static void main(String[] args) {

        int anzahlTabellen = Integer.parseInt(args[0]);

        for (int i = 1; i < anzahlTabellen; i++) {
            System.out.print("Die Muktipülikationstabelle von " + i + " ist: ");
            for (int j = 0; j <= 10; j++) {

                System.out.print(+j + "*" + i + ": " + (i * j) + " |");
            }
            System.out.println();
        }

    }

}
