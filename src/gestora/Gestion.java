package gestora;

import clasesBasicas.Afiliados;
import validaciones.validar;

public class Gestion {
    //Metodo para insertar datos de afiliados
    public static void insertarDatos(Afiliados[] listaAfiliados, Afiliados prueba){
        boolean seguir=true;
        String[] apellidosNombre = new String[1];
        String fecha;
        double peso;

        for (int i = 0; i < listaAfiliados.length && seguir;i++){
            apellidosNombre = validar.leerApellidos();
            fecha = validar.leerFecha();
            peso = validar.leePeso();

            prueba = new Afiliados(apellidosNombre[0], fecha, peso)
        }
    }


    //Metodo para insertar los afiliados
    public static Afiliados[] insertarAfiliado(Afiliados[] listaAfiliados, Afiliados afiliado) {
        boolean auxiliar = false;
        int i;
        for (i = 0; i < listaAfiliados.length && !auxiliar; i++) {
            if (listaAfiliados[i] == null) {
                listaAfiliados[i] = afiliado;
                auxiliar = true;
            }
        }
        return listaAfiliados;
    }


}
