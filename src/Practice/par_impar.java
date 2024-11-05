public class par_impar {

    public static void main(String[] args) {

        int number = Integer.parseInt(args[0]);

        if (number >= 0) {
            if (number % 2 != 0) {
                System.out.println("Es impar");
            } else {
                System.out.println("Es par");
            }
        } else {
            System.out.println("Digite un numero positivo");
        }

    }

}
