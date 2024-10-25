public class Materia {
    private String asignatura;
    private Float nrc;

    public Materia() {
    }

    public Materia(String asignatura, Float nrc) {
        this.asignatura = asignatura;
        this.nrc = nrc;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public Float getNrc() {
        return nrc;
    }

    public void setNrc(Float nrc) {
        this.nrc = nrc;
    }

    public String DetalleMateria() {
        String DM = "Ingrese el nombre de la asignatura: " + this.asignatura + "\n" +
                "Ingrese el NRC: " + this.nrc;
        return DM;
    }
}

