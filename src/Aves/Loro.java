package Aves;
    
public class Loro extends Aves{
    
    private boolean Habla;
    private String Mup; 
    
    Loro(String sistemaDigestivo, String tiempoDeVida,String tipodevuelo, boolean vuela, String plumaje, boolean habla, String mup) {
        super(sistemaDigestivo, tiempoDeVida, tipodevuelo, vuela, plumaje);
        this.Habla = habla;
        this.Mup = mup;
    }

    public void setHabla(boolean habla){
        this.Habla = habla;
    }
    
    public boolean getHabla(){
        return this.Habla;
    }
    
    public void setMup(String mup){
        this.Mup = mup;
    }
    
    public String getMup(){
        return this.Mup;
    }

    
    public void Hablar(){
        if(getHabla()==true){
            System.out.println("Este loro puede hablar");
        }
        else {
            System.out.println(getHabla());
            System.out.println("Este loro no puede hablar");
        }
    }
    
    public static void main(String[] args) {
       Loro loro1 = new Loro ("Herviboro", "80 años", "Constante", true, "verde", true, "Zurdo");
       
       System.out.println("El loro es color " + loro1.getPlumaje());
       
       loro1.Hablar();

}
}
