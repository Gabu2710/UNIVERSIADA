//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) { //se accede al metodo mediante los atributos
        automovil bmw=new automovil( "mercedez benz");
        bmw.setMarca("BMW");
        bmw.setModelo("1220i");
        bmw.setColor("negro");
        bmw.setCilindraje(2.2f);

//        System.out.println("bmw.leerMarca() = " + bmw.leerMarca());
//        System.out.println("bmw.getMarca() = " + bmw.getMarca());
//        System.out.println("bmw.getModelo() = " + bmw.getModelo());
//        System.out.println("bmw.getColor() = " + bmw.getColor());
//        System.out.println("bmw.getCilindraje() = " + bmw.getCilindraje());
        System.out.println("bmw.detallesvec() = " + bmw.detallesvec());

    }
}