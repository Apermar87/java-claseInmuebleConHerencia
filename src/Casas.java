public class Casas extends InmueblesVivienda {
    protected int pisos;

    public Casas(int id, int area, String direccion, int habitaciones, int baños, int pisos) {
        super(id, area, direccion, habitaciones, baños);
        this.pisos = pisos;
    }

    public void imprimir(){
        super.imprimir();
        System.out.println("Número de pisos: " + pisos);
    }
}
