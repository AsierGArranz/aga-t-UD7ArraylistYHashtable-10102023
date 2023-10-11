package ej3;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ej3App {

	public static void main(String[] args) {
		boolean terminar = true;
		
		ArrayList<String> listaArticulos=new ArrayList<>(10);
		ArrayList<String> listaCantidades=new ArrayList<>(10);
		int cantidadArticulos = 0;
		while(terminar ==true) {
			String texto_queQuierHacer = JOptionPane.showInputDialog("Añadir articulo (1) | Listar todo (2) | Consultar informacion de un articulo en concreto(3) | Eliminar priemr articulo (4) | Salir programa (5) ");
		
			switch(texto_queQuierHacer) {
				//añadir
				case "1":
					if(cantidadArticulos ==10) {
						JOptionPane.showMessageDialog(null,"Lista llena, porfavor elimine un articulo");
					}else {
						String texto_nombre = JOptionPane.showInputDialog("Añadir nombre articulo ");
						listaArticulos.add(texto_nombre);
				
						String texto_añadir = JOptionPane.showInputDialog("Añadir cantidad ");
						listaCantidades.add(texto_añadir);
						cantidadArticulos++;
					}
					
					break;
				//ver toda la array
				case "2":
					for(int i=0; i<listaArticulos.size();i++) {
						System.out.println("Posicion numero "+i+" tiene el nombre "+listaArticulos.get(i)+ " con la cantidad "+listaCantidades.get(i));
					}
					
					break;
				//ver un caso en especifico
				case "3":
					String texto_posicion = JOptionPane.showInputDialog("Que posicion quieres ver? ");
					int posicion = Integer.parseInt(texto_posicion);
					System.out.println("Posicion numero "+posicion+" tiene el nombre "+listaArticulos.get(posicion)+ " con la cantidad "+listaCantidades.get(posicion));
						
					break;
				//eliminar el primer articulo añadido
				case "4":
					System.out.println("El articulo con la posicion numero "+cantidadArticulos+" con el nombre "+listaArticulos.get(0)+ " y la cantidad "+listaCantidades.get(0)+" ha sido eliminado");
					listaArticulos.remove(0);
					listaCantidades.remove(0);
					break;
				//terminar programa
				case "5":
					terminar = false;
					break;
					default:
						JOptionPane.showMessageDialog(null,"El numero introducido no es correcto");
			}
		
		}
	}

}
