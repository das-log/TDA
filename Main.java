import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        Edad edad1;

        System.out.println("Ingrese la fecha de nacimiento(dia/mes/año):");
        int diaNac = read.nextInt();
        int mesNac = read.nextInt();
        int anioNac = read.nextInt();

        System.out.println(diaNac +"/" + mesNac +"/" + anioNac);
        edad1 = new Edad(anioNac, mesNac, diaNac);

        System.out.println("Ingrese la fecha actual(dia/mes/año):");
        int diaAc = read.nextInt();
        int mesAc = read.nextInt();
        int anioAc = read.nextInt();
        System.out.println(diaAc + "/" + mesAc + "/" + anioAc);
        
        System.out.println(edad1.calcularEdadCompleta(anioAc, mesAc, diaAc) + "\n" +
        edad1.calcularEdadAnio(anioAc, mesAc, diaAc) + "\n" +
        edad1.calcularEdadDias(anioAc, mesAc, diaAc) + "\n" +
        edad1.calcularEdadMeses(anioAc, mesAc, diaAc));

    }
}