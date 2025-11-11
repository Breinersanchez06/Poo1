public class Reptil extends Animal {
    protected String tipo_escamas;
    protected boolean venenoso;

    // Constructor
    public Reptil(String especie, String habitat, String alimentacion, String zona_ubicacion, String tipo_escamas, boolean venenoso) {
        super(especie, habitat, alimentacion, zona_ubicacion); // Llamado padre para inicializar sus 4 atributos

        this.tipo_escamas = tipo_escamas; // Inicialización propia Reptil para sus 2 atributos 
        this.venenoso = venenoso;
    }

     @Override
    public void comer() {
        System.out.println("Está comiendo alimento de reptiles...");
    }

     @Override
    public void dormir() {
        System.out.println("Está inactivo buscando dormir...");
    }

    @Override
    public void mostrar_info() {
        System.out.println("Info Reptil");
        System.out.println("Hábitat: " + habitat);
        System.out.println("Alimentación: " + alimentacion);
        System.out.println("Zona: " + zona_ubicacion);
        System.out.println("Escamas: " + tipo_escamas);
        System.out.println("Venenoso: " + (venenoso ? "Sí" : "No" ));
    }
}