package com.guillermo.gestioninventario.controller;

import com.guillermo.gestioninventario.model.productos;
import com.guillermo.gestioninventario.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
@CrossOrigin(origins = "*") // Permitir acceso de cualquier origen

public class ProductoController {
    @Autowired
    private ProductoService productoService;

    @PostMapping("/guardar")
    public productos createProducto(@RequestBody productos productos) {
        return productoService.saveProducto(productos);
    }

    @GetMapping("/todos")
    public List<productos> getAllProductos() {
        return productoService.getAllProductos();
    }


    @GetMapping("/obtener/{id}")
    public productos getProductoById(@PathVariable Integer id) {
        return productoService.getProductoById(id);
    }

    @PutMapping("/modificar/{id}")
    public productos updateProducto(@RequestBody productos productos) {
        return productoService.updateProducto(productos);
    }

    @DeleteMapping("/eliminar/{id}")
    public String deleteProducto(@PathVariable Integer id) {
        productoService.deleteProducto(id);
        return "Producto eliminado con id: " + id;
    }
}
