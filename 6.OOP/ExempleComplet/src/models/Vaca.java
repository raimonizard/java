package models;

import interfaces.AccionsAnimal;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Definició de la classe Vaca que hereda de la classe Mamifer i implementa la interfície AccionsAnimal
 */
public class Vaca extends Mamifer implements AccionsAnimal {
    private String color;
    private boolean taques;
    private boolean banyes;

    /**
     * Constructor de la classe Vaca
     * @param nom
     * @param dataNaixement
     * @param numPotes
     * @param pare
     * @param mare
     * @param genere
     * @param numEstomags
     * @param herbivor
     * @param color
     * @param taques
     * @param banyes
     */
    public Vaca(String nom, LocalDate dataNaixement, int numPotes, Animal pare, Animal mare
                , char genere, int numEstomags, boolean herbivor, String color, boolean taques, boolean banyes) {
        // Crida al constructor de la classe Pare (Mamifer)
        super(nom, dataNaixement, numPotes, pare, mare, genere, numEstomags, herbivor);
        this.color = color;
        this.taques = taques;
        this.banyes = banyes;
    }

    /**
     * Implementació del mètode parlar de l'interfície AccionsAnimal
     */
    @Override
    public void parlar() {
        System.out.println("La vaca " + this.nom + " diu: muuuuh!");
    }

    /**
     * Implementació del mètode dormir de l'interfície AccionsAnimal
     */
    @Override
    public void dormir() {
        System.out.println("La vaca " + this.nom + " va a dormir: Zzz, muuuuuh");
    }

    /**
     * Implementació del mètode madurar de l'interfície AccionsAnimal
     */
    @Override
    public void madurar() {
        this.decendencia = new ArrayList<>();
    }
}
