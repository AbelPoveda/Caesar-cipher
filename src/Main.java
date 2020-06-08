import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int elec = bienvenida();
        if (elec == 1) encriptar();
        else if (elec == 2) desencriptar();
        else System.out.println("Hasta la próxima");
    }

    public static int bienvenida() {
        boolean ok = false;
        String eleccion;
        System.out.println("Bienvenido a Caesar cipher!");
        System.out.println("Pulsa 1 para encriptar un código, 2 para desencriptarlo o 0 para salir");
        do {
            Scanner scan = new Scanner(System.in);
            eleccion = scan.nextLine();
            if (eleccion.matches("^[0-2]$")){
                ok = true;
            } else {
                System.out.println("Elige entre 0 para salir, 1 para encriptar y 2 para desencriptar");
            }
        } while (!ok);
        int a = Integer.parseInt(eleccion);
        return a;
    }

    public static void encriptar(){
        System.out.println("¿Qué código quieres encriptar?");
        Scanner scan = new Scanner(System.in);
        String codigo = scan.nextLine();
        System.out.println("¿Número de veces a mover cada letra? (MAX 26)");
        int veces = scan.nextInt();
        System.out.println("Tu nuevo código es: " + caesar(codigo,veces));
    }
    public static void desencriptar(){
        System.out.println("¿Qué código quieres desencriptar?");
        Scanner scan = new Scanner(System.in);
        String codigo = scan.nextLine();
        System.out.println("¿Número de cifrado? (MAX 26)");
        int veces = - scan.nextInt() + 26;
        System.out.println("Tu nuevo código es: " + caesar(codigo,veces));
    }

    public static String caesar(String codigo, int veces){
        String caps = codigo.toUpperCase().replace(" ", "");
        String nuevocodigo = "";
        String diccionario = "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int a = 0; a<caps.length();a++){
            char letra = caps.charAt(a);
            nuevocodigo += diccionario.charAt(diccionario.indexOf(letra) + veces);
        }
        return nuevocodigo;
    }

}