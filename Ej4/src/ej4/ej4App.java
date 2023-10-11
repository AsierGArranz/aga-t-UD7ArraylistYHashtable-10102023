package ej4;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ej4App {

	public static void main(String[] args) {
		boolean terminar = true;
		
		ArrayList<String> listaArticulos=new ArrayList<>(10);
		ArrayList<String> listaCantidades=new ArrayList<>(10);
		
		ArrayList<Double> listaVentas =new ArrayList<>(10);
		ArrayList<Double> listaPrecios =new ArrayList<>(10);
		ArrayList<Double> listaPreciosIVA =new ArrayList<>(10);
		ArrayList<Double> listaPagado =new ArrayList<>(10);
		ArrayList<Double> listaCambio =new ArrayList<>(10);
		
		double precioFinal=0;
		double ivaDelPrecio =0;
		final double IVA = 0.21;
		double precioBruto=0;
		double cambioDevolver = 0;
		
		int cantidadArticulos = 0;
		int cantidadVentas = 0;
		while(terminar ==true) {
			String texto_queQuierHacer = JOptionPane.showInputDialog("Añadir articulo (1) | Listar todo (2) | Lista Ventas(3) | Eliminar priemr articulo (4) | Salir programa (5) ");
		
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
				//ventas
				case "3":
					//guardamos cuantos articulos a comprado
					String texto_cantidadDeArticulos = JOptionPane.showInputDialog("Cuantos articulos has vendido? ");
					double cantidadDeArticulos = Double.parseDouble(texto_cantidadDeArticulos);
					listaVentas.add(cantidadDeArticulos);
					//guardamos su precio con iba y calculamos sin iva y lo guardamos
					String texto_precioFinal = JOptionPane.showInputDialog("Cual era el precio? ");
					precioFinal = Double.parseDouble(texto_precioFinal);
					listaPreciosIVA.add(precioFinal);
					ivaDelPrecio = precioFinal*IVA;
					precioBruto = precioFinal-ivaDelPrecio;
					listaPrecios.add(precioBruto);
					//calculamos cuanto ha pagado y con el precio sabremos cuanto hay que devolver y lo guardamos
					String texto_cantidadPagada = JOptionPane.showInputDialog("Cuantos ha pagado? ");
					double cantidadPagada = Double.parseDouble(texto_cantidadPagada);
					listaPagado.add(cantidadPagada)
					cambioDevolver = cantidadPagada-precioFinal;
					listaCambio.add(cambioDevolver);
					
					System.out.println("El total de articulos vendidos son "+listaVentas.get(cantidadVentas)+" con el precio "+listaPreciosIVA.get(cantidadVentas)+ " y el precio sin IVA es de "+listaPrecios.get(cantidadVentas)+" que nos ha pagado con la cantidad de "+listaPagado.get(cantidadVentas)+" y le hemos devuelto "+listaCambio.get(cantidadVentas));
					
					cantidadVentas++;
				
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

}
