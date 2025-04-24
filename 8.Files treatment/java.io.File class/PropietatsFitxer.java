import java.io.File;
import java.util.Date;

public class PropietatsFitxer {
    public static void main(String[] args) {
        // Declarem objecte de la classe File 'hola'
        File hola;
        // Inicialitzem l'objecte 'hola' usant el constructor de la classe File passant-li una ruta en format String com a paràmetre
        hola = new File("arxius" + File.separator + "hola.txt");
        // Cridem mètode 'propietatsFitxers' per tal de que mostri les propietats del fitxer passat per paràmetre
        propietatsFitxers(hola);
        fitxerDirectori(hola);

    }

    /**
     * Aquest mètode imprimeix per pantalla algunes propietats de l'objecte File  passat per paràmetre
     * @param arxiu
     */
    public static void propietatsFitxers(File arxiu){
        System.out.println("La ruta absoluta del fitxer " + arxiu.getName() + " és " + arxiu.getAbsolutePath());
        System.out.println("El fitxer " + arxiu.getName() + " existeix? " + arxiu.exists());
        System.out.println("El fitxer " + arxiu.getName() + " ocupa " + arxiu.length() + " bytes");
        System.out.println("La data de modificació del fitxer en UNIX time és: " + arxiu.lastModified());

        Date dataModif = new Date(arxiu.lastModified());

        System.out.println("La data de modificació del fitxer en human time és: " + dataModif);

    }

    /**
     * Aquest mètode comprova si et fitxer passat per paràmetre és una carpeta o un arxiu
     * @param arxiu
     */
    public static void fitxerDirectori(File arxiu){
        if (arxiu.exists()){
            if (arxiu.isDirectory()){
                System.out.println(arxiu.getName() + " és un directori.");
            }else if(arxiu.isFile()){
                System.out.println(arxiu.getName() + " és un fitxer.");
            }else{
                System.out.println(arxiu.getName() + "ERROR: Fitxer corrupte!");
            }
        }else{
            System.out.println(arxiu.getName() + "ERROR: Fitxer no existent!");
        }
    }

}