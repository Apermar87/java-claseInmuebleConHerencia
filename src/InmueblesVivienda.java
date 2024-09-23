public class InmueblesVivienda extends Inmueble {
    protected int habitaciones;
    protected int baños;

    public InmueblesVivienda(int id, int area, String direccion, int habitaciones, int baños) {
        super(id, area, direccion);
        this.habitaciones = habitaciones;
        this.baños = baños;
    }

    public void imprimir(){
        super.imprimir();
        System.out.println("Número de habitaciones: " + habitaciones);
        System.out.println("Número de baños: " + baños);
    }
    
}
