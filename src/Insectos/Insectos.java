package Insectos;

import Animales.*;

public class Insectos extends Animales{

    private boolean pelilloAdherente;
    private boolean tieneAlas; 

    public Insectos (String sistemaDigestivo, String tiempoDeVida,boolean pellilloAdherente ,boolean tieneAlas){

        super(sistemaDigestivo, tiempoDeVida);

        this.pelilloAdherente = pellilloAdherente;
        this.tieneAlas = tieneAlas;

    }

    public void respirar(){

	}
    public void reproducirse(){
        System.out.println("Los insectos tienen la capacidad de reproducirse");
	}

    public void setPelilloAdherente (boolean pelilloAdherente){
        this.pelilloAdherente = pelilloAdherente;
    }

        public boolean getPelilloAdherente (){
            return pelilloAdherente;
        }

    public void setTieneAlas (boolean tieneAlas){
        this.tieneAlas = tieneAlas;
    }

        public boolean setTieneAlas (){
            return tieneAlas;
        }

    public void Trepar(){
        if (this.pelilloAdherente = true){
            System.out.println("Este insecto tiene la capacidad de trepar muros.");
        }
    }

    public void clasificacion(){
        if (this.tieneAlas = true){
            System.out.println("Este insecto pertenece a los Pterigotos");
        }

        else {
            System.out.println("Este insecto pertenece a los Ápteros");
        }
    }

    


}