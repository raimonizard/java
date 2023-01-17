import java.util.Scanner;

/*
TA02: Comprovar parell o senar
Usant mètodes de la programació modular, desenvolupeu un programa en Java capaç de comprovar si donat un número enter, aquest és parell o senar.
Feu com a mínim els següents mètodes:
    1. Un mètode per obtenir un int amb control d'errors
    2. Un mètode que comprovi si el número introduït és parell (retorna True) o senar (retorna False)
    3. El mètode del Main principal que crida i usa als dos mètodes anteriors
Entregueu el fitxer .java amb la nomenclatura CognomNom_ParellSenar.java
 */
public class ParellSenar {
    /**
     * Mètode main principal per on comença l'execució del programa
     * @param args
     */
    public static void main(String[] args) {
        final String MENU_PRINCIPAL = "Escull una opció: "
                                    +"\n\t1. Comprovar parell | senar"
                                    +"\n\t2. Sortir";
        System.out.println("Benvingut/da al programa");
        int opcio;
        do {
            opcio = llegirInt(MENU_PRINCIPAL);
            switch (opcio) {
                case 1:
                    int numero = llegirInt("Escriu ún número a comprovar: ");

                    if (comprovarParell(numero)){
                        System.out.println("El valor introduït és parell");
                    }else{
                        System.out.println("El valor introduït és senar");
                    }
                    break;
                case 2:
                    System.out.println("Adiós bebe.");
                    break;
                default:
                    System.out.println("Opció no existent");
                    break;
            }
        }while (opcio != 2);
    }

    /**
     * Mètode per comprovar si un valor enter és parell o senar
     * @author Raimon Izard
     * @version 1.0
     * @param numero Input de valor enter
     * @return Retorna un boolean: true si parell | false si senar
     */
    public static boolean comprovarParell(int numero) {
        return numero % 2 == 0;
    }

    /**
     * Mètode per llegir un enter de teclat amb control d'errors i missatge parametritzat
     * @param menuPrincipal Missatge a mostrar a l'usuari
     * @return Retorna un int llegit amb control d'errors
     */
    public static int llegirInt(String menuPrincipal) {
        int valorLlegit = 0;
        boolean tipusCorrecte = false;
        Scanner llegir = new Scanner(System.in);

        do{
            System.out.println(menuPrincipal);
            tipusCorrecte = llegir.hasNextInt();

            if (!tipusCorrecte){
                System.out.println("ERROR: Tipus de dades no acceptat");
            }else{
                valorLlegit = llegir.nextInt();
            }
            llegir.nextLine();
        }while (!tipusCorrecte);


        return valorLlegit;
    }
}