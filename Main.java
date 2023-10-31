/**
 * Esta clase contiene las funciones que requiere el main para hacer calculos
 * respecto a la edad
 */
public class Edad {
    /*
     * *
     * para almacenar edad por constructores
     */
    private int anio, mes, dia;
    /*
     * para almacenar edad segun calculos:
     * private int edadMeses, edadDias;
     * 
     * variables para fecha actual o fechas posterior:
     * int segundoAnio, segundoMes,
     * segundoDias;
     */

    /**
     * arreglo para retornar calculos
     */
    private int[] arregloEdad = new int[3];

    /* USO DE CONSTRUCTORES */
    /*---------------------------------------------------------------------------------------------- */
    /**
     * Constructor para el caso que proporcione:
     * 
     * @param anioNac recibe anio de nacimiento
     * @param mes     recibe mes de nacimiento
     * @param dia     recibe dia de nacimient
     */
    public Edad(int anioNac, int mesNac, int diaNac) {

        this.anio = anioNac;
        this.mes = mesNac;
        this.dia = diaNac;

    }

    /*---------------------------------------------------------------------------------------------- */
    /**
     * constructor para el caso de calcular edad solo con anio de nacimiento
     * 
     * @param recibe anio de nacimiento
     */
    public Edad(int anioNac) {
        this.anio = anioNac;
        this.mes = 0;
        this.dia = 0;
    }

    /*---------------------------------------------------------------------------------------------- */
    /**
     * 
     * @param mesNac mes de nacimiento
     * @param diaNac dia de nacimiento
     */
    public Edad(int mesNac, int diaNac) {
        this.anio = 0;
        this.mes = mesNac;
        this.dia = diaNac;
    }

    /*---------------------------------------------------------------------------------------------- */
    int edadAnios; // variable para constructor que pide edad exacta para calcular fecha

    /**
     * 
     * @param edad edad en anios para calculos
     */

    public Edad(byte edad) { // constructor donde proporciona edad para pedir nacimiento
        this.edadAnios = edad;
    }

    /*---------------------------------------------------------------------------------------------- */

    /**
     * Funcion para calculo de edad completaFuncion para calculo de edad completa
     * 
     * @param segundoAnio segundo anio proporcionado a comparar con el de nacimiento
     * @param segundoMes  segundo mes proporcionado a comparar con el de nacimiento
     * @param segundoDias segundo dia proporcionado a comparar con el de nacimiento
     * @return retorna un arreglo con la edad calculada
     */

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

    /*---------------------------------------------------------------------------------------------- */

    /**
     * Funcion para calcular edad solo con mes y dias >0
     * 
     * @param segundoMes  segundo mes proporcionado a comparar con el de nacimiento
     * @param segundoDias segundo dia proporcionado a comparar con el de nacimiento
     * @return retorna un arreglo con la edad calculada
     */
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

        return arregloEdad;
    }

    /*---------------------------------------------------------------------------------------------- */
    /**
     * 
     * @param segundoAnio segundo anio proporcionado a comparar con el de nacimiento
     * @return retorna un arreglo con la edad calculada
     */
    /* Funcion para calcular edad solo con anio de nacimiento */
    public int[] calcularConAnio(int segundoAnio) {
        arregloEdad[0] = segundoAnio - anio;
        arregloEdad[1] = 0;
        arregloEdad[2] = 0;

        return arregloEdad;
    }

    /*---------------------------------------------------------------------------------------------- */

    /**
     * Funcion para calcular fecha de nacimiento
     * teniendo edad
     * 
     * @param segundoAnio segundo anio proporcionado a comparar con el de nacimiento
     * @return retorna un arreglo con la edad calculada
     */
    public int[] calcularFechaNacimiento(int segundoAnio) {
        int anioNacimiento = segundoAnio - edadAnios;

        arregloEdad[0] = anioNacimiento;

        return arregloEdad;
    }

    /*---------------------------------------------------------------------------------------------- */
    /**
     * Función para convertir la edad completa en meses
     * 
     */

    public void convertirEdadEnMeses() {
        int cAnioMeses = arregloEdad[0];
        int edadMesesConvertido = (cAnioMeses * 12) + mes;
        System.out.println("Edad en meses: " + edadMesesConvertido);
    }

    /**
     * Función para convertir la edad completa en días (suponiendo un mes de 30
     * días)
     */
    public void convertirEdadEnDias() {
        int cAnioDias = arregloEdad[0];
        int cMesesDias = arregloEdad[1];
        int cDias = arregloEdad[2];
        int edadDiasCalculados = (cAnioDias * 360) + (cMesesDias * 30) + cDias;
        System.out.println("Edad en dias: " + edadDiasCalculados);
    }
/**
 * Metodo accesor para que el main pueda manejar los dastos proporcionados al hacerlos publicos 
 * @return retorna el arreglo con la edad calculada
 */
    public int[] getArregloEdad() {
        return arregloEdad;
    }

}
