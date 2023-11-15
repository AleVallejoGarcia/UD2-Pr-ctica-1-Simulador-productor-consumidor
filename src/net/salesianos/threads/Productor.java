package net.salesianos.threads;

import java.util.Random;

public class Productor extends Thread {
    
    private String verduras[] = new String[]{"lettuce", "cabbage", "onion", "spinach", "potato", "celery", "asparagus", "radish", "broccoli", "artichoke", "tomato", "cucumber", "eggplant", "carrot", "green bean"};
    private int TIEMPOLIMITE = 5;

    private Restaurante restaurante;
    private int verdurasAProducir;
    private String nombre;
    private int limiteAlmacen;

    public Productor (Restaurante almacen, int numeroVerduras, String nombre, int limiteAlmacen) {
        this.restaurante = almacen;
        this.verdurasAProducir = numeroVerduras;
        this.nombre = nombre;
        this.limiteAlmacen = limiteAlmacen;
    }

    Random random = new Random();

    public int crecimiento() {
        int tiempoCrecimiento = random.nextInt(TIEMPOLIMITE) + 1;
        return tiempoCrecimiento;
    }

    public String verduraRandom() {
        int posicion = random.nextInt(limiteAlmacen) + 1;
        return verduras[posicion];
    }

    @Override
    public void run() {
        for (int i = 0; i < verdurasAProducir; i++) {
            String verdura = verduraRandom();
            System.out.println(nombre + " está plantando " + verdura);
        try {
            sleep(crecimiento() * 1000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        restaurante.almacenar(verdura, nombre);
        }
    }
}