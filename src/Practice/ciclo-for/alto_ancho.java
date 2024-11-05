import java.util.Scanner;

public class alto_ancho {

    public static void main(String[] args) {

        // Ejercicio desplegar alto y ancho a partir de la entrada de dos digitos
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un alto: ");
        int alto = sc.nextInt();

        System.out.print("Ingresa un ancho: ");
        int ancho = sc.nextInt();

        alto_ancho(alto, ancho);

    }

    public static void alto_ancho(int alto, int ancho) {

        for (int i = 0; i < alto; i++) {

            for (int j = 0; j < ancho; j++) {
                System.out.print("x");
            }

            System.out.println();
        }

    }

}
