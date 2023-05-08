import java.io.*;

public class DemoBinaryFiles {
    /**
     * Mètode inicial on arrenca el programa
     *
     * @param args
     */
    public static void main(String[] args) {
        write();
        read();
    }

    /**
     * Escriure valors de variables primitives a fitxer binari
     */
    public static void write() {
        FileOutputStream fileOut = null;
        DataOutputStream output = null;
        try {
            fileOut = new FileOutputStream("numbers.data");
            output = new DataOutputStream(fileOut);
            for (int i = 0; i < 5; i++) {
                output.writeInt(i);
            }
        } catch (FileNotFoundException fnfe) {
            System.out.println("ERROR: Fitxer no trobat!");
        } catch (IOException ioe) {
            System.out.println("ERROR: Problema de I/O " + ioe);
        } catch (Exception e) {
            System.out.println("ERROR: Desconegut " + e);
        } finally {
            if (output != null) {
                try {
                    output.close();
                } catch (IOException e) {
                    System.out.println("ERROR: Intentant tancar buffer d'escriptura!");
                }
            }
            if (fileOut != null) {
                try {
                    fileOut.close();
                } catch (IOException e) {
                    System.out.println("ERROR: Intentant tancar fitxer binari!");
                }
            }
        }
        System.out.println("Operació d'escriptura completada");
    }

    /**
     * Llegir valors de variables primitives de fitxer binari
     */
    public static void read() {
        FileInputStream fileIn = null;
        DataInputStream input = null;
        try {
            fileIn = new FileInputStream("numbers.data");
            input = new DataInputStream(fileIn);
            while (true) {
                int value = input.readInt();
                System.out.println("Valor: " + value);
            }
        } catch (FileNotFoundException fnfe) {
            System.out.println("ERROR: Fitxer no trobat!");
        } catch (EOFException eofe) {
            System.out.println("WARNING: Hem arribat al final del fitxer.");
        } catch (IOException ioe) {
            System.out.println("ERROR: Problema de I/O " + ioe);
        } catch (Exception e) {
            System.out.println("ERROR: Desconegut " + e);
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    System.out.println("ERROR: Intentant tancar buffer de lectura!");
                }
            }
            if (fileIn != null) {
                try {
                    fileIn.close();
                } catch (IOException e) {
                    System.out.println("ERROR: Intentant tancar fitxer binari!");
                }
            }
        }
    }
}