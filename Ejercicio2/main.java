public class main {
    public static void main(String[] args) {
        
        Leon leon = new Leon("León Africano", "Sabana", "Carnívoro", "África Central", 
         "Corto y dorado", 3, "Abundante");

        
        Serpiente serpiente = new Serpiente("Pitón Real", "Selva", "Carnívoro", "Amazonas", 
        "Suaves y brillantes", false, true);

        
        Elefante elefante = new Elefante("Elefante Africano", "Sabana y bosque", "Herbívoro", "África", 
        "Grueso y grisáceo", 1, "Muy larga");

        
        Cocodrilo cocodrilo = new Cocodrilo("Cocodrilo del Nilo", "Ríos y lagos", "Carnívoro", "África Subsahariana", 
         "Duras y rugosas", false, true);

        
        Animal[] zoo = {leon, serpiente, elefante, cocodrilo};

        System.out.println("========== ZOOLÓGICO EN ACCIÓN ==========\n");

        for (Animal animal : zoo) {
            animal.mostrar_info();
            animal.comer();
            animal.dormir();
            System.out.println("----------------------------------------\n");
        }

        
        System.out.println(">>> El cuidador traslada al león a otra zona...");
        leon.setzona_ubicacion("Reserva Natural");
        leon.mostrar_info();

        System.out.println("\n>>> Trasladando al elefante también...");
        elefante.setzona_ubicacion("Santuario de Elefantes");
        elefante.mostrar_info();
    }
}