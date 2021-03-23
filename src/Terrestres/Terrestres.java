package Terrestres;

import Animales.*;

class Terrestres extends Animales {

	private String tipoDeRespiracion;
	private boolean tienePatas;

	public Terrestres(String sistemaDigestivo, String tiempoDeVida, String tipoDeRespiracion, boolean tienePatas) {
		super(sistemaDigestivo, tiempoDeVida);
		this.tipoDeRespiracion = tipoDeRespiracion;
		this.tienePatas = tienePatas;
	}

	public void respirar() {
		System.out.println("Animal terrestre está respirando");
	}

	public void reproducirse() {
		System.out.println("Animal terrestre se está reproduciendo");
	}

	protected void setTipoDeRespiracion(String tipoDeRespiracion) {
		this.tipoDeRespiracion = tipoDeRespiracion;
	}

	protected String getTipoDeRespiracion() {
		return this.tipoDeRespiracion;
	}

	protected void setTienePatas(boolean tienePatas) {
		this.tienePatas = tienePatas;
	}

	protected boolean getTienePatas() {
		return this.tienePatas;
	}

	protected void caminar() {

		if (this.tienePatas) {
			System.out.println("Esta animal tiene la capacidad de caminar.");
		}

		else {
			System.out.println("Este animal no posee la capacidad de caminar");
		}

	}
}
