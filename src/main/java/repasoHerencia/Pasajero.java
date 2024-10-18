/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repasoHerencia;

/**
 *
 * @author emmanuel
 */
public class Pasajero extends Persona{
    private int noBoleto;
    private String asiento;
    private String pasaporte;
    private float equipajeK;

    public Pasajero(int noBoleto, String asiento, String pasaporte, float equipajeK) {
        this.noBoleto = noBoleto;
        this.asiento = asiento;
        this.pasaporte = pasaporte;
        this.equipajeK = equipajeK;
    }

    public Pasajero(String nombre, float estatura, float peso, String fechaNacimiento, 
            String sexo, String nacionalidad, int noBoleto, String asiento, String pasaporte, float equipajeK) {
        super(nombre, estatura, peso, fechaNacimiento, sexo, nacionalidad);
        this.noBoleto = noBoleto;
        this.asiento = asiento;
        this.pasaporte = pasaporte;
        this.equipajeK = equipajeK;
    }
    
    public void abordar(){
    
    }
    
    public void pagar(){
        
    }

    public int getNoBoleto() {
        return noBoleto;
    }

    public void setNoBoleto(int noBoleto) {
        this.noBoleto = noBoleto;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    public String getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(String pasaporte) {
        this.pasaporte = pasaporte;
    }

    public float getEquipajeK() {
        return equipajeK;
    }

    public void setEquipajeK(float equipajeK) {
        this.equipajeK = equipajeK;
    }
    
    
    
}
