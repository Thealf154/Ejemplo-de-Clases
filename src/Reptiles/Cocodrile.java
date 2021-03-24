package Reptiles;

public class Cocodrile extends Reptiles {
	Cocodrile(String sistemaDigestivo, String tiempoDeVida, boolean esOviparo, Double temperatura, boolean exoesqueleto,
			String textura) {
		super(sistemaDigestivo, tiempoDeVida, esOviparo, temperatura, exoesqueleto, textura);
	}

	protected static void main(String[] args) {
		Cocodrile cocodrile = new Cocodrile("carnivoro", "70 años", 50.0, true);
		cocodrile.arrastrarse();
		cocodrile.reproducirse();
		cocodrile.respirar();
		cocodrile.viviparo();
	}

	protected void arrastrarse() {
		System.out.println("El cocodrilo se arrastra");
	}

	protected void viviparo() {

		System.out.println("El cocodrilo es viviparo");
	}

}
