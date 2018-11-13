package es.ivanmarco.carritocompra.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import es.ivanmarco.carritocompra.beans.impl.Cliente;
import es.ivanmarco.carritocompra.beans.impl.Compra;
import es.ivanmarco.carritocompra.beans.impl.Empresa;
import es.ivanmarco.carritocompra.beans.impl.Menu;
import es.ivanmarco.carritocompra.beans.impl.Producto;



public class CarritoCompraMain {

	public static void main(String[] args) {
		Empresa empresa=new Empresa();
		
		empresa.setNombreEmpresa("IvanMarcoSL");
		
		Map <String,ArrayList<Compra>> listaClientes=new HashMap<String,ArrayList<Compra>>();
		
		ArrayList<Producto>productos=new ArrayList<Producto>();
		ArrayList<Cliente>clientes=new ArrayList<Cliente>();
		
		empresa.setProductos(productos);
		Compra compra=new Compra();
		
		Producto producto1 = new Producto("Galletas","Galletas de chocolate", "Alimentacion",2.95,10);
		Producto producto2 = new Producto("Colonia","Colonia para hombres MUY hombres", "Perfumeria",12.75,0);
		Producto producto3 = new Producto("Jabon","Jabon de manos","Limpieza",3.95,50);
		Producto producto4 = new Producto("Tofu","Alimento de soya","Alimentacion",5.95,100);
		
		Cliente clientes1 = new Cliente("Pedro","Alvarez Gonzalez","C/ Colon 21","+346527778","1");
		Cliente clientes2 = new Cliente("Pablo","Alvarez Gonzalez","C/ Marques de vadillo 21","+3467555678","2");
		Cliente clientes3 = new Cliente("Miguel","Alvarez Gonzalez","C/ Principe pio 21","+34653278","3");
		Cliente clientes4 = new Cliente("Maria","Alvarez Gonzalez","C/ Serrano 21","+3465345437","4");
		
		productos.add(producto1);
		productos.add(producto2);
		productos.add(producto3);
		productos.add(producto4);
		
		clientes.add(clientes1);
		clientes.add(clientes2);
		clientes.add(clientes3);
		clientes.add(clientes4);

		
		Menu menu = new Menu();

		menu.crearProducto(empresa);
		menu.mostrarListaCliente(empresa);
		menu.incrementarStock(empresa);
		menu.disminuirStock(empresa);
		menu.pasoCaja(clientes3, empresa, compra, listaClientes);
		menu.elegirProductos(clientes3, empresa, compra);
		menu.mostrarProductos(empresa);
		
	}



}
