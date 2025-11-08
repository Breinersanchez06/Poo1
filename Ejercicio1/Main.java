public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Usuario pepito = new Usuario("Juan", 123,"hola");
        pepito.logear();
        pepito.leerNota();

        Administrador admin = new Administrador("Admin", 1, "adminpass");
        admin.logear();
        admin.crearNota();

        Estudiante alumno = new Estudiante("Stiven",10,"1234","grupo");
        alumno.logear();
        alumno.leerNota();
        
        Profesor docente = new Profesor("nombre",12,"4321","ingles","grupo");
        docente.logear();
        docente.administrar_notas();
        


    }
    
}