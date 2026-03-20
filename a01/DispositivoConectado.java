package a01;

interface DispositivoConectado{
    final String tipoRed = "Wi-Fi 7";
    default void encender();
    default void apagar();
}