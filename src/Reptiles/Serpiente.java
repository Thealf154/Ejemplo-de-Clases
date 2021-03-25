package Reptiles;

public class Serpiente extends Reptiles {
	Serpiente(String sistemaDigestivo, String tiempoDeVida, boolean esOviparo, Double temperatura, boolean exoesqueleto,
			String textura) {
		super(sistemaDigestivo, tiempoDeVida, esOviparo, temperatura, exoesqueleto, textura);
	}

	public void arrastrarse() {
		System.out.println("La serpiente se esta arrastrando");
		this.arrastrarse();
	}

	protected void viviparo() {

		System.out.println("la serpiente es vivipara");
		this.viviparo();
	}

	public static void main(String[] args) {
		System.out.println("Mostrando la serpiente");
		Serpiente serpiente = new Serpiente("carnivoro", "70 años", true, 50.0, true, "rugosa");
		serpiente.arrastrarse();
		serpiente.reproducirse();
		serpiente.respirar();
		serpiente.viviparo();
	}

}
