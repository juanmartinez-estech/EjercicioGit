import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Carreras {
    private Reloj tiempoInicio;
    private boolean enCurso;
    private List<Coche> coches;

    // Constructor que inicializa la lista de coches y el tiempo de inicio de la carrera
    public Carrera(List<Coche> coches, Reloj tiempoInicio) {
        this.coches = new ArrayList<>(coches);
        this.tiempoInicio = tiempoInicio;
        this.enCurso = false;
    }

    // Método para agregar coches a la carrera
    public void agregarCoche(Coche coche) {
        coches.add(coche);
    }

    // Método para comenzar la carrera
    public void comenzarCarrera() {
        enCurso = true;
    }

    // Método para registrar el tiempo de vuelta de un coche
    public void registrarTiempoDeVuelta(Coche coche, int horas, int minutos, int segundos) {
        if (enCurso) {
            coche.getTiempodevuelta().modificarHora(horas, minutos, segundos);
        } else {
            System.out.println("La carrera no está en curso.");
        }
    }

    // Método para finalizar la carrera y generar una clasificación de los coches participantes
    public void finalizarCarrera() {
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

    // Método para mostrar la clasificación final
    public void mostrarClasificacion() {
        System.out.println("Clasificación final:");
        for (int i = 0; i < coches.size(); i++) {
            Coche coche = coches.get(i);
            System.out.println((i + 1) + ". " + coche);
        }
    }
}
    

