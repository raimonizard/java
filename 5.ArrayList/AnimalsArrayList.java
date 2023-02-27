import java.util.ArrayList;
import java.util.Scanner;

/**
 * Example Class to work with ArrayList<String>
 *
 * @author Raimon Izard
 * @since 2023-02-27
 * @version 1.0
 */
public class AnimalsArrayList {
    /**
     * Main method
     *
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        animals = initAnimals(animals);
        animals = mainMenu(animals);
    }

    /**
     * Main Menu method
     *
     * @param animals input Arraylist<String>
     * @return
     */
    private static ArrayList<String> mainMenu(ArrayList<String> animals) {
        final String MAIN_MENU_TEXT = "Welcome, choose an option:\n\t1.Show all the animals" + "\n\t2.Add an animal" + "\n\t3.Remove an animal" + "\n\t4.Exit";
        int option = 0;
        do {
            option = getInt(MAIN_MENU_TEXT, 1, 4);
            switch (option) {
                case 1:
                    printAnimals(animals);
                    break;
                case 2:
                    animals = addAnimal(animals);
                    break;
                case 3:
                    animals = removeAnimal(animals);
                    break;
                case 4:
                    System.out.println("bye!");
                    break;
            }
        } while (option != 4);
        return animals;
    }

    /**
     * Method to remove one animal from the list
     *
     * @param animals input Arraylist<String>
     * @return output Arraylist<String>
     */
    private static ArrayList<String> removeAnimal(ArrayList<String> animals) {
        System.out.println("There are " + animals.size() + " animals: ");
        printAnimals(animals);
        int index = getInt("Wich animal do you want to delete 0 - " + (animals.size() - 1), 0, animals.size() - 1);
        animals.remove(index);
        return animals;
    }

    /**
     * Method to add a new animal to the list
     *
     * @param animals input Arraylist<String>
     * @return output Arraylist<String>
     */
    private static ArrayList<String> addAnimal(ArrayList<String> animals) {
        String animal = getString("Write an animal");
        System.out.println("The actual list has " + animals.size() + " animals. Where do you want to add this new one?");
        System.out.println();
        int position = getInt("Write an number between 0 - " + animals.size(), 0, animals.size());
        animals.add(position, animal);
        return animals;
    }

    /**
     * Method which gets a String from the keyboard
     *
     * @param message
     * @return
     */
    private static String getString(String message) {
        Scanner read = new Scanner(System.in);
        String value;
        System.out.println(message);
        value = read.next();
        read.nextLine();

        read.close();

        return value;
    }

    /**
     * This method prints all the animals in the ArrayList
     *
     * @param animals input Arraylist<String>
     */
    private static void printAnimals(ArrayList<String> animals) {
        for (String animal : animals) {
            System.out.println(animal);
        }
    }

    /**
     * This method gets an int value with error control between min and max value
     *
     * @param message message to be shown to the user
     * @param min     min accepted value
     * @param max     max accepted value
     * @return returns the read int
     */
    private static int getInt(String message, int min, int max) {
        Scanner read = new Scanner(System.in);
        int x = 0;
        boolean correctDataType = false;
        do {
            System.out.println(message);
            correctDataType = read.hasNextInt();
            if (!correctDataType) {
                System.out.println("ERROR: Not an int value.");
                read.nextLine();
            } else { // Tinc un enter
                x = read.nextInt();
                read.nextLine();
                if (x < min || x > max) {
                    System.out.println("Not a valid option.");
                    correctDataType = false;
                }
            }
        } while (!correctDataType);

        return x;
    }

    /**
     * This method initializes the ArrayList with some values.
     *
     * @param animals input ArrayList<String>
     * @return Returns the ArrayList filled with some values.
     */
    private static ArrayList<String> initAnimals(ArrayList<String> animals) {
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Elephant");
        animals.add("Gorilla");

        return animals;
    }
}