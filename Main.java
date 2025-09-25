import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Personajes mago = null;
        Personajes demonio = null;


            System.out.println("Has elegido crear un Mago");
            System.out.println("Ingresa la fuerza del Mago (1-10): ");
            Integer fuerzaMago = scan.nextInt();

            System.out.println("Ingresa la inteligencia del Mago (1-10): ");
            Integer inteligenciaMago = scan.nextInt();

            System.out.println("Ingresa la resistencia del Mago (1-10): ");
            Integer resistenciaMago = scan.nextInt();

            System.out.println("Ingresa la vida del Mago (1-100): ");
            Integer vidaMago = scan.nextInt();

            mago = new Mago(fuerzaMago, inteligenciaMago, resistenciaMago, vidaMago);
            System.out.println("Mago creado con exito!");
            System.out.println("Vida actual del Mago: " + mago.getVida());

            System.out.println("Has elegido crear un Demonio");
            System.out.println("Ingresa la fuerza del Demonio (1-10): ");
            Integer fuerzaDemonio = scan.nextInt();

            System.out.println("Ingresa la inteligencia del Demonio (1-10): ");
            Integer inteligenciaDemonio = scan.nextInt();

            System.out.println("Ingresa la resistencia del Demonio (1-10): ");
            Integer resistenciaDemonio = scan.nextInt();

            System.out.println("Ingresa la vida del Demonio (1-100): ");
            Integer vidaDemonio = scan.nextInt();

            demonio = new Demonio(fuerzaDemonio, inteligenciaDemonio, resistenciaDemonio, vidaDemonio);
            System.out.println("Demonio creado con exito!");
            System.out.println("Vida actual del Demonio: " + demonio.getVida() + "\n");

        System.out.println("Ingrese la cantidad de movimientos que puede hacer el personaje: ");
        Integer cantidadMovimientosPersonajes = scan.nextInt();
        scan.nextLine();

        for (Integer i = 0; i < cantidadMovimientosPersonajes; i++) {
            if (mago != null && demonio != null) {

                System.out.println("Que deseas que haga el Mago: \n 1. Atacar 2. Curar");
                Integer accionMago = scan.nextInt();

                switch (accionMago) {
                    case 1:
                        System.out.println("El Mago ataca!");
                        mago.atacar();
                        System.out.println("Vida del Demonio después de ser atacado: " + demonio.getVida());
                        break;
                    case 2:
                        System.out.println("El Mago se cura!");
                        mago.curarVida();
                        System.out.println("Vida del Mago después de curarse: " + mago.getVida());
                        break;
                    default:
                        System.out.println("Accion no valida para el Mago");
                }

                System.out.println("\nQue deseas que haga el demonio: \n 1. Atacar 2. Curar");
                Integer accionDemonio = scan.nextInt();

                switch (accionDemonio) {
                    case 1:
                        System.out.println("El Demonio ataca!");
                        demonio.atacar();
                        System.out.println("Vida del mago después de ser atacado: " + mago.getVida());
                        break;
                    case 2:
                        System.out.println("El demonio se cura!");
                        demonio.curarVida();
                        System.out.println("Vida del demonio después de curarse: " + demonio.getVida());
                        break;
                    default:
                        System.out.println("Accion no valida para el demonio");
                }
            }
        }

        scan.close();
    }
}
