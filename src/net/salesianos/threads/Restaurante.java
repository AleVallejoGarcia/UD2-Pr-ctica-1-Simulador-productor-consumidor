package net.salesianos.threads;

import java.util.ArrayList;

public class Restaurante {
  

    private int capacidadAlmacenamiento;
    private ArrayList<String> almacen;

    public Restaurante(int capacidadAlmacenamiento) {
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
        this.almacen = new ArrayList<>();
    }

    public synchronized void almacenar(String verdura) {
        if (almacen.size() < capacidadAlmacenamiento) {
            almacen.add(verdura);
            System.out.println("Almacenada " + verdura + "Capacidad actual: " + almacen.size());
        } else {
            System.out.println("Almacen lleno, productor esperando.");
        }
    }

    
}
    

