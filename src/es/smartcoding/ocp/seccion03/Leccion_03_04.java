/**
 * 
 */
package es.smartcoding.ocp.seccion03;

/**
 * @author pep
 * 
 *         Principios de diseño.
 * 
 *         Un principio de diseño es una idea preestablecida o practica
 *         recomendada que facilita el proceso de diseño de software.
 * 
 *         En general es recomendable seguir unos buenos principio de diseño
 *         porque:
 * 
 *         1. Se produce código más lógico.
 * 
 *         2. Se produce código que es más fácil de entender.
 * 
 *         3. Se facilita el reuso de clases.
 * 
 *         4. El código es más fácil de mantener y de adaptar a cambios en los
 *         requerimientos de las aplicaciones.
 * 
 *         La encapsulación es uno de los principios básicos de diseño. De hecho
 *         es tan relevante que existe un standard llamado JavaBeans.
 * 
 *         Un JavaBean es un principio de diseño para encapsular datos en Java
 *         que sigue unas normas sencillas:
 * 
 *         1. Las propiedades han de ser privadas.
 * 
 *         2. Los métodos de lectura empiezan por get o is si el método retorna
 *         un valor lógico.
 * 
 *         3. Los métodos de escritura empiezan por set.
 * 
 *         4. Después de set/is/get escribiremos el nombre de la propiedad
 *         empezando con una mayúscula.
 * 
 *         La relación es-un expresa una relación de herencia
 * 
 *         La relación tiene-un expresa una relación de composición.
 * 
 */

class Mascota {
	/*
	 * Propiedades privadas
	 */
	private String nombre;
	private boolean exotico;

	/*
	 * No hay constructor por defecto
	 */
	public Mascota(String nombre, boolean exotico) {
		super();
		this.nombre = nombre;
		this.exotico = exotico;
	}

	/*
	 * Métodos accesores
	 */
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isExotico() {
		return exotico;
	}

	public void setExotico(boolean exotico) {
		this.exotico = exotico;
	}

	@Override
	public String toString() {
		return "AnimalDomestico [nombre=" + nombre + ", exotico=" + exotico + "]";
	}

}

public class Leccion_03_04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
