package a04;

public class ImpresoraBasica implements Imprimible {

    @Override
    public void imprimir(int cantidad, String documento){
        System.out.println("Imprimiendo...");
        for(int i = 1; i <= cantidad; i++){
            System.out.println("Imprimiendo " + documento + " (" + i + ")");
        }
        System.out.println("Proceso terminado");
    }
}