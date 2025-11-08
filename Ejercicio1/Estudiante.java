
public class Estudiante extends Usuario {
    private String horario_clases;
    private String grupo_str;

    public Estudiante(String nombre, int id, String password, String grupo_str) {
        super(nombre, id, password);
        this.grupo_str = grupo_str;
        
    }

    public void subir_trabajos() {
        System.out.println("ha subido un trabajo.");
    }

    public void actualizar_informacion() {
        System.out.println("actualizó su información personal.");
    }

    
    @Override
    public void leerNota() {
        System.out.println("está VIENDO SUS NOTAS.");
    }

    public void verNotas() {
        System.out.println("Notas");
       
    }
}