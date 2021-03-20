package Terrestres;

import Animales.*;

class Terrestres extends Animales {

    private String tipoDeRespiracion;
    private boolean tienePatas;

    public Terrestres(String sistemaDigestivo, String tiempoDeVida,String tipoDeRespiracion,boolean tienePatas){
	    super(sistemaDigestivo, tiempoDeVida);
	    this.tipoDeRespiracion = tipoDeRespiracion;
	    this.tienePatas = tienePatas;
    }

	public void respirar(){

	}
    public void reproducirse(){
        System.out.println("Animal terrestre se está reproduciendo");
	}
    
    public void setTipoDeRespiracion (String tipoDeRespiracion){
    	this.tipoDeRespiracion = tipoDeRespiracion;
    }
    
	    public String getTipoDeRespiracion () {
	    	return this.tipoDeRespiracion;
	    }
    
    public void setTienePatas (boolean tienePatas){
    	this.tienePatas = tienePatas;
    }
    
    public boolean getTienePatas () {
    	return this.tienePatas;
    }
    
    public void caminar() {
    	
    	if (this.tienePatas) {
    		System.out.println("Esta animal tiene la capacidad de caminar.");
    	}
    	
    	else {
    		System.out.println("Este animal no posee la capacidad de caminar");
    	}
    	
    }
}
