package com.esucomex.ventas.services;
import java.util.List;
import com.esucomex.ventas.entities.Producto;

public interface IProductoService {
	// escribir los metodos que va a ocupar los controladores	
	List<Producto> obtenerTodosLosProductos();
	Producto obtenerProductoPorId(Integer id);
	Producto guardarProducto(Producto pro);
	Producto actualizarProducto(Producto pro);
	Producto eliminarProducto(Integer id);	
}
