import java.util.InputMismatchException;
import java.util.Scanner;

import Anfibios.*;
import Aves.*;
import Humannos.*;
import Marinos.*;
import Reptiles.*;
import Terrestres.*;

public class Zoologico {
    private static Scanner tecleado;
    private static String[] args = {};

    public static void main(String[] args) {
        crearVisitante();
        decidir();
    }

    public static void decidir() {
        System.out.println("Ingrese que sección quiere visitar de nuestro zoológico:");
        System.out.println("0: Anfibios, 1:Marinos, 2:Reptiles, 3:Aves, 4:Terrestres, 5:Salir del zoológico");
        tecleado = new Scanner(System.in);
        int desición;
        try {
            desición = tecleado.nextInt();
            switch (desición) {
            case 0:
                visitarAnfibios();
                break;
            case 1:
                visitarMarinos();
                break;
            case 2:
                visitarReptiles();
                break;
            case 3:
                visitarAves();
                break;
            case 4:
                visitarTerrestres();
                break;
            case 5:
                System.out.println("Gracias por visitarnos, vuelva pronto");
                System.exit(0);
                break;
            default:
                System.out.println("Ingrese un valor válido");
            }
            decidir();
        } catch (InputMismatchException i) {
            System.out.println("Ingrese un dato válido");
            // Espera dos segundos antes de borrar la pantalla
            duerme();
            clearScreen();
            main(args);
        } catch (Exception e) {
            System.out.println("Algo ocurrió mal, reiniciando...");
            // Espera tres segundos antes de borrar la pantalla
            duerme();
            clearScreen();
        }
    }

    public static void duerme() {
        try {
            System.out.println("Reiniciando programa...");
            System.out.println("Espere");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Interrupio el programa");
            main(args);
        }
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static Humanos crearVisitante() {
        tecleado = new Scanner(System.in);
        String sexo, nombre, edad;
        System.out.println("Bienvenido al zoológico de Wameru");
        System.out.println("Antes de ingresar, tenemos quue pedirle sus datos");
        System.out.println("Ingrese su nombre:");
        nombre = tecleado.next();
        System.out.println("Ingrese su sexo: ");
        sexo = tecleado.next();
        System.out.println("Ingrese su edad");
        edad = String.valueOf(tecleado.nextInt());
        Humanos humano = new Humanos("Omnivoro", edad, "Pulmones", true, nombre, sexo);
        return humano;
    }

    public static void visitarAnfibios() {
        tecleado = new Scanner(System.in);
        System.out.println("Animales disponibles:");
        System.out.println("0: Rana");
    }

    public static void visitarMarinos() {
        int desición;
        tecleado = new Scanner(System.in);
        System.out.println("Animales disponibles:");
        System.out.println("0: Ballena");
        System.out.println("1: Delfin");
        System.out.println("2: Pez");
        System.out.println("3: Tiburón");
        System.out.println("Ingrese su opción:");

        try {
            desición = tecleado.nextInt();
            switch (desición) {
            case 0:
                Ballena.main(args);
                break;
            case 1:
                Delfín.main(args);
                break;
            case 2:
                Pez.main(args);
                break;
            case 3:
                Tiburón.main(args);
                break;
            default:
                System.out.println("Ingrese un valor válido");
                break;
            }
        } catch (InputMismatchException i) {
            System.out.println("Ingrese un dato válido");
            // Espera dos segundos antes de borrar la pantalla
            duerme();
            clearScreen();
            visitarMarinos();
        }
    }

    public static void visitarReptiles() {
        int desición;
        tecleado = new Scanner(System.in);
        System.out.println("Animales disponibles:");
        System.out.println("0: Cocodrilo");
        System.out.println("1: Lagartija");
        System.out.println("2: Serpiente");
        System.out.println("Ingrese su opción:");

        try {
            desición = tecleado.nextInt();
            switch (desición) {
            case 0:
                Cocodrile.main(args);
                break;
            case 1:
                Lagartija.main(args);
                break;
            case 2:
                Serpiente.main(args);
                break;
            default:
                System.out.println("Ingrese un valor válido");
                break;
            }
        } catch (InputMismatchException i) {
            System.out.println("Ingrese un dato válido");
            // Espera dos segundos antes de borrar la pantalla
            duerme();
            clearScreen();
            visitarReptiles();
        }
    }

    public static void visitarAves() {
        int desición;
        tecleado = new Scanner(System.in);
        System.out.println("Animales disponibles:");
        System.out.println("0: Aguila");
        System.out.println("1: Búho");
        System.out.println("2: Gallina");
        System.out.println("3: Loro");
        System.out.println("Ingrese su opción:");

        try {
            desición = tecleado.nextInt();
            switch (desición) {
            case 0:
                Aguila.main(args);
                break;
            case 1:
                Buho.main(args);
                break;
            case 2:
                Gallina.main(args);
                break;
            case 3:
                Loro.main(args);
                break;
            default:
                System.out.println("Ingrese un valor válido");
                break;
            }
        } catch (InputMismatchException i) {
            System.out.println("Ingrese un dato válido");
            // Espera dos segundos antes de borrar la pantalla
            duerme();
            clearScreen();
            visitarAves();
        }
    }

    public static void visitarTerrestres() {
        int desición;
        tecleado = new Scanner(System.in);
        System.out.println("Animales disponibles:");
        System.out.println("0: Conejo");
        System.out.println("1: Elefante");
        System.out.println("2: Gato");
        System.out.println("Ingrese su opción:");

        try {
            desición = tecleado.nextInt();
            switch (desición) {
            case 0:
                Conejo.main(args);
                break;
            case 1:
                Elefante.main(args);
                break;
            case 2:
                Gato.main(args);
                break;
            default:
                System.out.println("Ingrese un dato válido");
                break;
            }
        } catch (InputMismatchException i) {
            System.out.println("Ingrese un dato válido");
            // Espera dos segundos antes de borrar la pantalla
            duerme();
            clearScreen();
            visitarTerrestres();
        }
    }

}
