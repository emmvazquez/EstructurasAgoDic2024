/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repasoHerencia;

/**
 *
 * @author emmanuel
 */
public class Principal {
    public static void main(String[] a){
        Personal p1 = new Personal("Hector",1.8f,60.3f,"19/12/2000","H","Mexicana",10000,"nocturno","capitan","piloto");
        Personal p2 = new Personal("Vicente",1.8f,60.3f,"21/04/2000","H","Mexicana",10000,"nocturno","capitan","piloto");
        Personal p3 = new Personal("Amado",1.8f,60.3f,"16/07/2000","H","Mexicana",10000,"nocturno","capitan","piloto");
        
        Pasajero pp1 = new Pasajero("Emmanuel",1.6f,70.3f,"19/12/2000","H","Mexicana",102930,"3","23443",10.0f);
        Pasajero pp2 = new Pasajero("Abdiel",1.6f,70.3f,"19/12/2000","H","Mexicana",102931,"4","2343243",10.0f);
        Pasajero pp3 = new Pasajero("Ailyn",1.6f,70.3f,"19/12/2000","M","Mexicana",102932,"5","2343443",10.0f);
        Pasajero pp4 = new Pasajero("Claudia",1.6f,70.3f,"19/12/2000","M","Mexicana",102933,"6","234343",10.0f);
        Pasajero pp5 = new Pasajero("Reyna",1.6f,70.3f,"19/12/2000","M","Mexicana",102934,"7","234443",10.0f);
        
        Personal[] personal =  {p1,p2,p3};
        Pasajero[] pasajeros = {pp1,pp2,pp3,pp4,pp5};
        
        
        Vuelo v1 = new Vuelo(1,"Chignautla","Primera","10:00","22/10/2024",50,personal,pasajeros);
        v1.despegar();
        v1.listarPasajeros();
        v1.aterrizar();
     }
}
