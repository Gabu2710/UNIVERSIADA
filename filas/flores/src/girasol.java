public class girasol {
    private Float largo;
    private String colore;

    public girasol() {
    }

    public girasol(Float largo, String colores) {
        this.largo = largo;
        this.colore = colores;
    }

    public Float getLargo() {
        return largo;
    }

    public void setLargo(Float largo) {
        this.largo = largo;
    }

    public String getColores() {
        return colore;
    }

    public void setColores(String colore) {
        this.colore = colore;
    }

    public String detallesDeGirasol(){
        String dDG= "el largo es."+this.largo+"\n"+
                "los colores son>"+this.colore;
        return dDG;
    }

}
