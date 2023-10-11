package ej2;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class ej2App {
	
	public static void main(String[] args) {
		
		String texto_cantidadDeCompras = JOptionPane.showInputDialog("Cuantas compras habido hoy? ");
		int cantidadDeCompras = Integer.parseInt(texto_cantidadDeCompras);
		
		double array[][] = new double[5][cantidadDeCompras];
			
		compras(array, cantidadDeCompras);
		pintaPorPantalla(array, cantidadDeCompras);
		
		
	}
	
	public static void compras(double[][] array, int compras) {
		double precioFinal=0;
		double ivaDelPrecio =0;
		final double IVA = 0.21;
		double precioBruto=0;
		double cambioDevolver = 0;
		
		for(int y = 0; y<compras; y++) {
			//guardamos cuantos articulos a comprado
			String texto_cantidadDeArticulos = JOptionPane.showInputDialog("Cuantos articulos has comprado? ");
			double cantidadDeArticulos = Double.parseDouble(texto_cantidadDeArticulos);
			array[1][y]=cantidadDeArticulos;
			//guardamos su precio con iba y calculamos sin iva y lo guardamos
			String texto_precioFinal = JOptionPane.showInputDialog("Cual era el precio? ");
			precioFinal = Double.parseDouble(texto_precioFinal);
			array[2][y]=precioFinal;
			ivaDelPrecio = precioFinal*IVA;
			precioBruto = precioFinal-ivaDelPrecio;
			array[3][y] = precioBruto;
			//calculamos cuanto ha pagado y con el precio sabremos cuanto hay que devolver y lo guardamos
			String texto_cantidadPagada = JOptionPane.showInputDialog("Cuantos has pagado? ");
			double cantidadPagada = Double.parseDouble(texto_cantidadPagada);
			array[4][y] = cantidadPagada;
			cambioDevolver = cantidadPagada-precioFinal;
			array[5][y] = cambioDevolver;
			
		}
		
	}
	
	public static void pintaPorPantalla(double[][] array, int compras) {
		System.out.println("Hoy habido "+compras+" compras, las cuales son: ");
		for(int y = 0; y<compras; y++) {
			System.out.println("Nº de articulos "+array[1][y]+" | Precio total de la compra CON IVA "+array[2][y]+" | Precio total SIN IVA "+array[3][y]+" | Cantidad pagada "+array[4][y]+" | Cantidad a devolver "+array[51][y]);
		}
	
	}


}
