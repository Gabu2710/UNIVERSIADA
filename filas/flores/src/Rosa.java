public class Rosa {
    private String color;
    private Float precio;
    private String importador;

    public Rosa() {
    }

    public Rosa(String color, Float precio, String importador) {
        this.color = color;
        this.precio = precio;
        this.importador = importador;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public String getImportador() {
        return importador;
    }

    public void setImportador(String importador) {
        this.importador = importador;
    }

    public String detallesDeRosa(){
        String dDR="el color de la rosa es>"+this.color+"\n"+
        "el precio es."+this.precio+"\n"+
        "la importadora es>"+this.importador;
        return dDR;
    }
}
