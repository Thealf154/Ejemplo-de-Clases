package Aves;
    
public class Gallina extends Aves{
    
    private String Colordepluma;
    private boolean Planea; 
    
    Gallina(String sistemaDigestivo, String tiempoDeVida,String tipodevuelo, boolean vuela, String colordepluma, boolean planea) {
        super(sistemaDigestivo, tiempoDeVida, tipodevuelo, vuela);
        this.Colordepluma = colordepluma;
        this.Planea = planea;
    }

    public void setColordepluma(String colordepluma){
        this.Colordepluma = colordepluma;
    }
    
    public String getColordepluma(){
        return this.Colordepluma;
    }

    public void setPlanea(boolean planea){
        this.Planea = planea;
    }
    
    public boolean getPlanea(){
        return this.Planea;
    }
    
    
    public void planear(){
        if(this.Planea){
            System.out.println("La gallina esta planeando");
        }
        else {
            System.out.println("La gallina no puede planear");
        }
    }
    public static void main(String[] args) {
       Gallina gallina1 = new Gallina("Herbivoro", "1 año", "Por momentos", false, "cafe", true);
       
       System.out.println("La gallina tiene plumas color " + gallina1.getColordepluma());
       
       gallina1.volar();
       gallina1.planear();

    }
    
}
