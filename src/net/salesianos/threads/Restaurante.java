package net.salesianos.threads;

import java.util.ArrayList;
import java.util.Random;

public class Restaurante {
  

    private int capacidadAlmacenamiento;
    private ArrayList<String> almacen;

    public Restaurante(int capacidadAlmacenamiento) {
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
        this.almacen = new ArrayList<>();
    }

    Random random = new Random();

    public int verduraAConsumir() {
        int posicion = random.nextInt(almacen.size()) + 0;
        return posicion;
    }

     public int getSize() {
        int size = almacen.size();
        return size;
    }

    public synchronized void almacenar(String verdura, String nombre) {
        if (almacen.size() < capacidadAlmacenamiento) {
            almacen.add(verdura);
            System.out.println(nombre + " ha traio " + verdura + " capacidad actual: " + almacen.size());
        } else {
            System.out.println("Muchacho el almacén esta lleno " + nombre + " esta esperando.");
        }
    }


    
    public synchronized void consumir(String nombre) {
        if (almacen.size() > 0) {
            int posicion = verduraAConsumir();
            String verdura = almacen.get(posicion);
            almacen.remove(posicion);
            System.out.println(nombre + " se ha tragao una " + verdura + ", capacidad actual: " + almacen.size());
        } else {
            System.out.println(nombre + " tiene hambre y ho hay verduras para tragar");
        }
    }
}