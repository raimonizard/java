package utils;

import java.util.Scanner;

/**
 * Classe Utilitats per a ser usada amb els mètodes statics.
 * @author Raimon Izard
 */
public final class Utilities {
    // L'atribut Scanner no ha de poder ser accedit des de fora
    private static final Scanner llegir = new Scanner(System.in);

    /**
     * El constructor private no permet crear objectes de la classe.
     * Tots els seus mètodes hauràn de ser a nivell de classe (static)
     */
    private Utilities(){};

    /**
     * Mètode per a llegir enters amb control de tipatge de dades
     * @param missatge Missatge a mostrar a l'usuari
     * @return int capturat per teclat
     */
    public static int llegirInt(String missatge) {
        int x = 0;
        boolean valorCorrecte = false;

        do{
            System.out.println(missatge);
            valorCorrecte = llegir.hasNextInt();

            if (!valorCorrecte){
                System.out.println("ERROR: Valor no enter.");
                llegir.nextLine();
            }else{ // Tinc un enter
                x = llegir.nextInt();
                llegir.nextLine();
            }
        }while(!valorCorrecte);

        return x;
    }

    /**
     * Mètode per a llegir enters amb control de tipatge de dades i domini de valors
     * @param missatge Missatge a mostrar a l'usuari
     * @param min Valor mínim acceptat
     * @param max Valor màxim acceptat
     * @return int capturat per teclat
     */
    public static int llegirInt(String missatge, int min, int max) {
        int x = 0;
        boolean valorCorrecte = false;

        do{
            System.out.println(missatge);
            valorCorrecte = llegir.hasNextInt();

            if (!valorCorrecte){
                System.out.println("ERROR: Valor no enter.");
                llegir.nextLine();
            }else{ // Tinc un enter
                x = llegir.nextInt();
                llegir.nextLine();
                if (x < min || x > max){
                    System.out.println("Opció no vàlida");
                    valorCorrecte = false;
                }
            }
        }while(!valorCorrecte);

        return x;
    }

    /**
     * Mètode per a llegir frases
     * @param missatge Missatge a mostrar a l'usuari
     * @return retorna una frase String
     */
    public static String llegirString(String missatge){
        System.out.println(missatge);
        return llegir.nextLine();
    }
}
