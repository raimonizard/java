import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Raimon Izard
 * @version 1.0
 */
public class ReadingNumbers {
    /**
     * main method which initiates the program,
     *  creates the file object and calls a method to read its values
     * We use a try-catch-finally block in order to treat FileNotFoundExcetion
     * @param args
     */
    public static void main(String[] args) {
        File file= new File("numbers.txt");
        Scanner valuesReader = null;

        try{
            valuesReader = new Scanner(file);
            readFileValues(valuesReader);
        }catch (FileNotFoundException fnfe){
            System.out.println("ERROR: File not found: " + fnfe.getMessage());
        }catch (Exception e){
            System.out.println("UNKNOWN ERRRO!");
        }finally {
            if (valuesReader != null){
                valuesReader.close();
            }
        }
    }

    /**
     * This method recieves an input Scanner and reads the float values
     *  inside it until there is a non-float value
     * @param input
     */
    private static void readFileValues(Scanner input) {
        while (input.hasNextFloat()){
            float value = input.nextFloat();
            System.out.println("Value: "+value);
        }
    }
}