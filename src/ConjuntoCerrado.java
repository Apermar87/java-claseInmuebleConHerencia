public class ConjuntoCerrado extends CasasUrbanas {
    protected int valorAdministracion;
    protected boolean tienePiscina; //Piscinas y campos deportivos
    protected boolean tieneCamposDeportivos;

    protected static double valorArea = 2500000;

    public ConjuntoCerrado(int id, int area, String direccion, int habitaciones, int baños,
            int pisos, int valorAdministracion, boolean tienePiscina, boolean tieneCamposDeportivos) {
        super(id, area, direccion, habitaciones, baños, pisos);
        this.valorAdministracion = valorAdministracion;
        this.tienePiscina = tienePiscina;
        this.tieneCamposDeportivos = tieneCamposDeportivos;
    }

    public void imprimir(){
        super.imprimir();
        System.out.println("Valor de la administración: " + valorAdministracion);
        System.out.println("¿Tiene piscina?: " + tienePiscina);
        System.out.println("¿Tiene campos deportivos?: " + tieneCamposDeportivos);
        System.out.println("");
    }

    
}
