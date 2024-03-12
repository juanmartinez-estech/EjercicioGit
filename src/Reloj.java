/**
 * Reloj
 */
public class Reloj {

    //Variables

    int hora, minuto, segundo;


    //Constructores

    Reloj(){
        hora = 0;
        minuto = 0;
        segundo = 0;
    }

    Reloj(int hora, int minuto, int segundo){
        //Las limitaciones por denajo de 0 deberían hacerse en el main
        if( segundo>59 || segundo<0){
            while (segundo>59) {
                segundo=segundo-60;
                minuto++;
            }
            if(segundo<0){
                segundo=00;
            }
        }

        if( minuto>59 || minuto<0){
            while(minuto>59){
                minuto=minuto-60;
                hora++;
            }
            if (minuto<0){
                minuto=00;
            }
        }

        if(hora>23 || hora<0){
            hora = 00;
        }

    }


    //GETTERS Y SETTERS

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }


    //FUNCIONES


    public boolean modificarHora(int hora, int minuto, int segundo){

        // Si los datos no están dentro del rango devuelve falso y NO cambia los datos

        boolean supervisor=true;

        if (hora>23 || hora<0 || minuto>59 || minuto<0 || segundo>59 || segundo<0 ) {
            supervisor = false;
        }else{
            setHora(hora);
            setMinuto(minuto);
            setSegundo(segundo);
        }
        return supervisor;
    }

    public void sumarSegundo(){
        int segundo=getSegundo();
        segundo++;
        setSegundo(segundo);
    }

    public void sumarSegundos(int segundos){
        setSegundo(segundos);
    }


}