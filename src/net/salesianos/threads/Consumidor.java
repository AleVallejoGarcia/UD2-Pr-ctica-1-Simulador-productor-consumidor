package net.salesianos.threads;


public class Consumidor extends Thread {
    private String nombre;
    private Restaurante restaurante;
    private int verdurasAConsumir;


    public Consumidor(String nombre, Restaurante restaurante, int verdurasAConsumir) {
        this.nombre = nombre;
        this.restaurante = restaurante;
        this.verdurasAConsumir = verdurasAConsumir;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i <= verdurasAConsumir; i++) {
                Thread.sleep(10000);
            restaurante.consumir(nombre);
        }      
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}