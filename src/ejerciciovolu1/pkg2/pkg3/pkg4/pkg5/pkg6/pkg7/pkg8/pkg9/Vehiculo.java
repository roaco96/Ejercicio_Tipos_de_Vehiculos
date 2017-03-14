/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciovolu1.pkg2.pkg3.pkg4.pkg5.pkg6.pkg7.pkg8.pkg9;

/**
 * 
 * @author
 */
public abstract class Vehiculo 
{
    
    private String matricula;
    private int dias_alquiler;
    /**
     *  
     * @return la matricula del vehículo
     */
    public String getMatricula() {
        return matricula;
    }
    
    /**
     * 
     * @param matricula guarda una nueva matrícula para el vehículo
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * 
     * @return los días de alquiler
     */
    public int getDias_alquiler() {
        return dias_alquiler;
    }

    /**
     * 
     * @param dias_alquiler guarda un número nuevo de días de alquiler
     */
    public void setDias_alquiler(int dias_alquiler) {
        this.dias_alquiler = dias_alquiler;
    }

    /**
     * Constructor por defecto del vehículo
     */
    public Vehiculo() 
    {
        matricula="";
        dias_alquiler=-1;
    }
    
    /**
     * Constructor con parámetros del vehículo
     * @param matricula guarda el valor de la matrícula
     * @param dias_alquiler guarda el número de días de alquiler
     */
    public Vehiculo(String matricula, int dias_alquiler) {
        this.matricula = matricula;
        this.dias_alquiler = dias_alquiler;
    }

    /**
     * Calcula el importe del aquiler
     * @return devuelve el precio total del alquiler
     */
    public abstract double importeAlquiler();
    
    /**
     * Muestra el recibo del alquiler
     * @return el recibo del alquiler
     */
    public abstract String recibo();
    
}
