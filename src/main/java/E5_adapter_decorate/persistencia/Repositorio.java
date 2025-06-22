package E5_adapter_decorate.persistencia;

import E5_adapter_decorate.Concurso;
import E5_adapter_decorate.Participante;
import E5_adapter_decorate.utilidades.exceptions.DatabaseConnectionException;

import java.time.LocalDate;

public interface Repositorio {
    public void guardarInscripcion(LocalDate fecha, Participante participante, Concurso concurso) throws DatabaseConnectionException;
}
