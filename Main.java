

import java.util.Scanner; //importa el Scanner para leer datos.
/**
 * Programa de equipo
 * Esta clase es el main
 * Aqui se piden datos para calcular tiempo entre dos fechas de forma aproximada.
 */
public class Main {
    public static void main(String[] args) {
// objeto scanner para ingresar datos posteriormente.
        Scanner scanner = new Scanner(System.in); 
        // objeto apartir de la clase Edad para realizar calculos.
        Edad edad = null; 
        int[] imprimeEdad;

        do {
            /**
             * Imprime opciones para ingresar. Cada opción representa distintos casos en un
             * switch.
             */
            System.out.println("Elija una opción:");
            System.out.println("1. Crear edad con fecha completa");
            System.out.println("2. Crear edad con solo año");
            System.out.println("3. Crear edad con solo meses y días");
            System.out.println("4. Crear edad con edad en años");
// Objeto tipo Scanner para ingresar opción en switch
            byte opcion = scanner.nextByte(); 

            /* Variables que se usan para almacenar valores leídos por el escáner. */
            int anioNac; // representa el año de nacimiento
            int mesNac; // representa el mes de nacimiento
            int diaNac; // representa el día de nacimiento
            int edadEnAnios; // representa la edad en años si se ingresa como constructor
            int segundoAnio, segundoMes, segundoDias; // representa datos de la segunda fecha

            /*
             * Este switch tiene la función de pedir datos según lo requerido por el
             * usuario. Por lo tanto, el objeto de tipo Edad procesará datos según el
             * constructor de cada caso.
             */

            switch (opcion) {
                /*---------------------------------------------------------------------------------------------- */
                /* primer caso, con anio, mes y dia. */
                case 1:
                    /*
                     * Hará una comprobación de datos dentro de un rango con do
                     */
                    do {
                        System.out.println("Ingrese el año de nacimiento:");
                        anioNac = scanner.nextInt();
                        System.out.println("Ingrese el mes de nacimiento:");
                        mesNac = scanner.nextInt();
                        System.out.println("Ingrese el día de nacimiento:");
                        diaNac = scanner.nextInt();

                        System.out.println("Ingrese el anio de segunda fecha:");
                        segundoAnio = scanner.nextInt();
                        System.out.println("Ingrese el mes de segunda fecha:");
                        segundoMes = scanner.nextInt();
                        System.out.println("Ingrese el día de segunda fecha:");
                        segundoDias = scanner.nextInt();

                        if (mesNac < 1 || mesNac > 12 || diaNac < 1 || diaNac > 30) {
                            System.out.println("Valores fuera de rango");
                        }
                    } while (mesNac < 1 || mesNac > 12 || diaNac < 1 || diaNac > 30);

                    edad = new Edad(anioNac, mesNac, diaNac);
                    edad.calcularEdadCompleta(segundoAnio, segundoMes, segundoDias);
                    imprimeEdad = edad.getArregloEdad();
                    System.out.println(
                            "Edad en anios " + imprimeEdad[0] + " meses: " + imprimeEdad[1] + " dias" + imprimeEdad[2]);
                    edad.convertirEdadEnMeses();
                    edad.convertirEdadEnDias();

                    break;
                /*---------------------------------------------------------------------------------------------- */
                /* calcular edad solo con anio */
                case 2:

                    System.out.println("Ingrese el año de nacimiento:");
                    anioNac = scanner.nextInt();
                    edad = new Edad(anioNac);
                    imprimeEdad = edad.getArregloEdad();
                    System.out.println("Edad en anios " + imprimeEdad[0]);
                    edad.convertirEdadEnMeses();
                    edad.convertirEdadEnDias();

                    break;
                /*---------------------------------------------------------------------------------------------- */
                /* Tercer caso solo teniendo mes y dia de nacimiento. Anio >1 */
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
                    imprimeEdad = edad.getArregloEdad();
                    System.out.println("Edad en meses " + imprimeEdad[1] + " dias: " + imprimeEdad[2]);
                    edad.convertirEdadEnDias();

                    break;
                /*---------------------------------------------------------------------------------------------- */
                /* calcular fecha de nacimiento solo con edad en anios */
                case 4:
                    do {
                        System.out.println("Ingrese la edad en años:"); // Solicita la edad al usuario.
                        edadEnAnios = scanner.nextByte(); // Lee la entrada del usuario y la almacena en la variable edadEnAnios.
                        System.out.println("Ingrese la segunda fecha en años:"); // Solicita la segunda fecha al usuario.
                        segundoAnio = scanner.nextByte(); // Lee la entrada del usuario y la almacena en la variable segundoAnio.
                        edad = new Edad(edadEnAnios); // Crea un objeto de la clase Edad con el valor de edadEnAnios.
                        edad.calcularFechaNacimiento(segundoAnio); // Llama al método calcularFechaNacimiento con el valor de segundoAnio.
                        if (edadEnAnios < 1 || edadEnAnios > 120) {
                            System.out.println("Valores fuera de rango"); // Si la edad está fuera del rango, muestra un mensaje de error.
                        }
                    } while (edadEnAnios < 1 || edadEnAnios > 120); // Continúa el bucle mientras la edad esté fuera del rango.
                    break;

                /*---------------------------------------------------------------------------------------------- */
                default:
                    System.out.println("Opción no válida.");
            }

        } while (edad == null);
        scanner.close();
    }
}
