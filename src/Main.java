import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        bienvenida();
    }

    public static void bienvenida() {
        boolean ok = false;
        String eleccion;
        System.out.println("Bienvenido a Caesar cipher!");
        System.out.println("Pulsa 1 para encriptar un código, 2 para desencriptarlo o 0 para salir");
        do {
            Scanner scan = new Scanner(System.in);
            eleccion = scan.nextLine();
            if (eleccion.matches("^[0-2]$")){
                System.out.println("guay " + eleccion);
                ok = true;
            } else {
                System.out.println("Elige entre 0 para salir, 1 para encriptar y 2 para desencriptar");
            }
        } while (!ok);

    }
}