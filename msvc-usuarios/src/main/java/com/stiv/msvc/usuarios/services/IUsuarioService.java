package com.stiv.msvc.usuarios.services;

import com.stiv.msvc.usuarios.models.entity.Usuario;

import java.util.List;
import java.util.Optional;

public interface IUsuarioService {

    List<Usuario> listar();
    Optional<Usuario> porId(Long id);
    Usuario guardar (Usuario usuario);
    void elimminar(Long id);
    Optional<Usuario> poremail(String email);
    List<Usuario> listarPorIds(Iterable<Long> ids);

}
