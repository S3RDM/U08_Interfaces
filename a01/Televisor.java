package a01;

public class Televisor implements DispositivoConectado {
    @Override
    public void encender() {
        System.out.println("Televisor encendido");
    }

    @Override
    public void apagar() {
        System.out.println("Televisor apagado");
    }

    @Override
    public void conectar() {
        System.out.println("Conectando a la red " + tipoRed + " y buscando actualizaciones de firmware...");
    }
}