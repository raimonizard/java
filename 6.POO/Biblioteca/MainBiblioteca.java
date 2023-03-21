import models.Biblioteca;
import models.Llibre;

import java.util.Scanner;

public class MainBiblioteca {
    public static void main(String[] args) {
        Biblioteca gracia = new Biblioteca("Bilbio de Gràcia", "Plaça del Nord 14");
        menu(gracia);
    }

    private static void menu(Biblioteca b){
        System.out.println("Benvingut/da al programa...");
        int opcio = 0;

        do {
            opcio = llegirInt("Escull una opció:\n\t1. Crear i afegir llibre\n\t2. Veure catàleg de bilbio\n\t3.Info de la biblio\n\t4. Sortir ");
            switch (opcio) {
                case 1:
                    Llibre l = crearLlibre();
                    afegirLlibre(b, l);
                    break;
                case 2:
                    imprimirCataleg(b);
                    break;
                case 3:
                    System.out.println(b);
                    break;
                case 4:
                    System.out.println("Adèu");
                    break;
                default:
                    System.out.println("Opció no disponible");
                    break;
            }
        }while(opcio != 4);
    }

    private static void imprimirCataleg(Biblioteca biblio) {
        for (Llibre l : biblio.getCataleg()) {
            System.out.println(l);
        }
    }

    private static void afegirLlibre(Biblioteca biblio, Llibre llibreNou) {
        biblio.afegirLlibre(llibreNou);
    }

    private static Llibre crearLlibre() {
        Llibre llibre;
        String titol, autor;
        int ISBN;

        titol = llegirString("Escriu el titol del llibre: ");
        autor = llegirString("Escriu l'autor del llibre: ");
        ISBN = llegirInt("Escriu l'ISBN del llibre: ");

        llibre = new Llibre(titol, autor, ISBN);

        return llibre;
    }

    private static int llegirInt(String s) {
        Scanner llegir = new Scanner(System.in);
        boolean tipusCorrecte = false;
        int valor = 0;

        do {
            System.out.println(s);
            tipusCorrecte = llegir.hasNextInt();
            if (!tipusCorrecte){
                System.out.println("Valor no numèric");
            }else{
                valor = llegir.nextInt();
            }
            llegir.nextLine();
        }while(!tipusCorrecte);

        return valor;
    }

    private static String llegirString(String s) {
        Scanner llegir = new Scanner(System.in);
        String retorn;
        System.out.println(s);
        retorn = llegir.nextLine();
        // llegir.close();
        return retorn;
    }
}