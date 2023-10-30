
public class Edad {
    /* USO DE VARIABLES */
    private int anio, mes, dia; // para almacenar edad por constructores;
    /*
     * para almacenar edad segun calculos:
     * private int edadMeses, edadDias;
     * 
     * variables para fecha actual o fechas posterior:
     * int segundoAnio, segundoMes,
     * segundoDias;
     */

    /* arreglo para retornar calculos */
    private int[] arregloEdad = new int[3];

    /* USO DE CONSTRUCTORES */
    /*---------------------------------------------------------------------------------------------- */
    public Edad(int anioNac, int mesNac, int diaNac) { // Constructor para el caso que proporcione: anio, mes y dia

        this.anio = anioNac;
        this.mes = mesNac;
        this.dia = diaNac;

    }

    /*---------------------------------------------------------------------------------------------- */
    public Edad(int anioNac) { // constructor para el caso de calcular edad solo con anio de nacimiento
        this.anio = anioNac;
        this.mes = 0;
        this.dia = 0;
    }

    /*---------------------------------------------------------------------------------------------- */
    public Edad(int mesNac, int diaNac) { // en caso de que tenga menos de un anio
        this.anio = 0;
        this.mes = mesNac;
        this.dia = diaNac;
    }

    /*---------------------------------------------------------------------------------------------- */
    int edadAnios; // variable para constructor que pide edad exacta para calcular fecha

    public Edad(byte edad) { // constructor donde proporciona edad para pedir nacimiento
        this.edadAnios = edad;
    }

    /*---------------------------------------------------------------------------------------------- */
    /* Funcion para calculo de edad completa */

    public int[] calcularEdadCompleta(int segundoAnio, int segundoMes, int segundoDias) {

        // Ajuste si el día de nacimiento es mayor que el día actual
        if (segundoDias < dia) {
            segundoMes--;
            segundoDias += 30; // Suponemos un mes de 30 días
        }

        // Ajuste si el mes de nacimiento es mayor que el mes actual
        if (segundoMes < mes) {
            segundoAnio--;
            segundoMes += 12;
        }

        arregloEdad[0] = segundoAnio - anio;
        arregloEdad[1] = segundoMes - mes;
        arregloEdad[2] = segundoDias - dia;

        System.out.println("anio: " + arregloEdad[0] + " mes: " + arregloEdad[1] + " dias: " + arregloEdad[2]);
        return arregloEdad;
    }

    /*---------------------------------------------------------------------------------------------- */
    /* Funcion para calcular edad solo con mes y dias */
    public int[] calcularEdadConMesDias(int segundoMes, int segundoDias) {

        // Ajuste si el día de nacimiento es mayor que el día actual
        if (segundoDias < dia) {
            segundoMes--;
            segundoDias += 30; // Suponemos un mes de 30 días
        }

        // Ajuste si el mes de nacimiento es mayor que el mes actual
        if (segundoMes < mes) {
            segundoMes += 12;
        }

        arregloEdad[0] = 0;
        arregloEdad[1] = segundoMes - mes;
        arregloEdad[2] = segundoDias - dia;

        System.out.println("mes: " + arregloEdad[1] + " dias: " + arregloEdad[2]);
        return arregloEdad;
    }

    /*---------------------------------------------------------------------------------------------- */
    /* Funcion para calcular edad solo con anio de nacimiento */
    public int[] calcularConAnio(int segundoAnio){
        arregloEdad[0] = segundoAnio - anio;
        arregloEdad[1] = 0;
        arregloEdad[2] = 0;

        return arregloEdad;
    }

    /*---------------------------------------------------------------------------------------------- */
    /*
     * Funcion para calcular fecha de nacimiento
     * teniendo edad
     */
    public int[] calcularFechaNacimiento(int edad, int segundoAnio){
        int anioNacimiento = segundoAnio - edad;

        arregloEdad[0] = anioNacimiento;

return arregloEdad;
    }

}
