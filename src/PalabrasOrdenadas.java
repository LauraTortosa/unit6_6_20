import java.util.Arrays;
import java.util.Scanner;

public class PalabrasOrdenadas {
    public static void main(String[] args) {
        String frase;

        System.out.print("Escribe una frase (sustituye los espacios por comas , : ");
        frase = new Scanner (System.in).next();

        String[] palabras = frase.split(",");

        Arrays.sort(palabras);
        for (int i = 0; i < palabras.length; i++) {
            System.out.println(palabras[i] + " ");
        }
    }
}
