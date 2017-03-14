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
public class Coche extends VehiculoTransporte
{

    /**
     * Construcotr por defecto del coche
     */
    public Coche() 
    {
        super();
    }

    /**
     * Construcor con parámetros del coche
     * @param n_plazas guarda el numero de plazas del coche
     * @param matricula guarda el número de matrícual del coche
     * @param dias_alquiler guarda los días que ha estado alquilado el coche
     */
    public Coche(int n_plazas, String matricula, int dias_alquiler) {
        super(n_plazas, matricula, dias_alquiler);
    }
    
    /**
     * Calcula el importe del alquiler del coche
     * @return el importe del alquiler del coche
     */
    @Override
    public double importeAlquiler() 
    {
        double devu=(super.getDias_alquiler()*50)+(super.getN_plazas()*1.5)+(super.getDias_alquiler()*1.5);
        return devu;
    }
    
    /**
     * Muestra el recibo del alquiler del coche
     * @return el importe del alquiler en forma de recibo
     */
    @Override
    public String recibo() 
    {
        String devu="--------------------\n" +
        "COCHE\n" +
        "--------------------\nMatricula: "+super.getMatricula() +"\nDuración: "+super.getDias_alquiler()+"\n" +
        "Plazas: "+getN_plazas()+"\n" +
        "Importe: "+importeAlquiler()+" €";
        return devu;
    }
}
