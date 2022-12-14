import java.util.Scanner;

public class DemoString {
    // Crea el mètode executable per posar el 'play'
    public static void main(String[] args) {
        Scanner llegir = new Scanner(System.in);
        String nom;

        System.out.print("Escriu el teu nom: ");
        nom = llegir.nextLine();

        // Compara Strings sensible a majúscules
        if (nom.equals("Ramon Arnau")){
            System.out.println("Bon dia");
        }

        // Compara Strings insensible a majúscules
        if (nom.equalsIgnoreCase("Ramon Arnau")){
            System.out.println("Bon dia");
        }

        // Comprovar si String té valor blanc (espais en blanc)
        if (nom.isBlank()){
            System.out.println("Has escrit un nom en blanc!");
        }

        // Comprovar si String és una cadena de caràcters ""
        if (nom.isEmpty()){
            System.out.println("Has escrit un nom buit");
        }

        // Aquí usem charAt(posició)
        System.out.println("La primera lletra del teu nom és: [" + nom.charAt(0) + "]");

        // Usem el mètode endsWith per comprovar si el meu nom acaba amb un valor concret
        if (nom.endsWith("mon")){
            System.out.println("El teu nom acaba amb mon");
        }

        // Imprimeix la posició del nom on apareix la primera 'a'
        System.out.println("La primera 'a' apareix a la posició: " + nom.indexOf("a"));

        System.out.println("El nom en minúscules és: "+nom.toLowerCase());

    }
}
