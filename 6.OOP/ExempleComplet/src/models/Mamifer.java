package models;

import java.time.LocalDate;

/**
 * Classe Mamifer hereda de la classe abstracte Animal
 */
public class Mamifer extends Animal{
    private char genere;
    private int numEstomags;
    private boolean herbivor;

    /**
     * Constructor de la classe Mamifer
     * @param nom
     * @param dataNaixement
     * @param numPotes
     * @param pare
     * @param mare
     * @param genere
     * @param numEstomags
     * @param herbivor
     */
    public Mamifer(String nom, LocalDate dataNaixement, int numPotes, Animal pare, Animal mare, char genere, int numEstomags, boolean herbivor) {
        super(nom, dataNaixement, numPotes, pare, mare);
        this.genere = genere;
        this.numEstomags = numEstomags;
        this.herbivor = herbivor;
    }

    /**
     * Mètode que serveix per a afegir fills/es.
     * @param a
     * @return
     */
    @Override
    public boolean afegirDecendencia(Animal a) {
        Mamifer m = (Mamifer)a;
        if(this.decendencia.add(m)){
            return true;
        }else{
            return false;
        }
    }

    /**
     * Mètode toString per a imprimir Mamifers
     * @return
     */
    @Override
    public String toString() {
        return "Mamífer{" +
                "identificador=" + super.getIdentificador() +
                ", nom=" + this.nom +
                ", decendencia=" + this.decendencia +
                ", genere=" + this.genere +
                ", numEstomags=" + this.numEstomags +
                ", herbivor=" + this.herbivor +
                '}';
    }
}
