package a02;

public class PagoTarjeta implements MetodoPago{
    public String tarjeta;
  
    PagoTarjeta(String tarjeta){
        this.tarjeta = tarjeta;
    }

    @Override
    public void procesarPago(double cantidad){
        System.out.println("Pago con tarjeta");
        generarFactura(cantidad);
    }
}