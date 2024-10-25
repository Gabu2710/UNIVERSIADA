
public class Curso {
    private String paralelo;
    private String horario;

    public Curso() {
    }

    public Curso(String paralelo, String horario) {

        this.paralelo = paralelo;
        this.horario = horario;
    }


    public String getParalelo() {
        return paralelo;
    }

    public void setParalelo(String paralelo) {
        this.paralelo = paralelo;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String DetallesCurso(){
        String DC= "el paralelo es>"+this.paralelo+"\n"+
                "el horario es>"+this.horario;
        return DC;
    }
}