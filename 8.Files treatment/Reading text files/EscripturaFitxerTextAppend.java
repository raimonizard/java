import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class EscripturaFitxerTextAppend {
    public static void main(String[] args) {
        iniciaPrograma();
    }

    private static void iniciaPrograma() {
        File numbers = new File("fitxers" + File.separator + "numbers.txt");
        PrintStream ps = null;

        try{
            ps = new PrintStream(new FileOutputStream(numbers, true));
            escriureFitxer(ps);
        }catch(FileNotFoundException fnfe){
            System.out.println("ERROR: " + fnfe.getMessage());
        }catch(Exception e){
            System.out.println("ERROR desconegut: " + e.getMessage());
        }finally {
            if (ps != null){
                ps.close();
            }
        }
    }

    private static void escriureFitxer(PrintStream ps) {
        String linia = "hola";
        while (!linia.equalsIgnoreCase("fi")){
            linia = llegirLinia("Escriu una nova línia o 'fi' per acabar");
            ps.println(linia);
        }
    }

    private static String llegirLinia(String s) {
        Scanner llegir = new Scanner(System.in);
        System.out.println(s);
        return llegir.nextLine();
    }
}