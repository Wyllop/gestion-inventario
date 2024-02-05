package com.guillermo.gestioninventario.repository;


import com.guillermo.gestioninventario.model.productos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<productos, Integer> {

}
