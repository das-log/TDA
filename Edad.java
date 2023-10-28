public class Edad {
    private int anio, mes, dia;
    private int segundoAnio, segundoMes, segundoDias;
    private int edadAnios, edadMeses, edadDias;

    public Edad(int anioNac, int mesNac, int diaNac) {
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

    public Edad(byte edad) {
        this.edadAnios = edad;
    }

    public int[] calcularEdadCompleta(int segundoAnio, int segundoMes, int segundoDias) {
        int[] arregloEdad = new int[3];

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

    edadAnios = segundoAnio - anio;
    edadMeses = segundoMes - mes;
    edadDias = segundoDias - dia;

    arregloEdad[0] = edadAnios;
    arregloEdad[1] = edadMeses;
    arregloEdad[2] = edadDias;

    

        return arregloEdad;
    }
}
