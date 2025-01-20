package com.challengen.alura.forohub.domain.topico.dto;

import com.challengen.alura.forohub.domain.topico.Estado;

public record ActualizarTopicoDTO(String titulo,
                                  String mensaje,
                                  Estado estado,
                                  Long cursoId) {
}
