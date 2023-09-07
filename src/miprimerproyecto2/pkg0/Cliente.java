/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miprimerproyecto2.pkg0;

/**
 *
 * @author 56998
 */
public class Cliente {
    private String nombre;
    private String apellido;
    private int edad;
    private Tarjeta tarjeta;
    
    //Metodos 
    
    //Constructores: con parametros o sin parametros
    public Cliente(){}
    
    public Cliente(String nombre, String apellido, int edad, Tarjeta tarjeta ){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.tarjeta = tarjeta;
    }   
    //Accesadores  getter

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }
    
    //Mutadores  setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }
    
    //Personalizados
    public void mostrarDatos(){
        System.out.println("Nombre:"+nombre);
        System.out.println("Apellido:"+getApellido());
        System.out.println("Edad:"+getEdad());
        System.out.println(tarjeta.toString());
        
    }

}
