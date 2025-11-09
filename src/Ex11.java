import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti un sir de caractere: ");
        String text = scanner.nextLine();

        int lungime = text.length();
        int indiceMaxim = lungime - 1;

        System.out.println("Numarul total de caractere: " + lungime);
        System.out.println("Indicele maxim este: " + indiceMaxim);
    }
}
