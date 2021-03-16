package Terrestres;

import Animales.*;

class Terrestres extends Animales {

    protected String tipoDeRespiracion;
    protected boolean tienePatas;

    public Terrestres(String sistemaDigestivo, String tiempoDeVida,String tipoDeRespiracion,boolean tienePatas){
	super(String sistemaDigestivo, String tiempoDeVida);
	
	this.tipoDeRespiracion = tipoDeRespiracion;
	this.tienePatas = tienePatas;
	
    }
    
    public void setTipoDeRespiracion (String tipoDeRespiracion){
    	this.tipoDeRespiracion = tipoDeRespiracion;
    }
    
	    public String getTipoDeRespiracion () {
	    	return tipoDeRespiracion;
	    }
    
    public void setTienePatas (boolean tienePatas){
    	this.tienePatas = tienePatas;
    }
    
    public boolean getTienePatas () {
    	return tienePatas;
    }
    
    public void caminar() {
    	
    	if (tienePatas == true) {
    		System.out.println("Esta animal tiene la capacidad de caminar.");
    	}
    	
    	else {
    		System.out.println("Este animal no posee la capacidad de caminar");
    	}
    	
    }
}
