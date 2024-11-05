package Assigment_004;

public class BinomialCoefficient {
    public static void main(String[] args) {
        // Parse the number of lines from the command line argument
        int n = Integer.parseInt(args[0]);

        // Loop through each line
        for (int i = 0; i < n; i++) {

            // Representa cada numero en una fila. Aqui guardamos el valor actual en una
            // posicion especifica de la fila del triangulo
            int number = 1;

            // Loop through each position in the line
            for (int j = 0; j <= i; j++) {
                // Print the current number followed by a space
                System.out.print(number + " ");

                // Calculate the next number using the formula:
                // number = number * (i - j) / (j + 1);
                number = number * (i - j) / (j + 1);
            }
            // Move to the next line after finishing the current line
            System.out.println();
        }
    }
}
