import java.util.ArrayList;

public class Exemple1 {

    public static void main(String[] args) {
        ArrayList<String> nomsAlumnes;
        nomsAlumnes = new ArrayList<>();

        nomsAlumnes.add("Andreu");
        nomsAlumnes.add("Maria");
        nomsAlumnes.add("Josep");

        nomsAlumnes.add(0, "Helena");

        nomsAlumnes.set(0, "Geni"); // Sobre escriu. Update

        nomsAlumnes.remove("Geni"); // Delete
        mostrarElementsArrayList(nomsAlumnes);
        System.out.println("----");

    }

    private static void mostrarElementsArrayList(ArrayList<String> nomsAlumnes) {
        for (int i = 0; i < nomsAlumnes.size(); i++) {
            System.out.println(i + nomsAlumnes.get(i));
        }

        System.out.println("For-each");

        for (String nom : nomsAlumnes) {
            System.out.println(nom);
        }
    }
}
