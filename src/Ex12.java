import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti varsta: ");
        int varsta = scanner.nextInt();

        if (varsta <= 0 || varsta > 135) {
            System.out.println("Varsta invalida! Introduceti o valoare intre 1 si 135.");
        } else if (varsta < 12) {
            System.out.println("Esti copil.");
        } else if (varsta < 18) {
            System.out.println("Esti adolescent.");
        } else {
            System.out.println("Esti adult.");
        }
    }
}
