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