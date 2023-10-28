import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         /***AQUI HAY QUE MOVER ESTO AL CONSTRUCTOR PORQUE SI SE CREA EL OBJETO CON EL CONSTRUCTOR SOLO ANIO SOLO SE PEDIRIA ANIO, AQUI ESTAS PIDIENDO LOS 3 */
        // Solicitar y obtener la fecha de nacimiento del usuario
        System.out.print("Ingresa el año de nacimiento: ");
        int anioNac = scanner.nextInt();

        System.out.print("Ingresa el mes de nacimiento: ");
        int mesNac = scanner.nextInt();

        System.out.print("Ingresa el día de nacimiento: ");
        int diaNac = scanner.nextInt();
       /***HASTA AQUI */

       
        // Crear una instancia de Edad con la fecha de nacimiento proporcionada
        Edad edad = new Edad(anioNac, mesNac, diaNac);



        // Solicitar y obtener la fecha posterior del usuario
        System.out.print("Ingresa el año actual: ");
        int segundoAnio = scanner.nextInt();

        System.out.print("Ingresa el mes actual: ");
        int segundoMes = scanner.nextInt();

        System.out.print("Ingresa el día actual: ");
        int segundoDias = scanner.nextInt();

        
        // Calcular la edad completa con la fecha posterior ingresada
        int[] edadCalculada = edad.calcularEdadCompleta(segundoAnio, segundoMes, segundoDias);

        // Mostrar la edad calculada
        System.out.println("Edad calculada: " + edadCalculada[0] + " años, " + edadCalculada[1] + " meses, " + edadCalculada[2] + " días");
    }
}