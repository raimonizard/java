package models;
public  class Gos {
    // Atributs que descriuen un Gos
    // L'atribut XIP el farem final que vol dir que serà una constant i no se li podrà canviar el valor inicial
    private final int XIP;
    private String nom;
    private String raca;
    private int edat;
    private float pes;
    private boolean perillos;
    private Persona propietari;
    private int nivellGana = 10;
    private int nivellSet = 5;
    private int nivellEnergia = 7;
    private boolean teSon = true;
    private static int numGossosCreats = 0;

    /**
     * Constructor amb els següents paràmetres:
     * @param nom
     */
    public Gos(String nom){
        this.XIP = (int)(Math.random()*99+1);
        this.nom = nom;
        Gos.numGossosCreats++;
    }

    /**
     * Constructor amb els següents paràmetres:
     * @param nom
     * @param raca
     * @param edat
     */
    public Gos(int xip, String nom, String raca, int edat){
        this.XIP = xip;
        this.nom = nom;
        this.raca = raca;
        this.edat = edat;
        Gos.numGossosCreats++;
    }

    public void dormir(int hores){
        this.nivellEnergia += hores;
        this.teSon = false;
    }

    public void bordar(){
        System.out.println("Bup bup!");
    }

    public void passejar(){
        if (this.nivellEnergia <= 0 || this.nivellGana > 20 || this.nivellSet > 10){
            System.out.println("El teu gos està mig desmaiat i no pot caminar");
            this.dormir(10);
        }else {
            for (int i = 0; i < 4; i++) {
                this.bordar();
            }
            System.out.println("" +
                    "             .--~~,__\n" +
                    ":-....,-------`~~'._.'\n" +
                    " `-,,,  ,_      ;'~U'\n" +
                    "  _,-' ,'`-__; '--.\n" +
                    " (_/'~~      ''''(;");
            this.nivellGana += 10;
            this.nivellSet += 5;
            this.nivellEnergia -= 7;
        }
    }

    public void donarMenjar(String tipus){
        switch (tipus){
            case "Pinso":
                this.bordar();
                this.nivellGana += 2;
                this.nivellSet -= 2;
                System.out.println("" +
                        " __       ___,.-------..__        __\n" +
                        "//\\\\ _,-''                `'--._ //\\\\\n" +
                        "\\\\ ;'                           `: //\n" +
                        " `(                               )'\n" +
                        "   :.                           ,;\n" +
                        "    `.`--.___           ___.--','\n" +
                        "      `.     ``-------''     ,'\n" +
                        "         -.               ,-\n" +
                        "            `-._______.-'");
                this.pes *= 1.2f;
                break;
            case "Entrecot":
                this.nivellGana -= 10;
                this.nivellSet -= 5;
                this.pes += 2;
                System.out.println("" +
                        "    ___\n" +
                        " __/_  `.  .-\"\"\"-.\n" +
                        " \\_,` | \\-'  /   )`-')\n" +
                        "  \"\") `\"`    \\  ((`\"`\n" +
                        " ___Y  ,    .'7 /|\n" +
                        "(_,___/...-` (_/_/");
                break;
            default:
                System.out.println("Li has donat un menjar no adequat al teu gos!");
                break;
        }
    }


    /**
     * Mètode per recuperar nom del Gos
     * @return
     */
    public String getNom() {
        return nom;
    }

    /**
     *
     * @param nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public float getPes() {
        return pes;
    }

    public void setPes(float pes) {
        if (pes < 0.5f || pes > 50.0f){
            System.out.println("ERROR: Tens un microbi o un cavall");
        }else {
            this.pes = pes;
        }
    }

    public boolean isPerillos() {
        return perillos;
    }

    public void setPerillos(boolean perillos) {
        this.perillos = perillos;
    }

    public Persona getPropietari() {
        return propietari;
    }

    public void setPropietari(Persona propietari) {
        this.propietari = propietari;
    }

    public int getXIP() {
        return XIP;
    }

    public static int getNumGossosCreats() {
        return numGossosCreats;
    }

    /**
     * Redefinim què volem que passi quan s'imprimeix un Gos
     * @return
     */
    @Override
    public String toString() {
        return "Gos{" +
                "nom='" + this.nom + '\'' +
                ", raça='" + this.raca + '\'' +
                ", edat=" + this.edat +
                ", pes=" + this.pes +
                ", perillos=" + this.perillos +
                ", propietari='" + this.propietari + '\'' +
                ", nivellGana=" + this.nivellGana +
                ", nivellSet=" + this.nivellSet +
                ", nivellEnergia=" + this.nivellEnergia +
                ", teSon=" + this.teSon +
                '}';
    }

    /**
     * Redefinim què vol dir que dos gossos siguin iguals
     * @param obj rebem un objecte per paràmetre
     * @return true | false en funció de si els Gossos són iguals o no
     */
    @Override
    public boolean equals(Object obj) {
        // Pas 1: Comprovar que l'objecte que m'han passat és un Gos
        if(obj.getClass() != this.getClass()){
            System.out.println("ERROR: No m'has passat un Gos per comparar");
            return false;
        }
        // Pas 2: Comprovar que el Gos que m'han passat no és NULL
        if(obj == null){
            System.out.println("ERROR: El Gos passat no està inicilitzat.");
            return false;
        }

        // Reconvertim l'objecte rebut a la classe Gos i ho guardem dins d'un Gos temporal
        Gos aux = (Gos)obj;

        // Definim què vol dir que dos Gossos siguin iguals
        if (aux.getXIP() == this.XIP){
            return true;
        }else{
            return false;
        }
    }
}