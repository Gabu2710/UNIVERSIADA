public class Estudiante {
    private String nombres;
    private String apellido;
    private Double edad;

    public Estudiante() {
    }

    public Estudiante(String nombres, String apellido, Double edad) {
        this.nombres = nombres;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Double getEdad() {
        return edad;
    }

    public void setEdad(Double edad) {
        this.edad = edad;
    }

    public String DetallesEstudiantes() {
        String de;
        de = "El nombre del estudiante es: " + this.nombres + "\n" +
                "El apellido es: " + this.apellido + "\n" +
                "La edad es: " + this.edad;
        return de;
    }
}