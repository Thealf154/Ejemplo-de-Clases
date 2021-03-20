package Aves;

import Animales.*;

class Aves extends Animales {
    
    protected String TipoDeVuelo;
    protected boolean Vuela;

    public Aves(String sistemaDigestivo, String tiempoDeVida,String tipoDeVuelo,boolean vuela){
	super(sistemaDigestivo, tiempoDeVida);
        this.TipoDeVuelo = tipoDeVuelo;
        this.Vuela = vuela;
        
    }

    public void setTipoDeVuelo(String tipodevuelo){
        this.TipoDeVuelo = tipodevuelo;
    }
    
    public String getTipoDeVuelo(){
        return this.TipoDeVuelo;
    }

    public void setVuela(boolean vuela){
        this.Vuela = vuela;
    }
    
    public boolean getVuela(){
        return this.Vuela;
    }
    
    
    public void volar(){
        if (getVuela()==true){
            System.out.println("El ave esta volando ");
        }
        else {
            System.out.println("Este ave no vuela ");
        }
    }

    @Override
    public void respirar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void reproducirse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    }

