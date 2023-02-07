import java.util.Scanner;

public class DemoMetodes1 {
    public static void main(String[] args) {
        Scanner llegir = new Scanner(System.in);
        String nomAlumne;
        System.out.print("Escriu el teu nom: ");
        nomAlumne = llegir.nextLine();

        if (nomAlumne.equalsIgnoreCase("Maria")){
            salutacio();
        }else{
            travelDocumentation();
        }

        despertador(false);
    }

    /**
     * Aquest mètode imprimeix "Hello World" per pantalla
     */
    public static void salutacio(){
        System.out.println("Hello World");
    }

    /**
     * Aquest mètode imprimeix un conjunt d'instruccions per pantalla sobre com fer check-in
     */
    public static void travelDocumentation(){
        System.out.println("TRAVEL DOCUMENTATION:");
        System.out.println("A driving licence is not accepted as a travel document on international flights or domesticflights.");
        System.out.println("Travel documents accepted are:");
        System.out.println("A valid passport.");
        System.out.println("A valid National Identity Card issued by the goverment of an European Ecnomic Areacountry.");
    }

    /**
     * Aquest mètode fa sonar el despertador
     * @param horaLlevarse aquest paràmtre serveix per indicar si ha de sonar l'alarma o no
     */
    public static void despertador(boolean horaLlevarse){
        if (horaLlevarse == true){
            for (int i = 0; i < 3; i++) {
                System.out.println("ALARMA!");
            }
        }
    }
}