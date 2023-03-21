package models;

import java.util.ArrayList;

public class Biblioteca {
    private String nom;
    private String adreca;
    private ArrayList<Llibre> cataleg;

    public Biblioteca(String nom, String adreca){
        this.nom = nom;
        this.adreca = adreca;
        this.cataleg = new ArrayList<>();
    }

    public void afegirLlibre(Llibre l){
        this.cataleg.add(l);
    }

    public ArrayList<Llibre> getCataleg() {
        return this.cataleg;
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "nom='" + nom + '\'' +
                ", adreca='" + adreca + '\'' +
                ", cataleg=" + cataleg +
                '}';
    }
}
