public class Serpiente extends Reptil {
    private boolean constrictora;

    public Serpiente(String especie, String habitat, String alimentacion, String zona_ubicacion,
                     String tipo_escamas, boolean venenoso, boolean constrictora) {
        super(especie, habitat, alimentacion, zona_ubicacion, tipo_escamas, venenoso);
        this.constrictora = constrictora;
    }

    @Override
    public void comer() {
        if (constrictora) {
            System.out.println("La serpiente está estrujando a su presa antes de tragarla...");
        } else {
            System.out.println("La serpiente está inyectando veneno y tragando a su presa...");
        }
    }

    @Override
    public void dormir() {
        System.out.println("La serpiente está enrollada, inactiva y descansando...");
    }

    @Override
    public void mostrar_info() {
        System.out.println("=== INFORMACIÓN DE LA SERPIENTE ===");
        System.out.println("Especie: " + especie);
        System.out.println("Hábitat: " + habitat);
        System.out.println("Alimentación: " + alimentacion);
        System.out.println("Zona: " + zona_ubicacion);
        System.out.println("Escamas: " + tipo_escamas);
        System.out.println("Venenosa: " + (venenoso ? "Sí" : "No"));
        System.out.println("Constrictora: " + (constrictora ? "Sí" : "No"));
    }
} 
    

