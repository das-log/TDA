
public class Edad {
    // creamos constructores para cada caso


    //variables

    private int anio, mes, dia, edad;
    private int segundoAnio, segundoMes, SegundoDias;

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
        this.edad = edad;
    }

    // metodo para calcular edad por medio de dos fechas completas
    public void calcularEdadCompleta(int segundoAnio, int segundoMes, int SegundoDias) {


        //fecha actual - fecha nacimiento, pero en logica hay una condicion de que si aun no llega la fecha de cumpleanos se resta un anio
        // No quiero usar localDate porque hay que desarrollar la logica

        /*
         * 
         * ┌( ͝° ͜ʖ͡°)=ε/̵͇̿̿/’̿’̿ ̿
         */

//prueba
//xd
    }

    public void convertir(){
        
    }

}
