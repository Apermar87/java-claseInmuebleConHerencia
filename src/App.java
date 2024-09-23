public class App {
    public static void main(String[] args) throws Exception {
        ApartamentosFamiliares ap1 = new ApartamentosFamiliares(103067, 120, "Avenida Santander 45-45", 3, 2, 200000);
        
        System.out.println("Datos apartamento:");
        ap1.calcularValorCompra(ap1.valorCompra);
        ap1.imprimir();
    }
}
