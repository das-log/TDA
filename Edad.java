
public class Edad {
    // creamos constructores para cada caso

    // variables

    private int anio, mes, dia; // variables locales recibidas del nacimiento
    private int segundoAnio, segundoMes, segundoDias; // variables para fecha actual o fechas posterior
    private int edadAnios, edadMeses, edadDias; // para almacenar edad segun calculos

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

    /**me acabo de dar cuenta que aqui hay que usar un objeto o un arreglo para 
    retornar las variables asi que hay que pasar de void a int arregloEdad[3] y retornar valores en el arrelgo usando 
    arregloEdad[0] = edadAnios
    arregloEdad[1] = edadMeses
    arregloEdad[2] = edadDias
    **/

    // metodo para calcular edad por medio de dos fechas completas
    public void calcularEdadCompleta(int segundoAnio, int segundoMes, int segundoDias) {

        //**aqui donde el mes es el mismo de ambos
        if (mes == segundoMes && dia == segundoDias) { // si es su cumpleanio
            edadAnios = segundoAnio - anio;

            //retorna edadAnios;**
         
        } else if (mes == segundoMes && dia < segundoDias) { // si ya cumplio dentro del mes
            edadAnios = segundoAnio - anio;
            edadDias = segundoDias - dia;
            //debe retornar ambos**

        } else if (mes == segundoMes && dia > segundoDias) {// si esta por cumplir
            edadAnios = segundoAnio - anio;

            edadMeses = segundoMes - mes;

            edadDias = segundoDias - dia;

            //debe retornar los 3**

        }else {   //**  si el mes es diferente
               
            if (segundoMes < mes ){ //para evitar mes negativo
                edadAnios = segundoAnio - anio - 1;
                edadMeses = 12 - mes + segundoMes;
                if(segundoDias < dia){              //para evitar dias negativos
                    edadDias = dia - segundoDias;
                    
                } else {
                    edadDias = segundoDias - dia;
                    
                }

                //debe retornar los 3**

            } else {
                edadAnios = segundoAnio - anio;
                edadMeses = segundoMes - mes;
                edadDias = segundoDias - dia;

                //debe retornar los 3**

            }

            
        }

       

    }

}
