public class CasasRurales extends Casas {
    protected float distancia;
    protected float altitud;

    protected static double valorArea = 1500000;

    public CasasRurales(int id, int area, String direccion, int habitaciones, int baños, int pisos,
            float distancia, float altitud) {
        super(id, area, direccion, habitaciones, baños, pisos);
        this.distancia = distancia;
        this.altitud = altitud;
    }

    public void imprimir(){
        super.imprimir();
        System.out.println("Distancia la cabecera municipal: " + distancia);
        System.out.println("Altitud sobre el nivel del mar: " + altitud);
        System.out.println("");
    }
}
