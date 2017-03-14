/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciovolu1.pkg2.pkg3.pkg4.pkg5.pkg6.pkg7.pkg8.pkg9;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public final class Alquiler implements Datos
{
    private Tipo tipo= Tipo.B;
    private ArrayList<Vehiculo> pedido;

    /**
     * Constructor por defecto
     * @param n_vehiculos guarda el número de vehículos alquilados
     */
    public Alquiler(int n_vehiculos) 
    {
        Scanner teclado=new Scanner(System.in);
        Scanner teclado2=new Scanner(System.in);
        pedido=new ArrayList<>(n_vehiculos);
        for (int i = 0; i < pedido.size(); i++) 
        {
            System.out.println("Dime el tipo vehículo que quieres alquilar:");
            System.out.println("C)Camión\nB)Bus\nF)Furgoneta\nT)Trailer");
            String letra=teclado.nextLine();
            char a=letra.charAt(0);
            if(a=='C')
            {
                
                System.out.println("Dime la matrícula del vehículo");
                String matricula=teclado.nextLine();
                
                System.out.println("Dime él tiempo que lo vas a alquilar en días");
                int dias=teclado2.nextInt();
                
                System.out.println("Dime el número de plazas que vas a alquilar");
                int plazas=teclado2.nextInt();
                
                Coche co=new Coche(plazas, matricula, dias);
            }
            else if(a=='B')
            {
                System.out.println("Dime la matrícula del vehículo");
                String matricula=teclado.nextLine();
                
                System.out.println("Dime él tiempo que lo vas a alquilar en días");
                int dias=teclado2.nextInt();
                
                System.out.println("Dime el número de plazas que vas a alquilar");
                int plazas=teclado2.nextInt();
                
                Bus b=new Bus(plazas, matricula, dias);
            }
            else if(a=='F')
            {
                System.out.println("Dime la matrícula del vehículo");
                String matricula=teclado.nextLine();
                
                System.out.println("Dime él tiempo que lo vas a alquilar en días");
                int dias=teclado2.nextInt();
                
                System.out.println("Dime el número de plazas que vas a alquilar");
                int plazas=teclado2.nextInt();
            
                System.out.println("Dime las toneladas que lleva");
                double tone=teclado2.nextDouble();
                
                Furgoneta f=new Furgoneta(tone, plazas, matricula, dias);
            }
            else if(a=='T')
            {
                System.out.println("Dime la matrícula del vehículo");
                String matricula=teclado.nextLine();
                
                System.out.println("Dime él tiempo que lo vas a alquilar en días");
                int dias=teclado2.nextInt();
                
                System.out.println("Dime el número de plazas que vas a alquilar");
                int plazas=teclado2.nextInt();
            
                System.out.println("Dime las toneladas que lleva");
                double tone=teclado2.nextDouble();
                
                Camion c=new Camion(tone, plazas, matricula, dias);
            }
            
            
            
        }
    }
    
    /**
     * Calcula el importe de todos los vehiículos alquilados
     * @return el importe total
     */
    public double importeTotal()
    {
        double devu=0;
        for (int i = 0; i < pedido.size(); i++) 
        {
            devu=devu+pedido.get(i).importeAlquiler();
            
        }
        return devu;
    }
    
    /**
     * Calcula el importe de un vehículo
     * @param posicion guarda la posición del vehículo
     * @return el importe del vehículo indicado
     */
    public double importe(int posicion)
    {
        double devu=pedido.get(posicion).importeAlquiler();
        return devu;
    }

    /**
     * Muestra los datos del alquiler
     */
    @Override
    public void mostrarDatos() 
    {
        System.out.println("Total alquiler: "+importeTotal()+ "€\n" +
        "----------------------------------\n" +
        "DETALLE\n" +
        "---------------------------------\n");
        for (int i = 0; i < pedido.size(); i++) 
        {
            System.out.println("VEHÍCULO "+i+"\nInformación del vehículo\n"
                    + pedido.get(i).recibo());
            System.out.println("\n");
            
        }
    }
    
    
    
}
