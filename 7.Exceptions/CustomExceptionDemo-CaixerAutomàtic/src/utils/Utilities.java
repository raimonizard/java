package utils;
import java.util.Scanner;

/**
 * Classe estàtica d'utilitats a mode de llibreria per a tots els meus projectes
 */
public final class Utilities {
    private static Scanner llegir = new Scanner(System.in);

    /**
     * Constructor privat que NO permet crear objectes de la classe Utilities
     */
    private Utilities(){};

    /**
     * Mètode que llegeix un enter de la consola
     * @param missatge que mostrarem per consola a l'usuari per demanar el nombre
     * @param minValue nombre mínim acceptat
     * @param maxValue nombre màxim acceptat
     * @return el valor enter llegit de la consola
     */
    public static int llegirInt(String missatge, int minValue, int maxValue){
        int numero = 0;
        boolean correcte  = false;

        while(!correcte){
            System.out.println(missatge);
            if(llegir.hasNextInt()){
                numero = llegir.nextInt();
                if(numero >= minValue && numero <= maxValue) {
                    correcte = true;
                }else{
                    System.out.printf("El numero ha d'estar entre %d i %d\n", minValue,maxValue);
                }
            }else{
                System.out.println("Has de introduïr un numero!!");
            }
            llegir.nextLine();
        }
        return numero;
    }

    /**
     * Mètode que llegeix un enter de la consola
     * @param missatge que mostrarem per consola a l'usuari per demanar el nombre
     * @param min nombre mínim acceptat
     * @param max nombre màxim acceptat
     * @return valor float llegit
     */
    public static float llegirFloat(String missatge, float min, float max) {
        float valor = 0;
        boolean valorCorrecto = false;

        do {
            System.out.println(missatge);
            valorCorrecto = llegir.hasNextFloat();
            if (valorCorrecto) {
                valor = llegir.nextFloat();
                llegir.nextLine();
                if (valor < min || valor > max){
                    System.out.println("Opción no válida!");
                    valorCorrecto = false;
                }
            } else {
                llegir.nextLine();
            }
        }while(valorCorrecto == false);

        return valor;
    }

    /**
     * Mètode per a llegir una frase amb espais
     * @param missatge
     * @return
     */
    public static String llegirFrase(String missatge){
        System.out.println(missatge);
        return llegir.nextLine();
    }

    /**
     * Mètode per a llegir una paraula sense espais
     * @param missatge
     * @return
     */
    public static String llegirParaula(String missatge){
        String paraula;
        System.out.println(missatge);
        paraula = llegir.next();
        llegir.nextLine();

        return paraula;
    }

    /**
     * Mètode per a llegir un caràcter (primera lletra escrita)
     * @param missatge
     * @return
     */
    public static char llegirChar(String missatge){
        String paraula;
        char c;

        System.out.println(missatge);
        paraula = llegir.next();
        llegir.nextLine();

        c = paraula.charAt(0);

        return c;
    }
}
