package com.alura.forohub.domain.topico;

import com.alura.forohub.domain.curso.DatosRespuestaCurso;
import com.alura.forohub.domain.usuario.DatosRespuestaUsuario;

import java.util.Date;

public record DatosRespuestaTopico(Long id, String titulo, String mensaje, Date fechaCreacion, DatosRespuestaUsuario autor,
                                   DatosRespuestaCurso curso) {
}
