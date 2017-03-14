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
public abstract class VehiculoCarga extends VehiculoTransporte
{
    private double tara;

    /**
     * 
     * @return la tara del camión 
     */
    public double getTara() {
        return tara;
    }

    /**
     * 
     * @param tara guarda una nueva tara 
     */
    public void setTara(double tara) {
        this.tara = tara;
    }

    /**
     * Constructor por defecto del vehículo de carga
     */
    public VehiculoCarga() 
    {
        super();
        tara=-1;
    }

    /**
     * Constructor con parámetros del vehículo de carga
     * @param tara guarda la tara
     * @param n_plazas guarda el número de plazas
     * @param matricula guarda la matrícula
     * @param dias_alquiler guarda los días que ha estado alquilado
     */
    public VehiculoCarga(double tara, int n_plazas, String matricula, int dias_alquiler) {
        super(n_plazas, matricula, dias_alquiler);
        this.tara = tara;
    }
    
    /**
     * calcula el importe del aquiler
     * @return el importe del alquiler
     */
    @Override
    public abstract double importeAlquiler();
    
    /**
     * Muestra el recibo del alquiler
     * @return el importe del alquiler en forma de recibo
     */
    @Override
    public String recibo()
    {
        String devu="Matricula: "+super.getMatricula() +"\nDuración: "+super.getDias_alquiler()+"\n" +
        "Plazas: "+super.getN_plazas()+"\n" +
        "Importe: "+importeAlquiler()+" €";
        return devu;
    }
    
}
