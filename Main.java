import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Edad edad = null;

        do {

            int opcion = scanner.nextInt();

            int anioNac;
            int mesNac;
            int diaNac;

            System.out.println("Elija una opción:");
            System.out.println("1. Crear edad con fecha completa");
            System.out.println("2. Crear edad con solo año");
            System.out.println("3. Crear edad con solo meses y días");
            System.out.println("4. Crear edad con edad en años");

            switch (opcion) {
                case 1:

                    System.out.println("Ingrese el año de nacimiento:");
                    anioNac = scanner.nextInt();
                    System.out.println("Ingrese el mes de nacimiento:");
                    mesNac = scanner.nextInt();
                    System.out.println("Ingrese el dia de nacimiento:");
                    diaNac = scanner.nextInt();

                    if (mesNac < 1 || mesNac > 12 || diaNac < 1 || diaNac > 30) {
                        throw new IllegalArgumentException("Valores fuera de rango: año debe estar entre 1 y 9999, mes entre 1 y 12, día entre 1 y 30.");
                    }

                    edad = new Edad(anioNac, mesNac, diaNac);
                    break;
                case 2:
                    System.out.println("Ingrese el año de nacimiento:");
                    anioNac = scanner.nextInt();
                    edad = new Edad(anioNac);
                    break;
                case 3:
                    System.out.println("Ingrese el mes de nacimiento:");
                    mesNac = scanner.nextInt();
                    System.out.println("Ingrese el dia de nacimiento:");
                    diaNac = scanner.nextInt();
                    edad = new Edad(mesNac, diaNac);
                    break;
                case 4:
                    System.out.println("Ingrese la edad en años:");
                    byte edadEnAnios = scanner.nextByte();
                    edad = new Edad(edadEnAnios);
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

        } while (edad == null);
    }
}
