public class Cocodrilo extends Reptil {
    private boolean vive_en_agua;

    public Cocodrilo(String especie, String habitat, String alimentacion, String zona_ubicacion,
                     String tipo_escamas, boolean venenoso, boolean vive_en_agua) {
        super(especie, habitat, alimentacion, zona_ubicacion, tipo_escamas, venenoso);
        this.vive_en_agua = vive_en_agua;
    }

    @Override
    public void comer() {
        System.out.println("El cocodrilo está emboscando y arrastrando a su presa al agua...");
    }

    @Override
    public void dormir() {
        System.out.println("El cocodrilo está flotando inmóvil con los ojos abiertos...");
    }

    @Override
    public void mostrar_info() {
        System.out.println("=== INFORMACIÓN DEL COCODRILO ===");
        System.out.println("Especie: " + especie);
        System.out.println("Hábitat: " + habitat);
        System.out.println("Alimentación: " + alimentacion);
        System.out.println("Zona: " + zona_ubicacion);
        System.out.println("Escamas: " + tipo_escamas);
        System.out.println("Venenoso: " + (venenoso ? "Sí" : "No"));
        System.out.println("Vive en agua: " + (vive_en_agua ? "Sí" : "No"));
    }
}
