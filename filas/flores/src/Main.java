//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Rosa r=new Rosa();
        r.setColor("rojo");
        System.out.printf("el color es>"+r.getColor());
        r.setPrecio(1.5f);
        System.out.printf("el percio es>"+r.getPrecio());
        r.setImportador("distri");
        System.out.printf("el distribuidoir es>"+r.getImportador());

        girasol g=new girasol();
        g.setLargo(1.5f);
        System.out.printf("el largo es>"+g.getLargo());
    }
}