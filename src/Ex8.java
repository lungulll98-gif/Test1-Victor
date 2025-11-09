import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti ora dorita (0-23): ");
        int ora = scanner.nextInt();

        String perioada = "";

        switch (ora) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                perioada = "Morning";
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                perioada = "Afternoon";
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                perioada = "Evening";
                break;
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                perioada = "Night";
                break;
            default:
                perioada = "Ora invalida";
        }

        System.out.println("Ora aleasa este in: " + perioada + ".");
    }
}
