package Aves;

public class Gallina extends Aves {
  
    private boolean Planea; 
    
    Gallina(String sistemaDigestivo, String tiempoDeVida,String tipodevuelo, boolean vuela, String plumaje, boolean planea) {
        super(sistemaDigestivo, tiempoDeVida, tipodevuelo, vuela, plumaje);
        this.Planea = planea;
    }

    public void setPlanea(boolean planea){
        this.Planea = planea;
    }

    protected boolean getPlanea() {
        return this.Planea;
    }

    protected void planear() {
        if (this.Planea) {
            System.out.println("La gallina esta planeando");
        } else {
            System.out.println("La gallina no puede planear");
        }
    }
    public static void main(String[] args) {
        System.out.println("Mostrando la gallina");
       Gallina gallina1 = new Gallina("Herbivoro", "1 año", "Por momentos", false, "cafe", true);
       
       System.out.println("La gallina es color " + gallina1.getPlumaje());
       
       gallina1.volar();
       gallina1.planear();

    }
    
}
