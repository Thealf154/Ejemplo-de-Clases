package Insectos;

import java.util.Scanner;

public class Abeja extends Insectos {

    private boolean tieneAguijon;
    private double tamañocm;

    public Abeja(String sistemaDigestivo, String tiempoDeVida, boolean pellilloAdherente, boolean tieneAlas,
            boolean tieneAguijon, double tamañocm) {

        super(sistemaDigestivo, tiempoDeVida, pellilloAdherente, tieneAlas);

        this.tieneAguijon = tieneAguijon;
        this.tamañocm = tamañocm;

    }

    public void setTieneAguijon(boolean tieneAguijon) {
        this.tieneAguijon = tieneAguijon;
    }

    public boolean getTieneAguijon() {
        return tieneAguijon;
    }

    public void setTamañocm(double tamañocm) {
        this.tamañocm = tamañocm;
    }

    public double getTamañocm() {
        return tamañocm;
    }

    public void estraton() {

        if (this.tamañocm <= 0.55 && this.tieneAguijon == true) {
            System.out.println("Este ejemplar es una abeja obrera");
        }

        else if ((this.tamañocm <= 1.7 & this.tamañocm > 0.55) && this.tieneAguijon == false) {
            System.out.println("Esta abeja es un ejemplar zángano.");
        }

        else if ((this.tamañocm <= 3 & this.tamañocm > 1.7) && this.tieneAguijon == false) {
            System.out.println("Este ejemplar es una abeja reina");
        }

        else {
            System.out.println("Las características ingresadas no coinciden con ninguna clase de abeja.");
        }

    }

    public static void main(String[] args) {

        Scanner teclado5 = new Scanner(System.in);
        double tam;
        int si;
        boolean res = true;

            System.out.println("Mostrando a la abeja: ");
            System.out.println("Ingrese el tamaño de la abeja en centímetros");
            tam = teclado5.nextDouble();

        do{

            System.out.println("Esta abeja tiene aguijón? \n Ingrese un 1 si la respuesta es sí. De lo contrario ingrese un 0.");
            si = teclado5.nextInt();

            if (si == 1){
                res = true;
            }

            else if (si == 0){
                res = false;
            }
            else {
                System.out.println("Ingrese una respuesta válida por favor.");
            }

        teclado5.close();

        }while (si != 1 && si != 0);

        Abeja abeja1 = new Abeja("Herbívora", "28 días", true, true, res, tam);

        abeja1.estraton();


    }

}
