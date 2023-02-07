import java.util.Scanner;

/*
1. Escriu un programa per calcular la longitud d'una cadena i que ho mostri per
pantalla.
 */
public class Exercici1 {
    public static void main(String[] args) {
        Scanner llegir = new Scanner(System.in);
        System.out.println("Escriu una frase");
        String cadena = llegir.nextLine();

        System.out.println("Has escrit: " + cadena);

        int numCaracters = cadena.length();
        System.out.println("La teva frase té " + numCaracters + " caràcters");
    }
}