/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso;

/**
 *
 * @author emmanuel
 */
public class Principal {
    
    
    public static void main(String[] a){
        Pasajero p1 = new Pasajero("Emmanuel","04/02/1984");
        Pasajero p2 = new Pasajero("Daniel","09/12/1900");
        Pasajero p3 = new Pasajero("Brenda","01/01/2000");
        
        Pasajero[] arreglo = {p1,p2,p3};
        
        
        Vuelo v1 = new Vuelo("Teziutlán","Chignautla","15:00","21/08/2024", arreglo);
        
        v1.getListaPasajeros();
        
    }
}
