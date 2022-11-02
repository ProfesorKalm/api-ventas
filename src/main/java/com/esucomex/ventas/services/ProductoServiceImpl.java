package com.esucomex.ventas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esucomex.ventas.Daos.IProductoDao;
import com.esucomex.ventas.entities.Producto;

@Service
public class ProductoServiceImpl implements IProductoService {
			
	@Autowired
	private IProductoDao productoDao;
	
	@Override
	public List<Producto> obtenerTodosLosProductos() {		
		return (List<Producto>) productoDao.findAll();
	}

	@Override
	public Producto obtenerProductoPorId(Integer id) {
		
		return (Producto) productoDao.findById(id).orElse(new Producto());
	}

	@Override
	public Producto guardarProducto(Producto pro) {		
		return productoDao.save(pro);
	}

	@Override
	public Producto actualizarProducto(Producto pro) {
		
		// aqui va la logica de negocio
		if(pro.getId() == 0) {
			return new Producto();
		}
		return productoDao.save(pro);		
	}

	@Override
	public Producto eliminarProducto(Integer id) {
		
		Producto proBd = productoDao.findById(id).orElse(new Producto());
		
		if(proBd.getId() == null) {
			return proBd;
		}
		
		try {
			productoDao.delete(proBd);
			
		} catch (Exception e) {
			return new Producto();
		}		
		return proBd;
	}

}
