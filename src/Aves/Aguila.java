package Aves;
    
public class Aguila extends Aves{
    
    private String Pesocarga;
    private boolean Cazar; 
    
    Aguila(String sistemaDigestivo, String tiempoDeVida,String tipodevuelo, boolean vuela, String plumaje, String pesocarga, boolean cazar) {
        super(sistemaDigestivo, tiempoDeVida, tipodevuelo, vuela, plumaje);
        this.Pesocarga = pesocarga;
        this.Cazar = cazar;
    }

    public void setPesocarga(String pesocarga){
        this.Pesocarga = pesocarga;
    }
    
    public String getPesocarga(){
        return this.Pesocarga;
    }
    
    public void setCazar(boolean cazar){
        this.Cazar = cazar;
    }
    
    public boolean getCazar(){
        return this.Cazar;
    }

    
    public void caza(){
       if(getCazar()==true){
            System.out.println("El aguila caza");
        }
        else {
            System.out.println("El aguila ya no caza");
        } 
    }
    
    public static void main(String[] args) {
        System.out.println("Mostando a la aguila");
       Aguila aguila1 = new Aguila ("Carnivoro", "5 años", "Constante", true, "cafe con blanco", "10 kg", true);
       
       System.out.println("El aguila es color " + aguila1.getPlumaje());
       System.out.println("Tiene " + aguila1.getTiempoDeVida() + " de tiempo de vida");
       aguila1.caza();
        System.out.println("Puede cargar un peso de " + aguila1.getPesocarga());

}
}
