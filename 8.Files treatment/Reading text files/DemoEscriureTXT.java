import java.io.*;
import java.util.Scanner;

public class DemoEscriureTXT {
    public static void main(String[] args) {
        String nomFitxer = null;
        nomFitxer = triarNomFitxer();
        File fitxer = new File("dades" + File.separator + nomFitxer + ".txt");

        // Escriure a continuació (append) amb la classe PrintStream + FileOutputStream
        // escriureFitxerTXT(fitxer);
        // Escriure a continuació (append) amb la classe FileWriter
        ecriureFitxerFileWriter(fitxer);
    }
    /**
     * Mètode per a triar el nom del fitxer a crear i evitar noms incorrectes
     * @return
     */
    private static String triarNomFitxer() {
        String nomFitxer;
        Scanner llegirTeclat = new Scanner(System.in);
        System.out.print("Escriu el nom del fitxer: ");
        nomFitxer = llegirTeclat.nextLine();
        nomFitxer = nomFitxer.replace('.',' ');
        nomFitxer = nomFitxer.replace(' ', '_');
        nomFitxer = nomFitxer.toLowerCase();
        return nomFitxer;
    }

    /**
     * Mètode per a llegir contingut de teclat
     * @return
     */
    private static String llegirText() {
        Scanner llegirTeclat = new Scanner(System.in);
        String text;

        System.out.print("Escriu el que vulguis escriure al fitxer: (escriu $sortir$ per acabar) ");
        text = llegirTeclat.nextLine();

        return text;
    }

    /**
     * Mètode per a llegir d'un fitxer de text pla usant PrintStream + FileOutputStream amb append
     * @param fitxer
     */
    private static void escriureFitxerTXT(File fitxer) {
        String text = null;
        PrintStream bufferEscriptura = null;

        try{
            if (!fitxer.exists()){
                System.out.println("WARNING: El fitxer " + fitxer.getName() + " no existeix i serà creat!");
            }

            bufferEscriptura = new PrintStream(new FileOutputStream(fitxer, true));
            text = llegirText();

            while(!text.equalsIgnoreCase("$sortir$")){
                //bufferEscriptura.println(text);
                bufferEscriptura.append(text);
                text = llegirText();
            }
        }catch(FileNotFoundException fnfe) {
            System.out.println("ERROR: Fitxer no trobat " + fnfe.getMessage());
        }catch(Exception e){
            System.out.println("ERROR: Desconegut " + e.getMessage());
        }finally {
            if (bufferEscriptura != null){
                bufferEscriptura.close();
            }
        }
    }

    /**
     * Mètode per a llegir d'un fitxer de text pla usant FileWriter amb el constructor append = true
     * @param fitxer
     */
    private static void ecriureFitxerFileWriter(File fitxer){
        FileWriter bufferFileWriter = null;
        String text = null;

        try{
            bufferFileWriter = new FileWriter(fitxer, true);
            text = llegirText();

            while(!text.equalsIgnoreCase("$sortir$")){
                bufferFileWriter.append(text);
                text = llegirText();
            }

        }catch(FileNotFoundException fnfe){
            System.out.println("ERROR: Fitxer no trobat/accessible " + fnfe.getMessage());
        }catch(IOException ioe) {
            System.out.println("ERROR: Input-Output error " + ioe.getMessage());
        }catch(Exception e){
            System.out.println("ERROR: Desconegut " + e.getMessage());
        }finally {
            if (bufferFileWriter != null){
                try {
                    bufferFileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}
