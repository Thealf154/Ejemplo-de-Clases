package Terrestres;

import java.util.Scanner;

public class Elefante extends Terrestres {

    private double medidaColmillos;
    private int años;

    public Elefante(String sistemaDigestivo, String tiempoDeVida, String tipoDeRespiracion, boolean tienePatas,
            double medidaColmillos, int años) {

        super(sistemaDigestivo, tiempoDeVida, tipoDeRespiracion, tienePatas);

        this.medidaColmillos = medidaColmillos;
        this.años = años;

    }

    protected void setMedidaColmillos(double medidaColmillos) {
        this.medidaColmillos = medidaColmillos;
    }

    protected double getMedidaColmillos() {
        return medidaColmillos;
    }

    protected void setAños(int años) {
        this.años = años;
    }

    protected int getaños() {
        return años;
    }

    protected void peligro() {
        if (this.medidaColmillos >= 1.5) {
            System.out.println(
                    "Este elefante se encuentra en peligro de ser cazado ilegalmente por el tamaño de sus colmillos. ");
        }

        else {
            System.out.println("Este elefante no se encuentra en peligro de ser cazado ilegalmente por el tamaño de sus colmillos.");

        }
    }

    protected void etapas() {
        if (años <= 3) {

            System.out.println("Este elefante se encuentra en su etapa de bebé.");

        }

        else if (años > 3 && años <= 12) {

            System.out.println("Este elefante se encuentra en su etapa de niñez");

        }

        else if (años > 12 && años <= 30) {

            System.out.println("Este elefante es un ejemplar joven");

        }

        else if (años > 30 && años <= 49) {

            System.out.println("Este elefante es un ejemplar adulto");

        }

        else {

            System.out.println("Este elefante se encuentra en su etapa de vejez");
        }
    }

    public static void main(String[] args) {

        double lar;
        int age;
        
        Scanner teclado2 = new Scanner (System.in);
        System.out.println("Mostrando elefante: ");

        System.out.println("Ingrese el tamaño de los colmillos de este elefante en metros: ");
        lar = teclado2.nextDouble();

        System.out.println("Ingrese la edad de este elefante: ");
        age = teclado2.nextInt();

        teclado2.close();

        Elefante ele1 = new Elefante("Herbívoro", "70 años", "tipoDeRespiracion", true, lar, age);

        ele1.peligro();
        ele1.etapas();

    }

}
