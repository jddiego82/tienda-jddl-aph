package es.iesclaradelrey.da2d1a.tiendajddlaph.common.services;

import es.iesclaradelrey.da2d1a.tiendajddlaph.common.entities.Categoria;

import java.util.Optional;

public interface CategoriaServicio {
    void guardar(Categoria entity);
    Iterable<Categoria> findAll();
    Optional<Categoria> findById(Long id);
}
