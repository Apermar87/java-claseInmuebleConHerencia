public class Locales extends Inmueble {
    enum tipo {INTERNO, CALLE};
    protected tipo tipoLocal;

    public Locales(int id, int area, String direccion, Locales.tipo tipoLocal) {
        super(id, area, direccion);
        this.tipoLocal = tipoLocal;
    } 

    public void imprimir(){
        super.imprimir();
        System.out.println("Tipo de local: " + tipoLocal);
    }
    
}
