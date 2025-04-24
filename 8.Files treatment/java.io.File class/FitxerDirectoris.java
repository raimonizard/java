import java.io.File;
import java.util.Date;

public class FitxerDirectoris {
    public static void main(String[] args) {
        // Document amb ruta relativa
        File documentHola;

        // Ruta relativa al document hola.txt que es troba dins d'una carpeta
        documentHola = new File("carpeta"+File.separator+"hola.txt");
        // Crido mètode per comprovar si la ruta conté un fixer o un directori
        //FitxerDirectori(documentHola);

        UltimaModificacio(documentHola);
    }

    public static void FitxerDirectori(File arxiu){
        System.out.println(arxiu.getAbsolutePath()+" existeix? "+arxiu.exists());

        System.out.println(arxiu.getAbsolutePath()+" es directori? "+arxiu.isDirectory());
        System.out.println(arxiu.getAbsolutePath()+" es directori? "+arxiu.isFile());
    }

    public static void UltimaModificacio(File arxiu){
        Date dataUltimaModif = new Date(0);
        System.out.println("La data de l'última modificació del fitxer:\n"+arxiu.getAbsolutePath()+" és: "+dataUltimaModif);
    }

}