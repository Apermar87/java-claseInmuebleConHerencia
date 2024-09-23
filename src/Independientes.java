public class Independientes extends CasasUrbanas {
    protected static double valorArea = 3000000;

    public Independientes(int id, int area, String direccion, int habitaciones, int baños, int pisos) {
        super(id, area, direccion, habitaciones, baños, pisos);
    }

    public void imprimir(){
        super.imprimir();
        System.out.println("");
    }
}
