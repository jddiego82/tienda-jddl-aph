package es.iesclaradelrey.da2d1a.tiendajddlaph.web.controllers;

import es.iesclaradelrey.da2d1a.tiendajddlaph.common.services.CategoriaServicio;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
//la funcion de esta clase es atender peticiones de inicio, el objetivo es devolver una vista
public class ControladorInicio {

    private final CategoriaServicio categoriaServicio;

    public ControladorInicio(CategoriaServicio categoriaServicio) {
        this.categoriaServicio = categoriaServicio;
    }

    @GetMapping("/")
    public String mostrarVista(Model model){
        model.addAttribute("categorias", categoriaServicio.findAll());
        return "index";
    }

}
