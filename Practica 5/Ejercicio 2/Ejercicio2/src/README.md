Ejercicio 2: Pedido de Cafetería

Cómo ejecutar
- Versión: Java 17
- Compilar: `javac *.java`
- Ejecutar: `java Main`

Decisiones de diseño (Relación entre objetos)
Decidí que la relación es de Asociación (específicamente Agregación). El `Pedido` agrupa objetos `Producto`, pero los productos existen por su cuenta (puedo crear un Café sin meterlo a un pedido). El cálculo del total se hace dentro de `Pedido` con un ciclo `for` que recorre el arreglo de 3 posiciones, cumpliendo con la regla de delegar el comportamiento.

Evidencia de salida en consola
--- TICKET DE LA CAFETERÍA ---
- Café Americano: $30.0
- Rebanada de Pastel: $50.0
- Frappé: $40.0
------------------------------
Subtotal: $120.0
¡Aplica descuento del 10%!
Total a pagar: $108.0



Reto;
¿Qué agregué?
Añadí la regla de descuento en el método `calcularTotal()`. Si el subtotal de la compra supera los $100, se aplica un 10% de descuento automáticamente. En el ejemplo usado, el subtotal es $120, por lo que el sistema avisa del descuento y cobra $108.