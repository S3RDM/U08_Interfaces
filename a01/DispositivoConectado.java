package a01;

interface DispositivoConectado{
    String tipoRed = "Wi-Fi 7";

    void encender();

    void apagar();
    
    default void conectar() {
        System.out.println("Conectando a la red " + tipoRed + "...");
    }

    default void mostrarInfoGeneral() {
        System.out.println("Dispositivo IoT conectado en entorno inteligente.");
    }
}