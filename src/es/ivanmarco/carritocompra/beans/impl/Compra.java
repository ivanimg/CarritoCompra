package es.ivanmarco.carritocompra.beans.impl;

public class Compra {
	
	public Compra(int id, Producto producto, Clientes cliente, double total, String fecha) {
		super();
		this.id = id;
		this.producto = producto;
		this.cliente = cliente;
		this.setTotal(total);
		this.fecha = fecha;
	}
	private int id;
	private Producto producto;
	private Clientes cliente;
	private double total;
	private String fecha;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public Clientes getCliente() {
		return cliente;
	}
	public void setCliente(Clientes cliente) {
		this.cliente = cliente;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	
	/**
	 * CALCULAR TOTAL DE COMPRA METODO
	 */

	@Override
	public String toString() {
		return "Compra [id=" + id + ", producto=" + producto + ", cliente=" + cliente + ", Total=" + total
				+ ", fecha=" + fecha + "]";
	}
	

}
