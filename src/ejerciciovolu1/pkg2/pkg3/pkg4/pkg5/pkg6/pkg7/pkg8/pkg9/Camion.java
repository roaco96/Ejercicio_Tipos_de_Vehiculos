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
public class Camion extends VehiculoCarga
{

    /**
     * Constructor por defecto de un camión
     */
    public Camion() 
    {
        super();
    }

    /**
     * Constructor con parámetros del camión
     * @param tara guarda la tara del camión
     * @param n_plazas guarda el número de plazas del camión
     * @param matricula guarda la matrícula del camión 
     * @param dias_alquiler guarda los días de alquiler del camión
     */
    public Camion(double tara, int n_plazas, String matricula, int dias_alquiler) {
        super(tara, n_plazas, matricula, dias_alquiler);
    }

    /**
     * calcula el importe del alquiler
     * @return el importe del alquiler
     */
    @Override
    public double importeAlquiler() 
    {
        double devu=(super.getDias_alquiler()*50)+(super.getTara()*20)+40;
        return devu;
    }
    
    /**
     * Muestra el recibo del alquiler
     * @return el importe del alquiler en forma de recibo
     */
    @Override
    public String recibo() 
    {
        String devu="--------------------\n" +
        "CAMIÓN\n" +
        "--------------------\nMatricula: "+super.getMatricula() +"\nDuración: "+super.getDias_alquiler()+"\n" +
        "Plazas: "+getN_plazas()+"\n" +
        "Importe: "+importeAlquiler()+" €";
        return devu;
    }
}
