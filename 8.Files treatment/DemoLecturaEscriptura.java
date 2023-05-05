import java.io.*;
import java.util.Scanner;

public class DemoLecturaEscriptura {
    public static void main(String[] args) {
        File arxiu;
        int opcio;

        do {
            System.out.printf("Benvingut/da al programa de lectura i escriptura de fitxers de text");
            System.out.println("Escull una de les opcions següents: "
                    + "\n 1- Llegir arxiu per pantalla"
                    + "\n 2- Escriure al fitxer"
                    + "\n 3- Sortir");

            opcio = llegirInt();
            switch (opcio) {
                case 1:
                    arxiu = escullArxiu();
                    llegirArxiu(arxiu);
                    break;
                case 2:
                    arxiu = escullArxiu();
                    escriureArxiu(arxiu);
                    break;
                case 3:
                    System.out.printf("Sortint del programa...");
                    break;
            }
        }while(opcio != 3);
    }

    private static int llegirInt() {
        Scanner llegirTeclat = new Scanner(System.in);
        int valor = 0;
        boolean valorCorrecte = false;

        do {
            if (!llegirTeclat.hasNextInt()){
                System.out.printf("ERROR: Valor no enter!");
                llegirTeclat.nextLine();
            }else{
                valor = llegirTeclat.nextInt();
                llegirTeclat.nextLine();
                valorCorrecte = true;
            }
        }while(!valorCorrecte);

        return valor;
    }

    private static File escullArxiu() {
        Scanner llegirTeclat = new Scanner(System.in);
        String nomArxiu = "";
        File arxiu;
        boolean fitxerCorrecte;

        do {
            fitxerCorrecte = false;
            System.out.print("Escriu el nom del complet fitxer a buscar (inclou extensió): ");
            nomArxiu = llegirTeclat.next();
            llegirTeclat.nextLine();

            arxiu = new File(nomArxiu);
            if (arxiu.exists()) {
                if (arxiu.isFile() && (arxiu.getName().endsWith(".txt") || arxiu.getName().endsWith(".csv"))) {
                    System.out.println("Arxiu correcte i existent.");
                    fitxerCorrecte = true;
                } else {
                    System.out.println("ERROR: L'arxiu existeix però no és un fitxer llegible.");
                }
            } else {
                System.out.println("ERROR: L'arxiu no existeix.");
            }
        }while(!fitxerCorrecte);

        return arxiu;
    }

    public static void llegirArxiu(File arxiu){
        Scanner inputFitxer = null;

        try {
            inputFitxer = new Scanner(arxiu); // Somrient
            while (inputFitxer.hasNext()) {
                System.out.println(inputFitxer.nextLine());
            }
        }catch (FileNotFoundException e){
            System.out.println("ERROR! El fitxer no existeix");
        }catch(Exception e){
            System.out.println("ERROR!: " + e);
        }finally{
            // Tanco l'objecte Scanner vinculat al fitxer per tal de que no quedi bloquejat
            if (inputFitxer != null) {
                inputFitxer.close();
            }
        }
    }

    private static void escriureArxiu(File arxiu) {
        PrintStream escriureFitxer = null;
        Scanner llegirTeclat = new Scanner(System.in);
        String frase = "";
        try{
            // Usem les classes BufferedOutputStream i FileOutputStream per tal de poder inicialitzar el PrintStream amb append 'true' i escriure a continuació:
            escriureFitxer = new PrintStream(new BufferedOutputStream(new FileOutputStream(arxiu, true)));

            // Si usem el constructor directament amb l'objecte File, ens sobre-escriu el contingut:
            // escriureFitxer = new PrintStream(arxiu);

            do{
                System.out.printf("Escriu la frase que vols escriure al fitxer (per sortir escriu 'exit'): ");
                frase = llegirTeclat.nextLine();

                if (!frase.equalsIgnoreCase("exit")){
                    escriureFitxer.println(frase);
                }else{
                    System.out.printf("Deixem d'escriure.");
                }
            }while(!frase.equalsIgnoreCase("exit"));
        }catch(Exception e){
            System.out.printf("ERROR: " + e);
        }finally {
            if (escriureFitxer != null){
                escriureFitxer.close();
            }
        }
    }

}