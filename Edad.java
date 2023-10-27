
public class Edad {
    // creamos constructores para cada caso


    //variables

    private int anio, mes, dia, edad;
    private int segundoAnio, segundoMes, segundoDias;

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

    public String calcularEdadDias(int segundoAnio, int segundoMes, int segundoDias){
        

        int edadAn = 0;
        int edadMes = segundoMes - mes;

        //para calcular la edad de anios
        if (segundoMes < mes){
            edadAn = (segundoAnio - anio) - 1;
        }

        if (segundoMes == mes && segundoDias < dia){
            edadAn = (segundoAnio - anio) - 1;
        }
        edadAn = (segundoAnio - anio);

        //para calcular los dias
        int diaRe = segundoDias - dia;
        if (diaRe < 0){
        diaRe = (30 + segundoDias) - dia;
        //mes = mes + 1;

        edadMes = segundoMes - mes;   
    }
        //Calcular los meses
    if(edadMes < 0){
        edadMes = edadMes + 12;
    }

        int edadDias = (edadAn * 365) + (edadMes * 30) + diaRe;

        return ("Su edad en dias son: " + edadDias);
    }

    // metodo para calcular edad por medio de dos fechas completas
    public String calcularEdadCompleta(int segundoAnio, int segundoMes, int segundoDias) {


        //fecha actual - fecha nacimiento, pero en logica hay una condicion de que si aun no llega la fecha de cumpleanos se resta un anio
        // No quiero usar localDate porque hay que desarrollar la logica
        int edadAn = 0;

        if (segundoMes < mes){
            edadAn = (segundoAnio - anio) - 1;
        }

        if (segundoMes == mes && segundoDias < dia){
            edadAn = (segundoAnio - anio) - 1;
        }
        else {
            edadAn = (segundoAnio - anio);
        }

        int diaRe = segundoDias - dia;
        if (diaRe < 0){
        diaRe = (30 + segundoDias) - dia;
        mes = mes + 1;
        }

        int edadMes = segundoMes - mes;
        if(edadMes < 0){
            edadMes = edadMes + 12;
        }

        if (edadAn == 0) {
            return ("La edad completa es: " + edadMes + " Mes(es) " + diaRe + " Dia(s)");
        }   else if (edadMes == 0){
            return ("La edad completa es: " + edadAn + " Año(s) " + diaRe + " Dia(s)");
        } else if (diaRe == 0) {
            return ("La edad completa es: " + edadAn + " Año(s) " + edadMes + " Mes(es) ");
        } else {
            return ("La edad completa es: " + edadAn + " Año(s) " + edadMes + " Mes(es) " 
        + diaRe + " Dia(s)");
        }
        

    }

    public String calcularEdadAnio(int segundoAnio, int segundoMes, int segundoDias){
        
        int edadAn = 0;

        if (segundoMes < mes){
            edadAn = (segundoAnio - anio) - 1;
        }

        else if (segundoMes == mes && segundoDias < dia){
            edadAn = (segundoAnio - anio) - 1;
        }

        edadAn = (segundoAnio - anio);
        return ("La edad en años es: " + edadAn + " Año(s)");
    }


    public String calcularEdadMeses(int segundoAnio, int segundoMes, int segundoDias){

        int edadAn = 0;
        int edadMes = segundoMes - mes;

        if (segundoMes < mes){
            edadAn = (segundoAnio - anio) - 1;
        }

        if (segundoMes == mes && segundoDias < dia){
            edadAn = (segundoAnio - anio) - 1;
        }
        edadAn = (segundoAnio - anio);

        int diaRe = segundoDias - dia;
        if (diaRe < 0){
        diaRe = (30 + segundoDias) - dia;
        //mes = mes + 1;

        edadMes = segundoMes - mes;   
    }
        
    if(edadMes < 0){
        edadMes = edadMes + 12;
    }

        edadMes = (edadAn * 12) + edadMes;
        return ("Su edad en meses son: " + edadMes);
    }

}
