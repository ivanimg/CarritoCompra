package es.ivanmarco.carritocompra.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import es.ivanmarco.carritocompra.beans.impl.Clientes;
import es.ivanmarco.carritocompra.beans.impl.Compra;
import es.ivanmarco.carritocompra.beans.impl.Producto;

/**
 * Vamos a invocar todo
 * @author aula12
 *
 */
public class Empresa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 0 = Alimentación", 1= Perfumería", 2= Limpieza"
		 */
		Producto producto1 = new Producto("Galletas","Galletas de chocolate", 0,2.95,10);
		Producto producto2 = new Producto("Colonia","Colonia para hombres MUY hombres", 1,12.75,0);
		Producto producto3 = new Producto("Jabón","Jabón de manos", 2,3.95,50);
		Producto producto4 = new Producto("Tofu","Alimento de soya", 0,5.95,100);


		
		
		List<Compra> compra = new ArrayList<>();
		Clientes clientes1 = new Clientes(0,"Pedro","Alvárez Gonzalez","C/ Colón 21","+346527778");
		Clientes clientes2 = new Clientes(0,"Pablo","Alvárez Gonzalez","C/ Marques de vadillo 21","+3467555678");
		Clientes clientes3 = new Clientes(0,"Miguel","Alvárez Gonzalez","C/ Principe pio 21","+34653278");
		Clientes clientes4 = new Clientes(0,"Maria","Alvárez Gonzalez","C/ Serrano 21","+3465345437");
		

		private List<Producto,String> historial= new ArrayList<>();

		public ArrayList comprar(String fecha, Producto[] producto)
		{
			
			historial.add(producto,fecha);
			return historial;
		}
	}

}
