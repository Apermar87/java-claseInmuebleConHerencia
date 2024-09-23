public class ApartamentosFamiliares extends Apartamentos {
    protected int pagarValorAdministracion;

    protected static double valorArea = 2000000;

    public ApartamentosFamiliares(int id, int area, String direccion, int habitaciones, int baños,
            int pagarValorAdministracion) {
        super(id, area, direccion, habitaciones, baños);
        this.pagarValorAdministracion = pagarValorAdministracion;
    }

    public void imprimir(){
        super.imprimir();
        System.out.println("Valor de la administración: " + pagarValorAdministracion);
        System.out.println("");
    }
}
