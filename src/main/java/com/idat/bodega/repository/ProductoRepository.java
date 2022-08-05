package com.idat.bodega.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.idat.bodega.model.Producto;

@RestResource(path = "producto")
public interface ProductoRepository extends JpaRepository<Producto, Integer>{

}
