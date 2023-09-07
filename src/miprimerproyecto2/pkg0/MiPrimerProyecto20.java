/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package miprimerproyecto2.pkg0;

import java.util.Scanner;

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
    
        int opcion = 0;
        int saldoOpcion = 0;
        String respuesta = "";
        Scanner leer = new Scanner(System.in);
        Scanner leer1 = new Scanner(System.in);
        
        do{
            System.out.println("Menú");
            System.out.println("1.- Agregar Saldo");
            System.out.println("2.- Retirar Saldo");
            System.out.println("3.- Consultar Saldo");
            System.out.println("4.- Salir");
            opcion = leer.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Cuanto saldo desea Agregar?");
                    saldoOpcion = leer1.nextInt();
                    respuesta = cliente1.getTarjeta().agregarSaldo(saldoOpcion);
                    System.out.println(respuesta);
                    break;
                case 2:
                    System.out.println("Cuanto saldo desea retirar?");
                    saldoOpcion = leer1.nextInt();
                    respuesta = cliente1.getTarjeta().retirarSaldo(saldoOpcion);
                    System.out.println(respuesta);
                    break;
                case 3:
                    cliente1.mostrarDatos();
                    break;
                case 4: 
                    System.out.println("Chao pescao");                
                    break;
                default:
                    System.out.println("Error, escoged un número valido");
        }            
            
        }while(opcion!=4);
                
        }    
    
    }



           
