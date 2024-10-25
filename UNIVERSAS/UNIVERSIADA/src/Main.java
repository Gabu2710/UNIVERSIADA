

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Universidad u = new Universidad();
        Scanner scan = new Scanner(System.in);

        System.out.print("ingrese el nombre de la universidad : ");
        String nombre;
        nombre = scan.nextLine();
        u.setNombre(nombre);

        System.out.println("el nombre de la universida es :" + u.getNombre());

        System.out.print("ingrese la ubicacion :");

        String ubicacion;
        ubicacion = scan.nextLine();
        u.setUbicacion(ubicacion);
        System.out.println("La ubicacion es:" + u.getUbicacion());

        System.out.print("ingrese el telefono : ");

        Float Telf;
        Telf = scan.nextFloat();
        u.setTelef(Telf);

        System.out.println("el telefono es :" + u.getTelef());

        Estudiante E=new Estudiante();

        System.out.print("ingrese el nombre del estudiante :");
        String nombres;
        nombres = scan.nextLine();
        E.setNombres(nombres);
        System.out.println("el nombre del estudiante es :" + E.getNombres());

        System.out.print("ingrese el apellido:");
        String apellido;
        apellido = scan.nextLine();
        E.setApellido(apellido);
        System.out.println("el apellido del estudiante es :" + E.getNombres());

        System.out.print("ingrese la edad: ");
        Double edad;
        edad = scan.nextDouble();
        E.setEdad(edad);
        System.out.println("la edad es :" + E.getEdad());

        Materia MA= new Materia();
        System.out.print("asignatura> ");

        String asignatura;
        asignatura= scan.nextLine();
        MA.setAsignatura(asignatura);

        System.out.println("asignatura es> = " + MA.getAsignatura());

        System.out.print("el NRC>");

        Float nrc;
        nrc= scan.nextFloat();
        MA.setNrc(nrc);

        System.out.println("el nrc es> " +MA.getNrc());

        Curso CU=new Curso();

        System.out.print("ingrese el paralelo" +CU.getParalelo());

        String paralelo;
        paralelo= scan.nextLine();
        CU.setParalelo(paralelo);

        System.out.println("el paralelo es>" +CU.getParalelo());

        System.out.print("ingrese el horairo>");

        String horario;
        horario= scan.nextLine();
        CU.setHorario(horario);

        System.out.println("el horario es>" + CU.getHorario());
    }
}