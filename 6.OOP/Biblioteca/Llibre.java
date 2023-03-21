package models;

public class Llibre {
        private String titol;
        private String autor;
        private String tema;
        private int numPaginas;
        private final int ISBN;

        public Llibre (String titol, String autor, int ISBN){
                this.titol = titol;
                this.autor = autor;
                this.ISBN = ISBN;
        }

        public void setTema(String tema){
                this.tema = tema;
        }

        public void setNumPaginas(int numPaginas){
                this.numPaginas = numPaginas;
        }

        public String getTitol() {
                return titol;
        }

        public void setTitol(String titol) {
                this.titol = titol;
        }

        public String getAutor() {
                return autor;
        }

        public void setAutor(String autor) {
                this.autor = autor;
        }

        public String getTema() {
                return tema;
        }

        @Override
        public String toString() {
                return "Llibre{" +
                        "titol='" + titol + '\'' +
                        ", autor='" + autor + '\'' +
                        '}';
        }
}
