package models;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Classe abstracte Animal:
 * 1. No se'n poden crear objectes.
 * 2. Pensada per a ser heredada.
 */
public abstract class Animal {
    private int identificador;
    protected String nom; // Atribut protected per tal de que pugui ser tractat com un atribut propi a les classes filles
    private LocalDate dataNaixement;
    private int numPotes;
    protected Animal pare; // Atribut protected per tal de que pugui ser tractat com un atribut propi a les classes filles
    protected Animal mare; // Atribut protected per tal de que pugui ser tractat com un atribut propi a les classes filles
    protected ArrayList<Animal> decendencia; // Atribut protected per tal de que pugui ser tractat com un atribut propi a les classes filles
    private static int recompteAnimals = 1; // atribut static => atribut a nivell de classe Animal

    /**
     * Constructor amb paràmetres de la classe Animal
     * @param nom
     * @param dataNaixement
     * @param pare
     * @param mare
     */
    public Animal(String nom, LocalDate dataNaixement, int numPotes, Animal pare, Animal mare) {
        this.identificador = Animal.recompteAnimals;
        this.nom = nom;
        this.dataNaixement = dataNaixement;
        this.numPotes = numPotes;
        this.pare = pare;
        this.mare = mare;
        Animal.recompteAnimals++;
    }

    /**
     * Getter que retorna el valor de l'atribut private i static recompteAnimals.
     * Aquest mètode és final, vol dir que les classes filles no en podràn modificar el seu body de funcionament (definició)
     * @return
     */
    public final int getRecompteAnimals(){
        return Animal.recompteAnimals;
    }

    /**
     * Getter de l'identificador de l'Animal. Aquest mètode no pot ser redefinit a les classes filles.
     * @return
     */
    public final int getIdentificador(){
        return this.identificador;
    }

    /**
     * Aquest mètode és abstracte i, per tant, no li hem definit el seu body.
     * Estarem obligats a definir-ho a dins de les classes filles.
     * @param a
     * @return
     */
    public abstract boolean afegirDecendencia(Animal a);

    /**
     * El mètode de toString l'hem declarat com a abstract.
     * Haurem de redefinir el seu funcionament a dins de les classes filles.
     * @return
     */
    @Override
    public abstract String toString();

    /**
     * Aquest mètode és final. Això vol dir que no es podrà redefinir a les classes filles.
     * @param obj
     * @return
     */
    @Override
    public final boolean equals(Object obj) {
        if (this.identificador == ((Animal)obj).identificador){
            return true;
        }else{
            return false;
        }
    }
}
