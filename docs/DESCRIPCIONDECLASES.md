# Clases

## Consumidor

Esta clase que hereda de Thread servirá para crea un hilo que manipule una lista de verduras almacenadas.

- `Atributos`:

> Nombre: Indica el nombre del consumidor.

> Restaurante: Será el objeto restaurante del que se sacará el arraylist de verduras

> Verduras a consumir: Indica el número de verduras que consumirá el consumidor.

> TIEMPOLIMITE: Es el tiempo máximo que espera el consumidor entre consumición y consumición.

- `Constructores`:

> Tiene un único constructor que pide como parámetros el nombre, el restaurante y las verduras a consumir.

- `Métodos`:

> Tiempo de consumición: Retornara un entero aleatorio como máximo 5 que será el número de segundos que espera el consumidor entre consumiciones.

- `Overrides`:

> Se ha hecho un override al run, dado que esta clase será un hilo, en este caso lo que hará es acceder al tamaño del almacén del restaurante y si es mayor que 0 consumirá una verdura aleatoria y eso se repetirá hasta que se hayan consumido el numero de verduras que se hayan pasado como parámetro en el constructor.

## Productor

Esta clase que hereda de Thread servirá para crea un hilo que manipule una lista de verduras almacenadas.

- `Atributos`:

> Nombre: Indica el nombre del productor.

> Restaurante: Será el objeto restaurante del que se sacará el arraylist de verduras

> Verduras a producir: Indica el número de verduras que producirá el productor.

> TIEMPOLIMITE: Es el tiempo máximo que tardará en crecer la verdura plantada por el productor.

> VERDURAS: Son las posibles verduras que se pueden producir.

> Limite almacén: es la cantidas máxima de verduras que puede haber en el almacén.

- `Constructores`:

> Tiene un único constructor que pide como parámetros el nombre, el restaurante, las verduras a producir y la capacidad máxima del almacén.

- `Métodos`:

> Crecimiento: Retornara un entero aleatorio como máximo 5 que será el número de segundos que tarde en crecer una verdura.

> Verdura random: Retornara una verdura aleatoria de la lista de verduras que será la próxima que plante el productor.

- `Overrides`:

> Se ha hecho un override al run, dado que esta clase será un hilo, en este caso lo que hará es acceder al tamaño del almacén del restaurante y si es menor que el máximo del almacén se añadira una verdura aleatoria y eso se repetirá hasta que se hayan almacenado el numero de verduras que se hayan pasado como parámetro en el constructor.

## Restaurante

Esta clase servirá para crear un restaurante con un array list que sera el almacén de este.

- `Atributos`:

> Capacidad de almacenamiento: Indica el maxímo de verduras que se podrán almacenar.

> almacén: sera el array list que almacenará todas las verduras producidad por los productores.

- `Constructores`:

> Tiene un único constructor que pide como parámetros el tamaño máximo del almacén.

- `Métodos`:

> Verdura a consumir: Elegirá al azar una verdura del arraylilst almacén que sera la siguiente que se consuma.

> Get size: Retornará el tamaño actual del almacén.

> Almacenar: Es un método que recibe dos parámetros String, este método sera usado por los productores para almacenar la verdura que se pasa como primer parámetro, adicionalmente mostrá un mensaje indicando el nombre del productor que ha producido dicha verdura, el cual es el segundo parámetro.

> Consumir: Es un método que recibe un parámetro String, este método eliminar una verdura aleatoria del almacén y mostrá un mensaje con la verdura que será consumida y el nombre del consumidor que se la comerá, el nombre del consumidor es el parámetro del que se ha hablado anteriormente.

### Readme

Para volver al README pinche [aquí](../README.md)
