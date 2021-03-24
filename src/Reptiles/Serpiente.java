package Reptiles;

public class Serpiente extends Reptiles {
	private boolean tieneCola;
	private String textura; 

	Serpiente(String sistemaDigestivo, String tiempoDeVida, boolean esOviparo, Double temperatura, boolean exoesqueleto,
			String textura, boolean tienecola) {
		super(sistemaDigestivo, tiempoDeVida, esOviparo, temperatura, exoesqueleto, textura);
	}


	public void arrastrarse() {
		System.out.println("La serpiente se esta arrastrando");
	}

	//Debe ir camelCase en caso de que tenga más de una palabra
	private void esViviparo() {
		System.out.println("la serpiente es vivipara");
	}

	//Tienes que construir un mejor main
	/*public static void main(String[] args) {
		Serpiente serpiente = new Serpiente("carnivoro", "25 años", 38.0, true,);
		serpiente.arrastrarse();
		serpiente.reproducirse();
		serpiente.respirar();
		serpiente.viviparo();
	}*/
}
