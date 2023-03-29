package interfaces;

/**
 * Interfície AccionsAnimal conté mètodes que fan referència a accions que poden fer els animals.
 * El comportament d'aquests mètodes s'han de definir a les classes que l'implementen.
 */
public interface AccionsAnimal {
    public abstract void parlar();
    void dormir(); // No desenvolupem el contingut del mètode. NO cal definir que és públic abstract perquè ja ho és per defecte
    void madurar(); // No desenvolupem el contingut del mètode. NO cal definir que és públic abstract perquè ja ho és per defecte
}
