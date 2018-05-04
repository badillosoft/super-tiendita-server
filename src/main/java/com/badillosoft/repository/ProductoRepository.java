package com.badillosoft.repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.badillosoft.model.Producto;

@Transactional
public interface ProductoRepository extends CrudRepository<Producto, Long> {

}
