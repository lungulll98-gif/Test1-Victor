import java.util.Arrays;

public class Ex15 {
    public static void main(String[] args) {

        byte[] numere = {5, 10, 15, 20, 25, 30};
        System.out.println("Array initial: " + Arrays.toString(numere));
        numere[4] = 99;
        System.out.println("Array dupa modificare: " + Arrays.toString(numere));
    }
}
