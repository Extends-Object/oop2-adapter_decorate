package E5_adapter_decorate;

import E5_adapter_decorate.utilidades.exceptions.DatabaseConnectionException;

public interface ConcursoComponente {
    String inscribirParticipante(Participante participante) throws DatabaseConnectionException;
}