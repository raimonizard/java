import java.util.Scanner;

public class MaquinaBitllets_TODO {
    public static void main(String[] args) {
        menuPrincipal();
    }

    public static void menuPrincipal(){
        final String MENU_PRINCIPAL = "Escull un bitllet:\n"+
                "\t1. Bitllet senzill\n" +
                "\t2. TCasual\n" +
                "\t3. TUsual\n" +
                "\t4. TFamiliar\n" +
                "\t5. TJove\n";
        final String[] NOMS_BITLLETS = {"Bitllet senzill","TCasual","TUsual","TFamiliar","TJove"};
        final float[] PREUS_BITLLETS = {2.4f,11.35f,40f,10f,80f};

        int opcio = 0;

        do {
            opcio = llegirInt(MENU_PRINCIPAL, 1, 5);
            switch (opcio) {
                case 1:
                    // TODO
                    break;
                case 2:
                    // TODO
                    break;
                case 3:
                    // TODO
                    break;
                case 4:
                    // TODO
                    break;
                case 5:
                    // TODO
                    break;
                default:
                    break;
            }
        }while(true);
    }

    /**
     * Mètode per calcular el preu amb el modificador de zona
     * @param preuBase Preu inicial per una zona
     * @return Retorna l'import de bitllet amb la zona aplicada
     */
    public static float aplicarZona(float preuBase){
        // TODO: Desenvolupar
        return 0.0f;
    }

    public static void metodePagament(float importCompra){
        float dinersAcumulats = 0f;
        float monedaActual = 0f;
        boolean monedaBona = false;

        System.out.println("Introdueix diners fins a l'import de " + importCompra);
        do {
            System.out.println("Et falta per pagar " + (importCompra - dinersAcumulats));
            do {
                monedaActual = llegirFloat("Introdueix una moneda o bitllet legal: ");
                monedaBona = comprovarMoneda(monedaActual);
                if (!monedaBona){
                    System.out.println("ERROR: No posis monedes del Monopoly!");
                }
            } while (!monedaBona);
            dinersAcumulats += monedaActual;
            System.out.println("Tens acumulat " + dinersAcumulats + "€");
        }while(dinersAcumulats < importCompra);

        System.out.println("Has pagat un import de: " +dinersAcumulats + "€");
        System.out.println("El teu canvi és: " + (-1*(importCompra - dinersAcumulats)) + "€");
    }

    /**
     * Mètode per comprovar la validesa d'una moneda o bitllet d'€uros
     * @param moneda Moneda rebuda
     * @return Retorna True si moneda vàlida | False si moneda falsa
     */
    public static boolean comprovarMoneda(float moneda){
        final float[] MONEDES_VALIDES = {0.01f,0.02f,0.05f,0.1f,
                0.2f,0.5f,1f,2f,5f,10f,20f,50f};
        boolean monedaValida = false;

        for (int i = 0; i < MONEDES_VALIDES.length; i++) {
            if (moneda == MONEDES_VALIDES[i]){
                monedaValida = true;
                break;
            }
        }
        return monedaValida;
    }

    public static float llegirFloat(String missatge){
        Scanner llegir = new Scanner(System.in);
        float x = 0;
        boolean valorCorrecte = false;
        do{
            System.out.print(missatge);
            valorCorrecte = llegir.hasNextFloat();

            if (!valorCorrecte){
                System.out.println("ERROR: Valor no float.");
            }else{
                x = llegir.nextFloat();
            }
            llegir.nextLine();
        }while(!valorCorrecte);

        return x;
    }

    /**
     * Aquest mètode llegeix un enter per teclat dins d'un domini determinat
     * @param missatge parametritzat per a mostrar a l'usuari@
     * @param min valor min acceptat
     * @param max valor max acceptat
     * @return retorna un int
     */
    private static int llegirInt(String missatge, int min, int max) {
        Scanner llegir = new Scanner(System.in);
        int x = 0;
        boolean valorCorrecte = false;
        do{
            System.out.println(missatge);
            valorCorrecte = llegir.hasNextInt();
            if (!valorCorrecte){
                System.out.println("ERROR: Valor no enter.");
                llegir.nextLine();
            }else{ // Tinc un enter
                x = llegir.nextInt();
                llegir.nextLine();
                if (x < min || x > max){
                    System.out.println("Opció no vàlida");
                    valorCorrecte = false;
                }
            }
        }while(!valorCorrecte);

        return x;
    }
}
