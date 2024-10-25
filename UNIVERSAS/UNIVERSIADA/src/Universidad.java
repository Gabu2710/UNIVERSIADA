public class Universidad {
    private String nombre;
    private String ubicacion;
    private Float telef;

    public Universidad() {
    }

    public Universidad(String nombre, String ubicacion, Float telef) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.telef = telef;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Float getTelef() {
        return telef;
    }

    public void setTelef(Float telef) {
        this.telef = telef;
    }

    public String DetallesUniversidad(){
        String du="el nombre de la universidad es:"+this.nombre+"\n"+
                "la ubicacion es:"+this.ubicacion+"\n"+
                "el telefono es:"+this.telef;
        return du;
    }
}
