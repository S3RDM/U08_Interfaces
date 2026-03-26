package a02;

public class PagoBizum implements MetodoPago {
    String tlf;

    PagoBizum(String tlf){
        this.tlf = tlf;
    }

    @Override
    public void procesarPago(double cantidad){
        System.out.println("Pago por bizum");
        generarFactura(cantidad);
    }   
}