package Tp1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCarrito {

	@Test
	public void testQueAgregaProductos() {
		Carrito nuevo = new Carrito(1);
		Producto p1 = new Producto("leche", 200.0);
		Producto p2 = new Producto("leche", 200.0);
		Producto p3 = new Producto("leche", 200.0);
		Producto p4 = new Producto("agua", 100.0);
		Producto p5 = new Producto("agua", 100.0);
		
		assertTrue(nuevo.agregarProducto(p1, 1));
		assertTrue(nuevo.agregarProducto(p2, 1));
		assertTrue(nuevo.agregarProducto(p3, 1));
		assertTrue(nuevo.agregarProducto(p4, 1));
		assertTrue(nuevo.agregarProducto(p5, 1));
		
		nuevo.mostrarProducto();
		 
		System.out.println("el nuevo precio del producto es = "+nuevo.realizarDescuento());
		
		System.out.println("el precio total de la compra es = "+nuevo.precioTotalCompra());
	}

}
