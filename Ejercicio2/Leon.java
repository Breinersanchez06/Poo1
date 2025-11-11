public class Leon extends Mamífero {
    private String melena;

    public Leon(String especie, String habitat, String alimentacion, String zona_ubicacion, 
                String tipo_pelaje, int num_crias, String melena) {
        super(especie, habitat, alimentacion, zona_ubicacion, tipo_pelaje, num_crias);
        this.melena = melena;
    }

    @Override
    public void comer() {
        System.out.println("El león está desgarrando carne fresca...");
    }

    @Override
    public void dormir() {
        System.out.println("El león duerme plácidamente bajo la sombra...");
    }

    @Override
    public void mostrar_info() {
        System.out.println("=== INFORMACIÓN DEL LEÓN ===");
        System.out.println("Especie: " + especie);
        System.out.println("Hábitat: " + habitat);
        System.out.println("Alimentación: " + alimentacion);
        System.out.println("Zona: " + zona_ubicacion);
        System.out.println("Pelaje: " + tipo_pelaje);
        System.out.println("Número de crías: " + num_crias);
        System.out.println("Melena: " + melena);
    }
}
    

