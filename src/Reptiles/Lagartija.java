package Reptiles;

public class Lagartija extends Reptiles {
	Lagartija(String sistemaDigestivo, String tiempoDeVida, boolean esOviparo, Double temperatura, boolean exoesqueleto,
			String textura, boolean tienecola){
		super(sistemaDigestivo, tiempoDeVida, esOviparo, temperatura, exoesqueleto, textura);
	}


	public void deslizarse() {
		System.out.println("La lagartija se desliza");
	}

	private void viviparo() {
		System.out.println("La lagartija es viviparo");
	}

	/*public static void main(String[] args) {
		Lagartija lagartija = new Lagartija("carnivoro", "20 años", 25.0, true);
		lagartija.arrastrarse();
		lagartija.reproducirse();
		lagartija.respirar();
		lagartija.viviparo();
	}*/
}
