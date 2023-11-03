package com.stiv.msvc.cursos.services;

import com.stiv.msvc.cursos.models.Usuario;
import com.stiv.msvc.cursos.models.entity.Curso;

import java.util.List;
import java.util.Optional;

public interface ICursoService {

    List<Curso> listar();
    Optional<Curso> porId(Long id);
    Optional<Curso> porIdConUsuarios(Long id);
    Curso guardar(Curso curso);
    void eliminar(Long id);
    void eliminarUsuarioCursoPorId(Long id);

    Optional<Usuario> asignarUsuario(Usuario usuario, Long cursoId);
    Optional<Usuario> crearUsuario(Usuario usuario, Long cursoId);
    Optional<Usuario> desasignarUsuario(Usuario usuario, Long cursoId);
}
