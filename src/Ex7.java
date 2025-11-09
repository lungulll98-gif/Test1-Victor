import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti numarul dorit: ");
        int numar = scanner.nextInt();

        if(numar % 2 == 1)
            System.out.println("Acest numar este impar");
        else
            System.out.println("Acest numar este par");

    }
}
