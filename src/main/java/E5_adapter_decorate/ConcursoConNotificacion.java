package E5_adapter_decorate;

import E5_adapter_decorate.utilidades.exceptions.DatabaseConnectionException;
import E5_adapter_decorate.utilidades.notificadores.Notificacion;
import E5_adapter_decorate.utilidades.notificadores.Notificador;

public class ConcursoConNotificacion extends ConcursoDecorador {

    private Notificador notificador;

    public ConcursoConNotificacion(ConcursoComponente componente, Notificador notificador) {
        super(componente);
        this.notificador = notificador;
    }

    @Override
    public String inscribirParticipante(Participante participante) throws DatabaseConnectionException {
        String res = super.inscribirParticipante(participante);
        notificador.notificar(new Notificacion(participante.getEmail()));
        return res;
    }
}
