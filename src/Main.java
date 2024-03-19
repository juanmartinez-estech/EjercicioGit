public class Main {
    public static void main(String[] args) {
        Coche coche1 = new Coche("Coche1", 0, 0, 0);
        Coche coche2 = new Coche("Coche2", 0, 0, 0);
        Coche coche3 = new Coche("Coche3", 0, 0, 0);

        Carreras carrera1 = new Carreras();


        carrera1.agregarCoche(coche1);
        carrera1.agregarCoche(coche2);
        carrera1.agregarCoche(coche3);

        carrera1.comenzarCarrera();

        Reloj tiempoCoche1 = new Reloj(0, 0, 50);
        Reloj tiempoCoche2 = new Reloj(0, 0, 45);
        Reloj tiempoCoche3 = new Reloj(0, 0, 55);

        carrera1.registrarTiempoDeVuelta(tiempoCoche1, coche1);
        carrera1.registrarTiempoDeVuelta(tiempoCoche2, coche2);
        carrera1.registrarTiempoDeVuelta(tiempoCoche3, coche3);

        carrera1.finalizarCarrera();

        System.out.println("Fin");
    }
}
