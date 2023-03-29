package models;

import interfaces.AccionsAnimal;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Classe Porc hereda de Mamifer i implementa els mètodes d'AccionsAnimal
 */
public class Porc extends Mamifer implements AccionsAnimal {
    private String color;
    private boolean iberic;
    private boolean senglar;

    /**
     * Constructor de la classe Porc
     * @param nom
     * @param dataNaixement
     * @param numPotes
     * @param pare
     * @param mare
     * @param genere
     * @param numEstomags
     * @param herbivor
     * @param color
     * @param iberic
     * @param senglar
     */
    public Porc(String nom, LocalDate dataNaixement, int numPotes, Animal pare, Animal mare, char genere, int numEstomags, boolean herbivor, String color, boolean iberic, boolean senglar) {
        // Crida al constructor de la classe Pare (Mamifer)
        super(nom, dataNaixement, numPotes, pare, mare, genere, numEstomags, herbivor);
        this.color = color;
        this.iberic = iberic;
        this.senglar = senglar;
    }

    /**
     * Implementació del mètode parlar de l'interfície AccionsAnimal
     */
    public void parlar() {
        System.out.println("El porc " + this.nom + " diu: oing oing");
    }

    /**
     * Implementació del mètode dormir de l'interfície AccionsAnimal
     */
    public void dormir() {
        System.out.println("El porc " + this.nom + " va a dormir: Zzz, oing");
    }

    /**
     * Implementació del mètode madurar de l'interfície AccionsAnimal
     */
    @Override
    public void madurar() {
        this.decendencia = new ArrayList<>();
    }
}
