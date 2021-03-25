package Reptiles;


	public class Lagartija extends Reptiles {
	    Lagartija(String sistemaDigestivo, String tiempoDeVida, Double TemperaturaCorporal,  boolean tienecola) {
	        super(sistemaDigestivo, tiempoDeVida);
	        this.deslizarse();
	        this.viviparo();
	    }
	    
	
	    protected void deslizarse(){
	        System.out.println("La lagartija se desliza");
	        this.deslizarse();
	    }
	    
	    
		protected void viviparo() {
			
			System.out.println("La lagartija es viviparo");
			this.viviparo();
	    }	
			
		

	
	

	    

		public static void main(String[] args) {
	       Lagartija lagartija = new Lagartija("carnivoro", "20 años" , 25.0, true);
	       lagartija.deslizarse();
	       lagartija.reproducirse();
	       lagartija.respirar();
	       lagartija.viviparo();
	    }
	}


	    
	   
		}

	
		


