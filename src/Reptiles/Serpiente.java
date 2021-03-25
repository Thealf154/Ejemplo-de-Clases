package Reptiles;


	public class Serpiente extends Reptiles {
	    Serpiente(String sistemaDigestivo, String tiempoDeVida, Double TemperaturaCorporal,  boolean tienecola) {
	        super(sistemaDigestivo, tiempoDeVida);
	        this.arrastrarse();
	        this.viviparo();
	    }
	    
	
	    
	
	    protected void arrastrarse(){
	        System.out.println("La serpiente se esta arrastrando");
	        this.arrastrarse();
	    }
	    
	    
		protected void viviparo() {
			
			System.out.println("la serpiente es vivipara");
			this.viviparo();
	    }	
			
		
	    

		public static void main(String[] args) {
	       Serpiente serpiente = new Serpiente("carnivoro", "25 años" , 38.0, true);
	       serpiente.arrastrarse();
	       serpiente.reproducirse();
	       serpiente.respirar();
	       serpiente.viviparo();
	    }


	    
		}
