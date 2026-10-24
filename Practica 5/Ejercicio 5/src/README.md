Ejercicio 5: Préstamo de un Libro

Cómo ejecutar
- Versión: Java 17
- Compilar: `javac *.java`
- Ejecutar: `java Main`

Decisiones de diseño (Colaboración)
Se usó Asociación para conectar a un `Lector` con un `Libro` a través de la clase `Prestamo`. 
El estado del libro (`disponible`) está totalmente encapsulado. La clase `Main` nunca cambia el estado directamente; en lugar de eso, el constructor de `Prestamo` llama al método `libro.prestar()`, el cual tiene un condicional interno que cambia el estado y devuelve `true` solo si el libro estaba disponible. Si devuelve `false`, el préstamo se rechaza.

Evidencia de salida en consola
--- INTENTO 1: PRÉSTAMO VÁLIDO ---
-> Préstamo APROBADO: '1984 - George Orwell' entregado a Carlos Ruiz

--- INTENTO 2: LIBRO YA PRESTADO ---
-> Préstamo RECHAZADO: El libro '1984 - George Orwell' ya se encuentra prestado.

--- VERIFICACIÓN DE VENCIMIENTO (Reto) ---
AVISO: El préstamo de '1984 - George Orwell' está VENCIDO.

--- DEVOLUCIÓN ---
-> Devolución REGISTRADA: '1984 - George Orwell' devuelto por Carlos Ruiz


Reto:
¿Qué agregué?
Implementé una simulación simple del paso del tiempo usando números enteros ("día actual"). Añadí el atributo `diaVencimiento` al `Prestamo` con una regla de que duran 7 días. Luego, creé el método `verificarVencimiento(int diaActual)` que comprueba si el préstamo sigue activo y si el día actual es mayor a la fecha límite establecida, mostrando una advertencia si el lector se ha demorado.