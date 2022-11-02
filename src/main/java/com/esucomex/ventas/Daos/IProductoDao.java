package com.esucomex.ventas.Daos;

import org.springframework.data.repository.CrudRepository;

import com.esucomex.ventas.entities.Producto;

public interface IProductoDao extends CrudRepository<Producto, Integer>  {
 
}
