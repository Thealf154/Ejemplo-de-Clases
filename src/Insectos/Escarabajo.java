package Insectos;

public class Escarabajo extends Insectos{

    private boolean segmentacionAbdominal;
    private boolean suturaNotopleural;

    public Escarabajo (String sistemaDigestivo, String tiempoDeVida, boolean pelilloAdherente, boolean tieneAlas, boolean segmentacionAbdominal, boolean suturaNotopleural){

        super(sistemaDigestivo, tiempoDeVida, pelilloAdherente, tieneAlas);

        this.segmentacionAbdominal = segmentacionAbdominal;
        this.suturaNotopleural = suturaNotopleural;
        
    }

    public void setSegmentacionAbdominal (boolean segmentacionAbdominal){
        this.segmentacionAbdominal = segmentacionAbdominal;
    }

        public boolean getSegmentacionAbdominal (){
            return segmentacionAbdominal;
        }

    public void setSuturaNotopleural (boolean suturaNotopleural){
        this.suturaNotopleural = suturaNotopleural;
    }

        public boolean getSuturaNotopleural (){
            return suturaNotopleural;
        }

    public void Order (){

        if (segmentacionAbdominal == true && suturaNotopleural == true){

            System.out.println("Este escarabajo pertenece al orden Adephaga.");

        }

        else {

            System.out.println("Este escarabajo pertence al orden Polyphaga");

        }

    }
    
}
