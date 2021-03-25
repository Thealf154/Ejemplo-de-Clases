package Reptiles;

public class Lagartija extends Reptiles {
	Lagartija(String sistemaDigestivo, String tiempoDeVida, boolean esOviparo, Double temperatura, boolean exoesqueleto,
			String textura) {
		super(sistemaDigestivo, tiempoDeVida, esOviparo, temperatura, exoesqueleto, textura);
	}

	public void deslizarse() {
		System.out.println("La lagartija se desliza");
		this.deslizarse();
	}

	protected void viviparo() {
		System.out.println("La lagartija es viviparo");
		this.viviparo();
	}

	public static void main(String[] args) {
		System.out.println("Mostrando la lagartija");
		Lagartija lagartija = new Lagartija("carnivoro", "70 años", true, 50.0, true, "rugosa");
		lagartija.deslizarse();
		lagartija.reproducirse();
		lagartija.respirar();
		lagartija.viviparo();
	}
}