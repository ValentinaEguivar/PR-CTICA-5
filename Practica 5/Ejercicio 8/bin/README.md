Como ejecutar
Version: Java 17
Compilar: javac ValidadorClave.java Main.java
Ejecutar: java Main


Sugerencias:
Sugerencia 1: Manejar el caso donde la clave sea null. Clasificacion: Util. Al probar enviar null, el programa original fallaba con un NullPointerException al intentar medir la longitud.
Sugerencia 2: Exigir un caracter especial. Clasificacion: No aplicable. Para este ejercicio didactico, agregar mas reglas complicaria el codigo sin aportar mas a la practica de POO basica.

Incorpore la validacion de valores nulos al principio del metodo esValida. Si la clave es null, retorna false inmediatamente, evitando que el programa se rompa. Descarte la sugerencia de caracteres especiales para mantener la simpleza del ejercicio.

Reto:
Separe la validacion en tres metodos pequenos privados: tieneLongitudMinima, noTieneEspacios y tieneMayuscula. Al comparar esta organizacion con poner todo en un solo bloque gigante, la clase se vuelve mucho mas clara. El metodo principal esValida ahora se lee casi como lenguaje natural, y cada regla tiene su propio bloque de codigo independiente, lo que facilita encontrar errores sin cambiar el comportamiento esperado.