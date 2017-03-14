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
public abstract class VehiculoTransporte extends Vehiculo
{
    private int n_plazas;

    /**
     * 
     * @return el número de plazas del vehículo
     */
    public int getN_plazas() {
        return n_plazas;
    }

    /**
     * 
     * @param n_plazas guarda un número de plazas para el vehículo
     */
    public void setN_plazas(int n_plazas) {
        this.n_plazas = n_plazas;
    }

    /**
     * constructor por defecto del vehículoTransporte
     */
    public VehiculoTransporte() 
    {
        super();
        n_plazas=-1;
    }

    /**
     * Constructyor por parámetros
     * @param n_plazas guarda el número de plazas
     * @param matricula guarda el número de matrícula
     * @param dias_alquiler guarda los días de alquiler
     */
    public VehiculoTransporte(int n_plazas, String matricula, int dias_alquiler) {
        super(matricula, dias_alquiler);
        this.n_plazas = n_plazas;
    }
    
    /**
     * 
     * @return el precio del alquiler
     */
    @Override
    public abstract double importeAlquiler();

    /**
     * 
     * @return la información del alquiler en forma de recibo
     */
    @Override
    public String recibo() 
    {
        String devu="Matricula: "+super.getMatricula() +"\nDuración: "+super.getDias_alquiler()+"\n" +
        "Plazas: "+getN_plazas()+"\n" +
        "Importe: "+importeAlquiler()+" €";
        return devu;
    }
    
    
}
