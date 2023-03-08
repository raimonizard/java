public class CompteEnrereRecursiu {
    public static void main(String[] args) throws InterruptedException {
        // Crida inicial al mètode
        compteEnrereRecursiu(10);
    }

    /**
     * Aquest mètode recursiu mostra un compte enrere per pantalla simulant una bomba que acaba explotant en el cas base de n <= 0
     * @param n Inici del compte enrere
     * @throws InterruptedException Llença excepció en el cas de que el mètode Thread.sleep falli en temps d'execució
     */
    private static void compteEnrereRecursiu(int n) throws InterruptedException {
        if(n <= 0){
            System.out.print("Boom!!!");
        }
        else {
            System.out.print(n + ",");
            Thread.sleep(500);
            compteEnrereRecursiu(n - 1);
        }
    }
}