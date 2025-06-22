package E5_adapter_decorate;

import E5_adapter_decorate.utilidades.exceptions.DatabaseConnectionException;

public abstract class ConcursoDecorador implements ConcursoComponente{

    protected ConcursoComponente componente;

    public ConcursoDecorador(ConcursoComponente componente) {
        this.componente = componente;
    }

    @Override
    public String inscribirParticipante(Participante participante) throws DatabaseConnectionException {
        return componente.inscribirParticipante(participante);
    }
}
