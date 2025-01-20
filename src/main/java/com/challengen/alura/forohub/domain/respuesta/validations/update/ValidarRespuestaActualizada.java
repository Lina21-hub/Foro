package com.challengen.alura.forohub.domain.respuesta.validations.update;

import com.challengen.alura.forohub.domain.respuesta.dto.ActualizarRespuestaDTO;

public interface ValidarRespuestaActualizada {
    void validate(ActualizarRespuestaDTO data, Long respuestaId);
}
