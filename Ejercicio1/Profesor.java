// src/Profesor.java
import java.util.ArrayList;

public class Profesor extends Usuario {
    private String materia_asignada;
    private String horario_clase;

    public Profesor(String nombre, int id, String password, String materia_asignada, String horario_clase) {
        super(nombre, id, password);
        this.materia_asignada = materia_asignada;
        this.horario_clase = horario_clase;
    }

    public void editar_notas() {
        System.out.println("está editando notas");
    }

    public void administrar_notas() {
        System.out.println("administra notas completas.");
    }

    public void crear_notas() {
        System.out.println("creó una nueva nota.");
    }

    public void borrar_notas() {
        System.out.println("eliminó una nota.");
    }

    // Sobrescritura
    @Override
    public void leerNota() {
        System.out.println("está revisando notas de estudiantes.");
    }

    // Métodos funcionales con lista de notas
    public void agregarNota() {
        System.out.println("agregó una nota");
    }

    public void modificarNota() {
        System.out.println("Nota modificada.");
    }

    public void eliminarNota() {
        
        System.out.println("Nota eliminada para ");
    }
}