package Assigment_004;

public class Chairs {

    public static void main(String[] args) {

        // Definir los cinco "sillas" con los valores iniciales
        int a = 1; // Person a
        int b = 2; // Person b
        int c = 3; // Person c
        int d = 4; // Person d
        int e = 5; // Person e

        // Guardar los valores originales para verificar el ciclo
        int originalA = a;

        do {
            // Imprimir el estado actual de los "sillas"
            System.out.println("Stühle: a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + ", e=" + e);

            // Guardar el valor de "e" temporalmente para hacer la rotación
            int temp = e;

            // Realizar la rotación de las "personas" a la derecha
            e = d;
            d = c;
            c = b;
            b = a;
            a = temp;

        } while (!(a == originalA));
    }
}
