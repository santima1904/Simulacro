/**
 * <b></b>Nombre: Afiliados<br/>
 * <b></b>Propiedades:<br/>
 *  <b></b>Basicas:<br/>
 *   identificador: entero positivo, consultable, modificable<br/>
 *   apellidosNombre: array de string, consultable<br/>
 *   fecha: cadena, consultable<br/>
 *   peso: real, consultable, modificable<br/>
 *   categoria: entero positivo, consultable, modificable<br/>
 *   nivelActividad: enum nivel.Nivel, consultable, modificable<br/>
 *<br/>
 * Derivadas: Ninguna<br/>
 *<br/>
 * Compartida: Ninguna<br/>
 *<br/>
 * Metodos principales:<br/>
 * 						-identificador:<br/>
 *  						public int getIdentificador()<br/>
 *  					    public void setIdentificador(int identificador)<br/>
 * 						-apellidosNombre:<br/>
 *  						public String getApellidosNombre()<br/>
 * 						-fecha:<br/>
 * 							 public String getFecha()<br/>
 * 						-peso:<br/>
 *  						public float getPeso()<br/>
 *  						public void setPeso(float peso)<br/>
 * 						-categorias:<br/>
 *  						public int getCategoria()<br/>
 *  						public void setCategoria(float categoria)<br/>
 *  					-nivelActividad:<br/>
 *  				        public nivel.Nivel getNivelActividad()<br/>
 *  *  						public void setNivelActividad(nivel.Nivel nivelActividad)<br/>
 * Metodos anhadidos:<br/>
 *<br/>
 * Metodos heredados: Ninguno<br/>
 *
 */

package clasesBasicas;

import enums.Nivel;

import java.util.Objects;

public class Afiliados {
    //Atributos
    private int identificador;
    private String[] apellidosNombre;
    private String fecha;
    private double peso;
    private int categoria;
    public Nivel nivelActividad;


    //Constructor por defecto
    public Afiliados(){
        this.identificador = 1111;
        this.apellidosNombre =
        this.fecha = "19/03/22";
        this.peso = 67;
        this.categoria = 1;
        this.nivelActividad = Nivel.BAJO;
    }

    //Constructor por parametros
    public Afiliados(String apellidosNombre, String fecha, double peso, Nivel nivelActividad){
        this.identificador = 1000;
        this.apellidosNombre = apellidosNombre;
        this.fecha = fecha;
        this.categoria = 1;
        this.peso = peso;
        this.nivelActividad = nivelActividad;
    }

    //Getters y setters
    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getApellidosNombre() {
        return apellidosNombre;
    }

    public String getFecha() {
        return fecha;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public Nivel getNivelActividad() {
        return nivelActividad;
    }

    public void setNivelActividad(Nivel nivelActividad) {
        this.nivelActividad = nivelActividad;
    }
//Metodos de la clase Object

    //Metodo equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Afiliados afiliados = (Afiliados) o;
        return identificador == afiliados.identificador;
    }

    //Metodo toString
    @Override
    public String toString() {
        return identificador +", "+ apellidosNombre;
    }
}
