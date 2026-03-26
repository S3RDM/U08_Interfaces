package a02;

public class Main {
    public static void main(String[] args) {        
        MetodoPago pagoTarjeta = new PagoTarjeta("1234-5678-9101-1121");
        pagoTarjeta.procesarPago(100);

        System.out.println();
        
        MetodoPago pagoBizum = new PagoBizum("612345678");
        pagoBizum.procesarPago(50);
    }
}