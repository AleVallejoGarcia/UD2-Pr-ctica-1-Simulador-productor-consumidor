import net.salesianos.threads.*;

public class App {
    public static void main(String[] args) {
        int capacidadAlmacenamiento = 10;
        Restaurante restaurante = new Restaurante(capacidadAlmacenamiento);

        Productor granjero1 = new Productor(restaurante, 5, "Manolo", capacidadAlmacenamiento);
        Productor granjero2 = new Productor(restaurante, 5, "Gebrasio", capacidadAlmacenamiento);

        Consumidor cliente1 = new Consumidor("Manue", restaurante, 2);
        Consumidor cliente2 = new Consumidor("Ricardo", restaurante, 3);

        granjero1.start();
        granjero2.start();
        cliente1.start();
        cliente2.start();

        granjero1.setPriority(Thread.MAX_PRIORITY);
        granjero2.setPriority(Thread.MAX_PRIORITY);
        cliente1.setPriority(Thread.MIN_PRIORITY);
        cliente2.setPriority(Thread.MIN_PRIORITY);


        try {
            granjero1.join();
            granjero2.join();
            cliente1.join();
            cliente2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}