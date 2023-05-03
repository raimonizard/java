import java.io.File;
import java.util.Scanner;

public class CrearCarpeta {
    public static void main(String[] args) {
        File arxius = new File("arxius");
        crearCarpeta(arxius);
    }

    public static void crearCarpeta(File carpetaParent){
        Scanner llegir = new Scanner(System.in);
        String nomSubCarpeta;
        boolean resposta = false;

        System.out.println("Pots crear carpetes dins de la carpeta: " + carpetaParent.getName());
        System.out.println("Escriu el nom de la subcarpeta... ");
        nomSubCarpeta = llegir.next();
        llegir.nextLine();

        File subCarpeta = new File(carpetaParent.getAbsolutePath() + File.separator + nomSubCarpeta);
        boolean totCorrecte;

        totCorrecte = subCarpeta.mkdir();

        if (totCorrecte){
            System.out.println("S'ha creat la subcarpeta correctament!");
            System.out.println("Vols eliminar la carpeta creada? (true|false)");
            resposta = llegir.nextBoolean();
            llegir.nextLine();

            if (resposta){
                if (subCarpeta.delete()){
                    System.out.println("La carpeta s'ha esborrat");
                }else{
                    System.out.println("ERROR: La carpeta no s'ha pogut esborrar!");
                }
            }

        }else{
            System.out.println("ERROR: No s'ha pogut crear la carpeta!");
        }
    }


}