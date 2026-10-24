En la version corregida, elimine las variables static final para que javap no las encuentre en el pool de constantes. Agregue el parametro StandardCharsets.UTF_8 a getBytes para evitar problemas de codificacion. Tambien implemente la variable intentosFallidos para limitar la fuerza bruta.

Que agregue :D
Al comparar el bytecode de la clase original con la nueva version, comprobe que las cadenas admin y el hash ya no existen en el archivo .class. Los datos ahora deben ser proporcionados desde el Main (por ejemplo, leyendo variables de entorno). Aunque las variables de entorno no son una boveda de seguridad definitiva, cumplen con el proposito de sacar los secretos del codigo fuente.


-Respuestas a las preguntas de análisis

**¿Qué usuario y qué hash están definidos en la clase?**
Al leer el código original proporcionado en la guía, vi que el usuario definido es "admin" y el hash es "5f4dcc3b5aa765d61d8327deb882cf99". Ambos están escritos directamente en las primeras líneas.

**¿Qué información puedes observar con javap? ¿Qué información puede mostrar un decompilador?**
Al usar el comando `javap` pude ver que las palabras "admin" y el hash aparecen en texto plano dentro de una sección llamada "constant pool". Si uso un decompilador, me muestra el código fuente casi idéntico a como lo escribí.

**¿Por qué un atacante con acceso al archivo .class podría encontrar esos valores?**
Porque cuando declaramos textos con `static final`, Java no los oculta ni los protege, simplemente los guarda tal cual como texto legible dentro del archivo compilado.

**¿Qué debilidad presenta MD5 cuando se usa para almacenar contraseñas?**
Que ya es un algoritmo obsoleto y demasiado rápido. Cualquier persona podría adivinar la contraseña original probando miles de combinaciones por segundo con fuerza bruta o buscando en tablas de internet.

**¿Por qué input.getBytes() podría producir resultados distintos según la codificación predeterminada del entorno?**
Porque si no le digo exactamente qué formato de texto usar (como UTF-8), Java toma el que tenga la computadora por defecto. Entonces, la misma clave podría generar un hash distinto en Windows que en Linux.

**¿Qué cambios reducirían la exposición de secretos y el riesgo de intentos repetidos?**
Borrar las credenciales del código fuente para inyectarlas desde afuera (por ejemplo, desde el Main), y poner una variable que cuente los fallos y bloquee todo si me equivoco tres veces seguidas.

**¿Qué limitaciones conserva esta demostración incluso después de tus cambios?**
Sigue siendo una prueba local básica. No hay una base de datos real guardando esto, y la parte de encriptación fuerte solo la simulé un poco para no tener que meter librerías externas avanzadas a la práctica.

Cierre de la práctica :D

Ejercicio sobre proteger el estado
Bueno, para este elegí el Ejercicio 1, el de la Cuenta Digital. Y o sea, la decisión de diseño que me ayudó, o sea, lo que de verdad me ayudó a entender todo mejor fue usar el encapsulamiento así estricto. Al poner los atributos en privado y obligar a usar sí o sí los métodos de depositar y retirar, pues el código quedó mucho más limpio. Fue como mucho más fácil entender las reglas del banco ahí adentro de la clase, en vez de tener el main... o sea, en vez de tener el programa principal lleno de validaciones y de "ifs" para evitar que el saldo quedara negativo, ¿verdad? :D

Ejercicio sobre polimorfismo
Para el otro elegí el Ejercicio 3, el de las tarifas de entrega. Y bueno, la decisión de diseño súper clave aquí fue crear una clase base y dejar que las hijas, o sea, que las subclases sobrescribieran el método de calcular el costo. Esto hizo que... bueno, hizo que el código del ciclo for fuera súper mega fácil de leer. En lugar de tener un montón de condicionales preguntando a cada rato si la entrega era en bici o en auto, o sea, en vez de hacer todo eso, el polimorfismo permitió que cada objeto resolviera su propia fórmula matemática solito jaja :D

Mi pregunta final
Y bueno, finalmente mi pregunta... o sea, después de hacer el Ejercicio 9 y ver lo súper fácil que es que un atacante saque textos o credenciales directito de un archivo .class usando javap, me quedó esta duda: en una aplicación real, o sea, ya a nivel de una empresa grande, ¿cuál es el estándar actual o la forma definitiva para guardar las credenciales de forma súper segura para que ni siquiera los programadores que entran al servidor puedan verlas? :D
