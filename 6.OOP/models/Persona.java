
package model;

import java.time.LocalDate;

public class Persona {
    private String nom;
    private String cognom1;
    private String cognom2;
    private LocalDate dataNaixement;
    private String dni;
    private float alcada;
    private boolean vacunatCovid;
    private Vacuna vacuna;
    private String codiPostal;
    private static int recomptePersones;


    public Persona(String nom, String cognom1, String cognom2) {
        this.nom = nom;
        this.cognom1 = cognom1;
        this.cognom2 = cognom2;
        this.vacuna = Vacuna.ASTRA_ZENECA;
    }

    public void vacunar(String vacuna){
        this.vacunatCovid = true;
    }

    public void dormir(){
        System.out.println("zzzzzz");
    }

    public void parlar(){
        System.out.println("Bla, bla, bla");
    }

    public void dirNom(){
        System.out.println(this.nom + " "
                            + this.cognom1 + " "
                            + this.cognom2);
    }

    public int retornarEdat(){
        if (this.dataNaixement != null){
            return LocalDate.now().getYear() - this.dataNaixement.getYear();
        }else{
            return -1;
        }
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom1() {
        return cognom1;
    }

    public void setCognom1(String cognom1) {
        this.cognom1 = cognom1;
    }

    public String getCognom2() {
        return cognom2;
    }

    public void setCognom2(String cognom2) {
        this.cognom2 = cognom2;
    }

    public LocalDate getDataNaixement() {
        return dataNaixement;
    }

    public void setDataNaixement(LocalDate dataNaixement) {
        this.dataNaixement = dataNaixement;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public float getAlcada() {
        return alcada;
    }

    public void setAlcada(float alcada) {
        this.alcada = alcada;
    }

    public boolean isVacunatCovid() {
        return vacunatCovid;
    }

    public void setVacunatCovid(boolean vacunatCovid) {
        this.vacunatCovid = vacunatCovid;
    }

    public String getCodiPostal() {
        return codiPostal;
    }

    public void setCodiPostal(String codiPostal) {
        this.codiPostal = codiPostal;
    }

    public static int getRecomptePersones() {
        return recomptePersones;
    }

    public static void setRecomptePersones(int recomptePersones) {
        Persona.recomptePersones = recomptePersones;
    }

    public void setVacuna(Vacuna v){
        this.vacuna = v;
        this.vacunatCovid = true;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nom='" + nom + '\'' +
                ", cognom1='" + cognom1 + '\'' +
                ", cognom2='" + cognom2 + '\'' +
                ", dataNaixement=" + dataNaixement +
                ", dni='" + dni + '\'' +
                ", alcada=" + alcada +
                ", vacunatCovid=" + vacunatCovid +
                ", vacuna=" + vacuna +
                ", codiPostal='" + codiPostal + '\'' +
                '}';
    }
}
