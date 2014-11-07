Generador de mensajes
=====================
Esta es un primer borrador para ver si tendría sentido desarrollar una librería que permitiese la generación
de mensajes para usuario final con poco esfuerzo  por parte del desarrollador.
Estaría orientado a grandes proyectos donde al final generar mensajes se convierte en una tarea poco agradable.
La idea es tener una librería al estilo de lo que hace [Hamcrest](http://hamcrest.org/) para la generación de aserciones.

##Objetivos:
 - Asegurar la consistencia de los mensajes en toda la aplicación.
 - Permitir la traducción a otros idiomas traduciendo simplemente el nombre de las entidades principales.
 - Disponer de distintos "bindings" para que se pueda elegir el estilo de comunicación: 
	 - Impersonal: Se ha guardado la factura.
	 - Pasivo: La factura ha sido guardada.
	 - Personal: Hemos guardado la factura.
 - Evitar errores tipográficos.
 - Disponer de un mecanismo de extensión para permitir enriquecer el diccionario o gramática.

----------

En la clase com.errand.examples.Examples se puede ver un pequeño ejemplo de uso.

Básicamente:

    Invoice i = new Invoice();
	translate(the(i), updated());
	translate(the(i, i.code), deleted())
	translate(the(Contract.class), deleted());

Generaría:

    The invoice has been updated.
	The invoice "33/2015" has been deleted.
	The contract has been deleted.


