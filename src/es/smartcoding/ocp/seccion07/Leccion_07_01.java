/**
 * 
 */
package es.smartcoding.ocp.seccion07;

/**
 * @author pep
 * 
 *         Concurrencia
 * 
 *         Introducción
 * 
 *         La idea detrás del procesamiento multi-thread es que una aplicación o grupo de aplicaciones puedan ejecutar
 *         múltiples tareas en paralelo.
 * 
 *         En 2004, La versión 5 de Java ya introdujo la API Concurrency en el paquete java.util.concurrent que
 *         facilitaba la gestión de hilos.
 * 
 *         La gestión de los hilos y la concurrencia suelen ser uno de los temas más difíciles de entender incluso para
 *         algunos programadores veteranos.
 * 
 *         El examen OCP 8 se centra en gran medida en la API de concurrencia, de todas formas creo que es conveniente
 *         empezar desde el principio.
 * 
 *         Un hilo es la unidad mínima de ejecución que puede gestionar un sistema operativo. Un proceso es un grupo de
 *         hilos relacionados que se ejecuta en el mismo entorno compartido. Los procesos pueden tener un hilo o más de
 *         uno.
 * 
 *         Cuando digo 'entorno compartido' me refiero a que los hilos comparten el mismo espacio de memoria y que
 *         pueden comunicarse directamente entre ellos.
 * 
 *         Por lo tanto, si un thread actualiza una variable estática, entonces todos las instancias de esa clase veran
 *         el cambio.
 * 
 *         Los hilos realizan tareas (tasks), siendo una tarea la unidad de trabajo realizada por un thread o hilo. Un
 *         hilo puede realizar múltiples tareas, pero de una en una.
 * 
 *         Todas las aplicaciones son multi-threaded, incluso la más simple de todas, la que imprimer el clásico 'Hola
 *         mundo'. El motivo es que se deben distinguir entre threads del sistema y thread definidos por el usuario.
 * 
 *         Un thread del sistema es creado por la máquina virtual de Java (JVM) y se ejecuta en el background de la
 *         aplicación. Por ejemplo, el garbage-collector o recolector de basura es un thread de sistema que se ejecuta
 *         en background y se encarga de recuperar memória que no se utiliza. En general estos threads son transparentes
 *         desde el punto del desarrollador.
 * 
 *         Por otro lado, un thread definido por el usuario esta diseñado por el programador para llevar a cabo una
 *         tarea determinada. los hilos demonio (daemon thread) son hilos que se ejecutan en background pero que no
 *         previenen el final de un programa. Es decir, una aplicación Java terminará incluso si hay hilos demonio en
 *         marcha, porque previamente los para.
 * 
 *         Concurrencia se refiere a la propiedad de ejecutar múltiples hilos y procesos al mismo tiempo. Pero
 *         generalmente, hay más hilos que procesadores, por lo que el Scheduler o Planificador del sistema operativo es
 *         quien decide qué hilo se ejecuta en cada momento, mediante cambios de contexto cada cierta cantidad de
 *         tiempo.
 * 
 *         Revisa el código que acompaña a esta lección, responde a las preguntas planteadas y en definitiva, modifícalo
 *         para experimentar con los contenidos de esta lección.
 * 
 */
class Job extends Thread {
    @Override
    public void run() {
	for (;;)
	    System.out.println("X");
    }
}

public class Leccion_07_01 {

    /**
     * Determina la salida de este programa.
     * 
     * Qué pasa si modificas la línea (1) a true?
     * 
     * @param args
     */
    public static void main(String[] args) {
	Thread t = new Job();
	t.setDaemon(false);	// (1)
	t.start();
	System.out.println("main ends");

    }

}







