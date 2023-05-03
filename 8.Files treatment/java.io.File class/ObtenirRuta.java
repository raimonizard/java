import java.io.File;

public class ObtenirRuta {
    public static void main(String[] args) {
        // Declaro objecte de la classe File
        File carpetaDownloads;

        // Inicialitzo el fitxer "C:\Users\Professor\Downloads"
        // 1. Aconseguir la ruta origen de la unitat
        String home = System.getProperty("user.home");
        System.out.println(home);

        // Construim la ruta multiplataforma cap a la carpeta Downloads
        String rutaCompleta = home + File.separator + "Downloads";
        System.out.println(rutaCompleta);

        // Inicialitzem l'objecte File amb la ruta a downloads
        carpetaDownloads = new File(rutaCompleta);

        System.out.println(carpetaDownloads.getAbsolutePath());
        // Retorna una carpeta a nivell superior
        System.out.println(carpetaDownloads.getParent());
        // Retorna el nom de l'últim element de la ruta ja sigui directori o fitxer
        System.out.println(carpetaDownloads.getName());

        // Document amb ruta relativa
        File documentHola;

        // Ruta relativa al document hola.txt que es troba dins d'una carpeta
        documentHola = new File("carpeta"+File.separator+"hola.txt");

        // Obtinc la ruta absoluta del document "hola.txt"
        System.out.println(documentHola.getAbsolutePath());
        // Retorna el nom de la carpeta directament superior
        System.out.println(documentHola.getParent());
        // Obtenim nom del fitxer final
        System.out.println(documentHola.getName());
    }
}