public class Apartaestudios extends Apartamentos {

    protected static double valorArea = 1500000;

    public Apartaestudios(int id, int area, String direccion, int habitaciones, int baños) {
        super(id, area, direccion, 1, 1);
    }

    public void imprimir(){
        super.imprimir();
        System.out.println("");
    }
}
