package clases;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {
    private String nombre;
    private String ubicacion;
    private List<Habitat> habitats;

    // Constructor
    public Zoologico(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.habitats = new ArrayList<>();
    }

    // Métodos
    public void agregarHabitat(Habitat habitat) {
        habitats.add(habitat);
        System.out.println("Habitat " + habitat.getNombre() + " agregado al zoologico.");
    }

    public List<Habitat> listarHabitats() {
        return habitats;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getUbicacion() { return ubicacion; }
    public void setUbicacion(String ubicacion) { this.ubicacion = ubicacion; }
}
