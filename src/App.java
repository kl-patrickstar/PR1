import java.net.InetAddress;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Geben Sie eine IP Adresse ein: ");
        String ipadresse = sc.nextLine();

        System.out.println("Die folgende IP Adresse: " + ipadresse + " wird gerade analzyiert.");

        try {
            InetAddress inet = InetAddress.getByName(ipadresse);
            boolean status = inet.isReachable(5000);

        } catch (Exception e) {
            // TODO: handle exception
        }

        sc.close();
    }
}
