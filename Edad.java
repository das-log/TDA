
public class Edad {
    // creamos constructores para cada caso


    //variables

    private int anio, mes, dia; //variables locales recibidas del nacimiento
    private int segundoAnio, segundoMes, segundoDias; //variables para fecha actual o fechas posterior 
    private int edadAnios, edadMeses, edadDias; //para almacenar edad segun calculos

    // casos de fecha completa

    public Edad(int anioNac, int mesNac, int diaNac) {
        this.anio = anioNac;
        this.mes = mesNac;
        this.dia = diaNac;
    }

    // caso que solo proporcionen anio

    public Edad(int anioNac) {
        this.anio = anioNac;
        this.mes = 0;
        this.dia = 0;

    }

    // caso que no tenga ni un anio

    public Edad(int mesNac, int diaNac) {
        this.anio = 0;
        this.mes = mesNac;
        this.dia = diaNac;
    }

    // calcular fecha de nacimiento con edad proporcionada

    public Edad(byte edad) {
        this.edadAnios = edad;
    }

    // metodo para calcular edad por medio de dos fechas completas
    public int calcularEdadCompleta(int segundoAnio, int segundoMes, int segundoDias) {
        if(mes == segundoMes && dia == segundoDias ){ //si es su cumpleano 
            edadAnios = segundoAnio - anio;
            

           

        } else if (mes == segundoMes && dia < segundoDias) { //si ya cumplio dentro del mes 
            edadAnios = segundoAnio - anio;
            edadMeses--;
        }

        return edad;
    }

}
