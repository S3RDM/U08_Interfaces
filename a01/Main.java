package a01;

public class Main {
    public static void main(String[] args) {
        Bombilla bombilla = new Bombilla();
        Televisor televisor = new Televisor();

        System.out.println("=== BOMBILLA ===");
        bombilla.mostrarInfoGeneral();
        bombilla.conectar();
        bombilla.encender();
        bombilla.apagar();

        System.out.println("\n=== TELEVISOR ===");
        televisor.mostrarInfoGeneral();
        televisor.conectar();
        televisor.encender();
        televisor.apagar();
    }
}