package es.ivanmarco.carritocompra.beans.impl;

import java.util.Arrays;

public class Producto {
	private String nombre;
	private String descripcion;
	private String[] categoria = {"Alimentación", "Perfumería", "Limpieza"};
	public int getCategoriaNum() {
		return categoriaNum;
	}
	public void setCategoriaNum(int categoriaNum) {
		this.categoriaNum = categoriaNum;
	}

	private int categoriaNum;
	private double precio;
	private int stock;
	
	public Producto()
	{
		
	}	
	public Producto(String nombre, String descripcion, int categoriaNum, double precio, int stock) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.categoria = categoria;
		this.precio = precio;
		this.stock = stock;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String[] getCategoria() {
		return categoria;
	}
	public void setCategoria(String[] categoria) {
		this.categoria = categoria;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", descripcion=" + descripcion + ", categoria="
				+ Arrays.toString(categoria) + ", categoriaNum=" + categoriaNum + ", precio=" + precio + ", stock="
				+ stock + "]";
	}

}
