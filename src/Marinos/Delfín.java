package Marinos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Delfín extends Marinos {
    private boolean sabeTrucos;
    private boolean obedeceOrdenes;

    Delfín(String sistemaDigestivo, String tiempoDeVida, boolean tieneAletas, Double temperatura, Double presión,
            boolean sabeTrucos, boolean obedeceOrdenes) {
        super(sistemaDigestivo, tiempoDeVida, tieneAletas, temperatura, presión);
        this.sabeTrucos = sabeTrucos;
        this.obedeceOrdenes = obedeceOrdenes;
    }

    protected void hazTruco() {
        try (BufferedReader br = new BufferedReader(new FileReader("src/Marinos/Delfin.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException f) {
            System.out.println("No encontrado");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected void setSabeTrucos(boolean sabeTrucos) {
        this.sabeTrucos = sabeTrucos;
    }

    protected boolean getSabeTrucos() {
        return this.sabeTrucos;
    }

    protected void setObedeceOrdenes(boolean obedeceOrdenes) {
        this.obedeceOrdenes = obedeceOrdenes;
    }

    protected boolean getObedeceOrdenes() {
        return this.obedeceOrdenes;
    }

    public static void main(String[] args) {
        System.out.println("Mostrando al delfín");
        Delfín delfín = new Delfín("Carnivoro", "10 años", true, 40.0, 10.0, true, true);
        System.out.println("Tiene aletas: " + delfín.getTieneAletas());
        System.out.println("Temperatura: " + delfín.getTemperaturaCorporal());
        System.out.println("Presión: " + delfín.getPresiónAgua());
        System.out.println("Sabe hacer trucos: " + delfín.getSabeTrucos());
        System.out.println("Obede Ordenes: " + delfín.getObedeceOrdenes());
        System.out.println("El delfín hara un truco:");
    }
}