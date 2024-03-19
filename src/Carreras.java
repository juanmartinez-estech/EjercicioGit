
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Carreras {
    private Reloj tiempoInicio;
    private boolean enCurso;
    private ArrayList<Coche> coches;

    public void Carrera() {
        this.coches = new ArrayList<Coche>();
        this.tiempoInicio = new Reloj();
        this.enCurso = false;
    }

    public void agregarCoche(Coche coche) {
        coches.add(coche);
    }

    public void comenzarCarrera() {
        enCurso = true;
    }

    public void registrarTiempoDeVuelta(Coche coche, int horas, int minutos, int segundos) {
        if (enCurso) {
            for (Coche coche2 : coches) {
                if (coche2 == coche) {
                    coche2.getTiempodevuelta().modificarHora(horas, minutos, segundos);  
                }
            }
        } else {
            System.out.println("La carrera no ha comenzado");
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
