package ej1;

import javax.swing.JOptionPane;
import java.util.Hashtable;
import java.util.Enumeration;

public class ej1App {

	public static void main(String[] args) {
		
		int notaAlumnos = 0;
		double mediaAlumnos = 0;
		
		String texto_cantidadAlumnos = JOptionPane.showInputDialog("Cuantos alumnos quieres insertar? ");
		int cantidadAlumnos = Integer.parseInt(texto_cantidadAlumnos);
		
		double [] guardarNotas = new double [cantidadAlumnos];
		
		Hashtable<String, String> contenedor = new Hashtable<>();
		
		for(int i = 0; i < cantidadAlumnos; i++) {
			String texto_nombreAlumnos = JOptionPane.showInputDialog("Insertar nombre del alumno ");
			String texto_notaAlumnos = JOptionPane.showInputDialog("Insertar nota del alumno ");
			notaAlumnos = Integer.parseInt(texto_notaAlumnos);
			guardarNotas[i] = notaAlumnos;
			contenedor.put(texto_notaAlumnos, texto_nombreAlumnos);
		}

		for(int i = 0; i < guardarNotas.length; i++) {
			mediaAlumnos += guardarNotas[i];
		}
		
		mediaAlumnos /=cantidadAlumnos;
		Enumeration<String> nombresHashtable = contenedor.elements(); 
		//he intentado usar los hashtables en este ejercicio pero no los llego a entender como recorrerlos, 
		//me hubiera sido mas sencillo usando un array doble guardando en cada posicion nombre nota y media en cada fila y cambiar de columna cada vez que añadiria un nuevo alumno
		//con un doble for en una funcion aparte, dejo esto por que medio funciona pero seria algo como esto:
		//for(int y=0; y < cantidadalumnos; y++ ){for x = 0; x <cantidadalumnos;x++){array[1][y] = alumnonombre; array[2][y] = nota; array[3][y] = media; <-la media la meteria fuera seguramnete}
		
		for(int i = 0; i < guardarNotas.length; i++) {
			System.out.println("El alumno "+nombresHashtable.nextElement()+" tiene de media " +mediaAlumnos);
		}
		
	}

}
