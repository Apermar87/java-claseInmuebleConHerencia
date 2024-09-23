public class Inmueble {
    protected int id;
    protected int area;
    protected String direccion;
    protected double valorCompra;

    public Inmueble(int id, int area, String direccion) {
        this.id = id;
        this.area = area;
        this.direccion = direccion;
    }

    public double calcularValorCompra(double valorArea){
        valorCompra = area * valorArea;
        return valorArea;
    }

    public void imprimir(){
        System.out.println("Identificador inmobiliario: " + id);
        System.out.println("Area: " + area);
        System.out.println("Dirección: " + direccion);
        System.out.println("Valor de compra: " + valorCompra);

    }
}
