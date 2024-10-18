/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repasoHerencia;

/**
 *
 * @author emmanuel
 */
public class Personal extends Persona{
    private int salario;
    private String turno;
    private String grado;
    private String cargo;

    
    
    public Personal(int salario, String turno, String grado, String cargo) {
        this.salario = salario;
        this.turno = turno;
        this.grado = grado;
        this.cargo = cargo;
    }

    public Personal() {
    }

    public Personal( String nombre, float estatura, float peso, String fechaNacimiento, String sexo, String nacionalidad, int salario, String turno, String grado, String cargo) {
        super(nombre, estatura, peso, fechaNacimiento, sexo, nacionalidad);
        this.salario = salario;
        this.turno = turno;
        this.grado = grado;
        this.cargo = cargo;
    }

    
    public Personal(String nombre, float estatura, float peso, String fechaNacimiento, String sexo, String nacionalidad) {
        super(nombre, estatura, peso, fechaNacimiento, sexo, nacionalidad);
    }

    
    public void trabajar(){
        
    }
    
    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    
}
