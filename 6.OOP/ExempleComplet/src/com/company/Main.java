package com.company;

import interfaces.AccionsAnimal;
import models.Animal;
import models.Porc;
import models.Vaca;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        // Creem un objecte de la classe Vaca
        Vaca milka = new Vaca("Milka", LocalDate.of(2021,1,1), 4, null, null, 'F', 4, true, "Negre i Blanc", true, true);
        // Cridem al mètode madurar de la classe Vaca que prové de l'interfície
        milka.madurar();

        // Imprimim els detalls de la vaca milka
        System.out.println(milka);

        // Polimorfisme: creem el milky de la interface AccionsAnimal i usem el constructor de la classe Vaca.
        AccionsAnimal milky = new Vaca("Milky", LocalDate.now(), 4, null, milka, 'M', 4, true, "Negre i Blanc", true, false);

        // Imprimim els detalls del milky
        System.out.println(milky);

        // Afegim milky com a fill de milka però primerament l'hem de convertir a Animal.
        milka.afegirDecendencia(((Animal)milky));

        // Imprimim els detalls de milka
        System.out.println(milka);

        // Creem el Porc dave a partir de la classe abstracte Animal però usant el constructor de la clase Porc
	    Animal dave = new Porc("Dave", LocalDate.now(), 4, null, null, 'M', 1
                                , false, "Rosa", false, false);

        // Imprimim els detalls de dave
        System.out.println(dave);

        // Comprovem si l'Animal és un Porc
        if (dave instanceof Porc) {
            // Castejem l'Animal al tipus Porc per a tenir accés al mètode parlar i poder-lo fer servir
            ((Porc) dave).parlar();
            System.out.println(dave);
        }

        // Polimorfisme
        ferAdormir(milky);

    }

    /**
     * Polimorfisme: Mètode ferAdormir que rep un objecte de la interface AccionsAnimal
     * @param a
     */
    private static void ferAdormir(AccionsAnimal a){
        a.dormir();
    }
}
