package net.salesianos.threads;

import java.util.Random;

public class Consumidor extends Thread {
    private String nombre;
    private Restaurante restaurante;
    private int verdurasAConsumir;
    private int TIEMPOLIMITE = 5;



    public Consumidor(String nombre, Restaurante restaurante, int verdurasAConsumir) {
        this.nombre = nombre;
        this.restaurante = restaurante;
        this.verdurasAConsumir = verdurasAConsumir;
    }

    Random random = new Random();

    public int tiempoDeConsumicion() {
        int tiempoConsumicion = random.nextInt(TIEMPOLIMITE) + 1;
        return tiempoConsumicion;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < verdurasAConsumir; i++) {
                Thread.sleep( 10000);
            restaurante.consumir(nombre);
        }      
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}