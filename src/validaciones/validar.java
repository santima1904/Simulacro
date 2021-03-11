package validaciones;
import java.util.Scanner;

public class validar {
    private static Scanner teclado = new Scanner(System.in);

    public static String[] leerApellidos(){
     String[] apellidosNombre = new String[1];
     String respuesta;
        System.out.println("Cual es su apellido?");
        respuesta = teclado.nextLine();
        apellidosNombre = respuesta.split(", ");

        return apellidosNombre;
    }

    public static String leerFecha(){
        String fecha;
        System.out.println("Fecha de entrada");
        fecha = teclado.nextLine();

        return fecha;
    }

    public static double leePeso(){
        double peso;
        System.out.println("Peso: ");
        peso = teclado.nextDouble();

        return peso;
    }

    public static boolean continuar(){
        boolean seguir;
        System.out.println("Desea introducir otro?");
        seguir = teclado.hasNext();
        return seguir;
    }
}
