package com.stiv.msvc.usuarios.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "msvc-cursos", url = "msvc-cursos:8002")
public interface ICursoClienteRest {
    @DeleteMapping("/eliminar-usuario-/{id}")
    void eliminarUsuarioCursoPorId(@PathVariable Long id);
}
