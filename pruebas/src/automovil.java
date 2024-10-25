public class automovil {
    //atributos
    private String marca;
    private String modelo="mercedez benz";
    private String color;
    private float cilindraje=2.0f;

    //constructores y destructores

    public automovil() {
    }

    public automovil(String marca) {
        this.marca = marca;
    }

    public automovil(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public automovil(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }




    //Metodos propios del lenguaje Java, el amin llama al metodo para tener los atributyos

    /*public String leerMarca(){
        this.marca=marca;
        return marca;
    }

    public String ingresarMarca(String marca){
        this.marca=marca;
        return this.marca;
    }

    */

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(float cilindraje) {
        this.cilindraje = cilindraje;
    }

    //Metodos propios del programador
    public String detallesvec(){
        String dv="la marca es->"+this.marca+"\n"+
                "el modelo es->"+this.modelo+ "\n" +
                "el color es ->"+this.color+"\n"+
                "el cilindraje es ->"+this.cilindraje;
        return dv;
    }

    public float consumocombustible(float kmr, float gal){
        float kpg;
        kpg= kmr/gal;
        return kpg;
    }

    public double consumocombustible(float kmr){
        float pcc;
        pcc=kmr*0.7f;
        return pcc;
    }




    //Metodos especiales de Java

}
