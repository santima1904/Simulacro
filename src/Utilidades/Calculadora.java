package Utilidades;

import clasesBasicas.Afiliados;

public class Calculadora {

    public static double calcularCalorias(Afiliados a, double duracion){
        double calorias=0;
        try {
            calorias = a.nivelActividad.getCte() * duracion * a.getPeso();

        }catch (Exception e){
            System.out.println("Error");
        }
        return calorias;
    }
}
