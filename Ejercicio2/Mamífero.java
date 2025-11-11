public abstract class Mamífero extends Animal {

    protected String tipo_pelaje;
    protected int num_crias;

    public Mamífero(String especie, String habitat, String alimentacion, String zona_ubicacion, String tipo_pelaje, int num_crias) {
        super(especie, habitat, alimentacion, zona_ubicacion);

        this.tipo_pelaje = tipo_pelaje;
        this.num_crias = num_crias;
    }

    @Override
    public void comer() {
        System.out.println("Está comiendo alimento de mamífero...");
    }

    @Override
    public void dormir() {
        System.out.println("Está durmiendo profundamente...");
    }

    @Override
    public void mostrar_info(){
        System.out.println("Info mamífero");
        System.out.println("Hábitat: " + habitat);
        System.out.println("Alimentación: " + alimentacion);
        System.out.println("Zona: " + zona_ubicacion);
        System.out.println("Pelaje: " + tipo_pelaje);
        System.out.println("Crías: " + num_crias);
    }

}