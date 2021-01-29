package Tp1;

import java.util.LinkedList;

public class Carrito {
	
	public Carrito(Integer codigo_compra) {
		this.codigo_compra = codigo_compra;
		this.contador_productos_iguales = 0;
		this.lista_compras = new LinkedList<Producto>();
		this.lista_descuento = new LinkedList<Producto>();
	}
	
	public Boolean agregarProducto(Producto nuevo_producto, Integer codigo_compra) {
			if(this.codigo_compra.equals(codigo_compra)) {
				if(!buscarProducto(nuevo_producto)) {
					return this.lista_compras.add(nuevo_producto);
				}
				else 
					return this.lista_descuento.add(nuevo_producto);
			}
			return false;
	}
	
	
	public boolean buscarProducto(Producto nuevo_producto) {
		for (Producto producto : lista_compras) {
			if(nuevo_producto.getNombre().equals(producto.getNombre())){
				this.contador_productos_iguales++;
				return true;
			}
		}
		return false;
	}

	public Double realizarDescuento() {
		Double nuevo_precio = 0.0;
		if(contador_productos_iguales>=1) {
			for (Producto producto : lista_descuento) {
				nuevo_precio = producto.getPrecio()-(producto.getPrecio()*0.7) ;
				producto.setPrecio(nuevo_precio);
			}
			return nuevo_precio;
		}
		return nuevo_precio;
	}

	public void mostrarProducto() {
		for (Producto producto : lista_descuento) {
			System.out.println(producto.getNombre());
		}
	}
	
	public Double precioTotalCompra() {
		Double precio_total = 0.0;
		if(this.lista_compras.addAll(lista_descuento)) {
			for (Producto producto : lista_compras) {
				precio_total += producto.getPrecio();
			}
			return precio_total;
		}
		return precio_total;
	}
	
	private LinkedList<Producto> lista_compras;
	private LinkedList<Producto> lista_descuento;
	private Integer codigo_compra;
	private Integer contador_productos_iguales;
}
