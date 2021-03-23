package Aves;
    
public class Gallina extends Aves{
    
    private String Colordepluma;
    private boolean Planea; 
    
    Gallina(String sistemaDigestivo, String tiempoDeVida,String tipodevuelo, boolean vuela, String plumaje, boolean planea) {
        super(sistemaDigestivo, tiempoDeVida, tipodevuelo, vuela, plumaje);
        this.Planea = planea;
    }

    public void setPlanea(boolean planea){
        this.Planea = planea;
    }
    
    public boolean getPlanea(){
        return this.Planea;
    }
    
    
    public void planear(){
        if(getPlanea()==true){
            System.out.println("La gallina esta planeando");
        }
        else {
            System.out.println(getPlanea());
            System.out.println("La gallina no puede planear");
        }
    }
    public static void main(String[] args) {
       Gallina gallina1 = new Gallina("Herbivoro", "1 año", "Por momentos", false, "cafe", true);
       
       System.out.println("La gallina es color " + gallina1.getPlumaje());
       
       gallina1.volar();
       gallina1.planear();

    }
    
}
