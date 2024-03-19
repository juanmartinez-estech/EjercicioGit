public class Coche {
    
    //Variables

    String nombre;
    Reloj tiempodevuelta;

    //Constructores

    public Coche(String nombre, int horas, int minutos, int segundos){
        this.nombre = nombre;
        this.tiempodevuelta = new Reloj(horas,minutos,segundos);
    }


    @Override
    public String toString(){
        return "Coche: " + nombre + ", Tiempomde vueta: " + tiempodevuelta;
    }


    public String getNombre() {
        return nombre;
    }


    public Reloj getTiempodevuelta() {
        return tiempodevuelta;
    }


    public void setTiempodevuelta(Reloj tiempodevuelta) {
        this.tiempodevuelta = tiempodevuelta;
    }

}
