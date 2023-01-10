import java.util.Scanner;

public class DemoMethodsHelloWorld {
    /**
     * Mètode main del projecte
     * @param args
     */
    public static void main(String[] args) {
        String nom = demanarNom();
        ferSalutacio(nom);
    }

    /**
     * Imprimeix per pantalla una salutació personalitzada
     * @param nom
     */
    private static void ferSalutacio(String nom) {
        System.out.println("Hola " + nom);
    }

    /**
     * Aquest mètode serveix per demanar un String per teclat i retornar-lo
     * @return nomPersona de tipus String
     */
    public static String demanarNom() {
        Scanner llegir = new Scanner(System.in);
        boolean nomAcceptat = false;
        String nomPersona = "";

        do {
            System.out.print("Escriu el teu nom: ");
            nomPersona = llegir.nextLine();

            if (nomPersona.equalsIgnoreCase("Caca")) {
                System.out.println("El nom no pot ser 'Caca'");
                nomAcceptat = false;
            }else{
                nomAcceptat = true;
            }
        }while(!nomAcceptat);

        return nomPersona;
    }
}
