/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ajedrez;

import java.awt.Color;

/**
 *
 * @author emmanuel
 */
public class Pieza {
    private String nombre;
    private Color color;
    private String imagen;
    private int posX;
    private int posY;

    public Pieza(String nombre, Color color, int posX, int posY) {
        this.nombre = nombre;
        this.color = color;
        this.posX = posX;
        this.posY = posY;
    
    if(color == Color.BLACK){
        switch (nombre) { 
            case "Peón":
                imagen="chess-pawn-solid.png";
               // imagen="chess-pawn-regular.svg";
             break;
            case "Torre":
                imagen="chess-rook-solid.png";
            break; 
            case "Alfil" :
               imagen="chess-pawn-solid.png";
             break;
            case "Reina" :
                imagen="chess-pawn-solid.png";
             break;
             case "Rey" :
               imagen="chess-pawn-solid.png";
             break;
             case "Caballo" :
                imagen="chess-knight-solid.png";
             break;
            }
    }
    else{
        switch (nombre) { 
            case "Peón":
                imagen="chess-pawn-regular.png";
               // imagen="chess-pawn-regular.svg";
             break;
            case "Torre":
                imagen="chess-rook-solid.png";
            break; 
            case "Alfil" :
               imagen="chess-bishop-regular.png";
             break;
            case "Reina" :
                imagen="chess-pawn-solid.png";
             break;
             case "Rey" :
               imagen="chess-king-solid.png";
             break;
             case "Caballo" :
                imagen="chess-pawn-solid.png";
             break;
            }
    }
    
        
    }

    public Pieza(int i, int j) {
        
        this.nombre=null; 
        this.color = null;
        this.imagen="pixel.png";
        this.posX = i;
        this.posY = j;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
    
    
}
