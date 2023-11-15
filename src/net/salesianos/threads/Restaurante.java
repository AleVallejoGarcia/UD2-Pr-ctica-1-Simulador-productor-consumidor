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
        int posicion = random.nextInt(almacen.size()) + 1;
        return posicion;
    }

    public synchronized void almacenar(String verdura, String nombre) {
        if (almacen.size() < capacidadAlmacenamiento) {
            almacen.add(verdura);
            System.out.println(nombre + "ha traio " + verdura + " Capacidad actual: " + almacen.size());
        } else {
            System.out.println("Muchacho el almacén esta lleno" + nombre + " esta esperando.");
        }
    }

    
    public synchronized void consumir(String nombre) {
        if (almacen.size() > 0) {
            String verdura = almacen.get(verduraAConsumir());
            almacen.remove(verduraAConsumir());
            System.out.println(nombre + " se han tragao una" + verdura + ", capacidad actual: " + almacen.size());
        } else {
            System.out.println(nombre + " tiene hambre y ho hay verduras para tragar");
        }
    }
    

    
}
    

