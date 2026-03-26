package a02;

interface MetodoPago {
    double IVA = 0.21;
    
    void procesarPago(double cantidad);

    private void logTransaccion(double cantidad){
        System.out.println("Se ha pagado " + cantidad);
    }

    default void generarFactura(double cantidad){
        logTransaccion(cantidad);
        cantidad = cantidad + (cantidad * IVA);
        System.out.println("Precio con IVA: " + cantidad);
    }

}