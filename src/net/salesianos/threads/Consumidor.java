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

        boolean salir = false;

        while (salir == false) {
            try {
                if (restaurante.getSize() > 0) {
                    for (int i = 0; i < verdurasAConsumir; i++) {
                        Thread.sleep(tiempoDeConsumicion() * 1000);
                        restaurante.consumir(nombre);
                        if (i == verdurasAConsumir - 1) {
                            salir = true;
                        }
                    }
                } else {
                    System.out.println(nombre + " tiene hambre y ho hay verduras para tragar");
                    Thread.sleep(tiempoDeConsumicion() * 1000);
                }
            } catch (Exception e) {
            e.printStackTrace();
    
            }
        } 
    }
}