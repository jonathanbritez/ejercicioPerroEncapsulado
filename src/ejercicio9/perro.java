/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

/**
 *
 * @author jonathan
 */
public class perro {
     private String Nombre;
    private String Color;
    private String Tamaño;
    private int patas;
//creo el metodo constructor
    public perro(String Nom,int patas){

        this.Nombre = Nom;
        this.patas = patas;
    }    

//Hago el metodo ladrar
    
    public void animal(int PATAS){  //methodo setter
    
        patas = PATAS;
        
        
    }
   
    
    public String ladrar(){ //methodo getter
        Nombre = "Roky";
        return "Guau, el perro " + Nombre + " tiene " + patas + " patas";
        
    }
    
}
