package controller;

import model.Persona;
import model.Vacuna;

import java.time.LocalDate;

public class MainPersona {
    // Serveix per crear el mètode executable
    public static void main(String[] args) {
        Persona ximbi = new Persona("Ximbi", "Indica", "Sativa");
        ximbi.setDataNaixement(LocalDate.parse("2002-01-01"));

        Persona fernando = new Persona("Fernando", "Alonso", "Cuevillas");
        fernando.setDataNaixement(LocalDate.of(2002,2,5));

        System.out.println(fernando);

        ximbi.parlar();
        System.out.println("En "+ximbi.getNom()+" té " +ximbi.retornarEdat()+" anys");

        ximbi.setVacuna(Vacuna.MODERNA);

    }
}
