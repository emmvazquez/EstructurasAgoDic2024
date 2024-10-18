/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repasoHerencia;

/**
 *
 * @author emmanuel
 */
public class Vuelo {

    private int noVuelo;
    private String destino;
    private String clase;
    private String horaSalida;
    private String fecha;
    private int costo;
    private Personal[] personal;
    private Pasajero[] pasajeros;

    public Vuelo(int noVuelo, String destino, String clase, String horaSalida, String fecha, int costo, Personal[] personal, Pasajero[] pasajeros) {
        this.noVuelo = noVuelo;
        this.destino = destino;
        this.clase = clase;
        this.horaSalida = horaSalida;
        this.fecha = fecha;
        this.costo = costo;
        this.personal = personal;
        this.pasajeros = pasajeros;
    }

    public void listarPasajeros() {
        int nH=0, nM =0;
                
        for(int i=0; i < this.getPasajeros().length;i++){
            System.out.println(this.getPasajeros()[i].getNombre());
            
            if(this.getPasajeros()[i].getSexo().equals("H") ){
                nH++;
            }
            else{
                nM++;
            }
            
        }
        System.out.println("No de Hombres: "+ nH);
        System.out.println("No de Mujeres: "+ nM);
        
        
        
    }
    
    
    public void aterrizar(){
        System.out.println("El vuelo está aterrizando en :" + this.getDestino()  );
    }
    
    public void despegar(){
        System.out.println("El vuelo está despegando desde :" + this.getDestino()
                +"a las :" + this.getHoraSalida());
    }
    
    
    public int getNoVuelo() {
        return noVuelo;
    }

    public void setNoVuelo(int noVuelo) {
        this.noVuelo = noVuelo;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public Personal[] getPersonal() {
        return personal;
    }

    public void setPersonal(Personal[] personal) {
        this.personal = personal;
    }

    public Pasajero[] getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(Pasajero[] pasajeros) {
        this.pasajeros = pasajeros;
    }
    
    
}
