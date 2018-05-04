package com.badillosoft.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.badillosoft.model.Producto;
import com.badillosoft.repository.ProductoRepository;

@Service
public class ProductoService {

	@Autowired
	ProductoRepository productoRepository;
	
	public Producto crearProducto(Producto producto) throws Exception {
		
		if (producto.getUnitario() <= 0) {
			throw new Exception("El precio unitario no puede ser negativo, ni cero");
		}
		
		if (producto.getPrecio() <= 0) {
			throw new Exception("El precio no puede ser negativo, ni cero");
		}
		
		productoRepository.save(producto);
		
		return producto;
	}
	
}
