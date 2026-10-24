Ejercicio 7: Revision de codigo con ayuda de IA

Prompt utilizado
Revisa el constructor de mi clase Producto del Ejercicio 2. El codigo actual hace esto: if (precio > 0) this.precio = precio; else this.precio = 1.0; Sugiere cinco casos de prueba para evaluar este comportamiento.

Sugerencias de la IA y mi verificacion

Precio positivo normal como 50.0. Clasificacion: Correcta. El programa lo asigna sin problemas.

Precio negativo como -10.0. Clasificacion: Correcta. El programa lo rechazaba, pero asignarle 1.0 como castigo era una mala regla de negocio.

Precio exactamente igual a 0.0. Clasificacion: Correcta. El programa lo evaluaba como falso y le asignaba 1.0. Esto era un defecto real porque impedia tener productos de regalo o promociones gratuitas.

Precio con decimales muy largos como 10.5555. Clasificacion: No aplicable por ahora. El tipo double lo soporta, pero sale del alcance basico de la practica.

Precio nulo o vacio. Clasificacion: Incorrecta. En Java, una variable primitiva double no puede ser null, asi que el programa ni siquiera compilaria.

Cambio realizado
Modifique el constructor de la clase Producto. Cambie la condicion a precio >= 0 para permitir que los productos cuesten cero. Tambien cambie el valor de castigo para los negativos de 1.0 a 0.0, lo cual tiene mas sentido logico.

Reto Opcional

Que agregue:
Realice una segunda revision. Le envie a la IA mi codigo corregido y le pregunte si existia algun otro riesgo logico al permitir precios de 0.0. La IA sugirio verificar si un precio de cero afecta el calculo total. Verifique esto mentalmente y comprobe que no afecta, ya que el ciclo del Ejercicio 2 simplemente suma cero al subtotal sin causar errores.