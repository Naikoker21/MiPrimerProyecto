/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package miprimerproyecto2.pkg0;

/**
 *
 * @author 56998
 */
public class MiPrimerProyecto20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        Tarjeta tarjeta1 = new Tarjeta(5678, 423, 5, 500, false);
        Tarjeta tarjeta2 = new Tarjeta(1234, 276, 500000, 50000, true);
        Cliente cliente2 = new Cliente("Naiko" , "Leggio", 22, tarjeta2 );
        cliente1.setNombre("Pedro");
        cliente1.setApellido("Perez");
        cliente1.setEdad(25);
        cliente1.setTarjeta(tarjeta1);
        cliente1.mostrarDatos();
        cliente2.mostrarDatos();
        
        }    
    
    }



           
