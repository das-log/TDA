
/*Esta clase es el main
 * Aqui se piden datos para calcular tiempo entre dos fechas de forma aproximada.
 */
import java.util.Scanner; //importa el Scanner para leer datos.

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // objeto scanner para ingresar datos posteriormente.
        Edad edad = null; // objeto apartir de la clase Edad para realizar calculos.

        do {
            /*
             * Imprime opciones para ingresar. Cada opción representa distintos casos en un
             * switch.
             */
            System.out.println("Elija una opción:");
            System.out.println("1. Crear edad con fecha completa");
            System.out.println("2. Crear edad con solo año");
            System.out.println("3. Crear edad con solo meses y días");
            System.out.println("4. Crear edad con edad en años");

            byte opcion = scanner.nextByte(); // Objeto tipo Scanner para ingresar opción en switch

            /* Variables que se usan para almacenar valores leídos por el escáner. */
            int anioNac; // representa el año de nacimiento
            int mesNac; // representa el mes de nacimiento
            int diaNac; // representa el día de nacimiento
            int edadEnAnios; // representa la edad en años si se ingresa como constructor
            int segundoAnio, segundoMes, segundoDias; // representa datos de la segunda fecha

            /*
             * Este switch tiene la función de pedir datos según lo requerido por el
             * usuario. Por lo tanto, el objeto de tipo Edad procesará datos según el
             * constructor de cada caso
             */

            switch (opcion) {
                case 1:
                    /*
                     * Hará una comprobación de datos dentro de un rango
                     */
                    do {
                        System.out.println("Ingrese el año de nacimiento:");
                        anioNac = scanner.nextInt();
                        System.out.println("Ingrese el mes de nacimiento:");
                        mesNac = scanner.nextInt();
                        System.out.println("Ingrese el día de nacimiento:");
                        diaNac = scanner.nextInt();

                        if (mesNac < 1 || mesNac > 12 || diaNac < 1 || diaNac > 30) {
                            System.out.println("Valores fuera de rango");
                        }
                    } while (mesNac < 1 || mesNac > 12 || diaNac < 1 || diaNac > 30);

                    edad = new Edad(anioNac, mesNac, diaNac);
                    break;
                case 2:
                    System.out.println("Ingrese el año de nacimiento:");
                    anioNac = scanner.nextInt();
                    edad = new Edad(anioNac);
                    break;
                case 3:
                    do {
                        System.out.println("Ingrese el mes de nacimiento:");
                        mesNac = scanner.nextInt();
                        System.out.println("Ingrese el día de nacimiento:");
                        diaNac = scanner.nextInt();

                        System.out.println("Ingrese el mes de segunda fecha:");
                        segundoMes = scanner.nextInt();
                        System.out.println("Ingrese el día de segunda fecha:");
                        segundoDias = scanner.nextInt();

                        if ((mesNac < 1 || mesNac > 12 || diaNac < 1 || diaNac > 30)
                                || (segundoMes < 1 || segundoMes > 12 || segundoDias < 1 || segundoDias > 30)) {
                            System.out.println("Valores fuera de rango");
                        }
                    } while ((mesNac < 1 || mesNac > 12 || diaNac < 1 || diaNac > 30)
                            || (segundoMes < 1 || segundoMes > 12 || segundoDias < 1 || segundoDias > 30));

                    edad = new Edad(mesNac, diaNac);
                    edad.calcularEdadConMesDias(segundoMes, segundoDias);

                    break;
                case 4:
                    do {
                        System.out.println("Ingrese la edad en años:");
                        edadEnAnios = scanner.nextByte();
                        if (edadEnAnios < 1 || edadEnAnios > 120) {
                         System.out.println("Valores fuera de rango");
                        }
                    } while (edadEnAnios < 1 || edadEnAnios > 120);

                    edad = new Edad(edadEnAnios);
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

        } while (edad == null);
    }
