

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
    
    public Edad(int anioNac, int mesNac, int diaNac) { //  Constructor para el caso que proporcione: anio, mes y dia 



        this.anio = anioNac;
        this.mes = mesNac;
        this.dia = diaNac;

    }

    public Edad(int anioNac) {
        this.anio = anioNac;
        this.mes = 0;
        this.dia = 0;
    }

    public Edad(int mesNac, int diaNac) {
        this.anio = 0;
        this.mes = mesNac;
        this.dia = diaNac;
    }

    int edadAnios; // variable para constructor que pide edad exacta para calcular fecha

    public Edad(byte edad) { //constructor donde proporciona edad para pedir nacimiento
        this.edadAnios = edad;
    }
/*FUNCION PARA CALCULOS DE EDAD*/
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
        


        return arregloEdad;
    }
}
