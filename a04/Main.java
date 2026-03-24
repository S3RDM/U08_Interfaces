package a04;

public class Main {
    public static void main(String[] args) {
        ImpresoraBasica impBa = new ImpresoraBasica();
        ImpresoraAvanzada impAv = new ImpresoraAvanzada();

        System.out.println();
        System.out.println("-----Prueba de escaneo con impresora avanzada-----");
        impAv.escanear("documento.pdf", "correo@gmail.com");
        System.out.println();
        System.out.println("-----Prueba de impresión con impresora avanzada-----");
        impAv.imprimir(3, "documento.pdf");
        System.out.println();

        System.out.println("-----Prueba de impresión con impresora básica-----");
        impBa.imprimir(2, "documento.pdf");
    }
}