package E5_adapter_decorate;

import E5_adapter_decorate.persistencia.Repositorio;
import E5_adapter_decorate.persistencia.RepositorioArchivo;
import E5_adapter_decorate.persistencia.RepositorioBD;
import E5_adapter_decorate.utilidades.exceptions.DatabaseConnectionException;
import E5_adapter_decorate.utilidades.fechas.AccesoReloj;
import E5_adapter_decorate.utilidades.fechas.Formateador;
import E5_adapter_decorate.utilidades.fechas.Reloj;
import E5_adapter_decorate.utilidades.notificadores.Notificador;
import E5_adapter_decorate.utilidades.notificadores.NotificadorEmail;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

//------------------------------------------------ SET UP --------------------------------------------------------------
        Participante p1 = new Participante("Pepito Perez", "pepito@mail.com");
        Participante p2 = new Participante("Maria Suarez", "maria@mail.com");
        Participante p3 = new Participante("Juana Rodriguez", "juana@mail.com");
        Participante p4 = new Participante("Dominga Gomez", "dominga@mail.com");

        LocalDate fechaInicio =  LocalDate.of(2025, 03, 15);
        LocalDate fechaFin = LocalDate.of(2025, 03, 28);

//----------------------------------------------- REGISTRO EN ARCHIVO --------------------------------------------------

        String rutaArchivo = "C:\\Users\\retur\\OneDrive\\Escritorio\\UNRN\\TERCER AÑO\\PRIMER CUATRIMESTRE\\OBJETOS 2\\ArchivosJava\\Inscriptos.txt";
        Reloj reloj = new AccesoReloj();
        Formateador formateador = new Formateador();

        Repositorio repositorioArchivo = new RepositorioArchivo(rutaArchivo, formateador);
        Notificador notificador = new NotificadorEmail();

        ConcursoComponente concursoBase = new Concurso("Concurso 1", fechaInicio, fechaFin, repositorioArchivo, reloj);
        ConcursoComponente concursoDecorado = new ConcursoConNotificacion(concursoBase, notificador);
        //Concurso concurso1 = new Concurso("Concurso 1", fechaInicio, fechaFin, repositorioArchivo, reloj);


        System.out.println("Inscribir participantes (archivo): ");
        try {
            System.out.println(concursoDecorado.inscribirParticipante(p1));
            System.out.println(concursoDecorado.inscribirParticipante(p2));
        } catch (DatabaseConnectionException e) {
            System.out.println(e.getMessage());
        }

//------------------------------------------- REGISTRO EN BASE DE DATOS ------------------------------------------------

        Repositorio repositorioBD = new RepositorioBD();

        ConcursoComponente concursoBase_2 = new Concurso("Concurso 2", fechaInicio, fechaFin, repositorioBD, reloj);
        ConcursoComponente concursoDecorado_2 = new ConcursoConNotificacion(concursoBase_2, notificador);

        //Concurso concurso2 = new Concurso("Concurso 2", fechaInicio, fechaFin, repositorioBD, reloj);

        System.out.println("Inscribir participantes (bd): ");
        try {
            System.out.println(concursoDecorado_2.inscribirParticipante(p3));
            System.out.println(concursoDecorado_2.inscribirParticipante(p4));
        } catch (DatabaseConnectionException e) {
            System.out.println(e.getMessage());
        }
    }
}
