public abstract class Animal {
    protected String especie;
    protected String habitat;
    protected String alimentacion;
    protected String zona_ubicacion;

    public Animal(String especie, String habitat, String alimentacion, String zona_ubicacion) {

        this.especie = especie;
        this.habitat = habitat;
        this.alimentacion = alimentacion;
        this.zona_ubicacion = zona_ubicacion;
    }

    public abstract void comer();
    public abstract void dormir();
    public abstract void mostrar_info();

    
    public String getespecie() { return especie; }
    public String gethabitat() { return habitat; }
    public String getalimentacion() { return alimentacion; }
    public String getzona_ubicacion() { return zona_ubicacion; }    

    
    public void sethabitat(String habitat) { this.habitat = habitat; }
    public void setzona_ubicacion(String zona_ubicacion) { this.zona_ubicacion = zona_ubicacion; }
}
