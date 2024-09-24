
public class App {
    public static void main(String[] args) throws Exception {
        CasasRurales cr1 = new CasasRurales(102050, 150, "Avenida Manolete 20", 5, 3, 2, 1500, 700);
        System.out.println("Datos casa rural: ");
        cr1.calcularValorCompra(CasasRurales.valorArea);
        cr1.imprimir();

        ConjuntoCerrado cc1 = new ConjuntoCerrado(105026, 100, "Historiador Pepe Ruiz", 5, 2, 2, 100000, true, true);
        System.out.println("Datos de la casa en conjunto cerrado ");
        cc1.calcularValorCompra(ConjuntoCerrado.valorArea);
        cc1.imprimir();

        Independientes ind1 = new Independientes(100050, 80, "Plaza Agustin López", 3, 1, 1);
        System.out.println("Datos de la casa independiente");
        ind1.calcularValorCompra(Independientes.valorArea);
        ind1.imprimir();
        
        Apartaestudios apt1 = new Apartaestudios(103020, 90, "Avenida Carlos V", 1, 1);
        System.out.println("Datos apartaestudio: ");
        apt1.calcularValorCompra(Apartaestudios.valorArea);
        apt1.imprimir();

        ApartamentosFamiliares ap1 = new ApartamentosFamiliares(103067, 120, "Avenida Santander 45-45", 3, 2, 200000);
        System.out.println("Datos apartamento:");
        ap1.calcularValorCompra(ApartamentosFamiliares.valorArea); //Hay un error al calcular el valor de compra
        ap1.imprimir();

        LocalesComerciales lcom1 = new LocalesComerciales(100954, 70, "Calle Juan Ramón Jimenez 15", LocalesComerciales.tipo.INTERNO, "El Arcángel");
        System.out.println("Datos local comercial: ");
        lcom1.calcularValorCompra(LocalesComerciales.valorArea);
        lcom1.imprimir();

        Oficinas ofi1 = new Oficinas(102125, 65, "Avenida Felipe VI", Oficinas.tipo.CALLE, false);
        System.out.println("Datos oficina: ");
        ofi1.calcularValorCompra(Oficinas.valorArea);
        ofi1.imprimir();


    }
}
