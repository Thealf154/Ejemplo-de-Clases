package Reptiles;

public class Cocodrile extends Reptiles {
	Cocodrile(String sistemaDigestivo, String tiempoDeVida, boolean esOviparo, Double temperatura,
            boolean exoesqueleto, String textura) {
		super(sistemaDigestivo, tiempoDeVida, esOviparo, temperatura, exoesqueleto, textura);
	}

	public static void main(String[] args) {
		System.out.println("Mostrando el Cocodrilo");
		Cocodrile cocodrile = new Cocodrile("carnivoro", "70 años", true, 50.0, true, "rugosa");
		cocodrile.arrastrarse();
		cocodrile.reproducirse();
		cocodrile.respirar();
		cocodrile.viviparo();
	}

	public void arrastrarse() {
		System.out.println("El cocodrilo se arrastra");
	}

	protected void viviparo() {
		System.out.println("El cocodrilo es viviparo");
	}

}
