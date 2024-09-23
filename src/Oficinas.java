public class Oficinas extends Locales {
    protected boolean esgobierno;

    protected static double valorArea = 3500000;

    public Oficinas(int id, int area, String direccion, Locales.tipo tipoLocal,
            boolean esgobierno) {
        super(id, area, direccion, tipoLocal);
        this.esgobierno = esgobierno;
    }

    public void imprimir(){
        super.imprimir();
        System.out.println("Es oficina gubernamental: " + esgobierno);
        System.out.println("");
    }
}
