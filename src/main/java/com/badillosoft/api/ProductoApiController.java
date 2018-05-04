package com.badillosoft.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.badillosoft.model.Producto;
import com.badillosoft.repository.ProductoRepository;
import com.badillosoft.service.ProductoService;

@RestController
@RequestMapping("/api/producto")
public class ProductoApiController {
	
	@Autowired
	ProductoService productoService;
	
	@Autowired
	ProductoRepository productoRepository;

	@PutMapping("")
	public Producto crearProducto(@RequestParam String nombre,
			@RequestParam String descripcion, @RequestParam Double unitario, 
			@RequestParam Double precio) throws Exception {
		
		Producto producto = new Producto();
		
		producto.setNombre(nombre);
		producto.setDecripcion(descripcion);
		producto.setUnitario(unitario);
		producto.setPrecio(precio);
		
		return productoService.crearProducto(producto);
	}
	
	@GetMapping("")
	public Iterable<Producto> verProducto() {
		return productoRepository.findAll();
	}
	
}
