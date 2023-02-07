import java.util.Scanner;

public class Exercici2 {
    public static void main(String[] args) {
        Scanner llegir = new Scanner(System.in);
        String paraula;
        int count = 0;

        System.out.println("Hola escriu una paraula...");
        paraula = llegir.next();
        llegir.nextLine();

        for (int i = 0; i < paraula.length(); i++) {
            count = 0;
            if (paraula.indexOf(paraula.charAt(i)) == i) {
                for (int j = 0; j < paraula.length(); j++) {
                    if (paraula.charAt(i) == paraula.charAt(j)) {
                        count++;
                    }
                }
                System.out.println("La lletra "+paraula.charAt(i)+" apareix "+count+" cops");
            }
        }

    }
}