public class LocalesComerciales extends Locales {
    protected String centroComercial;

    protected static double valorArea = 3000000;

    public LocalesComerciales(int id, int area, String direccion, Locales.tipo tipoLocal,
            String centroComercial) {
        super(id, area, direccion, tipoLocal);
        this.centroComercial = centroComercial;
    }

    public void imprimir(){
        super.imprimir();
        System.out.println("Centro comercial: " + centroComercial);
        System.out.println("");
    }
}
