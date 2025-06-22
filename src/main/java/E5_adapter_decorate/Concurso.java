package E5_adapter_decorate;

import E5_adapter_decorate.persistencia.Repositorio;
import E5_adapter_decorate.utilidades.exceptions.DatabaseConnectionException;
import E5_adapter_decorate.utilidades.fechas.Reloj;
import E5_adapter_decorate.utilidades.notificadores.Notificacion;
import E5_adapter_decorate.utilidades.notificadores.Notificador;

import java.time.LocalDate;

public class Concurso implements ConcursoComponente{

    //ATRIBUTO DE CLASE
    private static int contador = 1;

    //ATRIBUTOS DE INSTANCIA
    private final int id;

    private String nombre;
    private LocalDate fechaInicioInscripcion;
    private LocalDate fechaFinInscripcion;
    private Repositorio repositorio;
    //private Notificador notificador;
    private Reloj reloj;


    public Concurso(String nombre, LocalDate fechaInicio, LocalDate fechaFin, Repositorio repositorio, Reloj reloj) {

        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
        if (fechaInicio == null || fechaFin == null) {
            throw new IllegalArgumentException("Las fechas no pueden ser nulas");
        }
        if (fechaInicio.isAfter(fechaFin)) {
            throw new IllegalArgumentException("La fecha de inicio debe ser anterior a fecha de finalización.");
        }

        this.id = this.contador++;
        this.nombre = nombre;
        this.fechaInicioInscripcion = fechaInicio;
        this.fechaFinInscripcion = fechaFin;

        this.repositorio = repositorio;
        //this.notificador = notificador;
        this.reloj = reloj;
    }

    public String inscribirParticipante(Participante participante) throws DatabaseConnectionException {

        LocalDate fechaActual = reloj.obtenerFechaActual();

        if (fechaActual.isBefore(fechaInicioInscripcion) || fechaActual.isAfter(fechaFinInscripcion)) {
            return "No se puede inscribir: la inscripción está cerrada.";
        }
        if (fechaActual.equals(fechaInicioInscripcion)) {
            participante.agregarPuntos(10);     //Suma los puntos si se cumple que es primer dia
        }

        this.repositorio.guardarInscripcion(fechaActual, participante, this);
        //this.notificador.notificar(new Notificacion(participante.getEmail()));  //Se puede evitar? ---> No

        return "Se realizó la inscripción.";
    }

//-------------------------------------------------------- GETTERS -----------------------------------------------------
    public int getId() {
        return id;
    }
}