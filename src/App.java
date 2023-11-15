import net.salesianos.threads.*;

public class App {
    public static void main(String[] args) {
        int capacidadAlmacenamiento = 10;
        Restaurante restaurante = new Restaurante(capacidadAlmacenamiento);

        Productor granjero = new Productor(restaurante, 5, "Hautacuperche", capacidadAlmacenamiento);

        Consumidor cliente = new Consumidor("Ricardo", restaurante, 5);

        granjero.start();
        cliente.start();

        try {
            granjero.join();
            cliente.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}