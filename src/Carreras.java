
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Carreras {
    private Reloj tiempoInicio;
    private boolean enCurso;
    private ArrayList<Coche> coches;

    Reloj reloj1 = new Reloj();
    Coche coche11 = new Coche(null, 0, 0, 0);

    public void Carrera(Coche coche11, Reloj reloj1, boolean tiempo) {
        this.coches = coches.add(coche11) ;
        this.tiempoInicio = reloj1;
        this.enCurso = tiempo;
    }

    public void agregarCoche(Coche coche) {
        System.out.println(coche);
        this.coches.add(coche);
    }

    public void comenzarCarrera() {
        enCurso = true;
    }

    public void registrarTiempoDeVuelta(Reloj tiempoCoche1, Coche coche1) {
        for (int i = 0; i < coches.size(); i++) {
            if (coches.get(i).getNombre().equals(coche1)) {
                coches.get(i).setTiempodevuelta(tiempoCoche1);
            }
        }
    }

    public void finalizarCarrera() {
        enCurso = false;
        Collections.sort(coches, (c1, c2) -> {
            return tiempoTotal(c1) - tiempoTotal(c2);
        });
    }

    private int tiempoTotal(Coche coche) {
        return coche.getTiempodevuelta().getHora() * 3600 +
               coche.getTiempodevuelta().getMinuto() * 60 +
               coche.getTiempodevuelta().getSegundo();
    }

    

}
























    /* public void finalizaCarrera() {
        enCurso = false;
        Collections.sort(coches, (c1, c2) -> {
            int tiempoC1 = c1.getTiempodevuelta().getHora() * 3600 +
                           c1.getTiempodevuelta().getMinuto() * 60 +
                           c1.getTiempodevuelta().getSegundo();
            int tiempoC2 = c2.getTiempodevuelta().getHora() * 3600 +
                           c2.getTiempodevuelta().getMinuto() * 60 +
                           c2.getTiempodevuelta().getSegundo();
            return tiempoC1 - tiempoC2;
        });
    }
   
    public void mostrarClasificacion() {
        System.out.println("Clasificación final:");
        for (int i = 0; i < coches.size(); i++) {
            Coche coche = coches.get(i);
            System.out.println((i + 1) + ". " + coche);
        }
    }
     */
