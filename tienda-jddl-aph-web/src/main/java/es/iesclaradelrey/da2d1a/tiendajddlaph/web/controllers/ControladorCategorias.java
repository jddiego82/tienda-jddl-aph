package es.iesclaradelrey.da2d1a.tiendajddlaph.web.controllers;

import es.iesclaradelrey.da2d1a.tiendajddlaph.common.entities.Categoria;
import es.iesclaradelrey.da2d1a.tiendajddlaph.common.services.CategoriaServicio;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
@RequestMapping("/categorias")
public class ControladorCategorias {
    private CategoriaServicio categoriaServicio; // 1. El atributo

    public ControladorCategorias(CategoriaServicio categoriaServicio) { // 2. El constructor
        this.categoriaServicio = categoriaServicio;
    }
    @GetMapping
    public String mostrarCategorias(Model model) {
        model.addAttribute("categorias", categoriaServicio.findAll());
        return "categorias/categorias";
    }

    @GetMapping("/{id}")
    public String mostrarDetalleCategoria(@PathVariable Long id, Model model) {
        Optional<Categoria> optional =  categoriaServicio.findById(id);
        Categoria categoria = optional.orElse(null);
        model.addAttribute("categoria", categoria);
        return "categorias/detalles-categoria";
    }
}