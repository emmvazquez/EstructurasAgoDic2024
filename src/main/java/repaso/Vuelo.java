/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso;

/**
 *
 * @author emmanuel
 */
public class Vuelo {
    private String origen;
    private String destino;
    private String hora;
    private String fecha;
    private Pasajero[] pasajeros;

    public Vuelo(String origen, String destino, String hora, String fecha, Pasajero[] pasajeros) {
        this.origen = origen;
        this.destino = destino;
        this.hora = hora;
        this.fecha = fecha;
        this.pasajeros = pasajeros;
    }
    
    public void getListaPasajeros(){
        
        System.out.println("Origen: " + this.getOrigen());
        System.out.println("Destino: " + this.getDestino());
        System.out.println(this.getFecha());
        System.out.println(this.getHora());
        
        for(int i = 0; i < this.getPasajeros().length; i++){
            System.out.println(this.getPasajeros()[i].getNombre());
        }
    }
    
    
    public void aterrizar(){
        System.out.println("El vuelo " + this.getDestino() + "está aterrizando" );
    }
    

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Pasajero[] getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(Pasajero[] pasajeros) {
        this.pasajeros = pasajeros;
    }
    
    
}
