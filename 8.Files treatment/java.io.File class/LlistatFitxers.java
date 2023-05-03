import java.io.File;

public class LlistatFitxers {

  public static void main(String[] args) {
     File arxius = new File("arxius");
     dir(arxius);
  }

  public static void dir(File carpeta){
      if (carpeta.isDirectory()){
          // Creem vector estàtic 1D amb els objectes File que hi ha dins de la carpeta 'arxius'
          File[] arxiusInteriors = carpeta.listFiles();

          // Llistem els fitxers que hi ha dins de la carpeta
          for (int i = 0; i < arxiusInteriors.length; i++) {
              // Mostrem els noms dels fitxers
              System.out.println("\t" + carpeta.getName() + "\\" + arxiusInteriors[i].getName());

              if (arxiusInteriors[i].isDirectory()){
                  // Crida recursiva al mètode dir per a llistar els documents dins de la subcarpeta
                  dir(arxiusInteriors[i]);
              }
          }
      }
  }
}