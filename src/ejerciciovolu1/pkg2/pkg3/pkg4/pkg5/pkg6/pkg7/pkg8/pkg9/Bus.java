/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciovolu1.pkg2.pkg3.pkg4.pkg5.pkg6.pkg7.pkg8.pkg9;

/**
 *
 * @author user
 */
public class Bus extends VehiculoTransporte
{

    /**
     * Constructor por defecto
     */
    public Bus() 
    {
        super();
    }

    /**
     * Constructor con parámetros
     * @param n_plazas guarda el número de plazas
     * @param matricula guarda el número de matrícula
     * @param dias_alquiler guarda los dias que ha estado alquilado
     */
    public Bus(int n_plazas, String matricula, int dias_alquiler) {
        super(n_plazas, matricula, dias_alquiler);
    }
    
    /**
     * Calcula el importe del alquiler
     * @return el precio del alquiler
     */
    @Override
    public double importeAlquiler() 
    {
        double devu=(super.getDias_alquiler()*50)+(super.getN_plazas()*1.5)+(super.getDias_alquiler()*1.5)+(super.getN_plazas()*2);
        return devu;    
    }
    
    /**
     * Muestra el recibo del alquiler
     * @return el precio del alquiler en forma de recibo
     */
    @Override
    public String recibo() 
    {
        String devu="--------------------\n" +
        "BUS\n" +
        "--------------------\nMatricula: "+super.getMatricula() +"\nDuración: "+super.getDias_alquiler()+"\n" +
        "Plazas: "+getN_plazas()+"\n" +
        "Importe: "+importeAlquiler()+" €";
        return devu;
    }
    
    
}
