public class Elefante extends Mamífero {
    private String tamano_trompa;

    public Elefante(String especie, String habitat, String alimentacion, String zona_ubicacion,
                    String tipo_pelaje, int num_crias, String tamano_trompa) {
        super(especie, habitat, alimentacion, zona_ubicacion, tipo_pelaje, num_crias);
        this.tamano_trompa = tamano_trompa;
    }

    @Override
    public void comer() {
        System.out.println("El elefante está arrancando hojas y ramas con su trompa...");
    }

    @Override
    public void dormir() {
        System.out.println("El elefante duerme de pie o recostado bajo un árbol...");
    }

    @Override
    public void mostrar_info() {
        System.out.println("=== INFORMACIÓN DEL ELEFANTE ===");
        System.out.println("Especie: " + especie);
        System.out.println("Hábitat: " + habitat);
        System.out.println("Alimentación: " + alimentacion);
        System.out.println("Zona: " + zona_ubicacion);
        System.out.println("Pelaje: " + tipo_pelaje);
        System.out.println("Número de crías: " + num_crias);
        System.out.println("Tamaño de trompa: " + tamano_trompa);
    }
}
